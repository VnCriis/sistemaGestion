import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.sql.*;

public class login {
    private JTextField textField4;
    private JButton ingresarButton;
    private JButton salirButton;
    private JPasswordField passwordField1;
    private JComboBox comboBox1;
    JPanel loginJPanel;
    public String nombre1;
    public String facultad;
    public String carrera;
    public String periodo;
    public String nombre2;
    public String carrera2;
    public String periodo2;
    public login(String nombre2, String carrera2, String periodo2) {
        this.nombre2 = nombre2;
        this.carrera2 = carrera2;
        this.periodo2 = periodo2;
    }

    // Getter y Setter para nombre2
    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    // Getter y Setter para carrera2
    public String getCarrera2() {
        return carrera2;
    }

    public void setCarrera2(String carrera2) {
        this.carrera2 = carrera2;
    }

    // Getter y Setter para periodo2
    public String getPeriodo2() {
        return periodo2;
    }

    public void setPeriodo2(String periodo2) {
        this.periodo2 = periodo2;
    }

    public login(String nombre1, String facultad, String carrera, String periodo) {
        this.nombre1 = nombre1;
        this.facultad = facultad;
        this.carrera = carrera;
        this.periodo = periodo;
    }

    // Getter y Setter para nombre1
    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    // Getter y Setter para facultad
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    // Getter y Setter para carrera
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Getter y Setter para periodo
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public login() {
        Main.ventana.setTitle("Gestion de Proyectos");
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = textField4.getText();
                int contraseña = Integer.parseInt(passwordField1.getText());
                String opcionSeleccionada = (String) comboBox1.getSelectedItem();
                if (opcionSeleccionada != null) {
                    Connection conexion = connector.obtenerConexion();
                    switch (opcionSeleccionada) {
                        case "Estudiante":
                            try {
                                String sql = "SELECT * FROM estudiantes WHERE usuario = ? AND contraseña = ?";
                                PreparedStatement statement = conexion.prepareStatement(sql);
                                statement.setString(1, nombre);
                                statement.setString(2, String.valueOf(contraseña));
                                ResultSet resultSet = statement.executeQuery();

                                if (resultSet.next()) {
                                    int idEstudiante = resultSet.getInt("id");
                                    String consulta = "SELECT * FROM listaestudiantes WHERE id_estudiante = ?";
                                    PreparedStatement statement1 = conexion.prepareStatement(consulta);
                                    statement1.setInt(1, idEstudiante);
                                    ResultSet resultSet1 = statement1.executeQuery();

                                    if (resultSet1.next()) {
                                        // Crear una instancia de la clase login y asignar valores
                                        login instanciaLogin = new login();
                                        instanciaLogin.setNombre1(resultSet1.getString("nombre"));
                                        instanciaLogin.setFacultad(resultSet1.getString("facultad"));
                                        instanciaLogin.setCarrera(resultSet1.getString("carrera"));
                                        instanciaLogin.setPeriodo(resultSet1.getString("periodo"));

                                        // Hacer algo con la información obtenida, como asignarla a variables globales o configurar la interfaz de usuario
                                        // Aquí, simplemente vamos a establecer los valores en la interfaz de estudiante

                                        estudiante estudiantePanel = new estudiante();
                                        estudiantePanel.getTextField1().setText(instanciaLogin.getNombre1());
                                        estudiantePanel.getTextField2().setText(instanciaLogin.getFacultad());
                                        estudiantePanel.getTextField3().setText(instanciaLogin.getCarrera());
                                        estudiantePanel.getTextField4().setText(instanciaLogin.getPeriodo());

                                        Main.ventana.setContentPane(estudiantePanel.estudianteJPanel);
                                        Main.ventana.revalidate();
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encontró información del estudiante en listaestudiantes");
                                    }

                                    resultSet1.close();
                                    statement1.close();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
                                }

                                resultSet.close();
                                statement.close();
                                conexion.close();
                            } catch (SQLException exception) {
                                JOptionPane.showMessageDialog(null, "Error al realizar la consulta SQL");
                                exception.printStackTrace();
                            }

                            break;
                        case "Tutor":
                            try {
                                String sql = "SELECT * FROM tutores WHERE usuario = ? AND contraseña = ?";
                                PreparedStatement statement = conexion.prepareStatement(sql);
                                statement.setString(1,nombre);
                                statement.setString(2, String.valueOf(contraseña));
                                ResultSet resultSet = statement.executeQuery();
                                if (resultSet.next()) {
                                    Main.ventana.setContentPane(new tutor().tutorJPanel);
                                    Main.ventana.revalidate();
                                    //JFrame tutor = new JFrame("");
                                    //tutor.setContentPane(new tutor().tutorJPanel);
                                    //tutor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                    //tutor.pack();
                                    //tutor.setSize(843,721);
                                    //tutor.setVisible(true);
                                    //((JFrame) SwingUtilities.getWindowAncestor(ingresarButton)).dispose();
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrecto");
                                }
                                resultSet.close();
                                statement.close();
                                conexion.close();
                            }
                            catch (SQLException exception){
                                JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrecto");
                            }
                            break;
                    }
                    connector.cerrarConexion(conexion);
                }
            }

        });
    }
}
