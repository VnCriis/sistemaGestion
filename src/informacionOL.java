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
    private JButton aplicarAhoraButton;
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
    private JLabel textFormacionA;
    private JLabel textConocimientoAd;
    private JLabel conocimiento_p;
    private JLabel ubicacion;
    private JLabel sueldo;
    private JLabel avance;
    private JLabel tiempo;
    private JRadioButton perfilRadioButton;

    public informacionOL(String cambio){
        Main.ventana.setTitle("Gestion De Proyectos");
        switch (cambio){
            case "primero" -> {
                titulo.setText("Asistente De Sistemas");
                subtitulo.setText("SERVICAT - PARTESCAT COMPAÑIA LIMITADA");
                //descripcion.setText("Descripcion del puesto");
                parrafo_d.setText("* Brindar Soporte oportuno de primer y segundo nivel a clientes internos.");
                //requisitos.setText("Requisitos");
                //textFormacionA.setText("Formacion Academica:");
                requisitos_p.setText("* Ingeniero o Egresado en Sistemas");
                //textConocimientoAd.setText("Conocimietnos Adicionales:");
                conocimiento_p.setText("* Conocimiento de módulos de Sistemas de Gestión (ERP)." );

                //beneficios.setText("Beneficios");
                beneficios_p.setText("* Beneficios de Ley");
                icon.setIcon(new ImageIcon("src/img/servical_renovado.png"));

                ubicacion.setText("Quito, Pichincha - Ecuador");
                sueldo.setText("500");
                avance.setText("Semi senior");
                tiempo.setText("Full-time | Presencial");
            }
            case "segundo" -> {
                titulo.setText("Supervisor De Produccion");
                subtitulo.setText("NOVACERO");
                //descripcion.setText("Descripcion del puesto");
                parrafo_d.setText("* Supervisar que se cumpla con las guías y métodos de trabajo para garantizar " +
                        "la operatividad de maquinas y evitar accidentes");
                //requisitos.setText("Requisitos");
                //textFormacionA.setText("Formacion Academica:");
                requisitos_p.setText("* Tecnologia Superior De Agua y Saniamiento");
                //textConocimientoAd.setText("Conocimietnos Adicionales:");
                conocimiento_p.setText("* Procesos de produccion." );

                //beneficios.setText("Beneficios");
                beneficios_p.setText("* Beneficios de ley & corporativos.");
                icon.setIcon(new ImageIcon("src/img/novacero.png"));

                ubicacion.setText("Latacunga, Cotopaxi - Ecuador");
                sueldo.setText("No especificado");
                avance.setText("Semi senior");
                tiempo.setText(" No especificado | Presencial");
            }
            case "tercero" -> {
                titulo.setText("Experto Calidad TI(Quality Assurance)");
                subtitulo.setText("BANCO PICHINCHA");
                //descripcion.setText("Descripcion del puesto");
                parrafo_d.setText("* Planificar, monitorear y dar seguimiento al proceso de aseguramiento y control de calidad utilizado en todo el ciclo de vida de construcción de soluciones tecnológicas, control de métricas de cumplimiento de los lineamientos de calidad, alineación del plan de pruebas, planes de mejora continua del proceso, acompañamiento a los equipos de QA así como el monitoreo de demanda y distribución de cargas entre la tribu/squad asignado, con el fin de contribuir al cumplimiento y alineación del proceso de aseguramiento y control de calidad de software, mejora de tiempos, nivel de servicio y eficiencias de entrega de soluciones al negocio, de acuerdo a las estrategia definida por el Chapter de QA.");
                //requisitos.setText("Requisitos");
                //textFormacionA.setText("Formacion Academica:");
                requisitos_p.setText("* Tecnologia Sistemas yy Telecomunicaciones");
                //textConocimientoAd.setText("Conocimietnos Adicionales:");
                conocimiento_p.setText("* Sólida en frameworks de pruebas de software." );

                //beneficios.setText("Beneficios");
                beneficios_p.setText("* Seguro médico privado");
                icon.setIcon(new ImageIcon("src/img/banco_t.png"));

                ubicacion.setText("Pichincha, Ecuador - Quito");
                sueldo.setText("No especificado");
                avance.setText("Senior");
                tiempo.setText("Full-time | Presencial ");
            }
            case "cuarta" -> {
                titulo.setText("Tecnico De Seguridad y Salud Ocupacional");
                subtitulo.setText("CORIS DEL ECUADOR");
                //descripcion.setText("Descripcion del puesto");
                parrafo_d.setText("* Levantamiento de matrices de riesgos, planes de emergencia, contingencia, políticas y procedimientos del subsistema de SSO.");
                //requisitos.setText("Requisitos");
                //textFormacionA.setText("Formacion Academica:");
                requisitos_p.setText("* Tecnologia Sistemas y Telecomunicaciones");
                //textConocimientoAd.setText("Conocimietnos Adicionales:");
                conocimiento_p.setText("* Experiencia mínima de 1 año manejando y liderando los procesos del subsistema." );

                //beneficios.setText("Beneficios");
                beneficios_p.setText("* Beneficios Coorporativos.");
                icon.setIcon(new ImageIcon("src/img/coris_t.png"));

                ubicacion.setText("Quito, Pichincha - Ecuador");
                sueldo.setText("600");
                avance.setText("Semi Senior");
                tiempo.setText("Full-time | Presencial ");

            }
            case "quinta" -> {
                titulo.setText("Analista De Desarrollo");
                subtitulo.setText("ORIGINARSA S.A");
                parrafo_d.setText("* Evaluación y mejora de procesos relacionados con el desarrollo de software.\n" +
                        "Papel crucial en la planificación, diseño, implementación y mejora continua de soluciones de software, asegurando que cumplan con los requisitos del negocio y se desarrollen de manera eficiente y efectiva.");

                requisitos_p.setText("* Tecnologia Sistemas y Telecomunicaciones");
                //textConocimientoAd.setText("Conocimietnos Adicionales:");
                conocimiento_p.setText("* Manejo de: Microsoft. Net, SQL Server, MySQL, NoSQL, O065, IIS, Tableau, Power BI." );

                //beneficios.setText("Beneficios");
                beneficios_p.setText("* Beneficios de ley.");
                icon.setIcon(new ImageIcon("src/img/originasa.png"));

                ubicacion.setText("Quito, Pichincha - Ecuador");
                sueldo.setText("No especificado");
                avance.setText("Junior");
                tiempo.setText("Full-time | Presencial ");
            }
            case "sexta" -> {
                titulo.setText("Analista De Desarrollo");
                subtitulo.setText("IMPROVE-INFORMATION-TECHNOLOGIES CIA.LTDA");
                parrafo_d.setText("* Evaluación y mejora de procesos relacionados con el desarrollo de software.\n" +
                        "Papel crucial en la planificación, diseño, implementación y mejora continua de soluciones de software, asegurando que cumplan con los requisitos del negocio y se desarrollen de manera eficiente y efectiva.");

                requisitos_p.setText("* Tecnologia Sistemas y Telecomunicaciones");
                //textConocimientoAd.setText("Conocimietnos Adicionales:");
                conocimiento_p.setText("* Manejo de: Microsoft. Net, SQL Server, MySQL, NoSQL, O065, IIS, Tableau, Power BI." );

                //beneficios.setText("Beneficios");
                beneficios_p.setText("* Beneficios de ley.");
                icon.setIcon(new ImageIcon("src/img/improve.png"));

                ubicacion.setText("Quito, Pichincha - Ecuador");
                sueldo.setText("No especificado");
                avance.setText("Junior");
                tiempo.setText("Full-time | Presencial ");
            }
            case "septima" -> {
                titulo.setText("Staff Software Engineer");
                subtitulo.setText("STAFFING");
                parrafo_d.setText("* Staff Software Engineer Estamos buscando un Staff Full-Stack Engineer experimentado " +
                        "y creativo para unirse a nuestro creciente equipo " +
                        "de servicios de integración y ayudar a llevar nuestra empresa al siguiente nivel..");

                requisitos_p.setText("* Tecnologia en Desarrollo de Software");
                //textConocimientoAd.setText("Conocimietnos Adicionales:");
                conocimiento_p.setText("* Experiencia trabajando con Node.js, Typescript or JavaScript.." );

                //beneficios.setText("Beneficios");
                beneficios_p.setText("* Beneficios de ley.");
                icon.setIcon(new ImageIcon("src/img/staffing_t.png"));

                ubicacion.setText("Quito, Pichincha - Ecuador");
                sueldo.setText("No especificado");
                avance.setText("Semi senior");
                tiempo.setText("Full-time | Presencial ");
            }
            case "octava" -> {
                titulo.setText("Pasante Sistemas");
                subtitulo.setText("PUNTONET");
                parrafo_d.setText("* Dar apoyo al área de sistemas en base a los requerimientos " +
                        "solicitados por los clientes internos..");

                requisitos_p.setText("* Tecnologia en Telecomunicaciones");
                //textConocimientoAd.setText("Conocimietnos Adicionales:");
                conocimiento_p.setText("* Apoyo Levantamiento Documentación e implementación de Servicios para Arquitectura de Software.." );

                //beneficios.setText("Beneficios");
                beneficios_p.setText("* Beneficios de ley.");
                icon.setIcon(new ImageIcon("src/img/puntonet_t.png"));

                ubicacion.setText("Quito, Pichincha - Ecuador");
                sueldo.setText("500");
                avance.setText("Junior");
                tiempo.setText("Intern | Presencial ");
            }
            case "novena" -> {
                titulo.setText("Centric - Passante de Sistemas");
                subtitulo.setText("CASABACA S.A.");
                parrafo_d.setText("* Apoyar en los procesos operativos del área.");
                requisitos_p.setText("* Tecnologia Sistemas y Telecomunicaciones");
                //textConocimientoAd.setText("Conocimietnos Adicionales:");
                conocimiento_p.setText("* Instalación y mantenimiento de diversos periféricos, así como instalación de " +
                        "actualizaciones y parches correspondientes.." );

                //beneficios.setText("Beneficios");
                beneficios_p.setText("* Beneficios de ley.");
                icon.setIcon(new ImageIcon("src/img/centric_t.png"));

                ubicacion.setText("Quito, Pichincha - Ecuador");
                sueldo.setText("No especificado");
                avance.setText("Junior");
                tiempo.setText("Intern | Presencial");
            }
        }
    };
}
