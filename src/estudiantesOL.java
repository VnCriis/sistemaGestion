import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class estudiantesOL {
    private JPanel estudianteJPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
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
    private JRadioButton perfilRadioButton;
    //private JButton button1;

    public estudiantesOL() {
        Main.ventana.setTitle("Gestion De Proyectos");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new estudiante().estudianteJPanel);
                Main.ventana.revalidate();
                //JFrame estudiante = new JFrame("");
                //estudiante.setContentPane(new estudiante().estudianteJPanel);
                //estudiante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //estudiante.pack();
                //estudiante.setSize(843,721);
                //estudiante.setVisible(true);
                //((JFrame) SwingUtilities.getWindowAncestor(button1)).dispose();
            }
        });
        verMásButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacionOL("primero").JPanelOL);
                Main.ventana.revalidate();
            }
        });

    }
}
