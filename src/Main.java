import javax.swing.*;

public class Main {
    static JFrame ventana = new JFrame("Gestion de Proyectos");
    public static void main(String[] args) {
        //ventana.setUndecorated(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ventana.setUndecorated(true);
        ventana.setContentPane(new login().loginJPanel);
        ventana.pack();
        ventana.setSize(1000, 800);
        ventana.setVisible(true);
    }
}