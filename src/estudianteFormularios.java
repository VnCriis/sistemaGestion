import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class estudianteFormularios {
    JPanel formulariosJPanel;
    private JButton button1;
    private JPanel estudianteJPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton perfilRadioButton;
    private JButton descargarFormularioButton;
    private JButton subirFormularioButton;

    public estudianteFormularios() {
        Main.ventana.setTitle("Gestion De Proyectos");
        textField1.setText(Main.nombre);
        textField2.setText(Main.facultad);
        textField3.setText(Main.carrera);
        textField4.setText(Main.periodo);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new login().loginJPanel);
                Main.ventana.revalidate();

            }
        });
        descargarFormularioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                int seleccion = chooser.showSaveDialog(null);
                if (seleccion == JFileChooser.APPROVE_OPTION){
                    File JFile = chooser.getSelectedFile();

                }
            }
        });
    }
}
