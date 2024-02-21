import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class informacion_estudiante {
    JPanel infoEstudiante;
    private JPanel estudianteJPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton perfilRadioButton;
    private JButton button1;
    private JTextField cedula;
    private JTextField codigo_unico;
    private JTextField apellidos;
    private JTextField nombres;
    private JTextField facultad;
    private JTextField carrera;
    private JTextField periodo;

    public informacion_estudiante(){
        textField1.setText(Main.nombre);
        textField2.setText(Main.facultad);
        textField3.setText(Main.carrera);
        textField4.setText(Main.periodo);

        codigo_unico.setText(String.valueOf(Main.codigoUnico));
        facultad.setText(Main.facultad);
        periodo.setText(Main.periodo);
        carrera.setText(Main.carrera);

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
