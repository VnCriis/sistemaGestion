import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class estudianteOV {
    JPanel ovJPanel;
    private JButton button1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JRadioButton prácticasPreprofesionalesRadioButton;
    private JRadioButton a️PrácticasLaboralesRadioButton;
    private JButton verMásButton1;
    private JButton verMásButton2;
    private JButton verMásButton3;
    private JButton verMásButton4;
    private JButton verMásButton5;
    private JButton verMásButton6;
    private JButton verMásButton7;
    private JButton verMásButton8;
    private JButton verMásButton9;
    private JRadioButton perfilRadioButton;

    public estudianteOV() {
        Main.ventana.setTitle("Gestion De Proyectos");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new estudiante().estudianteJPanel);
                Main.ventana.revalidate();
            }
        });
        verMásButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("primero").JPanelOV);
                Main.ventana.revalidate();
            }
        });
        verMásButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("segundo").JPanelOV);
                Main.ventana.revalidate();
            }
        });
        verMásButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("tercero").JPanelOV);
                Main.ventana.revalidate();
            }
        });
        verMásButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("cuarta").JPanelOV);
                Main.ventana.revalidate();
            }
        });
        verMásButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("quinta").JPanelOV);
                Main.ventana.revalidate();
            }
        });
        verMásButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("sexta").JPanelOV);
                Main.ventana.revalidate();
            }
        });
        verMásButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("septimo").JPanelOV);
                Main.ventana.revalidate();
            }
        });
        verMásButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("octavo").JPanelOV);
                Main.ventana.revalidate();
            }
        });
        verMásButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("noveno").JPanelOV);
                Main.ventana.revalidate();
            }
        });
    }
}
