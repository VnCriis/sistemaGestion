import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.*;

public class estudiante {
    JPanel estudianteJPanel;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JTextArea textArea4;

    public estudiante() {
        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame estudianteOL = new JFrame("");
                estudianteOL.setContentPane(new estudianteOL().olJPanel);
                estudianteOL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                estudianteOL.pack();
                estudianteOL.setSize(843,721);
                estudianteOL.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(radioButton1)).dispose();
            }
        });
        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame estudianteOV = new JFrame("");
                estudianteOV.setContentPane(new estudianteOV().ovJPanel);
                estudianteOV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                estudianteOV.pack();
                estudianteOV.setSize(843,721);
                estudianteOV.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(radioButton2)).dispose();
            }
        });
        radioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame estudianteFormularios = new JFrame("");
                estudianteFormularios.setContentPane(new estudianteFormularios().formulariosJPanel);
                estudianteFormularios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                estudianteFormularios.pack();
                estudianteFormularios.setSize(843,721);
                estudianteFormularios.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(radioButton3)).dispose();
            }
        });
        radioButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame estudianteInicio = new JFrame("");
                estudianteInicio.setContentPane(new estudianteInicio().inicioJPanel);
                estudianteInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                estudianteInicio.pack();
                estudianteInicio.setSize(843,721);
                estudianteInicio.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(radioButton4)).dispose();
            }
        });
        try {
            Connection conexion = connector.obtenerConexion();
            String query = "SELECT * FROM listaestudiantes";

            // Ejecutar la consulta
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // Iterar sobre los resultados y agregarlos al JTextArea existente
            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String facultad = resultSet.getString("facultad");
                String carrera = resultSet.getString("carrera");
                String periodo = resultSet.getString("periodo");
                textArea1.append(nombre + "\n"); // Agrega un salto de línea después de cada nombre
                textArea2.append(facultad + "\n"); // Agrega un salto de línea después de cada facultad
                textArea3.append(carrera + "\n"); // Agrega un salto de línea después de cada carrera
                textArea4.append(periodo + "\n");
            }

            resultSet.close();
            statement.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
