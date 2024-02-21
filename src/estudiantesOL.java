import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class estudiantesOL {
    private JPanel estudianteJPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button1;

    JPanel olJPanel;
    private JButton verMasButton;
    private JButton verMasButton1;
    private JButton verMasButton2;
    private JButton verMasButton3;
    private JButton verMasButton4;
    private JButton verMasButton5;
    private JButton verMasButton6;
    private JButton verMasButton7;
    private JButton verMasButton8;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton perfilRadioButton;
    //private JButton button1;


    public estudiantesOL() {
        Main.ventana.setTitle("Gestion De Proyectos");
        textField1.setText(Main.nombre);
        textField2.setText(Main.facultad);
        textField3.setText(Main.carrera);
        textField4.setText(Main.periodo);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new estudiante().estudianteJPanel);
                Main.ventana.revalidate();

            }
        });

        verMasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("primero").JPanelOL);
                Main.ventana.revalidate();
            }
        });

        verMasButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("segundo").JPanelOL);
                Main.ventana.revalidate();
            }
        });
        verMasButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("tercero").JPanelOL);
                Main.ventana.revalidate();
            }
        });
        verMasButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("cuarto").JPanelOL);
                Main.ventana.revalidate();
            }
        });
        verMasButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("quinto").JPanelOL);
                Main.ventana.revalidate();
            }
        });
        verMasButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("sexto").JPanelOL);
                Main.ventana.revalidate();
            }
        });
        verMasButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("septimo").JPanelOL);
                Main.ventana.revalidate();
            }
        });
        verMasButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("octava").JPanelOL);
                Main.ventana.revalidate();
            }
        });
        verMasButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("novena").JPanelOL);
                Main.ventana.revalidate();
            }
        });
        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new estudianteOV().ovJPanel);
                Main.ventana.validate();
            }
        });
        perfilRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacion_estudiante().infoEstudiante);
                Main.ventana.validate();
            }
        });
    }
}
