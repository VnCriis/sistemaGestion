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
    private JRadioButton a️PrácticasLaboralesRadioButton;
    private JRadioButton perfilRadioButton;
    private JButton verMasButton1;
    private JButton verMasButton2;
    private JButton verMasButton3;
    private JButton verMasButton4;
    private JButton verMasButton5;
    private JButton verMasButton6;
    private JButton verMasButton7;
    private JButton verMasButton8;
    private JButton verMasButton9;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;

    public estudianteOV() {
        Main.ventana.setTitle("Gestion De Proyectos");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new estudiante().estudianteJPanel);
                Main.ventana.revalidate();
            }
        });
        verMasButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("primero").JPanelOV);
                Main.ventana.revalidate();
            }
        });
        verMasButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("segundo").JPanelOV);
                Main.ventana.revalidate();
            }
        });
        verMasButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("tercero").JPanelOV);
                Main.ventana.revalidate();
            }
        });
        verMasButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("cuarta").JPanelOV);
                Main.ventana.revalidate();
            }
        });
        verMasButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("quinta").JPanelOV);
                Main.ventana.revalidate();
            }
        });
        verMasButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("sexta").JPanelOV);
                Main.ventana.revalidate();
            }
        });
        verMasButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("septimo").JPanelOV);
                Main.ventana.revalidate();
            }
        });
        verMasButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("octavo").JPanelOV);
                Main.ventana.revalidate();
            }
        });
        verMasButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOV("noveno").JPanelOV);
                Main.ventana.revalidate();
            }
        });
        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new estudiantesOL().olJPanel);
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
