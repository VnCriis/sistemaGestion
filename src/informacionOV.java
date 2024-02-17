import javax.swing.*;

public class informacionOV {
    JPanel JPanelOV;
    private JButton button1;
    private JRadioButton prácticasPreprofesionalesRadioButton;
    private JRadioButton a️PrácticasLaboralesRadioButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton aplicarAhoraButton;
    private JLabel icon;
    private JLabel titulo;
    private JLabel subtitulo;
    private JLabel descripcion;
    private JLabel requisitos;
    private JLabel textFromacionA;
    private JLabel parrafo_d;
    private JLabel requisitos_p;
    private JLabel textConocimientoAd;
    private JLabel conocimiento_p;
    private JLabel beneficios;
    private JLabel beneficios_p;
    private JLabel ubicacion;
    private JLabel sueldo;
    private JLabel avance;
    private JLabel tiempo;
    private JRadioButton perfilRadioButton;

    public informacionOV(String cambio){
        Main.ventana.setTitle("Gestion De Proyectos");
        switch (cambio){
            case "primero" -> {
                titulo.setText("Desarrollador Jr");
                subtitulo.setText("Crediprime S.A. ");
                //descripcion.setText("Descripcion del puesto");
                parrafo_d.setText("*Auxiliar en el desarrollo de una app movil para inmobiliaria");
                //requisitos.setText("Requisitos");
                //textFormacionA.setText("Formacion Academica:");
                requisitos_p.setText("* Título de tercer nivel en Ingeniería en Software, Programación  o afines");
                //textConocimientoAd.setText("Conocimietnos Adicionales:");
                conocimiento_p.setText("*  Infraestructura Backend y Frontend. · C#, Angular, TypeScript,"+" JavaScript, html, CSS · Manejo de base de datos, SQL Server" );

                //beneficios.setText("Beneficios");
                beneficios_p.setText("* Beneficios de salud y días libres");
                icon.setIcon(new ImageIcon("src/img/crediprime.png"));

                ubicacion.setText("Quito, Pichincha - Ecuador");
                sueldo.setText("0");
                avance.setText("Junior");
                tiempo.setText("Full-time | Presencial");
            }
            case "segundo" -> {
                titulo.setText("ANALISTA DE DESARROLLO");
                subtitulo.setText("ORIGINARSA S.A");
                //descripcion.setText("Descripcion del puesto");
                parrafo_d.setText("* Evaluación y mejora de procesos relacionados con el desarrollo \nde software. ");
                //requisitos.setText("Requisitos");
                //textFormacionA.setText("Formacion Academica:");
                requisitos_p.setText("*  Tecnología, Sistemas y Telecomunicaciones");
                //textConocimientoAd.setText("Conocimietnos Adicionales:");
                conocimiento_p.setText("* Gestión en bases de datos, Infraestructura básica, \nProcedimientos almacenados, \nvistas, funciones, Jobs, y triggers, Arquitectura de software (API Rest y MVC),\n Generación y administración API'S.");

                //beneficios.setText("Beneficios");
                beneficios_p.setText("* Seguro médico y de vida");
                icon.setIcon(new ImageIcon("src/img/originasa.png"));

                ubicacion.setText(" Quito, Pichincha - Ecuador");
                sueldo.setText("0.00");
                avance.setText("Junior");
                tiempo.setText(" Full-time | Presencial");
            }
            case "tercero" -> {
                titulo.setText("Practicante de Ciencia de Datos");
                subtitulo.setText("OMARSA corp");
                parrafo_d.setText("Participación en proyectos de ciencia de datos, analítica y aprendizaje\n automático. Oportunidad de aprender Python, R y las últimas técnicas de IA.");

                requisitos_p.setText("Estudiante de carreras como Ingeniería de Sistemas, Estadística o\n afines.");
                conocimiento_p.setText("Conocimientos de programación es deseable.");
                beneficios_p.setText("Horario flexible, ambiente joven.");
                icon.setIcon(new ImageIcon("src/img/omarsa.png"));
                ubicacion.setText("Quito");
                sueldo.setText("$0.00");
                avance.setText("Practicante");
                tiempo.setText("Medio tiempo | Remoto");
            }

            case "cuarta" -> {
                titulo.setText("Practicante de Ciberseguridad");
                subtitulo.setText("Staff Sotware Engineer");
                parrafo_d.setText("Apoyo en tareas de monitoreo, detección y respuesta a incidentes de\n seguridad.");
                requisitos_p.setText("Estudiante de Ingeniería de Sistemas o carreras afines.");
                conocimiento_p.setText("Conocimientos de redes y seguridad informática.");
                beneficios_p.setText("Horario flexible, ambiente joven.");
                icon.setIcon(new ImageIcon("src/img/staff.png"));
                ubicacion.setText("Quito");
                sueldo.setText("$0.00");
                avance.setText("Practicante");
                tiempo.setText("Medio tiempo | Remoto");

            }

            case "quinta" -> {
                titulo.setText("Practicante de Desarrollo de Software");
                subtitulo.setText("METEL");
                parrafo_d.setText("Participación en el desarrollo de software de la empresa. Oportunidad de\n aprender metodologías ágiles y trabajo en equipo.");
                requisitos_p.setText("Estudiante universitario de Ingeniería de Sistemas o carreras afines.");
                conocimiento_p.setText("Conocimientos de programación (Java, Python u otros)");
                beneficios_p.setText("Horario flexible, ambiente joven y dinámico");
                icon.setIcon(new ImageIcon("src/img/metel.png"));
                ubicacion.setText("Quito");
                sueldo.setText("$0.00");
                avance.setText("Practicante");
                tiempo.setText("Medio tiempo | Remoto");
            }

            case "sexta" -> {
                titulo.setText("Practicante de Testing de Software");
                subtitulo.setText("HandTree Consultancy");
                parrafo_d.setText("Participar en las pruebas de software desarrollado en la empresa.\n Oportunidad de aprender testing manual y automatizado.");
                requisitos_p.setText("Estudiante universitario de Ingeniería de Sistemas o carreras afines.");
                conocimiento_p.setText("Conocimientos de testing es deseable");
                beneficios_p.setText("Horario flexible, ambiente joven y dinámico");
                icon.setIcon(new ImageIcon("src/img/handtree.png"));
                ubicacion.setText("Quito");
                sueldo.setText("$0.00");
                avance.setText("Practicante");
                tiempo.setText("Medio tiempo | Remoto");

            }

            case "septimo" -> {
                titulo.setText("Practicante de Base de Datos");
                subtitulo.setText("Punto Net");
                parrafo_d.setText("Participación en tareas de administración de bases de datos de la\n empresa. Oportunidad de aprender SQL, NoSQL y modelado de datos.");
                requisitos_p.setText("Estudiante universitario de Ingeniería de Sistemas o carreras afines.");
                conocimiento_p.setText("Conocimientos de bases de datos es deseable");
                beneficios_p.setText("Horario flexible, ambiente joven y dinámico");
                icon.setIcon(new ImageIcon("src/img/puntonett.png"));
                ubicacion.setText("Quito");
                sueldo.setText("$0.00");
                avance.setText("Practicante");
                tiempo.setText("Medio tiempo | Remoto");

            }

            case "octavo" -> {
                titulo.setText("Practicante de Redes y Seguridad Informática");
                subtitulo.setText("QualityUp");
                parrafo_d.setText("Apoyo en tareas de administración de redes y seguridad informática.\n Oportunidad de aprender sobre redes TCP/IP, firewalls, VPNs, etc.");
                requisitos_p.setText("Estudiante universitario de Ingeniería de Sistemas o carreras afines.");
                conocimiento_p.setText("Conocimientos de redes es deseable");
                beneficios_p.setText("Horario flexible, ambiente joven y dinámico");
                icon.setIcon(new ImageIcon("src/img/qualityUp.png"));
                ubicacion.setText("Quito");
                sueldo.setText("$0.00");
                avance.setText("Practicante");
                tiempo.setText("Medio tiempo | Remoto");
            }
            case "noveno" -> {
                titulo.setText("Practicante de Innovación y Emprendimiento Digital");
                subtitulo.setText("human brand S.A.");
                parrafo_d.setText("Participación en proyectos de innovación tecnológica y emprendimiento.\n Oportunidad de aprender metodologías ágiles, diseño de productos digitales, validación de ideas, etc.");
                requisitos_p.setText("Estudiante universitario de carreras como Ingeniería de Sistemas, Diseño,\n Marketing, etc.");
                conocimiento_p.setText("Proactividad, creatividad y estar al día con las últimas tendencias \ndigitales.");
                beneficios_p.setText("Horario flexible, ambiente diverso y enérgico. Networking con\n emprendedores.");
                icon.setIcon(new ImageIcon("src/img/humanbrand.png"));
                ubicacion.setText("Quito");
                sueldo.setText("$0.00");
                avance.setText("Practicante");
                tiempo.setText("Medio tiempo | Remoto");
            }
        }
    };
}
