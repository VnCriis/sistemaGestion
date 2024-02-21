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



    public estudiante() {
        Main.ventana.setTitle("Gestion De Proyectos");
        textField1.setText(Main.nombre);
        textField2.setText(Main.facultad);
        textField3.setText(Main.carrera);
        textField4.setText(Main.periodo);
        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new estudiantesOL().olJPanel);
                Main.ventana.revalidate();
            }
        });
        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new estudianteOV().ovJPanel);
                Main.ventana.revalidate();
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new login().loginJPanel);
                Main.ventana.revalidate();
            }
        });

    }
}
