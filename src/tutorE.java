import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class tutorE {
    JPanel tutoreJPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTable table1;
    private JRadioButton radioButton1;

    public tutorE() {
        Main.ventana.setTitle("Gestion De Proyectos");
        textField1.setText(Main.nombre2);
        textField2.setText(Main.facultad2);
        textField3.setText(Main.periodo2);
        Connection conexion = connector.obtenerConexion();
        try {
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM listaestudiantes");

            // Crear un modelo de tabla para almacenar los datos
            DefaultTableModel model = new DefaultTableModel();

            // Obtener los metadatos de la consulta (nombres de columnas)
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }

            // Agregar filas de datos al modelo
            while (rs.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = rs.getObject(i);
                }
                model.addRow(rowData);
            }

            // Asignar el modelo a la tabla
            table1.setModel(model);

            // Cerrar la conexión
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
