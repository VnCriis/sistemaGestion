import java.sql.*;

public class connector {
    // Datos de conexión a la base de datos
    private static final String dbhost = "jdbc:mysql://localhost:3306/sistemaGestion";
    private static final String dbuser = "root";
    private static final String dbpassword = "1357";

    // Método para obtener la conexión a la base de datos
    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            // Registro del driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer conexión
            conexion = DriverManager.getConnection(dbhost, dbuser, dbpassword);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error en la conexión a la base de datos.");
            e.printStackTrace();
        }
        return conexion;
    }

    // Método para cerrar la conexión
    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión.");
                e.printStackTrace();
            }
        }
    }
//                    Connection conexion = connector.obtenerConexion();
//                    // Aquí puedes realizar operaciones con la base de datos utilizando la conexión
//
//                    // Cerrar la conexión cuando hayas terminado
//                    connector.cerrarConexion(conexion);
//                }
//                String opcionSeleccionada = (String) comboBox1.getSelectedItem(); // Corrección: Utiliza getSelectedItem()
}
