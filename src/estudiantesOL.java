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
    private JButton verMásButton;
    private JButton verMásButton1;
    private JButton verMásButton2;
    private JButton verMásButton3;
    private JButton verMásButton4;
    private JButton verMásButton5;
    private JButton verMásButton6;
    private JButton verMásButton7;
    private JButton verMásButton8;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton perfilRadioButton;
    //private JButton button1;

    public estudiantesOL() {
        Main.ventana.setTitle("Gestion De Proyectos");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new estudiante().estudianteJPanel);
                Main.ventana.revalidate();

            }
        });
        verMásButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("primero").JPanelOL);
                Main.ventana.revalidate();
            }
        });

        verMásButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("segundo").JPanelOL);
                Main.ventana.revalidate();
            }
        });
        verMásButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("tercero").JPanelOL);
                Main.ventana.revalidate();
            }
        });
        verMásButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("cuarto").JPanelOL);
                Main.ventana.revalidate();
            }
        });
        verMásButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("quinto").JPanelOL);
                Main.ventana.revalidate();
            }
        });
        verMásButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("sexto").JPanelOL);
                Main.ventana.revalidate();
            }
        });
        verMásButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("septimo").JPanelOL);
                Main.ventana.revalidate();
            }
        });
        verMásButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("octava").JPanelOL);
                Main.ventana.revalidate();
            }
        });
        verMásButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("novena").JPanelOL);
                Main.ventana.revalidate();
            }
        });
    }
}
