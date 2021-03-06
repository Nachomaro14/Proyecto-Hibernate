package vista;

import facade.Facade;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import hibernate.Alumnos;
import hibernate.AsigMat;
import hibernate.Asignaturas;
import hibernate.AsignaturasId;
import hibernate.Aulas;
import hibernate.AulasId;
import hibernate.Matriculas;
import hibernate.Paa;
import hibernate.Profesores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import sqlite.ConexionSQLite;

public class Interfaz extends javax.swing.JFrame {
    Facade facade = new Facade();
    ConexionSQLite sqlite = new ConexionSQLite();

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        matriculas = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaMatriculas = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaAsigMat = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnNuevaMatricula = new javax.swing.JMenuItem();
        btnConsultas = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();
        jPanel14 = new javax.swing.JPanel();
        btnSalirInicio1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        btnLetras1 = new javax.swing.JButton();
        btnCiencias1 = new javax.swing.JButton();
        matriculas1 = new javax.swing.JDialog();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaMatriculas1 = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablaAsigMat1 = new javax.swing.JTable();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        btnNuevaMatricula1 = new javax.swing.JMenuItem();
        btnConsultas1 = new javax.swing.JMenuItem();
        btnSalir1 = new javax.swing.JMenuItem();
        consultas = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtNotaAsignatura = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnModificarNota = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtDniAlumno = new javax.swing.JTextField();
        txtTituloAsignatura = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        btnEliminarAlumno = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaAsigMatAlum = new javax.swing.JTable();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNuevoTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumCreditos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnEliminarAsignatura = new javax.swing.JButton();
        btnModificarAsignatura = new javax.swing.JButton();
        btnAnadirAsignatura = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        txtNuevoCodigoAsignatura = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaAsignaturas = new javax.swing.JTable();
        jSplitPane3 = new javax.swing.JSplitPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaProfesores = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDniProfesor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidosProfesor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombreProfesor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDomicilioProfesor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefonoProfesor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnAnadirProfesor = new javax.swing.JButton();
        btnModificarProfesor = new javax.swing.JButton();
        btnEliminarProfesor = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtSupervisorProfesor = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtNuevoDniProfesor = new javax.swing.JTextField();
        jSplitPane4 = new javax.swing.JSplitPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtEdificio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAula = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnAnadirAula = new javax.swing.JButton();
        btnModificarAula = new javax.swing.JButton();
        btnEliminarAula = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtNuevoEdificio = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtNuevoNumero = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAulas = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablaAsignaciones = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        comboProfesor = new javax.swing.JComboBox();
        comboAsignatura = new javax.swing.JComboBox();
        comboEdificio = new javax.swing.JComboBox();
        comboAula = new javax.swing.JComboBox();
        jPanel11 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        btnAsignar = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        txtCodigoAsignacion = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        btnEliminarAsignacion = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        btnVolver = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        nuevaMatricula = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtNuevoDni = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtNuevoApellidos = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNuevoNombre = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtNuevoDomicilio = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtNuevoTelefono = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtNuevoAcceso = new javax.swing.JTextField();
        comboAsignaturasAMatricular = new javax.swing.JComboBox();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaAsignaturasAMatricular = new javax.swing.JList();
        btnCompletarMatricula = new javax.swing.JButton();
        btnCancelarMatricula = new javax.swing.JButton();
        btnAnadirAsignaturaMatricula = new javax.swing.JButton();
        cs = new javax.swing.JDialog();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tablaAlumnosCS = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        tablaAsignaturasCS = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSalirInicio = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnAcceder = new javax.swing.JButton();

