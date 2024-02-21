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
    private JLabel advertencia;
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
                String contraseña = String.valueOf(passwordField1.getText());
                String opcionSeleccionada = (String) comboBox1.getSelectedItem();
                if (!nombre.isEmpty() && !contraseña.isEmpty()) {
                    Connection conexion = connector.obtenerConexion();
                    switch (opcionSeleccionada) {
                        case "Estudiante":
                            try {
                                String sql = "SELECT * FROM estudiantes WHERE usuario = '"+ nombre+"' AND contraseña = "+ contraseña;
                                Statement statement = conexion.createStatement();
                                ResultSet resultSet = statement.executeQuery(sql);
                                if (resultSet.next()) {
                                    int idEstudiante = resultSet.getInt("id");
                                    String consulta = "SELECT * FROM listaestudiantes WHERE id_estudiante = "+idEstudiante;
                                    Statement statement2 = conexion.createStatement();
                                    ResultSet resultSet2 = statement.executeQuery(consulta);
                                    resultSet2.next();
                                    Main.nombre = resultSet2.getString("nombre");
                                    Main.facultad = resultSet2.getString("facultad");
                                    Main.carrera=resultSet2.getString("carrera");
                                    Main.periodo= resultSet2.getString("periodo");
                                    Main.codigoUnico= resultSet2.getInt("codigo");

                                    Main.ventana.setContentPane(new estudiante().estudianteJPanel);
                                    Main.ventana.revalidate();
                                    resultSet2.close();
                                    statement2.close();
                                    resultSet.close();
                                    statement.close();
                                    conexion.close();
                                } else {
                                    JOptionPane.showMessageDialog(null, "No se encontró información del estudiante en listaestudiantes");
                                }

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
                                }
                                else{
                                    throw new Exception("Credenciales Incorrectas");
                                }
                                resultSet.close();
                                statement.close();
                                conexion.close();
                            }
                            catch (Exception exception){
                                JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrecto");
                            }
                            break;
                    }
                }else{
                    advertencia.setText("Ingrese sus credenciales");
                }
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
