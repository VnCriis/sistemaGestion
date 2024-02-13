import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.sql.Connection;

public class login {
    private JTextField textField4;
    private JButton ingresarButton;
    private JButton salirButton;
    private JPasswordField passwordField1;
    private JComboBox comboBox1;
    JPanel loginJPanel;

    public login() {
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String opcionSeleccionada = (String) comboBox1.getSelectedItem(); // Corrección: Utiliza getSelectedItem()
                if (opcionSeleccionada != null) {
                    switch (opcionSeleccionada) {
                        case "Estudiante":
                            JFrame estudiante = new JFrame("");
                            estudiante.setContentPane(new estudiante().estudianteJPanel);
                            estudiante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            estudiante.pack();
                            estudiante.setSize(850,420);
                            estudiante.setVisible(true);
                            break;
                        case "Tutor":
                            JFrame tutor = new JFrame("");
                            tutor.setContentPane(new tutor().tutorJPanel);
                            tutor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            tutor.pack();
                            tutor.setSize(850,420);
                            tutor.setVisible(true);
                            break;
                    }
                }
            }

        });
    }
}