        matriculas.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        tablaMatriculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaMatriculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMatriculasMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablaMatriculas);

        jPanel1.add(jScrollPane5);

        tablaAsigMat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tablaAsigMat);

        jPanel1.add(jScrollPane7);

        jMenu1.setText("Opciones");

        btnNuevaMatricula.setText("Nueva Matrícula");
        btnNuevaMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaMatriculaActionPerformed(evt);
            }
        });
        jMenu1.add(btnNuevaMatricula);

        btnConsultas.setText("Consultas");
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });
        jMenu1.add(btnConsultas);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jMenu1.add(btnSalir);

        jMenuBar1.add(jMenu1);

        matriculas.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout matriculasLayout = new javax.swing.GroupLayout(matriculas.getContentPane());
        matriculas.getContentPane().setLayout(matriculasLayout);
        matriculasLayout.setHorizontalGroup(
            matriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );
        matriculasLayout.setVerticalGroup(
            matriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        jPanel14.setLayout(new java.awt.GridLayout(1, 0));

        btnSalirInicio1.setText("Salir");
        jPanel14.add(btnSalirInicio1);

        jPanel15.setLayout(new java.awt.GridLayout(1, 0));

        btnLetras1.setText("LETRAS");
        jPanel15.add(btnLetras1);

        btnCiencias1.setText("CIENCIAS");
        jPanel15.add(btnCiencias1);

        matriculas1.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel16.setLayout(new java.awt.GridLayout(0, 1));

        tablaMatriculas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(tablaMatriculas1);

        jPanel16.add(jScrollPane10);

        tablaAsigMat1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(tablaAsigMat1);

        jPanel16.add(jScrollPane11);

        jMenu2.setText("Opciones");

        btnNuevaMatricula1.setText("Nueva Matrícula");
        btnNuevaMatricula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaMatricula1ActionPerformed(evt);
            }
        });
        jMenu2.add(btnNuevaMatricula1);

        btnConsultas1.setText("Consultas");
        jMenu2.add(btnConsultas1);

        btnSalir1.setText("Salir");
        jMenu2.add(btnSalir1);

        jMenuBar3.add(jMenu2);

        matriculas1.setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout matriculas1Layout = new javax.swing.GroupLayout(matriculas1.getContentPane());
        matriculas1.getContentPane().setLayout(matriculas1Layout);
        matriculas1Layout.setHorizontalGroup(
            matriculas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );
        matriculas1Layout.setVerticalGroup(
            matriculas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        consultas.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel14.setText("Nota");

        jLabel15.setText("<- ->");

        btnModificarNota.setText("Modificar");

        jLabel16.setText("DNI");

        txtDniAlumno.setEditable(false);

        jLabel24.setText("Asignatura");

        btnEliminarAlumno.setText("Eliminar");
        btnEliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNotaAsignatura)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel15))
                    .addComponent(btnModificarNota, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(txtDniAlumno)
                    .addComponent(txtTituloAsignatura)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel24)
                            .addComponent(btnEliminarAlumno))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDniAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTituloAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNotaAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel4);

        jPanel9.setLayout(new java.awt.GridLayout(0, 1));

        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAlumnos);

        jPanel9.add(jScrollPane1);

        tablaAsigMatAlum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaAsigMatAlum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAsigMatAlumMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tablaAsigMatAlum);

        jPanel9.add(jScrollPane8);

        jSplitPane1.setRightComponent(jPanel9);

        jTabbedPane1.addTab("Alumnos", jSplitPane1);

        jLabel1.setText("Código");

        txtCodigo.setEditable(false);

        jLabel2.setText("Nuevo Título");

        jLabel3.setText("Núm. Créditos");

        jLabel11.setText("<- ->");

        btnEliminarAsignatura.setText("Eliminar");
        btnEliminarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAsignaturaActionPerformed(evt);
            }
        });

        btnModificarAsignatura.setText("Modificar");
        btnModificarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAsignaturaActionPerformed(evt);
            }
        });

        btnAnadirAsignatura.setText("Añadir");
        btnAnadirAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirAsignaturaActionPerformed(evt);
            }
        });

        jLabel25.setText("Nuevo Código");

        jLabel29.setText("Título");

        txtTitulo.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addComponent(btnModificarAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnadirAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNuevoCodigoAsignatura)
                    .addComponent(txtNuevoTitulo)
                    .addComponent(txtNumCreditos)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel25)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel29))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtTitulo))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addGap(4, 4, 4)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNuevoCodigoAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNuevoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(btnAnadirAsignatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarAsignatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarAsignatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jSplitPane2.setLeftComponent(jPanel5);

        tablaAsignaturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaAsignaturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAsignaturasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaAsignaturas);

        jSplitPane2.setRightComponent(jScrollPane3);

        jTabbedPane1.addTab("Asignaturas", jSplitPane2);

        tablaProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaProfesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProfesoresMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaProfesores);

        jSplitPane3.setRightComponent(jScrollPane4);

        jLabel4.setText("DNI");

        txtDniProfesor.setEditable(false);

        jLabel5.setText("Apellidos");

        jLabel6.setText("Nombre");

        jLabel7.setText("Domicilio");

        jLabel8.setText("Teléfono");

        jLabel13.setText("<- ->");

        btnAnadirProfesor.setText("Añadir");
        btnAnadirProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirProfesorActionPerformed(evt);
            }
        });

        btnModificarProfesor.setText("Modificar");
        btnModificarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProfesorActionPerformed(evt);
            }
        });

        btnEliminarProfesor.setText("Eliminar");
        btnEliminarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProfesorActionPerformed(evt);
            }
        });

        jLabel22.setText("DNI Supervisor");

        jLabel26.setText("Nuevo DNI");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDniProfesor)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13))
                    .addComponent(btnEliminarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnAnadirProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNuevoDniProfesor)
                    .addComponent(txtApellidosProfesor)
                    .addComponent(txtNombreProfesor)
                    .addComponent(txtDomicilioProfesor)
                    .addComponent(txtTelefonoProfesor)
                    .addComponent(txtSupervisorProfesor)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel26)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel22))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDniProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNuevoDniProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidosProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDomicilioProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefonoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSupervisorProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnAnadirProfesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarProfesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarProfesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jSplitPane3.setLeftComponent(jPanel6);

        jTabbedPane1.addTab("Profesores", jSplitPane3);

        jLabel9.setText("Edificio");

        txtEdificio.setEditable(false);

        jLabel10.setText("Número");

        txtAula.setEditable(false);

        jLabel12.setText("<- ->");

        btnAnadirAula.setText("Añadir");
        btnAnadirAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirAulaActionPerformed(evt);
            }
        });

        btnModificarAula.setText("Modificar");
        btnModificarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAulaActionPerformed(evt);
            }
        });

        btnEliminarAula.setText("Eliminar");
        btnEliminarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAulaActionPerformed(evt);
            }
        });

        jLabel27.setText("Nuevo Edificio");

        jLabel28.setText("Nuevo Número");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdificio)
                    .addComponent(txtAula)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addComponent(btnEliminarAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarAula, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnAnadirAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNuevoEdificio)
                    .addComponent(txtNuevoNumero))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNuevoEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNuevoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(btnAnadirAula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarAula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarAula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        jSplitPane4.setLeftComponent(jPanel7);

        tablaAulas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaAulas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAulasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaAulas);

        jSplitPane4.setRightComponent(jScrollPane2);

        jTabbedPane1.addTab("Aulas", jSplitPane4);

        jPanel8.setLayout(new java.awt.BorderLayout());

        tablaAsignaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaAsignaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAsignacionesMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tablaAsignaciones);

        jPanel8.add(jScrollPane9, java.awt.BorderLayout.CENTER);

        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        comboProfesor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel10.add(comboProfesor);

        comboAsignatura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel10.add(comboAsignatura);

        comboEdificio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboEdificio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboEdificioItemStateChanged(evt);
            }
        });
        jPanel10.add(comboEdificio);

        comboAula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboAula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAulaItemStateChanged(evt);
            }
        });
        jPanel10.add(comboAula);

        jPanel8.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));
        jPanel11.add(filler1);

        btnAsignar.setText("Asignar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });
        jPanel11.add(btnAsignar);
        jPanel11.add(filler4);

        txtCodigoAsignacion.setEnabled(false);
        jPanel11.add(txtCodigoAsignacion);
        jPanel11.add(filler3);

        btnEliminarAsignacion.setText("Eliminar");
        btnEliminarAsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAsignacionActionPerformed(evt);
            }
        });
        jPanel11.add(btnEliminarAsignacion);
        jPanel11.add(filler2);

        jPanel8.add(jPanel11, java.awt.BorderLayout.PAGE_END);

        jTabbedPane1.addTab("Asignaciones", jPanel8);

        jMenu3.setText("Opciones");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jMenu3.add(btnVolver);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Copia de Seguridad");

        jMenuItem1.setText("Realizar CS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Visualizar CS");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar2.add(jMenu4);

        consultas.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout consultasLayout = new javax.swing.GroupLayout(consultas.getContentPane());
        consultas.getContentPane().setLayout(consultasLayout);
        consultasLayout.setHorizontalGroup(
            consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultasLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        consultasLayout.setVerticalGroup(
            consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultasLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        nuevaMatricula.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setLayout(new java.awt.GridLayout(0, 1));

        jLabel17.setText("DNI");
        jPanel12.add(jLabel17);
        jPanel12.add(txtNuevoDni);

        jLabel18.setText("Apellidos");
        jPanel12.add(jLabel18);
        jPanel12.add(txtNuevoApellidos);

        jLabel19.setText("Nombre");
        jPanel12.add(jLabel19);
        jPanel12.add(txtNuevoNombre);

        jLabel20.setText("Domicilio");
        jPanel12.add(jLabel20);
        jPanel12.add(txtNuevoDomicilio);

        jLabel21.setText("Teléfono");
        jPanel12.add(jLabel21);
        jPanel12.add(txtNuevoTelefono);

        jLabel23.setText("Acceso");
        jPanel12.add(jLabel23);
        jPanel12.add(txtNuevoAcceso);

        jPanel13.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 570, 260));

        comboAsignaturasAMatricular.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel13.add(comboAsignaturasAMatricular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jScrollPane6.setViewportView(listaAsignaturasAMatricular);

        jPanel13.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 570, 160));

        btnCompletarMatricula.setText("Completar matrícula");
        btnCompletarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletarMatriculaActionPerformed(evt);
            }
        });
        jPanel13.add(btnCompletarMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        btnCancelarMatricula.setText("Cancelar");
        btnCancelarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMatriculaActionPerformed(evt);
            }
        });
        jPanel13.add(btnCancelarMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, -1, -1));

        btnAnadirAsignaturaMatricula.setText("Añadir");
        btnAnadirAsignaturaMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirAsignaturaMatriculaActionPerformed(evt);
            }
        });
        jPanel13.add(btnAnadirAsignaturaMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        javax.swing.GroupLayout nuevaMatriculaLayout = new javax.swing.GroupLayout(nuevaMatricula.getContentPane());
        nuevaMatricula.getContentPane().setLayout(nuevaMatriculaLayout);
        nuevaMatriculaLayout.setHorizontalGroup(
            nuevaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );
        nuevaMatriculaLayout.setVerticalGroup(
            nuevaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );

        cs.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        cs.setResizable(false);

        jPanel17.setLayout(new javax.swing.BoxLayout(jPanel17, javax.swing.BoxLayout.PAGE_AXIS));

        tablaAlumnosCS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaAlumnosCS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlumnosCSMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tablaAlumnosCS);

        jPanel17.add(jScrollPane12);

        tablaAsignaturasCS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane13.setViewportView(tablaAsignaturasCS);

        jPanel17.add(jScrollPane13);

        jPanel18.setLayout(new java.awt.BorderLayout());

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout csLayout = new javax.swing.GroupLayout(cs.getContentPane());
        cs.getContentPane().setLayout(csLayout);
        csLayout.setHorizontalGroup(
            csLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        csLayout.setVerticalGroup(
            csLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(csLayout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btnSalirInicio.setText("Salir");
        btnSalirInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirInicioActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalirInicio);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btnAcceder.setText("ACCEDER");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });
        jPanel3.add(btnAcceder);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaMatriculaActionPerformed
        matriculas.setVisible(false);
        ArrayList<String> asignaturas = facade.nombresAsignaturas();
        int t = asignaturas.size();
        String[] nombres = new String[t];
        for(int i = 0; i < t; i++){
            nombres[i] = asignaturas.get(i);
        }
        comboAsignaturasAMatricular.setModel(new DefaultComboBoxModel(nombres));
        nuevaMatricula.pack();
        nuevaMatricula.setLocationRelativeTo(null);
        nuevaMatricula.setVisible(true);
    }//GEN-LAST:event_btnNuevaMatriculaActionPerformed

    private void btnNuevaMatricula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaMatricula1ActionPerformed
        
    }//GEN-LAST:event_btnNuevaMatricula1ActionPerformed

    private void comboAulaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAulaItemStateChanged

    }//GEN-LAST:event_comboAulaItemStateChanged

    private void btnSalirInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirInicioActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirInicioActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        this.setVisible(false);
        matriculas.pack();
        matriculas.setLocationRelativeTo(null);
        matriculas.setVisible(true);
        tablaMatriculas.setModel(facade.tablaMatriculas(facade.getMatriculas()));
        tablaAsigMat.setModel(facade.tablaAsigMat(facade.getAsignaturasMatriculadas("")));
    }//GEN-LAST:event_btnAccederActionPerformed

    private void tablaMatriculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMatriculasMouseClicked
        int matricula = tablaMatriculas.rowAtPoint(evt.getPoint());
        String dni = String.valueOf(tablaMatriculas.getValueAt(matricula, 1));
        tablaAsigMat.setModel(facade.tablaAsigMat(facade.getAsignaturasMatriculadas(dni)));
    }//GEN-LAST:event_tablaMatriculasMouseClicked

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        matriculas.setVisible(false);
        consultas.pack();
        consultas.setLocationRelativeTo(null);
        consultas.setVisible(true);
        tablaAlumnos.setModel(facade.tablaAlumnos(facade.getAlumnos()));
        tablaAsignaturas.setModel(facade.tablaAsignaturas(facade.getAsignaturas()));
        tablaProfesores.setModel(facade.tablaProfesores(facade.getProfesores()));
        tablaAulas.setModel(facade.tablaAulas(facade.getAulas()));
        tablaAsignaciones.setModel(facade.tablaPaa(facade.getPAA()));
        tablaAsigMatAlum.setModel(facade.tablaAsigMat(facade.getAsignaturasMatriculadas("")));
        actualizarComboProfesor();
        actualizarComboAsignatura();
        actualizarComboEdificio();
        String edificio = comboEdificio.getItemAt(0).toString();
        actualizarComboAula(edificio);
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        consultas.setVisible(false);
        matriculas.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMatriculaActionPerformed
        nuevaMatricula.setVisible(false);
        txtNuevoDni.setText("");
        txtNuevoApellidos.setText("");
        txtNuevoNombre.setText("");
        txtNuevoDomicilio.setText("");
        txtNuevoTelefono.setText("");
        txtNuevoAcceso.setText("");
        matriculas.setVisible(true);
        listaAsignaturasAMatricular.setModel(new DefaultListModel());
    }//GEN-LAST:event_btnCancelarMatriculaActionPerformed

    private void btnAnadirAsignaturaMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirAsignaturaMatriculaActionPerformed
        String asignatura = comboAsignaturasAMatricular.getSelectedItem().toString();
        if(asignatura.equals("") || comboAsignaturasAMatricular.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Seleccione una asignatura a añadir.");
        }else if(compruebaAsignaturaYaSeleccionada(asignatura) == false){
            DefaultListModel listaAAM = new DefaultListModel();
            for(int i = 0; i < listaAsignaturasAMatricular.getModel().getSize(); i++){
                String elemento = listaAsignaturasAMatricular.getModel().getElementAt(i).toString();
                listaAAM.addElement(elemento);
            }
            listaAAM.addElement(asignatura);
            listaAsignaturasAMatricular.setModel(listaAAM);
        }else if(compruebaAsignaturaYaSeleccionada(asignatura) == true){
            JOptionPane.showMessageDialog(null, "La asignatura ya ha sido seleccionada.");
        }
    }//GEN-LAST:event_btnAnadirAsignaturaMatriculaActionPerformed

    private void btnCompletarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletarMatriculaActionPerformed
        String dni = txtNuevoDni.getText();
        String apellidos = txtNuevoApellidos.getText();
        String nombre = txtNuevoNombre.getText();
        String domicilio = txtNuevoDomicilio.getText();
        String telefono = txtNuevoTelefono.getText();
        String acceso = txtNuevoAcceso.getText();
        if(!dni.equals("") || !apellidos.equals("") || !nombre.equals("") || !domicilio.equals("") || !telefono.equals("") || !acceso.equals("")){
            if(listaAsignaturasAMatricular.getModel().getSize() > 0){
                ArrayList<Matriculas> matriculas = new ArrayList<>();
                boolean existe = false;
                for(int i = 0; i < matriculas.size(); i++){
                    if(matriculas.get(i).getDni().equals(dni)){
                        existe = true;
                    }
                }
                if(existe == false){
                    Matriculas matricula = new Matriculas();
                    matricula.setDni(dni);
                    matricula.setApellidos(apellidos);
                    matricula.setNombre(nombre);
                    matricula.setDomicilio(domicilio);
                    matricula.setTelefono(telefono);
                    matricula.setAcceso(acceso);
                    facade.nuevaMatricula(matricula);
                    for(int i = 0; i < listaAsignaturasAMatricular.getModel().getSize(); i++){
                        String titulo = listaAsignaturasAMatricular.getModel().getElementAt(i).toString();
                        Asignaturas asignatura = facade.getAsignaturaByTitulo(titulo);
                        AsigMat asigMat = new AsigMat();
                        asigMat.setDni(dni);
                        asigMat.setNota(0);
                        asigMat.setCodigo(asignatura.getId().getCodigo());
                        asigMat.setNumCreditos(asignatura.getNumCreditos());
                        asigMat.setTitulo(asignatura.getId().getTitulo());
                        facade.nuevaAsignaturaMatriculada(asigMat);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Ya existe un alumno con esa identificación.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Introduzca al menos una asignatura.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Introduzca todos los datos necesarios.");
        }
        nuevaMatricula.setVisible(false);
        txtNuevoDni.setText("");
        txtNuevoApellidos.setText("");
        txtNuevoNombre.setText("");
        txtNuevoDomicilio.setText("");
        txtNuevoTelefono.setText("");
        txtNuevoAcceso.setText("");
        matriculas.setVisible(true);
        tablaMatriculas.setModel(facade.tablaMatriculas(facade.getMatriculas()));
        listaAsignaturasAMatricular.setModel(new DefaultListModel());
    }//GEN-LAST:event_btnCompletarMatriculaActionPerformed

    private void tablaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlumnosMouseClicked
        int alumno = tablaAlumnos.rowAtPoint(evt.getPoint());
        String dni = String.valueOf(tablaAlumnos.getValueAt(alumno, 0));
        txtDniAlumno.setText(dni);
        tablaAsigMatAlum.setModel(facade.tablaAsigMat(facade.getAsignaturasMatriculadas(dni)));
    }//GEN-LAST:event_tablaAlumnosMouseClicked

    private void tablaAsigMatAlumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAsigMatAlumMouseClicked
        int asignatura = tablaAsigMatAlum.rowAtPoint(evt.getPoint());
        String titulo = String.valueOf(tablaAsigMatAlum.getValueAt(asignatura, 1));
        String nota = String.valueOf(tablaAsigMatAlum.getValueAt(asignatura, 4));
        txtTituloAsignatura.setText(titulo);
        txtNotaAsignatura.setText(nota);
    }//GEN-LAST:event_tablaAsigMatAlumMouseClicked

    private void btnEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAlumnoActionPerformed
        String dni = txtDniAlumno.getText();
        if(!dni.equals("")){
            Alumnos alumno = facade.getAlumnoByDni(dni);
            Matriculas matricula = facade.getMatriculaByDni(dni);
            facade.eliminarAlumno(alumno);
            facade.eliminarMatricula(matricula);
            ArrayList<AsigMat> asignaturas = facade.getAsignaturasMatriculadas(dni);
            for(int i = 0; i < asignaturas.size(); i++){
                AsigMat asignatura = asignaturas.get(i);
                facade.eliminarAsignaturaMatriculada(asignatura);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un alumno que eliminar.");
        }
        tablaAlumnos.setModel(facade.tablaAlumnos(facade.getAlumnos()));
        tablaAsigMatAlum.setModel(facade.tablaAsigMat(facade.getAsignaturasMatriculadas("")));
    }//GEN-LAST:event_btnEliminarAlumnoActionPerformed

    private void tablaAsignaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAsignaturasMouseClicked
        int asignatura = tablaAsignaturas.rowAtPoint(evt.getPoint());
        String codigo = String.valueOf(tablaAsignaturas.getValueAt(asignatura, 0));
        String titulo = String.valueOf(tablaAsignaturas.getValueAt(asignatura, 1));
        String creditos = String.valueOf(tablaAsignaturas.getValueAt(asignatura, 2));
        txtCodigo.setText(codigo);
        txtTitulo.setText(titulo);
        txtNuevoCodigoAsignatura.setText(codigo);
        txtNuevoTitulo.setText(titulo);
        txtNumCreditos.setText(creditos);
    }//GEN-LAST:event_tablaAsignaturasMouseClicked

    private void btnAnadirAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirAsignaturaActionPerformed
        String codigo = txtNuevoCodigoAsignatura.getText();
        String titulo = txtNuevoTitulo.getText();
        String creditos = txtNumCreditos.getText();
        if(!codigo.equals("") || !titulo.equals("") || !creditos.equals("")){
            boolean existe = false;
            ArrayList<Asignaturas> asignaturas = facade.getAsignaturas();
            for(int i = 0; i < asignaturas.size(); i++){
                if(asignaturas.get(i).getId().getCodigo() == Integer.parseInt(codigo) || asignaturas.get(i).getId().getTitulo().equals(titulo)){
                    existe = true;
                }
            }
            if(existe == false){
                Asignaturas asignatura = new Asignaturas();
                AsignaturasId id = new AsignaturasId();
                id.setCodigo(Integer.parseInt(codigo));
                id.setTitulo(titulo);
                asignatura.setId(id);
                asignatura.setNumCreditos(Integer.parseInt(creditos));
                facade.nuevaAsignatura(asignatura);
            }else{
                JOptionPane.showMessageDialog(null, "Ya existe una asignatura con esa identificación.");
            }
        }
        tablaAsignaturas.setModel(facade.tablaAsignaturas(facade.getAsignaturas()));
        actualizarComboAsignatura();
    }//GEN-LAST:event_btnAnadirAsignaturaActionPerformed

    private void btnModificarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAsignaturaActionPerformed
        String codigo = txtCodigo.getText();
        String titulo = txtTitulo.getText();
        String nCodigo = txtNuevoCodigoAsignatura.getText();
        String nTitulo = txtNuevoTitulo.getText();
        String creditos = txtNumCreditos.getText();
        if(!codigo.equals("") || !titulo.equals("")){
            if(!nCodigo.equals("") || !nTitulo.equals("") || !creditos.equals("")){
                Asignaturas asignatura = facade.getAsignatura(Integer.parseInt(codigo), titulo);
                AsignaturasId id = asignatura.getId();
                id.setCodigo(Integer.parseInt(nCodigo));
                id.setTitulo(nTitulo);
                asignatura.setId(id);
                asignatura.setNumCreditos(Integer.parseInt(creditos));
                facade.modificarAsignatura(asignatura);
            }else{
                JOptionPane.showMessageDialog(null, "Introduzca los nuevos valores.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una asignatura que modificar.");
        }
        tablaAsignaturas.setModel(facade.tablaAsignaturas(facade.getAsignaturas()));
        actualizarComboAsignatura();
    }//GEN-LAST:event_btnModificarAsignaturaActionPerformed

    private void btnEliminarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAsignaturaActionPerformed
        String codigo = txtCodigo.getText();
        String titulo = txtTitulo.getText();
        if(!codigo.equals("") || !titulo.equals("")){
            Asignaturas asignatura = facade.getAsignatura(Integer.parseInt(codigo), titulo);
            facade.eliminarAsignatura(asignatura);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una asignatura que eliminar.");
        }
        tablaAsignaturas.setModel(facade.tablaAsignaturas(facade.getAsignaturas()));
        actualizarComboAsignatura();
    }//GEN-LAST:event_btnEliminarAsignaturaActionPerformed

    private void tablaProfesoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProfesoresMouseClicked
        int profesor = tablaProfesores.rowAtPoint(evt.getPoint());
        String dni = String.valueOf(tablaProfesores.getValueAt(profesor, 0));
        String apellidos = String.valueOf(tablaProfesores.getValueAt(profesor, 1));
        String nombre = String.valueOf(tablaProfesores.getValueAt(profesor, 2));
        String domicilio = String.valueOf(tablaProfesores.getValueAt(profesor, 3));;
        String telefono = String.valueOf(tablaProfesores.getValueAt(profesor, 4));;
        String supervisor = String.valueOf(tablaProfesores.getValueAt(profesor, 5));;
        txtDniProfesor.setText(dni);
        txtNuevoDniProfesor.setText(dni);
        txtApellidosProfesor.setText(apellidos);
        txtNombreProfesor.setText(nombre);
        txtDomicilioProfesor.setText(domicilio);
        txtTelefonoProfesor.setText(telefono);
        txtSupervisorProfesor.setText(supervisor);
    }//GEN-LAST:event_tablaProfesoresMouseClicked

    private void btnAnadirProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirProfesorActionPerformed
        String nDni = txtNuevoDniProfesor.getText();
        String apellidos = txtApellidosProfesor.getText();
        String nombre = txtNombreProfesor.getText();
        String domicilio = txtDomicilioProfesor.getText();
        String telefono = txtTelefonoProfesor.getText();
        String supervisor = txtSupervisorProfesor.getText();
        if(!nDni.equals("") || !apellidos.equals("") || !nombre.equals("") || !domicilio.equals("") || !telefono.equals("")){
            if(!supervisor.equals("")){
                ArrayList<Profesores> supervisores = facade.getProfesores();
                boolean existe = false;
                for(int i = 0; i < supervisores.size(); i++){
                    if(supervisores.get(i).getDni().equals(supervisor)){
                        existe = true;
                    }
                }
                if(existe == true){
                    Profesores profesor = new Profesores(nDni, apellidos, nombre, domicilio, telefono, supervisor);
                    facade.nuevoProfesor(profesor);
                }else{
                    JOptionPane.showMessageDialog(null, "El supervisor introducido no existe.");
                }
            }else{
                Profesores profesor = new Profesores(nDni, apellidos, nombre, domicilio, telefono, supervisor);
                facade.nuevoProfesor(profesor);
            }
        }
        tablaProfesores.setModel(facade.tablaProfesores(facade.getProfesores()));
        actualizarComboProfesor();
    }//GEN-LAST:event_btnAnadirProfesorActionPerformed

    private void btnModificarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProfesorActionPerformed
        String dni = txtDniProfesor.getText();
        String nDni = txtNuevoDniProfesor.getText();
        String apellidos = txtApellidosProfesor.getText();
        String nombre = txtNombreProfesor.getText();
        String domicilio = txtDomicilioProfesor.getText();
        String telefono = txtTelefonoProfesor.getText();
        String supervisor = txtSupervisorProfesor.getText();
        if(!dni.equals("")){
            if(!nDni.equals("") || !apellidos.equals("") || !nombre.equals("") || !domicilio.equals("") || !telefono.equals("")){
                Profesores profesor = facade.getProfesor(dni);
                profesor.setDni(nDni);
                profesor.setApellidos(apellidos);
                profesor.setNombre(nombre);
                profesor.setDomicilio(domicilio);
                profesor.setTelefono(telefono);
                profesor.setSupervisor(supervisor);
                facade.modificarProfesor(profesor);
            }else{
                JOptionPane.showMessageDialog(null, "Introduzca todos los valores necesarios.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione primero un profesor que modificar.");
        }
        tablaProfesores.setModel(facade.tablaProfesores(facade.getProfesores()));
        actualizarComboProfesor();
    }//GEN-LAST:event_btnModificarProfesorActionPerformed

    private void btnEliminarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProfesorActionPerformed
        String dni = txtDniProfesor.getText();
        if(!dni.equals("")){
            Profesores profesor = facade.getProfesor(dni);
            facade.eliminarProfesor(profesor);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione primero un profesor que eliminar.");
        }
        tablaProfesores.setModel(facade.tablaProfesores(facade.getProfesores()));
        actualizarComboProfesor();
    }//GEN-LAST:event_btnEliminarProfesorActionPerformed

    private void tablaAulasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAulasMouseClicked
        int aula = tablaAulas.rowAtPoint(evt.getPoint());
        String edificio = String.valueOf(tablaAulas.getValueAt(aula, 0));
        String numero = String.valueOf(tablaAulas.getValueAt(aula, 1));
        txtEdificio.setText(edificio);
        txtAula.setText(numero);
        txtNuevoEdificio.setText(edificio);
        txtNuevoNumero.setText(numero);
    }//GEN-LAST:event_tablaAulasMouseClicked

    private void btnAnadirAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirAulaActionPerformed
        String edificio = txtNuevoEdificio.getText();
        String numero = txtNuevoNumero.getText();
        if(!edificio.equals("") || !numero.equals("")){
            AulasId id = new AulasId(edificio, Integer.parseInt(numero));
            Aulas aula = new Aulas(id);
            facade.nuevoAula(aula);
        }else{
            JOptionPane.showMessageDialog(null, "Introduzca todos los valores necesarios.");
        }
        tablaAulas.setModel(facade.tablaAulas(facade.getAulas()));
        actualizarComboEdificio();
        String ed = comboEdificio.getItemAt(0).toString();
        actualizarComboAula(ed);
    }//GEN-LAST:event_btnAnadirAulaActionPerformed

    private void btnModificarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAulaActionPerformed
        String edificio = txtEdificio.getText();
        String numero = txtAula.getText();
        String nEdificio = txtNuevoEdificio.getText();
        String nAula = txtNuevoNumero.getText();
        if(!edificio.equals("") || !numero.equals("")){
            if(!nEdificio.equals("") || !nAula.equals("")){
                Aulas aula = facade.getAula(edificio, Integer.parseInt(numero));
                AulasId id = aula.getId();
                id.setNombreEdificio(nEdificio);
                id.setNumAula(Integer.parseInt(nAula));
                aula.setId(id);
                facade.modificarAula(aula);
            }else{
                JOptionPane.showMessageDialog(null, "Introduzca todos los valores necesarios.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un aula que modificar.");
        }
        tablaAulas.setModel(facade.tablaAulas(facade.getAulas()));
        actualizarComboEdificio();
        String ed = comboEdificio.getItemAt(0).toString();
        actualizarComboAula(ed);
    }//GEN-LAST:event_btnModificarAulaActionPerformed

    private void btnEliminarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAulaActionPerformed
        String edificio = txtEdificio.getText();
        String numero = txtAula.getText();
        if(!edificio.equals("") || !numero.equals("")){
            Aulas aula = facade.getAula(edificio, Integer.parseInt(numero));
            facade.eliminarAula(aula);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un aula que eliminar.");
        }
        tablaAulas.setModel(facade.tablaAulas(facade.getAulas()));
        actualizarComboEdificio();
        String ed = comboEdificio.getItemAt(0).toString();
        actualizarComboAula(ed);
    }//GEN-LAST:event_btnEliminarAulaActionPerformed

    private void comboEdificioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboEdificioItemStateChanged
        String edificio = comboEdificio.getSelectedItem().toString();
        
        ArrayList<Integer> aulas = facade.numerosAulas(edificio);
        int t = aulas.size();
        String[] numeros = new String[t];
        for(int i = 0; i < t; i++){
            numeros[i] = "" + aulas.get(i);
        }
        
        comboAula.setModel(new DefaultComboBoxModel(numeros));
    }//GEN-LAST:event_comboEdificioItemStateChanged

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        String dni = comboProfesor.getSelectedItem().toString();
        String nombre = facade.getNombreProfesor(dni);
        String apellidos = facade.getApellidosProfesor(dni);
        String titulo = comboAsignatura.getSelectedItem().toString();
        String edificio = comboEdificio.getSelectedItem().toString();
        String aula = comboAula.getSelectedItem().toString();
        ArrayList<Paa> asignaciones = facade.getPAA();
        boolean existe = false;
        for(int i = 0; i < asignaciones.size(); i++){
            Paa asignacion = asignaciones.get(i);
            if(asignacion.getDni().equals(dni) && asignacion.getTitulo().equals(titulo)){
                existe = true;
            }
        }
        if(existe == false){
            int cont = 0;
            for(int i = 0; i < asignaciones.size(); i++){
                Paa asignacion = asignaciones.get(i);
                if(asignacion.getDni().equals(dni)){
                    cont++;
                }
            }
            if(cont < 6){
                Paa paa = new Paa();
                paa.setDni(dni);
                paa.setNombre(nombre);
                paa.setApellidos(apellidos);
                paa.setTitulo(titulo);
                paa.setNombreEdificio(edificio);
                paa.setNumAula(Integer.parseInt(aula));
                facade.nuevoPAA(paa);
            }else{
                JOptionPane.showMessageDialog(null, "Ese profesor ya tiene asignada 6 asignaturas.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ese profesor ya tiene asignada esa asignatura.");
        }
        tablaAsignaciones.setModel(facade.tablaPaa(facade.getPAA()));
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void btnEliminarAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAsignacionActionPerformed
        String codigo = txtCodigoAsignacion.getText();
        if(!codigo.equals("")){
            Paa paa = facade.getPAAByCodigo(Integer.parseInt(codigo));
            facade.eliminarPAA(paa);
        }
        tablaAsignaciones.setModel(facade.tablaPaa(facade.getPAA()));
    }//GEN-LAST:event_btnEliminarAsignacionActionPerformed

    private void tablaAsignacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAsignacionesMouseClicked
        int paa = tablaAsignaciones.rowAtPoint(evt.getPoint());
        String dni = String.valueOf(tablaAsignaciones.getValueAt(paa, 0));
        String titulo = String.valueOf(tablaAsignaciones.getValueAt(paa, 3));
        String edificio = String.valueOf(tablaAsignaciones.getValueAt(paa, 4));
        String aula = String.valueOf(tablaAsignaciones.getValueAt(paa, 5));
        int a = Integer.parseInt(aula);
        int codigo = facade.getCodigoPAA(dni, titulo, edificio, a);
        txtCodigoAsignacion.setText("" + codigo);
    }//GEN-LAST:event_tablaAsignacionesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cs.setVisible(false);
        consultas.setVisible(true);
        tablaAsignaturasCS.setModel(tablaAsignaturasMatriculadasCS(""));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        consultas.setVisible(false);
        cs.pack();
        cs.setLocationRelativeTo(null);
        cs.setVisible(true);
        tablaAlumnosCS.setModel(tablaAlumnosCS());
        tablaAsignaturasCS.setModel(tablaAsignaturasMatriculadasCS(""));
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        vaciaAlumnosCS();
        vaciaAsignaturasMatriculadasCS();
        actualizaAlumnosCS(facade.getAlumnos());
        actualizaAsignaturasCS(facade.getAsignaturasMatriculadas());
        JOptionPane.showMessageDialog(null, "Copia de seguridad realizada con éxito.");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tablaAlumnosCSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlumnosCSMouseClicked
        int alumno = tablaAlumnosCS.rowAtPoint(evt.getPoint());
        String dni = String.valueOf(tablaAlumnosCS.getValueAt(alumno, 0));
        tablaAsignaturasCS.setModel(tablaAsignaturasMatriculadasCS(dni));
    }//GEN-LAST:event_tablaAlumnosCSMouseClicked

    public boolean compruebaAsignaturaYaSeleccionada(String asignatura){
        boolean res = false;
        int n = listaAsignaturasAMatricular.getModel().getSize();
        for(int i = 0; i < n; i++){
            if(listaAsignaturasAMatricular.getModel().getElementAt(i).toString().equals(asignatura)){
                res = true;
            }
        }
        return res;
    }
    
    public void actualizarComboProfesor(){
        ArrayList<String> profesores = facade.nombresProfesores();
        int t1 = profesores.size();
        String[] dni = new String[t1];
        for(int i = 0; i < t1; i++){
            dni[i] = profesores.get(i);
        }
        comboProfesor.setModel(new DefaultComboBoxModel(dni));
    }
    
    public void actualizarComboAsignatura(){
        ArrayList<String> asignaturas = facade.nombresAsignaturas();
        int t2 = asignaturas.size();
        String[] codigos = new String[t2];
        for(int i = 0; i < t2; i++){
            codigos[i] = asignaturas.get(i);
        }
        comboAsignatura.setModel(new DefaultComboBoxModel(codigos));
    }
    
    public void actualizarComboEdificio(){
        ArrayList<String> edificios = facade.nombresEdificios();
        int t3 = edificios.size();
        String[] nombres = new String[t3];
        for(int i = 0; i < t3; i++){
            nombres[i] = edificios.get(i);
        }
        comboEdificio.setModel(new DefaultComboBoxModel(nombres));
    }
    
    public void actualizarComboAula(String edificio){
        ArrayList<Integer> aulas = facade.numerosAulas(edificio);
        int t4 = aulas.size();
        String[] numeros = new String[t4];
        for(int i = 0; i < t4; i++){
            numeros[i] = "" + aulas.get(i);
        }
        
        comboAula.setModel(new DefaultComboBoxModel(numeros));
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interfaz i = new Interfaz();
                i.pack();
                i.setLocationRelativeTo(null);
                i.setVisible(true);
            }
        });
    }
    
    public class ModeloTablaNoEditable extends DefaultTableModel {

        public boolean isCellEditable(int row, int column){  
            return false;  
        }
    }
    
    public void vaciaAlumnosCS(){
        String q = "DELETE FROM Alumnos";
        try {
            PreparedStatement pstm = sqlite.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al vaciar la tabla de alumnos\n" + e.getMessage());
        }
    }
    
    public void vaciaAsignaturasMatriculadasCS(){
        String q = "DELETE FROM AsigMat";
        try {
            PreparedStatement pstm = sqlite.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al vaciar la tabla de asignaturas\n" + e.getMessage());
        }
    }
    
    public void actualizaAlumnosCS(ArrayList<Alumnos> alumnos){
        for(int i = 0; i < alumnos.size(); i++){
            Alumnos alumno = alumnos.get(i);
            String dni = alumno.getDni();
            String apellidos = alumno.getApellidos();
            String nombre = alumno.getNombre();
            String domicilio = alumno.getDomicilio();
            String telefono = alumno.getTelefono();
            String acceso = alumno.getAcceso();
            String q = "INSERT INTO Alumnos (DNI, Apellidos, Nombre, Domicilio, Telefono, Acceso)"
                    + "VALUES('"+dni+"','"+apellidos+"','"+nombre+"','"+domicilio+"','"+telefono+"','"+acceso+"')";
            try {
                PreparedStatement pstm = sqlite.getConexion().prepareStatement(q);
                pstm.execute();
                pstm.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error al introducir nuevo alumno\n" + e.getMessage());
                e.printStackTrace();
            }
        }
    }
    
    public void actualizaAsignaturasCS(ArrayList<AsigMat> asignaturas){
        for(int i = 0; i < asignaturas.size(); i++){
            AsigMat asignatura = asignaturas.get(i);
            String dni = asignatura.getDni();
            String titulo = asignatura.getTitulo();
            int creditos = asignatura.getNumCreditos();
            int nota = asignatura.getNota();
            String q = "INSERT INTO AsigMat (DNI, Titulo, NumCreditos, Nota)"
                + "VALUES('"+dni+"','"+titulo+"',"+creditos+","+nota+")";
            try {
                PreparedStatement pstm = sqlite.getConexion().prepareStatement(q);
                pstm.execute();
                pstm.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error al introducir nuevo alumno\n" + e.getMessage());
                e.printStackTrace();
            }
        }
    }
    
    public DefaultTableModel tablaAlumnosCS(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"DNI","Apellidos","Nombre","Domicilio","Teléfono","Acceso"};
      
        try{
            PreparedStatement pstm = sqlite.getConexion().prepareStatement("SELECT count(DNI) as total FROM Alumnos");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][6];
        try{
          
            PreparedStatement pstm = sqlite.getConexion().prepareStatement("SELECT DNI, Apellidos, Nombre, Domicilio, Telefono, Acceso FROM Alumnos");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("DNI");
                data[i][1] = res.getString("Apellidos");
                data[i][2] = res.getString("Nombre");
                data[i][3] = res.getString("Domicilio");
                data[i][4] = res.getString("Telefono");
                data[i][5] = res.getString("Acceso");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
        }
        return tablemodel;
    }
    
    public DefaultTableModel tablaAsignaturasMatriculadasCS(String dni){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","DNI","Título","Créditos","Nota"};
      
        try{
            PreparedStatement pstm = sqlite.getConexion().prepareStatement("SELECT count(Codigo) as total FROM AsigMat WHERE DNI = '" + dni + "'");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new Object[registros][5];
        try{
          
            PreparedStatement pstm = sqlite.getConexion().prepareStatement("SELECT Codigo, DNI, Titulo, NumCreditos, Nota FROM AsigMat WHERE DNI = '" + dni + "'");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("DNI");
                data[i][2] = res.getString("Titulo");
                data[i][3] = res.getInt("NumCreditos");
                data[i][4] = res.getInt("Nota");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAcceder;
    public javax.swing.JButton btnAnadirAsignatura;
    public javax.swing.JButton btnAnadirAsignaturaMatricula;
    public javax.swing.JButton btnAnadirAula;
    public javax.swing.JButton btnAnadirProfesor;
    public javax.swing.JButton btnAsignar;
    public javax.swing.JButton btnCancelarMatricula;
    public javax.swing.JButton btnCiencias1;
    public javax.swing.JButton btnCompletarMatricula;
    public javax.swing.JMenuItem btnConsultas;
    public javax.swing.JMenuItem btnConsultas1;
    private javax.swing.JButton btnEliminarAlumno;
    public javax.swing.JButton btnEliminarAsignacion;
    public javax.swing.JButton btnEliminarAsignatura;
    public javax.swing.JButton btnEliminarAula;
    public javax.swing.JButton btnEliminarProfesor;
    public javax.swing.JButton btnLetras1;
    public javax.swing.JButton btnModificarAsignatura;
    public javax.swing.JButton btnModificarAula;
    public javax.swing.JButton btnModificarNota;
    public javax.swing.JButton btnModificarProfesor;
    public javax.swing.JMenuItem btnNuevaMatricula;
    public javax.swing.JMenuItem btnNuevaMatricula1;
    public javax.swing.JMenuItem btnSalir;
    public javax.swing.JMenuItem btnSalir1;
    public javax.swing.JButton btnSalirInicio;
    public javax.swing.JButton btnSalirInicio1;
    public javax.swing.JMenuItem btnVolver;
    public javax.swing.JComboBox comboAsignatura;
    public javax.swing.JComboBox comboAsignaturasAMatricular;
    public javax.swing.JComboBox comboAula;
    public javax.swing.JComboBox comboEdificio;
    public javax.swing.JComboBox comboProfesor;
    public javax.swing.JDialog consultas;
    private javax.swing.JDialog cs;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu2;
    public javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JList listaAsignaturasAMatricular;
    public javax.swing.JDialog matriculas;
    public javax.swing.JDialog matriculas1;
    public javax.swing.JDialog nuevaMatricula;
    public javax.swing.JTable tablaAlumnos;
    private javax.swing.JTable tablaAlumnosCS;
    public javax.swing.JTable tablaAsigMat;
    public javax.swing.JTable tablaAsigMat1;
    public javax.swing.JTable tablaAsigMatAlum;
    public javax.swing.JTable tablaAsignaciones;
    public javax.swing.JTable tablaAsignaturas;
    private javax.swing.JTable tablaAsignaturasCS;
    public javax.swing.JTable tablaAulas;
    public javax.swing.JTable tablaMatriculas;
    public javax.swing.JTable tablaMatriculas1;
    public javax.swing.JTable tablaProfesores;
    public javax.swing.JTextField txtApellidosProfesor;
    public javax.swing.JTextField txtAula;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JLabel txtCodigoAsignacion;
    public javax.swing.JTextField txtDniAlumno;
    public javax.swing.JTextField txtDniProfesor;
    public javax.swing.JTextField txtDomicilioProfesor;
    public javax.swing.JTextField txtEdificio;
    public javax.swing.JTextField txtNombreProfesor;
    public javax.swing.JTextField txtNotaAsignatura;
    public javax.swing.JTextField txtNuevoAcceso;
    public javax.swing.JTextField txtNuevoApellidos;
    public javax.swing.JTextField txtNuevoCodigoAsignatura;
    public javax.swing.JTextField txtNuevoDni;
    public javax.swing.JTextField txtNuevoDniProfesor;
    public javax.swing.JTextField txtNuevoDomicilio;
    public javax.swing.JTextField txtNuevoEdificio;
    public javax.swing.JTextField txtNuevoNombre;
    public javax.swing.JTextField txtNuevoNumero;
    public javax.swing.JTextField txtNuevoTelefono;
    public javax.swing.JTextField txtNuevoTitulo;
    public javax.swing.JTextField txtNumCreditos;
    public javax.swing.JTextField txtSupervisorProfesor;
    public javax.swing.JTextField txtTelefonoProfesor;
    public javax.swing.JTextField txtTitulo;
    public javax.swing.JTextField txtTituloAsignatura;
    // End of variables declaration//GEN-END:variables
}
