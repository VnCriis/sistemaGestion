import javax.swing.*;

public class tutor {
    JPanel tutorJPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public tutor(JTextField textField1, JTextField textField2, JTextField textField3) {
        this.textField1 = textField1;
        this.textField2 = textField2;
        this.textField3 = textField3;

    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public void setTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    public tutor(){
        try {
            // Crear una instancia de la clase login
            login instanciaLogin = new login();

            // Obtener los valores utilizando los métodos getter
            String nombre2 = instanciaLogin.getNombre1();
            String carrera2 = instanciaLogin.getCarrera();
            String periodo2 = instanciaLogin.getPeriodo();

            // Insertar los valores en los campos de texto
            textField1.setText(nombre2);
            textField2.setText(carrera2);
            textField3.setText(periodo2);
        } catch (Exception e) {
            // Manejar cualquier excepción que pueda ocurrir
            e.printStackTrace();
        }
    }
}
