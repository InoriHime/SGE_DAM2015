package Vistas;

import java.awt.BorderLayout;

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

        Frame_Cliente = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        tabPane_Cliente = new javax.swing.JTabbedPane();
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
        btn_Eliminar_Cliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_Cliente_Cancelar = new javax.swing.JButton();
        Frame_Proveedor = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tabPane_Proveedor = new javax.swing.JTabbedPane();
        pnl_Crear_Proveedor = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Crear_Proveedor_Cif = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Crear_Proveedor_DSocial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Crear_Proveedor_Telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Crear_Proveedor_Correo = new javax.swing.JTextField();
        btn_Crear_Proveedor = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        pnl_Modificar_Proveedor = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_Tabla_Modificar_Proveedor = new javax.swing.JTable();
        txt_Modificar_Proveedor_Buscar = new javax.swing.JTextField();
        btn_Modificar_Proveedor_Busqueda = new javax.swing.JButton();
        btn_Modificar_Proveedor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_Modificar_Proveedor_Cif = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_Modificar_Proveedor_DSocial = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_Modificar_Proveedor_Telefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_Modificar_Proveedor_Correo = new javax.swing.JTextField();
        pnl_Eliminar_Proveedor = new javax.swing.JPanel();
        cbox_Eliminar_Proveedor_Buscar = new javax.swing.JComboBox();
        txt_Eliminar_Proveedor_Buscar = new javax.swing.JTextField();
        btn_Eliminar_Proveedor_Buscar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_Eliminar_Proveedor = new javax.swing.JTable();
        btn_Eliminar_Proveedor = new javax.swing.JButton();
        btn_Proveedor_Cancelar = new javax.swing.JButton();
        Frame_Articulo = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tabPane_Articulo = new javax.swing.JTabbedPane();
        pnl_Crear_Articulo = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_Crear_Articulo_Nombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_Crear_Articulo_Precio = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        btn_Crear_Articulo = new javax.swing.JButton();
        pnl_Modificar_Articulo = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txt_Modificar_Articulo_Nombre = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_Modificar_Articulo_Precio = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txt_Modificar_Articulo_Buscar = new javax.swing.JTextField();
        btn_Modificar_Articulo_Busqueda = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_Tabla_Modificar_Articulo = new javax.swing.JTable();
        btn_Modificar_Articulo = new javax.swing.JButton();
        pnl_Eliminar_Articulo = new javax.swing.JPanel();
        cbox_Eliminar_Articulo_Buscar = new javax.swing.JComboBox();
        txt_Eliminar_Articulo_Buscar = new javax.swing.JTextField();
        btn_Eliminar_Articulo_Buscar = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_Eliminar_Articulo = new javax.swing.JTable();
        btn_Eliminar_Articulo = new javax.swing.JButton();
        btn_Articulo_Cancelar = new javax.swing.JButton();
        Frame_Pedido = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        rad_Pedido_Cliente = new javax.swing.JRadioButton();
        rad_Pedido_Proveedor = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_Pedido_ArticulosPedidos = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_Pedido_Articulos = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pnl_Pedido_ClienteProveedor = new javax.swing.JPanel();
        btn_Pedido_Cancelar = new javax.swing.JButton();
        btn_Pedido_HacerPedido = new javax.swing.JButton();
        radGroup_Pedido = new javax.swing.ButtonGroup();
        pnl_Pedido_Contenedor_Cliente = new javax.swing.JPanel();
        pnl_Pedido_Cliente = new javax.swing.JPanel();
        cbox_Pedido_Cliente_Busqueda = new javax.swing.JComboBox();
        txt_Pedido_Cliente_Buscar = new javax.swing.JTextField();
        btn_Pedido_Cliente_Buscar = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbl_Pedido_Cliente_Busqueda = new javax.swing.JTable();
        jLabel45 = new javax.swing.JLabel();
        eti_Pedido_Cliente_Nombre = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        eti_Pedido_Cliente_Apellidos = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        eti_Pedido_Cliente_Domicilio = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        eti_Pedido_Cliente_Correo = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        eti_Pedido_Cliente_Dni = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        eti_Pedido_Cliente_Telefono = new javax.swing.JLabel();
        pnl_Pedido_Contenedor_Proveedor = new javax.swing.JPanel();
        pnl_Pedido_Proveedor = new javax.swing.JPanel();
        cbox_Pedido_Proveedor_Busqueda1 = new javax.swing.JComboBox();
        txt_Pedido_Proveedor_Buscar = new javax.swing.JTextField();
        btn_Pedido_Proveedor_Buscar = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tbl_Pedido_Proveedor_Busqueda = new javax.swing.JTable();
        jLabel51 = new javax.swing.JLabel();
        eti_Pedido_Proveedor_CIF = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        eti_Pedido_Proveedor_DSocial = new javax.swing.JLabel();
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
        Menu_Nuevo_Articulo = new javax.swing.JMenuItem();
        Menu_Nuevo_Cliente = new javax.swing.JMenuItem();
        Menu_Nuevo_Proveedor = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Menu_Nuevo_Pedido = new javax.swing.JMenuItem();
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

        Frame_Cliente.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnl_Crear_Cliente.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setText("Nombre:");

        jLabel20.setText("Apellidos:");

        jLabel21.setText("Domicilio:");

        jLabel22.setText("Correo");

        jLabel23.setText("DNI:");

        jLabel24.setText("Teléfono:");

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
                        .addGroup(pnl_Crear_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_Crear_ClienteLayout.createSequentialGroup()
                                .addContainerGap()
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
                            .addGroup(pnl_Crear_ClienteLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel32)
                                .addGap(0, 105, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Crear_ClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Crear_Cliente)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(btn_Crear_Cliente)
                .addContainerGap())
        );

        tabPane_Cliente.addTab("Crear...", pnl_Crear_Cliente);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Modificar_ClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Modificar_Cliente)
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Modificar_Cliente)
                .addContainerGap())
        );

        tabPane_Cliente.addTab("Modificar...", pnl_Modificar_Cliente);

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
                        .addComponent(btn_Eliminar_Cliente)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btn_Eliminar_Cliente)
                .addContainerGap())
        );

        tabPane_Cliente.addTab("Eliminar...", pnl_Eliminar_Cliente);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cliente");
        jLabel1.setOpaque(true);

        btn_Cliente_Cancelar.setText("Cancelar");
        btn_Cliente_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cliente_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane_Cliente, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Cliente_Cancelar)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabPane_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Cliente_Cancelar)
                .addContainerGap())
        );

        javax.swing.GroupLayout Frame_ClienteLayout = new javax.swing.GroupLayout(Frame_Cliente.getContentPane());
        Frame_Cliente.getContentPane().setLayout(Frame_ClienteLayout);
        Frame_ClienteLayout.setHorizontalGroup(
            Frame_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Frame_ClienteLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Frame_ClienteLayout.setVerticalGroup(
            Frame_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Frame_ClienteLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Frame_Proveedor.setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Proveedor");
        jLabel8.setOpaque(true);

        pnl_Crear_Proveedor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel36.setText("Por favor introduzca los datos que acontinuación se piden. Introduzca los campos señalados con un ");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 0, 0));
        jLabel37.setText("*");

        jLabel2.setText("CIF:");

        jLabel3.setText("Denominación Social:");

        jLabel4.setText("Teléfono:");

        jLabel5.setText("Correo:");

        btn_Crear_Proveedor.setText("Crear");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 0, 0));
        jLabel38.setText("*");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 0, 0));
        jLabel39.setText("*");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 0, 0));
        jLabel40.setText("*");

        javax.swing.GroupLayout pnl_Crear_ProveedorLayout = new javax.swing.GroupLayout(pnl_Crear_Proveedor);
        pnl_Crear_Proveedor.setLayout(pnl_Crear_ProveedorLayout);
        pnl_Crear_ProveedorLayout.setHorizontalGroup(
            pnl_Crear_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Crear_ProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Crear_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Crear_ProveedorLayout.createSequentialGroup()
                        .addGroup(pnl_Crear_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_Crear_ProveedorLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Crear_Proveedor_Cif))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_Crear_ProveedorLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Crear_Proveedor_DSocial))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_Crear_ProveedorLayout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel37)
                                .addGap(0, 158, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_Crear_ProveedorLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Crear_Proveedor_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Crear_Proveedor_Correo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_Crear_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Crear_ProveedorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Crear_Proveedor)))
                .addContainerGap())
        );
        pnl_Crear_ProveedorLayout.setVerticalGroup(
            pnl_Crear_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Crear_ProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Crear_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(45, 45, 45)
                .addGroup(pnl_Crear_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Crear_Proveedor_Cif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addGroup(pnl_Crear_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Crear_Proveedor_DSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_Crear_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Crear_Proveedor_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Crear_Proveedor_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(btn_Crear_Proveedor)
                .addContainerGap())
        );

        tabPane_Proveedor.addTab("Crear ...", pnl_Crear_Proveedor);

        pnl_Modificar_Proveedor.setBackground(new java.awt.Color(255, 255, 255));

        tbl_Tabla_Modificar_Proveedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tbl_Tabla_Modificar_Proveedor);

        btn_Modificar_Proveedor_Busqueda.setText("Buscar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txt_Modificar_Proveedor_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Modificar_Proveedor_Busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Modificar_Proveedor_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Modificar_Proveedor_Busqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_Modificar_Proveedor.setText("Modificar");

        jLabel6.setText("CIF:");

        jLabel7.setText("Denominación Social:");

        jLabel9.setText("Teléfono:");

        jLabel10.setText("Correo:");

        javax.swing.GroupLayout pnl_Modificar_ProveedorLayout = new javax.swing.GroupLayout(pnl_Modificar_Proveedor);
        pnl_Modificar_Proveedor.setLayout(pnl_Modificar_ProveedorLayout);
        pnl_Modificar_ProveedorLayout.setHorizontalGroup(
            pnl_Modificar_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_Modificar_ProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Modificar_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Modificar_ProveedorLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Modificar_Proveedor_Cif))
                    .addGroup(pnl_Modificar_ProveedorLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Modificar_Proveedor_DSocial))
                    .addGroup(pnl_Modificar_ProveedorLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Modificar_Proveedor_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Modificar_Proveedor_Correo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Modificar_ProveedorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Modificar_Proveedor)))
                .addContainerGap())
        );
        pnl_Modificar_ProveedorLayout.setVerticalGroup(
            pnl_Modificar_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Modificar_ProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Modificar_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Modificar_Proveedor_Cif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Modificar_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_Modificar_Proveedor_DSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Modificar_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_Modificar_Proveedor_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_Modificar_Proveedor_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Modificar_Proveedor)
                .addContainerGap())
        );

        tabPane_Proveedor.addTab("Modificar ...", pnl_Modificar_Proveedor);

        pnl_Eliminar_Proveedor.setBackground(new java.awt.Color(255, 255, 255));

        cbox_Eliminar_Proveedor_Buscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CIF", "Denominacion Social", "Telefono", "Correo" }));

        btn_Eliminar_Proveedor_Buscar.setText("Buscar");

        tbl_Eliminar_Proveedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tbl_Eliminar_Proveedor);

        btn_Eliminar_Proveedor.setText("Eliminar");

        javax.swing.GroupLayout pnl_Eliminar_ProveedorLayout = new javax.swing.GroupLayout(pnl_Eliminar_Proveedor);
        pnl_Eliminar_Proveedor.setLayout(pnl_Eliminar_ProveedorLayout);
        pnl_Eliminar_ProveedorLayout.setHorizontalGroup(
            pnl_Eliminar_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Eliminar_ProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Eliminar_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(pnl_Eliminar_ProveedorLayout.createSequentialGroup()
                        .addComponent(cbox_Eliminar_Proveedor_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Eliminar_Proveedor_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Eliminar_Proveedor_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Eliminar_ProveedorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Eliminar_Proveedor)))
                .addContainerGap())
        );
        pnl_Eliminar_ProveedorLayout.setVerticalGroup(
            pnl_Eliminar_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Eliminar_ProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Eliminar_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbox_Eliminar_Proveedor_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Eliminar_Proveedor_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Eliminar_Proveedor_Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Eliminar_Proveedor)
                .addContainerGap())
        );

        tabPane_Proveedor.addTab("Eliminar ...", pnl_Eliminar_Proveedor);

        btn_Proveedor_Cancelar.setText("Cancelar");
        btn_Proveedor_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Proveedor_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane_Proveedor, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Proveedor_Cancelar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(tabPane_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Proveedor_Cancelar)
                .addContainerGap())
        );

        javax.swing.GroupLayout Frame_ProveedorLayout = new javax.swing.GroupLayout(Frame_Proveedor.getContentPane());
        Frame_Proveedor.getContentPane().setLayout(Frame_ProveedorLayout);
        Frame_ProveedorLayout.setHorizontalGroup(
            Frame_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Frame_ProveedorLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Frame_ProveedorLayout.setVerticalGroup(
            Frame_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Frame_ProveedorLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Frame_Articulo.setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Articulo");
        jLabel11.setOpaque(true);

        pnl_Crear_Articulo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel41.setText("Por favor introduzca los datos que acontinuación se piden. Introduzca los campos señalados con un ");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 0, 0));
        jLabel42.setText("*");

        jLabel12.setText("Nombre:");

        jLabel13.setText("Precio:");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 0, 0));
        jLabel43.setText("*");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 0, 0));
        jLabel44.setText("*");

        btn_Crear_Articulo.setText("Crear");

        javax.swing.GroupLayout pnl_Crear_ArticuloLayout = new javax.swing.GroupLayout(pnl_Crear_Articulo);
        pnl_Crear_Articulo.setLayout(pnl_Crear_ArticuloLayout);
        pnl_Crear_ArticuloLayout.setHorizontalGroup(
            pnl_Crear_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Crear_ArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Crear_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Crear_ArticuloLayout.createSequentialGroup()
                        .addGroup(pnl_Crear_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_Crear_ArticuloLayout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel42)
                                .addGap(0, 101, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_Crear_ArticuloLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Crear_Articulo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel43)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Crear_Articulo_Precio)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Crear_ArticuloLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Crear_Articulo)))
                .addContainerGap())
        );
        pnl_Crear_ArticuloLayout.setVerticalGroup(
            pnl_Crear_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Crear_ArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Crear_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(50, 50, 50)
                .addGroup(pnl_Crear_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_Crear_Articulo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txt_Crear_Articulo_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btn_Crear_Articulo)
                .addContainerGap())
        );

        tabPane_Articulo.addTab("Crear ...", pnl_Crear_Articulo);

        pnl_Modificar_Articulo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setText("Nombre:");

        jLabel15.setText("Precio:");

        btn_Modificar_Articulo_Busqueda.setText("Buscar");

        tbl_Tabla_Modificar_Articulo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tbl_Tabla_Modificar_Articulo);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txt_Modificar_Articulo_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Modificar_Articulo_Busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Modificar_Articulo_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Modificar_Articulo_Busqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_Modificar_Articulo.setText("Modificar");

        javax.swing.GroupLayout pnl_Modificar_ArticuloLayout = new javax.swing.GroupLayout(pnl_Modificar_Articulo);
        pnl_Modificar_Articulo.setLayout(pnl_Modificar_ArticuloLayout);
        pnl_Modificar_ArticuloLayout.setHorizontalGroup(
            pnl_Modificar_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Modificar_ArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Modificar_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Modificar_ArticuloLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Modificar_Articulo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Modificar_Articulo_Precio))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Modificar_ArticuloLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Modificar_Articulo)))
                .addContainerGap())
        );
        pnl_Modificar_ArticuloLayout.setVerticalGroup(
            pnl_Modificar_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Modificar_ArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Modificar_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_Modificar_Articulo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txt_Modificar_Articulo_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Modificar_Articulo)
                .addContainerGap())
        );

        tabPane_Articulo.addTab("Modificar ...", pnl_Modificar_Articulo);

        pnl_Eliminar_Articulo.setBackground(new java.awt.Color(255, 255, 255));

        cbox_Eliminar_Articulo_Buscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CIF", "Denominacion Social", "Telefono", "Correo" }));

        btn_Eliminar_Articulo_Buscar.setText("Buscar");

        tbl_Eliminar_Articulo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(tbl_Eliminar_Articulo);

        btn_Eliminar_Articulo.setText("Eliminar");

        javax.swing.GroupLayout pnl_Eliminar_ArticuloLayout = new javax.swing.GroupLayout(pnl_Eliminar_Articulo);
        pnl_Eliminar_Articulo.setLayout(pnl_Eliminar_ArticuloLayout);
        pnl_Eliminar_ArticuloLayout.setHorizontalGroup(
            pnl_Eliminar_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Eliminar_ArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Eliminar_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7)
                    .addGroup(pnl_Eliminar_ArticuloLayout.createSequentialGroup()
                        .addComponent(cbox_Eliminar_Articulo_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Eliminar_Articulo_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Eliminar_Articulo_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Eliminar_ArticuloLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Eliminar_Articulo)))
                .addContainerGap())
        );
        pnl_Eliminar_ArticuloLayout.setVerticalGroup(
            pnl_Eliminar_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Eliminar_ArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Eliminar_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbox_Eliminar_Articulo_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Eliminar_Articulo_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Eliminar_Articulo_Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btn_Eliminar_Articulo)
                .addContainerGap())
        );

        tabPane_Articulo.addTab("Eliminar ...", pnl_Eliminar_Articulo);

        btn_Articulo_Cancelar.setText("Cancelar");
        btn_Articulo_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Articulo_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane_Articulo)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Articulo_Cancelar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(tabPane_Articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btn_Articulo_Cancelar)
                .addContainerGap())
        );

        javax.swing.GroupLayout Frame_ArticuloLayout = new javax.swing.GroupLayout(Frame_Articulo.getContentPane());
        Frame_Articulo.getContentPane().setLayout(Frame_ArticuloLayout);
        Frame_ArticuloLayout.setHorizontalGroup(
            Frame_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Frame_ArticuloLayout.setVerticalGroup(
            Frame_ArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Frame_Pedido.setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Pedido ");
        jLabel16.setOpaque(true);

        radGroup_Pedido.add(rad_Pedido_Cliente);
        rad_Pedido_Cliente.setText("Cliente");

        radGroup_Pedido.add(rad_Pedido_Proveedor);
        rad_Pedido_Proveedor.setText("Proveedor");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Articulos"));

        jButton1.setText(">>");

        jButton2.setText("<<");

        tbl_Pedido_ArticulosPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(tbl_Pedido_ArticulosPedidos);

        tbl_Pedido_Articulos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(tbl_Pedido_Articulos);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Articulos");
        jLabel17.setOpaque(true);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Articulos Pedidos");
        jLabel18.setOpaque(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_Pedido_ClienteProveedorLayout = new javax.swing.GroupLayout(pnl_Pedido_ClienteProveedor);
        pnl_Pedido_ClienteProveedor.setLayout(pnl_Pedido_ClienteProveedorLayout);
        pnl_Pedido_ClienteProveedorLayout.setHorizontalGroup(
            pnl_Pedido_ClienteProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        pnl_Pedido_ClienteProveedorLayout.setVerticalGroup(
            pnl_Pedido_ClienteProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );

        btn_Pedido_Cancelar.setText("Cancelar");
        btn_Pedido_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Pedido_CancelarActionPerformed(evt);
            }
        });

        btn_Pedido_HacerPedido.setText("Hacer Pedido");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Pedido_ClienteProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(rad_Pedido_Cliente)
                        .addGap(46, 46, 46)
                        .addComponent(rad_Pedido_Proveedor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Pedido_HacerPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Pedido_Cancelar)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rad_Pedido_Cliente)
                    .addComponent(rad_Pedido_Proveedor))
                .addGap(6, 6, 6)
                .addComponent(pnl_Pedido_ClienteProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Pedido_Cancelar)
                    .addComponent(btn_Pedido_HacerPedido))
                .addContainerGap())
        );

        javax.swing.GroupLayout Frame_PedidoLayout = new javax.swing.GroupLayout(Frame_Pedido.getContentPane());
        Frame_Pedido.getContentPane().setLayout(Frame_PedidoLayout);
        Frame_PedidoLayout.setHorizontalGroup(
            Frame_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Frame_PedidoLayout.setVerticalGroup(
            Frame_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_Pedido_Contenedor_Cliente.setPreferredSize(new java.awt.Dimension(632, 260));

        pnl_Pedido_Cliente.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Pedido_Cliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        cbox_Pedido_Cliente_Busqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dni", "Nombre", "Apellidos" }));

        btn_Pedido_Cliente_Buscar.setText("Buscar");

        tbl_Pedido_Cliente_Busqueda.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane10.setViewportView(tbl_Pedido_Cliente_Busqueda);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setText("Nombre:");

        eti_Pedido_Cliente_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eti_Pedido_Cliente_Nombre.setText("NombreSelect");
        eti_Pedido_Cliente_Nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setText("Apellidos:");

        eti_Pedido_Cliente_Apellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eti_Pedido_Cliente_Apellidos.setText("ApellidosSelect");
        eti_Pedido_Cliente_Apellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setText("Domicilio:");

        eti_Pedido_Cliente_Domicilio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eti_Pedido_Cliente_Domicilio.setText("DomicilioSelect");
        eti_Pedido_Cliente_Domicilio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setText("Correo:");

        eti_Pedido_Cliente_Correo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eti_Pedido_Cliente_Correo.setText("CorreoSelect");
        eti_Pedido_Cliente_Correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel49.setText("Dni:");

        eti_Pedido_Cliente_Dni.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eti_Pedido_Cliente_Dni.setText("DniSelect");
        eti_Pedido_Cliente_Dni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setText("Telefono:");

        eti_Pedido_Cliente_Telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eti_Pedido_Cliente_Telefono.setText("TelefonoSelect");
        eti_Pedido_Cliente_Telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnl_Pedido_ClienteLayout = new javax.swing.GroupLayout(pnl_Pedido_Cliente);
        pnl_Pedido_Cliente.setLayout(pnl_Pedido_ClienteLayout);
        pnl_Pedido_ClienteLayout.setHorizontalGroup(
            pnl_Pedido_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Pedido_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Pedido_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10)
                    .addGroup(pnl_Pedido_ClienteLayout.createSequentialGroup()
                        .addComponent(cbox_Pedido_Cliente_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Pedido_Cliente_Buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Pedido_Cliente_Buscar))
                    .addGroup(pnl_Pedido_ClienteLayout.createSequentialGroup()
                        .addGroup(pnl_Pedido_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(pnl_Pedido_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Pedido_ClienteLayout.createSequentialGroup()
                                .addComponent(eti_Pedido_Cliente_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eti_Pedido_Cliente_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_Pedido_ClienteLayout.createSequentialGroup()
                                .addComponent(eti_Pedido_Cliente_Dni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eti_Pedido_Cliente_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(eti_Pedido_Cliente_Domicilio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eti_Pedido_Cliente_Correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnl_Pedido_ClienteLayout.setVerticalGroup(
            pnl_Pedido_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Pedido_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Pedido_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbox_Pedido_Cliente_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Pedido_Cliente_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Pedido_Cliente_Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_Pedido_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(eti_Pedido_Cliente_Nombre)
                    .addComponent(jLabel46)
                    .addComponent(eti_Pedido_Cliente_Apellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Pedido_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(eti_Pedido_Cliente_Domicilio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Pedido_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(eti_Pedido_Cliente_Correo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Pedido_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(eti_Pedido_Cliente_Dni)
                    .addComponent(jLabel50)
                    .addComponent(eti_Pedido_Cliente_Telefono))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_Pedido_Contenedor_ClienteLayout = new javax.swing.GroupLayout(pnl_Pedido_Contenedor_Cliente);
        pnl_Pedido_Contenedor_Cliente.setLayout(pnl_Pedido_Contenedor_ClienteLayout);
        pnl_Pedido_Contenedor_ClienteLayout.setHorizontalGroup(
            pnl_Pedido_Contenedor_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Pedido_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_Pedido_Contenedor_ClienteLayout.setVerticalGroup(
            pnl_Pedido_Contenedor_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Pedido_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_Pedido_Contenedor_Proveedor.setPreferredSize(new java.awt.Dimension(632, 260));

        pnl_Pedido_Proveedor.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Pedido_Proveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedor"));

        cbox_Pedido_Proveedor_Busqueda1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CIF", "Denominacion Social" }));

        btn_Pedido_Proveedor_Buscar.setText("Buscar");

        tbl_Pedido_Proveedor_Busqueda.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane11.setViewportView(tbl_Pedido_Proveedor_Busqueda);

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel51.setText("CIF:");

        eti_Pedido_Proveedor_CIF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eti_Pedido_Proveedor_CIF.setText("CIFSelect");
        eti_Pedido_Proveedor_CIF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel52.setText("Denominación Social:");

        eti_Pedido_Proveedor_DSocial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eti_Pedido_Proveedor_DSocial.setText("DenominacionSocialSelect");
        eti_Pedido_Proveedor_DSocial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnl_Pedido_ProveedorLayout = new javax.swing.GroupLayout(pnl_Pedido_Proveedor);
        pnl_Pedido_Proveedor.setLayout(pnl_Pedido_ProveedorLayout);
        pnl_Pedido_ProveedorLayout.setHorizontalGroup(
            pnl_Pedido_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Pedido_ProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Pedido_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(pnl_Pedido_ProveedorLayout.createSequentialGroup()
                        .addComponent(cbox_Pedido_Proveedor_Busqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Pedido_Proveedor_Buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Pedido_Proveedor_Buscar))
                    .addGroup(pnl_Pedido_ProveedorLayout.createSequentialGroup()
                        .addGroup(pnl_Pedido_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_Pedido_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eti_Pedido_Proveedor_CIF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eti_Pedido_Proveedor_DSocial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnl_Pedido_ProveedorLayout.setVerticalGroup(
            pnl_Pedido_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Pedido_ProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Pedido_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbox_Pedido_Proveedor_Busqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Pedido_Proveedor_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Pedido_Proveedor_Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_Pedido_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(eti_Pedido_Proveedor_CIF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_Pedido_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(eti_Pedido_Proveedor_DSocial))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_Pedido_Contenedor_ProveedorLayout = new javax.swing.GroupLayout(pnl_Pedido_Contenedor_Proveedor);
        pnl_Pedido_Contenedor_Proveedor.setLayout(pnl_Pedido_Contenedor_ProveedorLayout);
        pnl_Pedido_Contenedor_ProveedorLayout.setHorizontalGroup(
            pnl_Pedido_Contenedor_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
            .addGroup(pnl_Pedido_Contenedor_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_Pedido_Proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_Pedido_Contenedor_ProveedorLayout.setVerticalGroup(
            pnl_Pedido_Contenedor_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
            .addGroup(pnl_Pedido_Contenedor_ProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_Pedido_Proveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(btn_principal_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
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
        Menu_Nuevo_Articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Nuevo_ArticuloActionPerformed(evt);
            }
        });
        Menu_Nuevo.add(Menu_Nuevo_Articulo);

        Menu_Nuevo_Cliente.setText("Cliente");
        Menu_Nuevo_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Nuevo_ClienteActionPerformed(evt);
            }
        });
        Menu_Nuevo.add(Menu_Nuevo_Cliente);

        Menu_Nuevo_Proveedor.setText("Proveedor");
        Menu_Nuevo_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Nuevo_ProveedorActionPerformed(evt);
            }
        });
        Menu_Nuevo.add(Menu_Nuevo_Proveedor);
        Menu_Nuevo.add(jSeparator1);

        Menu_Nuevo_Pedido.setText("Nuevo pedido");
        Menu_Nuevo_Pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Nuevo_PedidoActionPerformed(evt);
            }
        });
        Menu_Nuevo.add(Menu_Nuevo_Pedido);

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

    private void Menu_Nuevo_ArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Nuevo_ArticuloActionPerformed
        Frame_Articulo.setVisible(true);
        Frame_Articulo.setSize(800, 500);
        Frame_Articulo.setLocationRelativeTo(this);
    }//GEN-LAST:event_Menu_Nuevo_ArticuloActionPerformed

    private void Menu_Nuevo_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Nuevo_ClienteActionPerformed
        Frame_Cliente.setVisible(true);
        Frame_Cliente.setSize(800,500);
        Frame_Cliente.setLocationRelativeTo(this);
    }//GEN-LAST:event_Menu_Nuevo_ClienteActionPerformed

    private void Menu_Nuevo_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Nuevo_ProveedorActionPerformed
        Frame_Proveedor.setVisible(true);
        Frame_Proveedor.setSize(800,500);
        Frame_Proveedor.setLocationRelativeTo(this);
    }//GEN-LAST:event_Menu_Nuevo_ProveedorActionPerformed

    private void btn_Cliente_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cliente_CancelarActionPerformed
        Frame_Cliente.setVisible(false);
    }//GEN-LAST:event_btn_Cliente_CancelarActionPerformed

    private void btn_Proveedor_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Proveedor_CancelarActionPerformed
        Frame_Proveedor.setVisible(false);
    }//GEN-LAST:event_btn_Proveedor_CancelarActionPerformed

    private void btn_Articulo_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Articulo_CancelarActionPerformed
        Frame_Articulo.setVisible(false);
    }//GEN-LAST:event_btn_Articulo_CancelarActionPerformed

    private void Menu_Nuevo_PedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Nuevo_PedidoActionPerformed
        Frame_Pedido.setVisible(true);
        Frame_Pedido.setSize(800, 650);
        Frame_Pedido.setLocationRelativeTo(this);
    }//GEN-LAST:event_Menu_Nuevo_PedidoActionPerformed

    private void btn_Pedido_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Pedido_CancelarActionPerformed
        Frame_Pedido.setVisible(false);
    }//GEN-LAST:event_btn_Pedido_CancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Frame_Articulo;
    public javax.swing.JFrame Frame_Cliente;
    private javax.swing.JFrame Frame_Pedido;
    public javax.swing.JFrame Frame_Proveedor;
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
    private javax.swing.JMenuItem Menu_Nuevo_Articulo;
    private javax.swing.JMenuItem Menu_Nuevo_Cliente;
    private javax.swing.JMenuItem Menu_Nuevo_Pedido;
    private javax.swing.JMenuItem Menu_Nuevo_Proveedor;
    public javax.swing.JMenuBar Menu_bar;
    public javax.swing.JButton btn_Articulo_Cancelar;
    public javax.swing.JButton btn_Cliente_Cancelar;
    public javax.swing.JButton btn_Crear_Articulo;
    public javax.swing.JButton btn_Crear_Cliente;
    public javax.swing.JButton btn_Crear_Proveedor;
    public javax.swing.JButton btn_Eliminar_Articulo;
    public javax.swing.JButton btn_Eliminar_Articulo_Buscar;
    public javax.swing.JButton btn_Eliminar_Cliente;
    public javax.swing.JButton btn_Eliminar_Cliente_Buscar;
    public javax.swing.JButton btn_Eliminar_Proveedor;
    public javax.swing.JButton btn_Eliminar_Proveedor_Buscar;
    public javax.swing.JButton btn_Modificar_Articulo;
    public javax.swing.JButton btn_Modificar_Articulo_Busqueda;
    private javax.swing.JButton btn_Modificar_Cliente;
    private javax.swing.JButton btn_Modificar_Cliente_Busqueda;
    public javax.swing.JButton btn_Modificar_Proveedor;
    public javax.swing.JButton btn_Modificar_Proveedor_Busqueda;
    public javax.swing.JButton btn_Pedido_Cancelar;
    public javax.swing.JButton btn_Pedido_Cliente_Buscar;
    public javax.swing.JButton btn_Pedido_HacerPedido;
    public javax.swing.JButton btn_Pedido_Proveedor_Buscar;
    public javax.swing.JButton btn_Proveedor_Cancelar;
    public javax.swing.JButton btn_principal_articulos;
    public javax.swing.JButton btn_principal_buscar;
    public javax.swing.JButton btn_principal_clientes;
    public javax.swing.JButton btn_principal_pedidos;
    public javax.swing.JButton btn_principal_proveedores;
    public javax.swing.JButton btn_principal_salir;
    public javax.swing.JComboBox cbox_Eliminar_Articulo_Buscar;
    public javax.swing.JComboBox cbox_Eliminar_Cliente_Buscar;
    public javax.swing.JComboBox cbox_Eliminar_Proveedor_Buscar;
    public javax.swing.JComboBox cbox_Pedido_Cliente_Busqueda;
    public javax.swing.JComboBox cbox_Pedido_Proveedor_Busqueda1;
    public javax.swing.JLabel eti_Pedido_Cliente_Apellidos;
    public javax.swing.JLabel eti_Pedido_Cliente_Correo;
    public javax.swing.JLabel eti_Pedido_Cliente_Dni;
    public javax.swing.JLabel eti_Pedido_Cliente_Domicilio;
    public javax.swing.JLabel eti_Pedido_Cliente_Nombre;
    public javax.swing.JLabel eti_Pedido_Cliente_Telefono;
    public javax.swing.JLabel eti_Pedido_Proveedor_CIF;
    public javax.swing.JLabel eti_Pedido_Proveedor_DSocial;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
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
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel30;
    public javax.swing.JLabel jLabel31;
    public javax.swing.JLabel jLabel32;
    public javax.swing.JLabel jLabel33;
    public javax.swing.JLabel jLabel34;
    public javax.swing.JLabel jLabel35;
    public javax.swing.JLabel jLabel36;
    public javax.swing.JLabel jLabel37;
    public javax.swing.JLabel jLabel38;
    public javax.swing.JLabel jLabel39;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel40;
    public javax.swing.JLabel jLabel41;
    public javax.swing.JLabel jLabel42;
    public javax.swing.JLabel jLabel43;
    public javax.swing.JLabel jLabel44;
    public javax.swing.JLabel jLabel45;
    public javax.swing.JLabel jLabel46;
    public javax.swing.JLabel jLabel47;
    public javax.swing.JLabel jLabel48;
    public javax.swing.JLabel jLabel49;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel50;
    public javax.swing.JLabel jLabel51;
    public javax.swing.JLabel jLabel52;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    public javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane10;
    public javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JScrollPane jScrollPane7;
    public javax.swing.JScrollPane jScrollPane8;
    public javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public javax.swing.JSplitPane jSplitPane1;
    public javax.swing.JPanel pnl_Crear_Articulo;
    public javax.swing.JPanel pnl_Crear_Cliente;
    public javax.swing.JPanel pnl_Crear_Proveedor;
    public javax.swing.JPanel pnl_Eliminar_Articulo;
    public javax.swing.JPanel pnl_Eliminar_Cliente;
    public javax.swing.JPanel pnl_Eliminar_Proveedor;
    public javax.swing.JPanel pnl_Modificar_Articulo;
    public javax.swing.JPanel pnl_Modificar_Cliente;
    public javax.swing.JPanel pnl_Modificar_Proveedor;
    public javax.swing.JPanel pnl_Pedido_Cliente;
    public javax.swing.JPanel pnl_Pedido_ClienteProveedor;
    public javax.swing.JPanel pnl_Pedido_Contenedor_Cliente;
    public javax.swing.JPanel pnl_Pedido_Contenedor_Proveedor;
    public javax.swing.JPanel pnl_Pedido_Proveedor;
    public javax.swing.JPanel pnl_contenedor;
    public javax.swing.JPanel pnl_principal_derecha;
    public javax.swing.JPanel pnl_principal_izquierda;
    public javax.swing.JProgressBar progres_principal;
    public javax.swing.ButtonGroup radGroup_Pedido;
    public javax.swing.JRadioButton rad_Pedido_Cliente;
    public javax.swing.JRadioButton rad_Pedido_Proveedor;
    public javax.swing.JTabbedPane tabPane_Articulo;
    public javax.swing.JTabbedPane tabPane_Cliente;
    public javax.swing.JTabbedPane tabPane_Proveedor;
    public javax.swing.JTable tbl_Eliminar_Articulo;
    public javax.swing.JTable tbl_Eliminar_Cliente;
    public javax.swing.JTable tbl_Eliminar_Proveedor;
    public javax.swing.JTable tbl_Pedido_Articulos;
    public javax.swing.JTable tbl_Pedido_ArticulosPedidos;
    public javax.swing.JTable tbl_Pedido_Cliente_Busqueda;
    private javax.swing.JTable tbl_Pedido_Proveedor_Busqueda;
    public javax.swing.JTable tbl_Tabla_Modificar_Articulo;
    private javax.swing.JTable tbl_Tabla_Modificar_Cliente;
    public javax.swing.JTable tbl_Tabla_Modificar_Proveedor;
    private javax.swing.JTable tbl_Tabla_Principal;
    public javax.swing.JTextField txt_Crear_Articulo_Nombre;
    public javax.swing.JTextField txt_Crear_Articulo_Precio;
    public javax.swing.JTextField txt_Crear_Cliente_Apellidos;
    public javax.swing.JTextField txt_Crear_Cliente_Correo;
    public javax.swing.JTextField txt_Crear_Cliente_Dni;
    public javax.swing.JTextField txt_Crear_Cliente_Domicilio;
    public javax.swing.JTextField txt_Crear_Cliente_Nombre;
    public javax.swing.JTextField txt_Crear_Cliente_Telefono;
    public javax.swing.JTextField txt_Crear_Proveedor_Cif;
    public javax.swing.JTextField txt_Crear_Proveedor_Correo;
    public javax.swing.JTextField txt_Crear_Proveedor_DSocial;
    public javax.swing.JTextField txt_Crear_Proveedor_Telefono;
    public javax.swing.JTextField txt_Eliminar_Articulo_Buscar;
    public javax.swing.JTextField txt_Eliminar_Cliente_Buscar;
    public javax.swing.JTextField txt_Eliminar_Proveedor_Buscar;
    public javax.swing.JTextField txt_Modificar_Articulo_Buscar;
    public javax.swing.JTextField txt_Modificar_Articulo_Nombre;
    public javax.swing.JTextField txt_Modificar_Articulo_Precio;
    public javax.swing.JTextField txt_Modificar_Cliente_Apellidos;
    private javax.swing.JTextField txt_Modificar_Cliente_Buscar;
    public javax.swing.JTextField txt_Modificar_Cliente_Correo;
    public javax.swing.JTextField txt_Modificar_Cliente_Dni;
    public javax.swing.JTextField txt_Modificar_Cliente_Domicilio;
    public javax.swing.JTextField txt_Modificar_Cliente_Nombre;
    public javax.swing.JTextField txt_Modificar_Cliente_Telefono;
    public javax.swing.JTextField txt_Modificar_Proveedor_Buscar;
    public javax.swing.JTextField txt_Modificar_Proveedor_Cif;
    public javax.swing.JTextField txt_Modificar_Proveedor_Correo;
    public javax.swing.JTextField txt_Modificar_Proveedor_DSocial;
    public javax.swing.JTextField txt_Modificar_Proveedor_Telefono;
    public javax.swing.JTextField txt_Pedido_Cliente_Buscar;
    public javax.swing.JTextField txt_Pedido_Proveedor_Buscar;
    public javax.swing.JTextField txt_principal_busqueda;
    // End of variables declaration//GEN-END:variables
}
