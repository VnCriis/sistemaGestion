import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame login = new JFrame("");
        login.setContentPane(new login().loginJPanel);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.pack();
        login.setSize(843,721);
        login.setVisible(true);
    }
}