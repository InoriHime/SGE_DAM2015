package Vistas;

/**
 *
 * @author MrDrulix
 */
public class Vista_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Frame_Crear_Cliente = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnl_Crear_Cliente = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txt_Crear_Cliente_Nombre = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_Crear_Cliente_Apellidos = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_Crear_Cliente_Domicilio = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_Crear_Cliente_Correo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_Crear_Cliente_Dni = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_Crear_Cliente_Telefono = new javax.swing.JTextField();
        btn_Crear_Cliente_Cancelar = new javax.swing.JButton();
        btn_Crear_Cliente = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        pnl_Modificar_Cliente = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Tabla_Modificar_Cliente = new javax.swing.JTable();
        txt_Modificar_Cliente_Buscar = new javax.swing.JTextField();
        btn_Modificar_Cliente_Busqueda = new javax.swing.JButton();
        btn_Modificar_Cliente_Cancelar = new javax.swing.JButton();
        btn_Modificar_Cliente = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txt_Modificar_Cliente_Dni = new javax.swing.JTextField();
        txt_Modificar_Cliente_Correo = new javax.swing.JTextField();
        txt_Modificar_Cliente_Domicilio = new javax.swing.JTextField();
        txt_Modificar_Cliente_Nombre = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txt_Modificar_Cliente_Apellidos = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txt_Modificar_Cliente_Telefono = new javax.swing.JTextField();
        pnl_Eliminar_Cliente = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_Eliminar_Cliente = new javax.swing.JTable();
        cbox_Eliminar_Cliente_Buscar = new javax.swing.JComboBox();
        txt_Eliminar_Cliente_Buscar = new javax.swing.JTextField();
        btn_Eliminar_Cliente_Buscar = new javax.swing.JButton();
        btn_Eliminar_Cliente_Cancelar = new javax.swing.JButton();
        btn_Eliminar_Cliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Frame_Crear_Proveedor = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pnl_contenedor = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        pnl_principal_izquierda = new javax.swing.JPanel();
        btn_principal_articulos = new javax.swing.JButton();
        btn_principal_clientes = new javax.swing.JButton();
        btn_principal_proveedores = new javax.swing.JButton();
        btn_principal_pedidos = new javax.swing.JButton();
        btn_principal_salir = new javax.swing.JButton();
        progres_principal = new javax.swing.JProgressBar();
        pnl_principal_derecha = new javax.swing.JPanel();
        txt_principal_busqueda = new javax.swing.JTextField();
        btn_principal_buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Tabla_Principal = new javax.swing.JTable();
        Menu_bar = new javax.swing.JMenuBar();
        Menu_Nuevo = new javax.swing.JMenu();
        Menu_Nuevo_Articulo = new javax.swing.JMenu();
        Menu_Nuevo_Articulo_Crear = new javax.swing.JMenuItem();
        Menu_Nuevo_Articulo_Modificar = new javax.swing.JMenuItem();
        Menu_Nuevo_Articulo_Eliminar = new javax.swing.JMenuItem();
        Menu_Nuevo_Cliente = new javax.swing.JMenu();
        Menu_Nuevo_Cliente_Crear = new javax.swing.JMenuItem();
        Menu_Nuevo_Cliente_Modificar = new javax.swing.JMenuItem();
        Menu_Nuevo_Cliente_Eliminar = new javax.swing.JMenuItem();
        Menu_Nuevo_Proveedor = new javax.swing.JMenu();
        Menu_Nuevo_Proveedor_Crear = new javax.swing.JMenuItem();
        Menu_Nuevo_Proveedor_Modificar = new javax.swing.JMenuItem();
        Menu_Nuevo_Proveedor_Eliminar = new javax.swing.JMenuItem();
        Menu_Empresa = new javax.swing.JMenu();
        Menu_Empresa_Gastos = new javax.swing.JMenuItem();
        Menu_Empresa_Cobros_Pagos = new javax.swing.JMenuItem();
        Menu_Configuracion = new javax.swing.JMenu();
        Menu_Confi_Ver = new javax.swing.JMenuItem();
        Menu_Confi_Modificar = new javax.swing.JMenu();
        Menu_Confi_Modificar_Correo = new javax.swing.JMenuItem();
        Menu_Confi_Modificar_Direccion = new javax.swing.JMenuItem();
        Menu_Confi_Modificar_Iva = new javax.swing.JMenuItem();
        Menu_Confi_Modificar_Nombre = new javax.swing.JMenuItem();
        Menu_Confi_Modificar_Telefono = new javax.swing.JMenuItem();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnl_Crear_Cliente.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setText("Nombre:");

        jLabel20.setText("Apellidos:");

        jLabel21.setText("Domicilio:");

        jLabel22.setText("Correo");

        jLabel23.setText("DNI:");

        jLabel24.setText("Teléfono:");

        btn_Crear_Cliente_Cancelar.setText("Cancelar");

        btn_Crear_Cliente.setText("Crear");

        jLabel31.setText("Por favor introduzca los datos que acontinuación se piden. Introduzca los campos señalados con un ");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 0));
        jLabel32.setText("*");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 0, 0));
        jLabel33.setText("*");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 0, 0));
        jLabel34.setText("*");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 0, 0));
        jLabel35.setText("*");

        javax.swing.GroupLayout pnl_Crear_ClienteLayout = new javax.swing.GroupLayout(pnl_Crear_Cliente);
        pnl_Crear_Cliente.setLayout(pnl_Crear_ClienteLayout);
        pnl_Crear_ClienteLayout.setHorizontalGroup(
            pnl_Crear_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Crear_ClienteLayout.createSequentialGroup()
                .addGroup(pnl_Crear_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Crear_ClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_Crear_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_Crear_ClienteLayout.createSequentialGroup()
                                .addGroup(pnl_Crear_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_Crear_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_Crear_ClienteLayout.createSequentialGroup()
                                        .addComponent(txt_Crear_Cliente_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Crear_Cliente_Apellidos))
                                    .addComponent(txt_Crear_Cliente_Domicilio)
                                    .addComponent(txt_Crear_Cliente_Correo)
                                    .addGroup(pnl_Crear_ClienteLayout.createSequentialGroup()
                                        .addComponent(txt_Crear_Cliente_Dni)
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel33)
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_Crear_Cliente_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Crear_ClienteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_Crear_Cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Crear_Cliente_Cancelar))))
                    .addGroup(pnl_Crear_ClienteLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)
                        .addGap(0, 105, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addContainerGap())
        );
        pnl_Crear_ClienteLayout.setVerticalGroup(
            pnl_Crear_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Crear_ClienteLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnl_Crear_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(28, 28, 28)
                .addGroup(pnl_Crear_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txt_Crear_Cliente_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txt_Crear_Cliente_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(pnl_Crear_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txt_Crear_Cliente_Domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_Crear_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Crear_Cliente_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(pnl_Crear_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txt_Crear_Cliente_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txt_Crear_Cliente_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(pnl_Crear_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Crear_Cliente_Cancelar)
                    .addComponent(btn_Crear_Cliente))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Crear...", pnl_Crear_Cliente);

        pnl_Modificar_Cliente.setBackground(new java.awt.Color(255, 255, 255));

        tbl_Tabla_Modificar_Cliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_Tabla_Modificar_Cliente);

        btn_Modificar_Cliente_Busqueda.setText("Buscar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txt_Modificar_Cliente_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Modificar_Cliente_Busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Modificar_Cliente_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Modificar_Cliente_Busqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_Modificar_Cliente_Cancelar.setText("Cancelar");

        btn_Modificar_Cliente.setText("Modificar");

        jLabel25.setText("Nombre:");

        jLabel26.setText("Domicilio:");

        jLabel27.setText("Correo");

        jLabel28.setText("DNI:");

        jLabel29.setText("Apellidos:");

        jLabel30.setText("Teléfono:");

        javax.swing.GroupLayout pnl_Modificar_ClienteLayout = new javax.swing.GroupLayout(pnl_Modificar_Cliente);
        pnl_Modificar_Cliente.setLayout(pnl_Modificar_ClienteLayout);
        pnl_Modificar_ClienteLayout.setHorizontalGroup(
            pnl_Modificar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Modificar_ClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Modificar_Cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Modificar_Cliente_Cancelar)
                .addContainerGap())
            .addGroup(pnl_Modificar_ClienteLayout.createSequentialGroup()
                .addGroup(pnl_Modificar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Modificar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Modificar_ClienteLayout.createSequentialGroup()
                        .addComponent(txt_Modificar_Cliente_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Modificar_Cliente_Apellidos))
                    .addComponent(txt_Modificar_Cliente_Domicilio)
                    .addComponent(txt_Modificar_Cliente_Correo)
                    .addGroup(pnl_Modificar_ClienteLayout.createSequentialGroup()
                        .addComponent(txt_Modificar_Cliente_Dni, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Modificar_Cliente_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnl_Modificar_ClienteLayout.setVerticalGroup(
            pnl_Modificar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Modificar_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Modificar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txt_Modificar_Cliente_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(txt_Modificar_Cliente_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Modificar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txt_Modificar_Cliente_Domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Modificar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Modificar_Cliente_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Modificar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txt_Modificar_Cliente_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(txt_Modificar_Cliente_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Modificar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Modificar_Cliente_Cancelar)
                    .addComponent(btn_Modificar_Cliente))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Modificar...", pnl_Modificar_Cliente);

        pnl_Eliminar_Cliente.setBackground(new java.awt.Color(255, 255, 255));

        tbl_Eliminar_Cliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbl_Eliminar_Cliente);

        cbox_Eliminar_Cliente_Buscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dni", "Nombre", "Apellidos", "Correo", "Telefono" }));

        btn_Eliminar_Cliente_Buscar.setText("Buscar");

        btn_Eliminar_Cliente_Cancelar.setText("Cancelar");

        btn_Eliminar_Cliente.setText("Eliminar");

        javax.swing.GroupLayout pnl_Eliminar_ClienteLayout = new javax.swing.GroupLayout(pnl_Eliminar_Cliente);
        pnl_Eliminar_Cliente.setLayout(pnl_Eliminar_ClienteLayout);
        pnl_Eliminar_ClienteLayout.setHorizontalGroup(
            pnl_Eliminar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Eliminar_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Eliminar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(pnl_Eliminar_ClienteLayout.createSequentialGroup()
                        .addComponent(cbox_Eliminar_Cliente_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Eliminar_Cliente_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Eliminar_Cliente_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Eliminar_ClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Eliminar_Cliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Eliminar_Cliente_Cancelar)))
                .addContainerGap())
        );
        pnl_Eliminar_ClienteLayout.setVerticalGroup(
            pnl_Eliminar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Eliminar_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Eliminar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbox_Eliminar_Cliente_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Eliminar_Cliente_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Eliminar_Cliente_Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(pnl_Eliminar_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Eliminar_Cliente_Cancelar)
                    .addComponent(btn_Eliminar_Cliente))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Eliminar...", pnl_Eliminar_Cliente);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cliente");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout Frame_Crear_ClienteLayout = new javax.swing.GroupLayout(Frame_Crear_Cliente.getContentPane());
        Frame_Crear_Cliente.getContentPane().setLayout(Frame_Crear_ClienteLayout);
        Frame_Crear_ClienteLayout.setHorizontalGroup(
            Frame_Crear_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Frame_Crear_ClienteLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Frame_Crear_ClienteLayout.setVerticalGroup(
            Frame_Crear_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Proveedor");
        jLabel8.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Frame_Crear_ProveedorLayout = new javax.swing.GroupLayout(Frame_Crear_Proveedor.getContentPane());
        Frame_Crear_Proveedor.getContentPane().setLayout(Frame_Crear_ProveedorLayout);
        Frame_Crear_ProveedorLayout.setHorizontalGroup(
            Frame_Crear_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Frame_Crear_ProveedorLayout.setVerticalGroup(
            Frame_Crear_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Frame_Crear_ProveedorLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_contenedor.setBackground(new java.awt.Color(255, 255, 255));

        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setDividerSize(15);
        jSplitPane1.setOneTouchExpandable(true);

        pnl_principal_izquierda.setBackground(new java.awt.Color(255, 255, 255));
        pnl_principal_izquierda.setPreferredSize(new java.awt.Dimension(200, 482));

        btn_principal_articulos.setText("Articulos");

        btn_principal_clientes.setText("Clientes");

        btn_principal_proveedores.setText("Proveedores");

        btn_principal_pedidos.setText("Pedidos");

        btn_principal_salir.setText("Salir");

        javax.swing.GroupLayout pnl_principal_izquierdaLayout = new javax.swing.GroupLayout(pnl_principal_izquierda);
        pnl_principal_izquierda.setLayout(pnl_principal_izquierdaLayout);
        pnl_principal_izquierdaLayout.setHorizontalGroup(
            pnl_principal_izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_principal_articulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_principal_clientes, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(btn_principal_proveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
            .addComponent(btn_principal_pedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(btn_principal_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(progres_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_principal_izquierdaLayout.setVerticalGroup(
            pnl_principal_izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principal_izquierdaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_principal_articulos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_principal_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_principal_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_principal_pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_principal_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(progres_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setLeftComponent(pnl_principal_izquierda);

        pnl_principal_derecha.setBackground(new java.awt.Color(255, 255, 255));

        btn_principal_buscar.setText("Buscar");

        tbl_Tabla_Principal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbl_Tabla_Principal);

        javax.swing.GroupLayout pnl_principal_derechaLayout = new javax.swing.GroupLayout(pnl_principal_derecha);
        pnl_principal_derecha.setLayout(pnl_principal_derechaLayout);
        pnl_principal_derechaLayout.setHorizontalGroup(
            pnl_principal_derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principal_derechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_principal_busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_principal_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnl_principal_derechaLayout.setVerticalGroup(
            pnl_principal_derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_principal_derechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_principal_derechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_principal_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_principal_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(pnl_principal_derecha);

        javax.swing.GroupLayout pnl_contenedorLayout = new javax.swing.GroupLayout(pnl_contenedor);
        pnl_contenedor.setLayout(pnl_contenedorLayout);
        pnl_contenedorLayout.setHorizontalGroup(
            pnl_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        pnl_contenedorLayout.setVerticalGroup(
            pnl_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        Menu_Nuevo.setText("Nuevo");

        Menu_Nuevo_Articulo.setText("Articulo");

        Menu_Nuevo_Articulo_Crear.setText("Crear");
        Menu_Nuevo_Articulo.add(Menu_Nuevo_Articulo_Crear);

        Menu_Nuevo_Articulo_Modificar.setText("Modificar");
        Menu_Nuevo_Articulo.add(Menu_Nuevo_Articulo_Modificar);

        Menu_Nuevo_Articulo_Eliminar.setText("Eliminar");
        Menu_Nuevo_Articulo.add(Menu_Nuevo_Articulo_Eliminar);

        Menu_Nuevo.add(Menu_Nuevo_Articulo);

        Menu_Nuevo_Cliente.setText("Cliente");

        Menu_Nuevo_Cliente_Crear.setText("Crear");
        Menu_Nuevo_Cliente.add(Menu_Nuevo_Cliente_Crear);

        Menu_Nuevo_Cliente_Modificar.setText("Modificar");
        Menu_Nuevo_Cliente.add(Menu_Nuevo_Cliente_Modificar);

        Menu_Nuevo_Cliente_Eliminar.setText("Eliminar");
        Menu_Nuevo_Cliente.add(Menu_Nuevo_Cliente_Eliminar);

        Menu_Nuevo.add(Menu_Nuevo_Cliente);

        Menu_Nuevo_Proveedor.setText("Proveedor");

        Menu_Nuevo_Proveedor_Crear.setText("Crear");
        Menu_Nuevo_Proveedor.add(Menu_Nuevo_Proveedor_Crear);

        Menu_Nuevo_Proveedor_Modificar.setText("Modificar");
        Menu_Nuevo_Proveedor.add(Menu_Nuevo_Proveedor_Modificar);

        Menu_Nuevo_Proveedor_Eliminar.setText("Eliminar");
        Menu_Nuevo_Proveedor.add(Menu_Nuevo_Proveedor_Eliminar);

        Menu_Nuevo.add(Menu_Nuevo_Proveedor);

        Menu_bar.add(Menu_Nuevo);

        Menu_Empresa.setText("Empresa");

        Menu_Empresa_Gastos.setText("Gastos de Empresa");
        Menu_Empresa.add(Menu_Empresa_Gastos);

        Menu_Empresa_Cobros_Pagos.setText("Cobros y pagos");
        Menu_Empresa.add(Menu_Empresa_Cobros_Pagos);

        Menu_bar.add(Menu_Empresa);

        Menu_Configuracion.setText("Configuracion");

        Menu_Confi_Ver.setText("Ver datos");
        Menu_Configuracion.add(Menu_Confi_Ver);

        Menu_Confi_Modificar.setText("Modificar");

        Menu_Confi_Modificar_Correo.setText("Correo ...");
        Menu_Confi_Modificar.add(Menu_Confi_Modificar_Correo);

        Menu_Confi_Modificar_Direccion.setText("Dirección ...");
        Menu_Confi_Modificar.add(Menu_Confi_Modificar_Direccion);

        Menu_Confi_Modificar_Iva.setText("% IVA ...");
        Menu_Confi_Modificar.add(Menu_Confi_Modificar_Iva);

        Menu_Confi_Modificar_Nombre.setText("Nombre de Empresa ...");
        Menu_Confi_Modificar.add(Menu_Confi_Modificar_Nombre);

        Menu_Confi_Modificar_Telefono.setText("Teléfono de contacto ...");
        Menu_Confi_Modificar.add(Menu_Confi_Modificar_Telefono);

        Menu_Configuracion.add(Menu_Confi_Modificar);

        Menu_bar.add(Menu_Configuracion);

        setJMenuBar(Menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JFrame Frame_Crear_Cliente;
    public javax.swing.JFrame Frame_Crear_Proveedor;
    public javax.swing.JMenu Menu_Confi_Modificar;
    public javax.swing.JMenuItem Menu_Confi_Modificar_Correo;
    public javax.swing.JMenuItem Menu_Confi_Modificar_Direccion;
    public javax.swing.JMenuItem Menu_Confi_Modificar_Iva;
    public javax.swing.JMenuItem Menu_Confi_Modificar_Nombre;
    public javax.swing.JMenuItem Menu_Confi_Modificar_Telefono;
    public javax.swing.JMenuItem Menu_Confi_Ver;
    public javax.swing.JMenu Menu_Configuracion;
    public javax.swing.JMenu Menu_Empresa;
    public javax.swing.JMenuItem Menu_Empresa_Cobros_Pagos;
    public javax.swing.JMenuItem Menu_Empresa_Gastos;
    public javax.swing.JMenu Menu_Nuevo;
    public javax.swing.JMenu Menu_Nuevo_Articulo;
    public javax.swing.JMenuItem Menu_Nuevo_Articulo_Crear;
    public javax.swing.JMenuItem Menu_Nuevo_Articulo_Eliminar;
    public javax.swing.JMenuItem Menu_Nuevo_Articulo_Modificar;
    public javax.swing.JMenu Menu_Nuevo_Cliente;
    public javax.swing.JMenuItem Menu_Nuevo_Cliente_Crear;
    public javax.swing.JMenuItem Menu_Nuevo_Cliente_Eliminar;
    public javax.swing.JMenuItem Menu_Nuevo_Cliente_Modificar;
    public javax.swing.JMenu Menu_Nuevo_Proveedor;
    public javax.swing.JMenuItem Menu_Nuevo_Proveedor_Crear;
    public javax.swing.JMenuItem Menu_Nuevo_Proveedor_Eliminar;
    public javax.swing.JMenuItem Menu_Nuevo_Proveedor_Modificar;
    public javax.swing.JMenuBar Menu_bar;
    public javax.swing.JButton btn_Crear_Cliente;
    public javax.swing.JButton btn_Crear_Cliente_Cancelar;
    public javax.swing.JButton btn_Eliminar_Cliente;
    public javax.swing.JButton btn_Eliminar_Cliente_Buscar;
    public javax.swing.JButton btn_Eliminar_Cliente_Cancelar;
    private javax.swing.JButton btn_Modificar_Cliente;
    private javax.swing.JButton btn_Modificar_Cliente_Busqueda;
    private javax.swing.JButton btn_Modificar_Cliente_Cancelar;
    public javax.swing.JButton btn_principal_articulos;
    public javax.swing.JButton btn_principal_buscar;
    public javax.swing.JButton btn_principal_clientes;
    public javax.swing.JButton btn_principal_pedidos;
    public javax.swing.JButton btn_principal_proveedores;
    public javax.swing.JButton btn_principal_salir;
    public javax.swing.JComboBox cbox_Eliminar_Cliente_Buscar;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel28;
    public javax.swing.JLabel jLabel29;
    public javax.swing.JLabel jLabel30;
    public javax.swing.JLabel jLabel31;
    public javax.swing.JLabel jLabel32;
    public javax.swing.JLabel jLabel33;
    public javax.swing.JLabel jLabel34;
    public javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JSplitPane jSplitPane1;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JPanel pnl_Crear_Cliente;
    public javax.swing.JPanel pnl_Eliminar_Cliente;
    public javax.swing.JPanel pnl_Modificar_Cliente;
    public javax.swing.JPanel pnl_contenedor;
    public javax.swing.JPanel pnl_principal_derecha;
    public javax.swing.JPanel pnl_principal_izquierda;
    public javax.swing.JProgressBar progres_principal;
    public javax.swing.JTable tbl_Eliminar_Cliente;
    private javax.swing.JTable tbl_Tabla_Modificar_Cliente;
    private javax.swing.JTable tbl_Tabla_Principal;
    public javax.swing.JTextField txt_Crear_Cliente_Apellidos;
    public javax.swing.JTextField txt_Crear_Cliente_Correo;
    public javax.swing.JTextField txt_Crear_Cliente_Dni;
    public javax.swing.JTextField txt_Crear_Cliente_Domicilio;
    public javax.swing.JTextField txt_Crear_Cliente_Nombre;
    public javax.swing.JTextField txt_Crear_Cliente_Telefono;
    public javax.swing.JTextField txt_Eliminar_Cliente_Buscar;
    public javax.swing.JTextField txt_Modificar_Cliente_Apellidos;
    private javax.swing.JTextField txt_Modificar_Cliente_Buscar;
    public javax.swing.JTextField txt_Modificar_Cliente_Correo;
    public javax.swing.JTextField txt_Modificar_Cliente_Dni;
    public javax.swing.JTextField txt_Modificar_Cliente_Domicilio;
    public javax.swing.JTextField txt_Modificar_Cliente_Nombre;
    public javax.swing.JTextField txt_Modificar_Cliente_Telefono;
    public javax.swing.JTextField txt_principal_busqueda;
    // End of variables declaration//GEN-END:variables
}
