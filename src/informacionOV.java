import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class informacionOV {
    JPanel JPanelOV;
    private JButton cerrarSesiónButton;
    private JRadioButton prácticasPreprofesionalesRadioButton;
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
    private JList conocimiento_p;
    private JLabel beneficios;
    private JList beneficios_p;
    private JLabel ubicacion;
    private JLabel sueldo;
    private JLabel avance;
    private JLabel tiempo;
    private JRadioButton perfilRadioButton;
    private JList parrafo_p;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;

    public informacionOV(String cambio){
        Main.ventana.setTitle("Ofertas de Practicas y Vinculacion");

        textField1.setText(Main.nombre);
        textField2.setText(Main.facultad);
        textField3.setText(Main.carrera);
        textField4.setText(Main.periodo);
        switch (cambio){
            case "primero" -> {
                titulo.setText("Desarrollador Jr");
                subtitulo.setText("Crediprime S.A. ");

                DefaultListModel contenedorPa= new DefaultListModel();
                contenedorPa.addElement("• Auxiliar en el desarrollo de una app movil para inmobiliaria");
                parrafo_p.setModel(contenedorPa);



                requisitos_p.setText("• Título de tercer nivel en Ingeniería en Software, Programación  o afines");
                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Infraestructura Backend y Frontend.");
                contenedor.addElement("• C#, Angular, TypeScript");
                contenedor.addElement("• JavaScript, html, CSS");
                contenedor.addElement("• Manejo de base de datos, SQL Server");
                conocimiento_p.setModel(contenedor);


                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Beneficios de salud y días libres");
                beneficios_p.setModel(contenedorbeneficios);
                icon.setIcon(new ImageIcon("src/img/crediprime.png"));

                ubicacion.setText("📍 Quito, Pichincha - Ecuador");
                sueldo.setText("💵 0");
                avance.setText("✅ Junior");
                tiempo.setText("🕛 Full-time | Presencial");
            }
            case "segundo" -> {
                titulo.setText("ANALISTA DE DESARROLLO");
                subtitulo.setText("ORIGINARSA S.A");

                DefaultListModel contenedorPa= new DefaultListModel();
                contenedorPa.addElement("• Evaluación y mejora de procesos relacionados con el desarrollo");
                contenedorPa.addElement(" de software.");
                parrafo_p.setModel(contenedorPa);

                requisitos_p.setText("• Tecnología, Sistemas y Telecomunicaciones");
                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Gestión en bases de datos, Infraestructura básica.");
                contenedor.addElement("• Procedimientos almacenados");
                contenedor.addElement("• Vistas, funciones, Jobs, y triggers");
                contenedor.addElement("• Arquitectura de software (API Rest y MVC)");
                contenedor.addElement("• Generación y administración API'S");
                conocimiento_p.setModel(contenedor);


                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Seguro médico y de vida");
                beneficios_p.setModel(contenedorbeneficios);
                icon.setIcon(new ImageIcon("src/img/originasa.png"));

                ubicacion.setText("📍 Quito, Pichincha - Ecuador");
                sueldo.setText("💵 0");
                avance.setText("✅ Junior");
                tiempo.setText("🕛 Full-time | Presencial");
            }
            case "tercero" -> {
                titulo.setText("Practicante de Ciencia de Datos");
                subtitulo.setText("OMARSA corp");


                DefaultListModel contenedorPa= new DefaultListModel();
                contenedorPa.addElement("• Participación en proyectos de ciencia de datos, analítica y ");
                contenedorPa.addElement("  automático. Oportunidad de aprender Python, R y las últimas");
                contenedorPa.addElement("  técnicas de IA.");
                parrafo_p.setModel(contenedorPa);

                requisitos_p.setText("Estudiante de carreras como Ingeniería de Sistemas.");
                //conocimiento_p.setText("Conocimientos de programación es deseable.");
                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Conocimientos de programación es deseable..");
                conocimiento_p.setModel(contenedor);


                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Horario flexible, ambiente joven.");
                beneficios_p.setModel(contenedorbeneficios);

                icon.setIcon(new ImageIcon("src/img/omarsa.png"));
                ubicacion.setText("📍 Quito");
                sueldo.setText("💵 0");
                avance.setText("✅ Practicante");
                tiempo.setText("🕛 Medio tiempo | Remoto");
            }

            case "cuarta" -> {
                titulo.setText("Practicante de Ciberseguridad");
                subtitulo.setText("Staff Sotware Engineer");

                DefaultListModel contenedorPa= new DefaultListModel();
                contenedorPa.addElement("• Apoyo en tareas de monitoreo, detección y respuesta a incidentes");
                contenedorPa.addElement("  seguridad.");
                parrafo_p.setModel(contenedorPa);

                requisitos_p.setText("•Estudiante de Ingeniería de Sistemas o carreras afines.");
                //conocimiento_p.setText("Conocimientos de redes y seguridad informática.");
                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Conocimientos de redes y seguridad informática.");
                conocimiento_p.setModel(contenedor);


                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Horario flexible, ambiente joven.");
                beneficios_p.setModel(contenedorbeneficios);

                icon.setIcon(new ImageIcon("src/img/staff.png"));
                ubicacion.setText("📍 Quito");
                sueldo.setText("💵 0");
                avance.setText("✅ Practicante");
                tiempo.setText("🕛 Medio tiempo | Remoto");

            }

            case "quinta" -> {
                titulo.setText("Practicante de Desarrollo de Software");
                subtitulo.setText("METEL");

                DefaultListModel contenedorPa= new DefaultListModel();
                contenedorPa.addElement("• Participación en el desarrollo de software de la empresa,");
                contenedorPa.addElement("  oportunidades de aprender metodologías ágiles y trabajo en equipo.");
                parrafo_p.setModel(contenedorPa);

                requisitos_p.setText("• Estudiante universitario de Ingeniería de Sistemas");
                //conocimiento_p.setText("Conocimientos de programación (Java, Python u otros)");
                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Conocimientos de programación (Java, Python u otros)");
                conocimiento_p.setModel(contenedor);


                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Horario flexible, ambiente joven y dinámico.");
                beneficios_p.setModel(contenedorbeneficios);

                icon.setIcon(new ImageIcon("src/img/metel.png"));
                ubicacion.setText("📍 Quito");
                sueldo.setText("💵 0");
                avance.setText("✅ Practicante");
                tiempo.setText("🕛 Medio tiempo | Remoto");
            }

            case "sexta" -> {
                titulo.setText("Practicante de Testing de Software");
                subtitulo.setText("HandTree Consultancy");

                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Participar en las pruebas de software desarrollado en la empresa,");
                contenedor.addElement("  oportunidad de aprender testing manual y automatizado.");
                conocimiento_p.setModel(contenedor);

                DefaultListModel contenedorPa= new DefaultListModel();
                contenedorPa.addElement("• Oportunidad de aprender testing manual y automatizado.");
                parrafo_p.setModel(contenedorPa);

                requisitos_p.setText("• Estudiante universitario de Ingeniería de Sistemas o carreras afines.");
                //conocimiento_p.setText("Conocimientos de testing es deseable");
                contenedor = new DefaultListModel();
                contenedor.addElement("• Conocimientos de testing es deseable");
                conocimiento_p.setModel(contenedor);


                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Horario flexible, ambiente joven y dinámico.");
                beneficios_p.setModel(contenedorbeneficios);

                icon.setIcon(new ImageIcon("src/img/handtree.png"));
                ubicacion.setText("📍 Quito");
                sueldo.setText("💵 0");
                avance.setText("✅ Practicante");
                tiempo.setText("🕛 Medio tiempo | Remoto");

            }

            case "septimo" -> {
                titulo.setText("Practicante de Base de Datos");
                subtitulo.setText("Punto Net");
                DefaultListModel contenedorPa= new DefaultListModel();
                contenedorPa.addElement("• Participación en tareas de administración de bases de datos");
                contenedorPa.addElement("  Oportunidad de aprender SQL, NoSQL y modelado de datos.");
                parrafo_p.setModel(contenedorPa);

                requisitos_p.setText("• Estudiante de tecnologia en desarrollo de softaware");
                //conocimiento_p.setText("Conocimientos de bases de datos es deseable");
                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Conocimientos de bases de datos es deseable");
                conocimiento_p.setModel(contenedor);


                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Horario flexible, ambiente joven y dinámico.");
                beneficios_p.setModel(contenedorbeneficios);
                icon.setIcon(new ImageIcon("src/img/puntonett.png"));
                ubicacion.setText("📍 Quito");
                sueldo.setText("💵 0");
                avance.setText("✅ Practicante");
                tiempo.setText("🕛 Medio tiempo | Remoto");

            }

            case "octavo" -> {
                titulo.setText("Practicante de Redes y Seguridad Informática");
                subtitulo.setText("QualityUp");
                parrafo_d.setText(" Oportunidad de aprender sobre redes TCP/IP, firewalls, VPNs, etc.");

                DefaultListModel contenedorPa= new DefaultListModel();
                contenedorPa.addElement("• Apoyo en tareas de administración de redes y seguridad informática.");
                contenedorPa.addElement("  Oportunidad de aprender sobre redes TCP/IP, firewalls, VPNs, etc.");
                parrafo_p.setModel(contenedorPa);

                requisitos_p.setText("• Estudiante de tecnologia en desarrollo de softaware");
                //conocimiento_p.setText("Conocimientos de redes es deseable");
                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Conocimientos de bases de datos es deseable");
                conocimiento_p.setModel(contenedor);


                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Horario flexible, ambiente joven y dinámico.");
                beneficios_p.setModel(contenedorbeneficios);

                icon.setIcon(new ImageIcon("src/img/qualityUp.png"));
                ubicacion.setText("📍 Quito");
                sueldo.setText("💵 0");
                avance.setText("✅ Practicante");
                tiempo.setText("🕛 Medio tiempo | Remoto");
            }
            case "noveno" -> {
                titulo.setText("Practicante de Innovación y Emprendimiento Digital");
                subtitulo.setText("human brand S.A.");

                DefaultListModel contenedorPa= new DefaultListModel();
                contenedorPa.addElement("• Participación en proyectos de innovación tecnológica y emprendimiento.");
                contenedorPa.addElement("  Oportunidad de aprender metodologías ágiles, diseño de productos");
                contenedorPa.addElement("  digitalees, validación de ideas, etc.");
                parrafo_p.setModel(contenedorPa);


                requisitos_p.setText("• Estudiante de tecnologia desarrollo de software/ redes.");
                //conocimiento_p.setText("Proactividad, creatividad y estar al día con las últimas tendencias \ndigitales.");
                DefaultListModel contenedor= new DefaultListModel();
                contenedor.addElement("• Proactividad, creatividad ");
                contenedor.addElement("• Estar al día con las últimas tendencias \\ndigitales");
                conocimiento_p.setModel(contenedor);

                DefaultListModel contenedorbeneficios= new DefaultListModel();
                contenedorbeneficios.addElement("• Horario flexible, ambiente joven y dinámico.");
                contenedorbeneficios.addElement("• Networking con emprendedores.");
                beneficios_p.setModel(contenedorbeneficios);
                icon.setIcon(new ImageIcon("src/img/humanbrand.png"));
                ubicacion.setText("📍 Quito");
                sueldo.setText("💵 0");
                avance.setText("✅ Practicante");
                tiempo.setText("🕛 Medio tiempo | Remoto");
            }
        }
        prácticasPreprofesionalesRadioButton.addActionListener(new ActionListener() {
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
        cerrarSesiónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.ventana.setContentPane(new login().loginJPanel);
                Main.ventana.revalidate();
            }
        });
    };
}
