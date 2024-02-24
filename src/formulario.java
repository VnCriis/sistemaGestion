import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class formulario {
    JPanel formularioJPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public formulario() {
        Main.ventana.setTitle("Gestion De Proyectos");
        textField1.setText(Main.nombre);
        textField2.setText(Main.facultad);
        textField3.setText(Main.carrera);
        textField4.setText(Main.periodo);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Especificar la ubicMain.ventana.setContentPane(new estudiante().estudianteJPanel);
                    //                Main.ventana.revalidate();
                    File file = new File("C:/Users/cusin/IdeaProjects//sistemaGestion/src/doc/solicitud.docx");

                    // Verificar si el archivo existe antes de intentar descargarlo
                    if (file.exists()) {
                        // Mostrar un mensaje de éxito

                        // Abrir el archivo para que el usuario pueda acceder a él
                        Desktop.getDesktop().open(file);
                    } else {
                        // Mostrar un mensaje de error si el archivo no existe
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            final JFileChooser fileChooser = new JFileChooser();
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnValue = fileChooser.showOpenDialog(null);

                // Si se selecciona un archivo, obtener la ruta del archivo seleccionado
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    String filePath = fileChooser.getSelectedFile().getPath();
                    System.out.println("Archivo seleccionado: " + filePath);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new estudiante().estudianteJPanel);
                Main.ventana.revalidate();
            }
        });
    }
}
