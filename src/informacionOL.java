import javax.swing.*;

public class informacionOL {
    private JPanel estudianteJPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JButton button1;
    private JButton aplicarButton;
    private JLabel titulo;
    private JLabel subtitulo;
    private JLabel descripcion;
    private JLabel parrafo_d;
    private JLabel requisitos;
    private JLabel requisitos_p;
    private JLabel beneficios;
    private JLabel beneficios_p;
    private JLabel icon;
    JPanel JPanelOL;

    public informacionOL(String cambio){
        Main.ventana.setTitle("Gestion De Proyectos");
        switch (cambio){
            case "primero" -> {
                titulo.setText("Asistente De Sistemas");
                subtitulo.setText("SERVICAT - PARTESCAT COMPAÑIA LIMITADA");
                descripcion.setText("Descripcion");
                parrafo_d.setText("Se busca pasante");
                requisitos.setText("Requisitos");
                requisitos_p.setText("Ayudante");
                beneficios.setText("Beneficios");
                beneficios_p.setText("todos los beneficios");
                icon.setIcon(new ImageIcon("src/img/servical_renovado.png"));
            }
            case "segundo" -> {
                titulo.setText("Asistente De Sistemas casa");
                subtitulo.setText("SERVICAT - PARTESCAT COMPAÑIA LIMITADA");
                descripcion.setText("Descripcion");
                parrafo_d.setText("Se busca pasante");
                requisitos.setText("Requisitos");
                requisitos_p.setText("Ayudante");
                beneficios.setText("Beneficios");
                beneficios_p.setText("todos los beneficios");
                icon.setIcon(new ImageIcon("src/img/servical_renovado.png"));
            }
            case "tercero" -> {
                titulo.setText("Asistente De Sistemas cs");
                subtitulo.setText("SERVICAT - PARTESCAT COMPAÑIA LIMITADA");
                descripcion.setText("Descripcion");
                parrafo_d.setText("Se busca pasante");
                requisitos.setText("Requisitos");
                requisitos_p.setText("Ayudante");
                beneficios.setText("Beneficios");
                beneficios_p.setText("todos los beneficios");
                icon.setIcon(new ImageIcon("src/img/servical_renovado.png"));
            }
            case "cuarta" -> {
                titulo.setText("Asistente De Sistemas fg");
                subtitulo.setText("SERVICAT - PARTESCAT COMPAÑIA LIMITADA");
                descripcion.setText("Descripcion");
                parrafo_d.setText("Se busca pasante");
                requisitos.setText("Requisitos");
                requisitos_p.setText("Ayudante");
                beneficios.setText("Beneficios");
                beneficios_p.setText("todos los beneficios");
                icon.setIcon(new ImageIcon("src/img/servical_renovado.png"));
            }
            case "quinta" -> {
                titulo.setText("Asistente De Sistemas c");
                subtitulo.setText("SERVICAT - PARTESCAT COMPAÑIA LIMITADA");
                descripcion.setText("Descripcion");
                parrafo_d.setText("Se busca pasante");
                requisitos.setText("Requisitos");
                requisitos_p.setText("Ayudante");
                beneficios.setText("Beneficios");
                beneficios_p.setText("todos los beneficios");
                icon.setIcon(new ImageIcon("src/img/servical_renovado.png"));
            }
            case "sexta" -> {
                titulo.setText("Asistente De Sistemas cd");
                subtitulo.setText("SERVICAT - PARTESCAT COMPAÑIA LIMITADA");
                descripcion.setText("Descripcion");
                parrafo_d.setText("Se busca pasante");
                requisitos.setText("Requisitos");
                requisitos_p.setText("Ayudante");
                beneficios.setText("Beneficios");
                beneficios_p.setText("todos los beneficios");
                icon.setIcon(new ImageIcon("src/img/servical_renovado.png"));
            }

        }
    };
}
