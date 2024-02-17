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

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button1;
    private JRadioButton perfilRadioButton;

    public estudiante(JTextField textField1, JTextField textField2, JTextField textField3, JTextField textField4) {
        this.textField1 = textField1;
        this.textField2 = textField2;
        this.textField3 = textField3;
        this.textField4 = textField4;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public void setTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    public JTextField getTextField4() {
        return textField4;
    }

    public void setTextField4(JTextField textField4) {
        this.textField4 = textField4;
    }

    public estudiante() {
        Main.ventana.setTitle("Gestion De Proyectos");
        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new estudiantesOL().olJPanel);
                Main.ventana.revalidate();
                //JFrame estudianteOL = new JFrame("");
                //estudianteOL.setContentPane(new estudiantesOL().olJPanel);
                //estudianteOL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //estudianteOL.pack();
                //estudianteOL.setSize(843,721);
                //estudianteOL.setVisible(true);
                //((JFrame) SwingUtilities.getWindowAncestor(radioButton1)).dispose();
            }
        });
        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new estudianteOV().ovJPanel);
                Main.ventana.revalidate();
                //JFrame estudianteOV = new JFrame("");
                //estudianteOV.setContentPane(new estudianteOV().ovJPanel);
                //estudianteOV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //estudianteOV.pack();
                //estudianteOV.setSize(843,721);
                //estudianteOV.setVisible(true);
                //((JFrame) SwingUtilities.getWindowAncestor(radioButton2)).dispose();
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
                textField1.setText(nombre); // Agrega un salto de línea después de cada nombre
                textField2.setText(facultad); // Agrega un salto de línea después de cada facultad
                textField3.setText(carrera); // Agrega un salto de línea después de cada carrera
                textField4.setText(periodo);
            }

            resultSet.close();
            statement.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new login().loginJPanel);
                Main.ventana.revalidate();
                //JFrame login = new JFrame("");
                //login.setContentPane(new login().loginJPanel);
                //login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //login.pack();
                //login.setSize(843,721);
                //login.setVisible(true);
                //((JFrame) SwingUtilities.getWindowAncestor(button1)).dispose();
            }
        });
    }
}
