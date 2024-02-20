import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JList beneficios_p;
    private JLabel icon;
    JPanel JPanelOL;
    private JLabel textFormacionA;
    private JLabel textConocimientoAd;
    private JList conocimiento_p;
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
                parrafo_d.setText("Brindar Soporte oportuno de primer y segundo nivel a clientes internos.");
                //requisitos.setText("Requisitos");
                //textFormacionA.setText("Formacion Academica:");
                requisitos_p.setText("• Ingeniero o Egresado en Sistemas");
                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Conocimiento de Cyberseguridad.");
                contenedor.addElement("• Administración de base de datos mysql, sql server.");
                contenedor.addElement("• Soporte remoto o en sitio a usuarios.");
                conocimiento_p.setModel(contenedor);

                //beneficios
                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Beneficios de Ley.");
                contenedorbeneficios.addElement("• Beneficios Corporativos.");
                contenedorbeneficios.addElement("• Plan Carrera.");
                beneficios_p.setModel(contenedorbeneficios);

                icon.setIcon(new ImageIcon("src/img/servical_renovado.png"));

                ubicacion.setText("📍 Quito, Pichincha - Ecuador");
                sueldo.setText("💵 500");
                avance.setText("✅ Semi senior");
                tiempo.setText("🕛 Full-time | Presencial");
            }
            case "segundo" -> {
                titulo.setText("Supervisor De Produccion");
                subtitulo.setText("NOVACERO");
                parrafo_d.setText("Supervisar que se cumpla con las guías y métodos de trabajo para garantizar " +
                        "la operatividad de maquinas y evitar accidentes");
                requisitos_p.setText("• Tecnologia Superior De Agua y Saniamiento");
                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Procesos de producción");
                contenedor.addElement("• Manejo de personal.");
                contenedor.addElement("• Metalurgia y materiales.");
                conocimiento_p.setModel(contenedor);


                //beneficios
                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Beneficios de ley & corporativos.");
                beneficios_p.setModel(contenedorbeneficios);

                icon.setIcon(new ImageIcon("src/img/novacero.png"));

                ubicacion.setText("📍 Latacunga, Cotopaxi - Ecuador");
                sueldo.setText("💵 No especificado");
                avance.setText("✅ Semi senior");
                tiempo.setText("🕛 No especificado | Presencial");
            }
            case "tercero" -> {
                titulo.setText("Experto Calidad TI(Quality Assurance)");
                subtitulo.setText("BANCO PICHINCHA");
                //descripcion.setText("Descripcion del puesto");
                parrafo_d.setText("• Planificar, monitorear y dar seguimiento al proceso de aseguramiento y control de calidad utilizado en todo el ciclo de vida de construcción de soluciones tecnológicas, control de métricas de cumplimiento de los lineamientos de calidad, alineación del plan de pruebas, planes de mejora continua del proceso, acompañamiento a los equipos de QA así como el monitoreo de demanda y distribución de cargas entre la tribu/squad asignado, con el fin de contribuir al cumplimiento y alineación del proceso de aseguramiento y control de calidad de software, mejora de tiempos, nivel de servicio y eficiencias de entrega de soluciones al negocio, de acuerdo a las estrategia definida por el Chapter de QA.");
                //requisitos.setText("Requisitos");
                //textFormacionA.setText("Formacion Academica:");
                requisitos_p.setText("• Tecnologia Sistemas yy Telecomunicaciones");
                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Manejo de herramientas en gestión de proyectos y pruebas.");
                contenedor.addElement("• Herramientas de automatización y rendimiento de pruebas.");
                contenedor.addElement("• Prácticas de Pruebas: ISTQB.");
                contenedor.addElement("• Lenguajes de programación.");
                conocimiento_p.setModel(contenedor);

                //beneficios
                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Seguro médico privado");
                contenedorbeneficios.addElement("Tarjeta de crédito como parte de tu bienvenida");
                contenedorbeneficios.addElement("• Planes de ahorro con beneficios especiales");
                beneficios_p.setModel(contenedorbeneficios);

                icon.setIcon(new ImageIcon("src/img/banco_t.png"));

                ubicacion.setText("📍 Pichincha, Ecuador - Quito");
                sueldo.setText("💵 No especificado");
                avance.setText("✅ Senior");
                tiempo.setText("🕛 Full-time | Presencial ");
            }
            case "cuarto" -> {
                titulo.setText("Tecnico De Seguridad y Salud Ocupacional");
                subtitulo.setText("CORIS DEL ECUADOR");
                //descripcion.setText("Descripcion del puesto");
                parrafo_d.setText("Levantamiento de matrices de riesgos, planes de emergencia, contingencia, políticas y procedimientos del subsistema de SSO.");
                //requisitos.setText("Requisitos");
                //textFormacionA.setText("Formacion Academica:");
                requisitos_p.setText("• Tecnologia Sistemas y Telecomunicaciones");
                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Credibilidad técnica");
                contenedor.addElement("• Seguimiento de gestión");
                contenedor.addElement("• Pensamiento analítico");

                conocimiento_p.setModel(contenedor);



                //beneficios
                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Beneficios de Ley.");
                contenedorbeneficios.addElement("• Beneficios Coorporativos.");
                beneficios_p.setModel(contenedorbeneficios);

                icon.setIcon(new ImageIcon("src/img/coris_t.png"));

                ubicacion.setText("📍 Quito, Pichincha - Ecuador");
                sueldo.setText("💵 600");
                avance.setText("✅ Semi Senior");
                tiempo.setText("🕛 Full-time | Presencial ");

            }
            case "quinto" -> {
                titulo.setText("Analista De Desarrollo");
                subtitulo.setText("ORIGINARSA S.A");
                parrafo_d.setText("* Evaluación y mejora de procesos relacionados con el desarrollo de software.\n" +
                        "Papel crucial en la planificación, diseño, implementación y mejora continua de soluciones de software, asegurando que cumplan con los requisitos del negocio y se desarrollen de manera eficiente y efectiva.");

                requisitos_p.setText("* Tecnologia Sistemas y Telecomunicaciones");
                //textConocimientoAd.setText("Conocimietnos Adicionales:");
                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Gestión en bases de datos, Infraestructura básica");
                contenedor.addElement("• Procedimientos vistas, funciones, Jobs, y triggers");
                contenedor.addElement("• Arquitectura de software (API Rest y MVC)");
                contenedor.addElement("• Manejo de: Microsoft. Net, SQL Server, MySQL, NoSQL ");



                //beneficios.setText("Beneficios");
                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Sueldo fijo");
                contenedorbeneficios.addElement("• Seguro médico");
                contenedorbeneficios.addElement("• Beneficios de ley");
                beneficios_p.setModel(contenedorbeneficios);

                icon.setIcon(new ImageIcon("src/img/originasa.png"));

                ubicacion.setText("📍 Quito, Pichincha - Ecuador");
                sueldo.setText("💵 No especificado");
                avance.setText("✅ Junior");
                tiempo.setText("🕛 Full-time | Presencial ");
            }
            case "sexto" -> {
                titulo.setText("Analista De Desarrollo");
                subtitulo.setText("IMPROVE-INFORMATION-TECHNOLOGIES CIA.LTDA");
                parrafo_d.setText("* Evaluación y mejora de procesos relacionados con el desarrollo de software.\n" +
                        "Papel crucial en la planificación, diseño, implementación y mejora continua de soluciones de software, asegurando que cumplan con los requisitos del negocio y se desarrollen de manera eficiente y efectiva.");

                requisitos_p.setText("* Tecnologia Sistemas y Telecomunicaciones");
                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Levantamiento, análisis y escritura de requerimientos");
                contenedor.addElement("• Conocimientos HTML 5, CSS, JavaScript");
                contenedor.addElement("• Conocimientos SQL Server, Transact SQL");
                contenedor.addElement("• Creación de historias de usuario");
                contenedor.addElement("• Conocimientos en diagramas de flujo de procesos");
                conocimiento_p.setModel(contenedor);

                //beneficios
                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Sueldo fijo");
                contenedorbeneficios.addElement("• Aprendizaje continuo");
                contenedorbeneficios.addElement("• Beneficios de ley");
                beneficios_p.setModel(contenedorbeneficios);

                icon.setIcon(new ImageIcon("src/img/improve.png"));

                ubicacion.setText("📍 Quito, Pichincha - Ecuador");
                sueldo.setText("💵 No especificado");
                avance.setText("✅ Junior");
                tiempo.setText("🕛 Full-time | Presencial ");
            }
            case "septimo" -> {
                titulo.setText("Staff Software Engineer");
                subtitulo.setText("STAFFING");
                parrafo_d.setText("* Staff Software Engineer Estamos buscando un Staff Full-Stack Engineer experimentado " +
                        "y creativo para unirse a nuestro creciente equipo " +
                        "de servicios de integración y ayudar a llevar nuestra empresa al siguiente nivel..");

                requisitos_p.setText("* Tecnologia en Desarrollo de Software");
                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Experiencia con NestJS, Node.js, Typecript o JavaScript.");
                contenedor.addElement("• Bases de datos relacionales (Postgres, Redshift) y bibliotecas ORM.");
                contenedor.addElement("• Experiencia con estructuras de datos, transformación y desnormalización.");
                contenedor.addElement("• Lenguajes de marcado como JSON y XML.");
                contenedor.addElement("• Conocimientos en diagramas de flujo de procesos");
                conocimiento_p.setModel(contenedor);

                //beneficios
                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Sueldo fijo");
                contenedorbeneficios.addElement("• Beneficios de ley");
                beneficios_p.setModel(contenedorbeneficios);
                icon.setIcon(new ImageIcon("src/img/staffing_t.png"));

                ubicacion.setText("📍 Quito, Pichincha - Ecuador");
                sueldo.setText("💵 No especificado");
                avance.setText("✅ Semi senior");
                tiempo.setText("🕛 Full-time | Presencial ");
            }
            case "octava" -> {
                titulo.setText("Pasante Sistemas");
                subtitulo.setText("PUNTONET");
                parrafo_d.setText("* Dar apoyo al área de sistemas en base a los requerimientos " +
                        "solicitados por los clientes internos..");

                requisitos_p.setText("* Tecnologia en Telecomunicaciones");
                //textConocimientoAd.setText("Conocimietnos Adicionales:");
                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Automatización de seguridad para manejo de credenciales de usuarios");
                contenedor.addElement("• Levantamiento de Procesos de QA para desarrollo de software interno");
                contenedor.addElement("• Documentación e implementación de Servicios para Arquitectura de Software.");
                conocimiento_p.setModel(contenedor);

                //beneficios.setText("Beneficios");
                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Beneficios de ley");
                beneficios_p.setModel(contenedorbeneficios);

                icon.setIcon(new ImageIcon("src/img/puntonet_t.png"));

                ubicacion.setText("📍 Quito, Pichincha - Ecuador");
                sueldo.setText("💵 500");
                avance.setText("✅ Junior");
                tiempo.setText("🕛 Interno | Presencial ");
            }
            case "novena" -> {
                titulo.setText("Centric - Passante de Sistemas");
                subtitulo.setText("CASABACA S.A.");
                parrafo_d.setText("* Apoyar en los procesos operativos del área.");
                requisitos_p.setText("* Tecnologia Sistemas y Telecomunicaciones");
                //textConocimientoAd.setText("Conocimietnos Adicionales:");
                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Manejar inventario tecnológico de las empresas del grupo.");
                contenedor.addElement("• Instalación y mantenimiento de diversos periféricos");
                contenedor.addElement("• Configuración de aplicaciones de hardware y software");
                conocimiento_p.setModel(contenedor);

                //beneficios.setText("Beneficios");
                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Aprendizaje continuo");
                beneficios_p.setModel(contenedorbeneficios);

                icon.setIcon(new ImageIcon("src/img/centric_t.png"));

                ubicacion.setText("📍 Quito, Pichincha - Ecuador");
                sueldo.setText("💵 No especificado");
                avance.setText("✅ Junior");
                tiempo.setText("🕛 Interno | Presencial");
            }
        }
        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new estudiantesOL().olJPanel);
                Main.ventana.validate();
            }
        });
        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new estudiantesOL().olJPanel);
                Main.ventana.validate();
            }
        });
        perfilRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new informacion_estudiante().infoEstudiante);
                Main.ventana.validate();
            }
        });
    };
}
