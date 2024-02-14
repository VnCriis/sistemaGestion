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


    public login() {
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
                                statement.setString(1,nombre);
                                statement.setString(2, String.valueOf(contraseña));
                                ResultSet resultSet = statement.executeQuery();
                                if (resultSet.next()) {
                                    JFrame estudiante = new JFrame("");
                                    estudiante.setContentPane(new estudiante().estudianteJPanel);
                                    estudiante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                    estudiante.pack();
                                    estudiante.setSize(843, 721);
                                    estudiante.setVisible(true);
                                    ((JFrame) SwingUtilities.getWindowAncestor(ingresarButton)).dispose();
                                }else{
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
                        case "Tutor":
                            try {
                                String sql = "SELECT * FROM tutores WHERE usuario = ? AND contraseña = ?";
                                PreparedStatement statement = conexion.prepareStatement(sql);
                                statement.setString(1,nombre);
                                statement.setString(2, String.valueOf(contraseña));
                                ResultSet resultSet = statement.executeQuery();
                                if (resultSet.next()) {
                                    JFrame tutor = new JFrame("");
                                    tutor.setContentPane(new tutor().tutorJPanel);
                                    tutor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                    tutor.pack();
                                    tutor.setSize(843,721);
                                    tutor.setVisible(true);
                                    ((JFrame) SwingUtilities.getWindowAncestor(ingresarButton)).dispose();
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
