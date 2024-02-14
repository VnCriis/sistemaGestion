import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class estudianteOL {
   JPanel olJPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;

    public estudianteOL() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame estudiante = new JFrame("");
                estudiante.setContentPane(new estudiante().estudianteJPanel);
                estudiante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                estudiante.pack();
                estudiante.setSize(843,721);
                estudiante.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(button1)).dispose();
            }
        });
    }
}
