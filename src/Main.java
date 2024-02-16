import javax.swing.*;

public class Main {
    static JFrame ventana = new JFrame("Gestion de Proyectos");
    public static void main(String[] args) {
        //ventana.setUndecorated(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setContentPane(new login().loginJPanel);
        ventana.pack();
        ventana.setSize(854, 480);
        ventana.setVisible(true);
        //JFrame login = new JFrame("");
        //login.setContentPane(new login().loginJPanel);
        //login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //login.pack();
        //login.setSize(843,721);
        //login.setVisible(true);
    }
}