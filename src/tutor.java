import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tutor {
    JPanel tutorJPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel estudianteJPanel;
    private JRadioButton radioButton1;
    private JButton cerrarSesiónButton;
    private JRadioButton radioButton2;

    public tutor(){
        Main.ventana.setTitle("Gestion De Proyectos");
        textField1.setText(Main.nombre2);
        textField2.setText(Main.facultad2);
        textField3.setText(Main.periodo2);
        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new tutorE().tutoreJPanel);
                Main.ventana.revalidate();
            }
        });
    }
}
