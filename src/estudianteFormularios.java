import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class estudianteFormularios {
    JPanel formulariosJPanel;
    private JButton button1;

    public estudianteFormularios() {
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
    }
}
