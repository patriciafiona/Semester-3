
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class admin_frame extends javax.swing.JFrame {

    private Connection con;
    private Statement st;
    private String sql="";
    private ResultSet hasil;
    
    public admin_frame() {
        initComponents();
        
        //default kalo baru masuk admin_frame tampilinnya yang halaman pasien
        patient_menu_choose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alas = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        top_sidebar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        setting_menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        patients_menu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        appointment_menu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        scedule_menu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        patient = new javax.swing.JScrollPane();
        patient_page = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabel_pasien = new javax.swing.JTable();
        pasien_menu = new javax.swing.JPanel();
        menu_patient_add = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        menu_patient_edit = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        menu_patient_del = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        menu_patient_dropdown = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        appointment = new javax.swing.JScrollPane();
        patient_page1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        add_patient = new javax.swing.JScrollPane();
        add_patient_page = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        pasien_menu1 = new javax.swing.JPanel();
        menu_patient_add1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        menu_patient_edit1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        menu_patient_del1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        menu_patient_dropdown1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        edit_patient = new javax.swing.JScrollPane();
        edit_patient_page = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        pasien_menu2 = new javax.swing.JPanel();
        menu_patient_add2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        menu_patient_edit2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        menu_patient_del2 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        menu_patient_dropdown2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        del_patient = new javax.swing.JScrollPane();
        del_patient_page = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        pasien_menu3 = new javax.swing.JPanel();
        menu_patient_add3 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        menu_patient_edit3 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        menu_patient_del3 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        menu_patient_dropdown3 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        top_bar = new javax.swing.JPanel();
        close_box = new javax.swing.JPanel();
        close_x = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        alas.setBackground(new java.awt.Color(255, 255, 255));

        sidebar.setBackground(new java.awt.Color(60, 68, 100));

        top_sidebar.setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hospital-logo-2-kecil.png"))); // NOI18N

        javax.swing.GroupLayout top_sidebarLayout = new javax.swing.GroupLayout(top_sidebar);
        top_sidebar.setLayout(top_sidebarLayout);
        top_sidebarLayout.setHorizontalGroup(
            top_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_sidebarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        top_sidebarLayout.setVerticalGroup(
            top_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setting_menu.setBackground(new java.awt.Color(109, 118, 156));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Settings");

        javax.swing.GroupLayout setting_menuLayout = new javax.swing.GroupLayout(setting_menu);
        setting_menu.setLayout(setting_menuLayout);
        setting_menuLayout.setHorizontalGroup(
            setting_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setting_menuLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setting_menuLayout.setVerticalGroup(
            setting_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setting_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        patients_menu.setBackground(new java.awt.Color(81, 90, 129));
        patients_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patients_menuMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patients");

        javax.swing.GroupLayout patients_menuLayout = new javax.swing.GroupLayout(patients_menu);
        patients_menu.setLayout(patients_menuLayout);
        patients_menuLayout.setHorizontalGroup(
            patients_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patients_menuLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        patients_menuLayout.setVerticalGroup(
            patients_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patients_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        appointment_menu.setBackground(new java.awt.Color(81, 90, 129));
        appointment_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointment_menuMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Appointment");

        javax.swing.GroupLayout appointment_menuLayout = new javax.swing.GroupLayout(appointment_menu);
        appointment_menu.setLayout(appointment_menuLayout);
        appointment_menuLayout.setHorizontalGroup(
            appointment_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointment_menuLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        appointment_menuLayout.setVerticalGroup(
            appointment_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointment_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        scedule_menu.setBackground(new java.awt.Color(81, 90, 129));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Scedule");

        javax.swing.GroupLayout scedule_menuLayout = new javax.swing.GroupLayout(scedule_menu);
        scedule_menu.setLayout(scedule_menuLayout);
        scedule_menuLayout.setHorizontalGroup(
            scedule_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scedule_menuLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        scedule_menuLayout.setVerticalGroup(
            scedule_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scedule_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top_sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(scedule_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patients_menu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(appointment_menu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setting_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addComponent(top_sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(patients_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(appointment_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(scedule_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(setting_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(new java.awt.CardLayout());

        patient.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        patient_page.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Patients");

        tabel_pasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabel_pasien);

        pasien_menu.setBackground(new java.awt.Color(153, 153, 153));
        pasien_menu.setLayout(new java.awt.GridLayout());

        menu_patient_add.setBackground(new java.awt.Color(153, 153, 153));
        menu_patient_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_patient_addMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Add Patient");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_add_user_kecil.png"))); // NOI18N

        javax.swing.GroupLayout menu_patient_addLayout = new javax.swing.GroupLayout(menu_patient_add);
        menu_patient_add.setLayout(menu_patient_addLayout);
        menu_patient_addLayout.setHorizontalGroup(
            menu_patient_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_patient_addLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(27, 27, 27)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_patient_addLayout.setVerticalGroup(
            menu_patient_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pasien_menu.add(menu_patient_add);

        menu_patient_edit.setBackground(new java.awt.Color(153, 153, 153));
        menu_patient_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_patient_editMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Edit Patient");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b_edit.png"))); // NOI18N

        javax.swing.GroupLayout menu_patient_editLayout = new javax.swing.GroupLayout(menu_patient_edit);
        menu_patient_edit.setLayout(menu_patient_editLayout);
        menu_patient_editLayout.setHorizontalGroup(
            menu_patient_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_patient_editLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu_patient_editLayout.setVerticalGroup(
            menu_patient_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pasien_menu.add(menu_patient_edit);

        menu_patient_del.setBackground(new java.awt.Color(153, 153, 153));
        menu_patient_del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_patient_delMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Remove Patient");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b_drop.png"))); // NOI18N

        javax.swing.GroupLayout menu_patient_delLayout = new javax.swing.GroupLayout(menu_patient_del);
        menu_patient_del.setLayout(menu_patient_delLayout);
        menu_patient_delLayout.setHorizontalGroup(
            menu_patient_delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_patient_delLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu_patient_delLayout.setVerticalGroup(
            menu_patient_delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        pasien_menu.add(menu_patient_del);

        menu_patient_dropdown.setBackground(new java.awt.Color(153, 153, 153));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aksi.gif"))); // NOI18N

        javax.swing.GroupLayout menu_patient_dropdownLayout = new javax.swing.GroupLayout(menu_patient_dropdown);
        menu_patient_dropdown.setLayout(menu_patient_dropdownLayout);
        menu_patient_dropdownLayout.setHorizontalGroup(
            menu_patient_dropdownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_patient_dropdownLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(48, 48, 48))
        );
        menu_patient_dropdownLayout.setVerticalGroup(
            menu_patient_dropdownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        pasien_menu.add(menu_patient_dropdown);

        javax.swing.GroupLayout patient_pageLayout = new javax.swing.GroupLayout(patient_page);
        patient_page.setLayout(patient_pageLayout);
        patient_pageLayout.setHorizontalGroup(
            patient_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_pageLayout.createSequentialGroup()
                .addGroup(patient_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pasien_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(patient_pageLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8))
                    .addGroup(patient_pageLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        patient_pageLayout.setVerticalGroup(
            patient_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_pageLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel8)
                .addGap(26, 26, 26)
                .addComponent(pasien_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        patient.setViewportView(patient_page);

        main.add(patient, "card2");

        appointment.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        patient_page1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Appointment");

        javax.swing.GroupLayout patient_page1Layout = new javax.swing.GroupLayout(patient_page1);
        patient_page1.setLayout(patient_page1Layout);
        patient_page1Layout.setHorizontalGroup(
            patient_page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_page1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel9)
                .addContainerGap(602, Short.MAX_VALUE))
        );
        patient_page1Layout.setVerticalGroup(
            patient_page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_page1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel9)
                .addContainerGap(704, Short.MAX_VALUE))
        );

        appointment.setViewportView(patient_page1);

        main.add(appointment, "card2");

        add_patient.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        add_patient_page.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Add Patient");

        pasien_menu1.setBackground(new java.awt.Color(153, 153, 153));
        pasien_menu1.setLayout(new java.awt.GridLayout());

        menu_patient_add1.setBackground(new java.awt.Color(153, 153, 153));
        menu_patient_add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_patient_add1MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Add Patient");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_add_user_kecil.png"))); // NOI18N

        javax.swing.GroupLayout menu_patient_add1Layout = new javax.swing.GroupLayout(menu_patient_add1);
        menu_patient_add1.setLayout(menu_patient_add1Layout);
        menu_patient_add1Layout.setHorizontalGroup(
            menu_patient_add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_patient_add1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(27, 27, 27)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_patient_add1Layout.setVerticalGroup(
            menu_patient_add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pasien_menu1.add(menu_patient_add1);

        menu_patient_edit1.setBackground(new java.awt.Color(153, 153, 153));
        menu_patient_edit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_patient_edit1MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Edit Patient");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b_edit.png"))); // NOI18N

        javax.swing.GroupLayout menu_patient_edit1Layout = new javax.swing.GroupLayout(menu_patient_edit1);
        menu_patient_edit1.setLayout(menu_patient_edit1Layout);
        menu_patient_edit1Layout.setHorizontalGroup(
            menu_patient_edit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_patient_edit1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu_patient_edit1Layout.setVerticalGroup(
            menu_patient_edit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pasien_menu1.add(menu_patient_edit1);

        menu_patient_del1.setBackground(new java.awt.Color(153, 153, 153));
        menu_patient_del1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_patient_del1MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Remove Patient");

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b_drop.png"))); // NOI18N

        javax.swing.GroupLayout menu_patient_del1Layout = new javax.swing.GroupLayout(menu_patient_del1);
        menu_patient_del1.setLayout(menu_patient_del1Layout);
        menu_patient_del1Layout.setHorizontalGroup(
            menu_patient_del1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_patient_del1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu_patient_del1Layout.setVerticalGroup(
            menu_patient_del1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        pasien_menu1.add(menu_patient_del1);

        menu_patient_dropdown1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aksi.gif"))); // NOI18N

        javax.swing.GroupLayout menu_patient_dropdown1Layout = new javax.swing.GroupLayout(menu_patient_dropdown1);
        menu_patient_dropdown1.setLayout(menu_patient_dropdown1Layout);
        menu_patient_dropdown1Layout.setHorizontalGroup(
            menu_patient_dropdown1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_patient_dropdown1Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(48, 48, 48))
        );
        menu_patient_dropdown1Layout.setVerticalGroup(
            menu_patient_dropdown1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        pasien_menu1.add(menu_patient_dropdown1);

        javax.swing.GroupLayout add_patient_pageLayout = new javax.swing.GroupLayout(add_patient_page);
        add_patient_page.setLayout(add_patient_pageLayout);
        add_patient_pageLayout.setHorizontalGroup(
            add_patient_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_patient_pageLayout.createSequentialGroup()
                .addGroup(add_patient_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pasien_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(add_patient_pageLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel16)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        add_patient_pageLayout.setVerticalGroup(
            add_patient_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_patient_pageLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel16)
                .addGap(26, 26, 26)
                .addComponent(pasien_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(499, Short.MAX_VALUE))
        );

        add_patient.setViewportView(add_patient_page);

        main.add(add_patient, "card2");

        edit_patient.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        edit_patient_page.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("Edit Patient");

        pasien_menu2.setBackground(new java.awt.Color(153, 153, 153));
        pasien_menu2.setLayout(new java.awt.GridLayout());

        menu_patient_add2.setBackground(new java.awt.Color(153, 153, 153));
        menu_patient_add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_patient_add2MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Add Patient");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_add_user_kecil.png"))); // NOI18N

        javax.swing.GroupLayout menu_patient_add2Layout = new javax.swing.GroupLayout(menu_patient_add2);
        menu_patient_add2.setLayout(menu_patient_add2Layout);
        menu_patient_add2Layout.setHorizontalGroup(
            menu_patient_add2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_patient_add2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(27, 27, 27)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_patient_add2Layout.setVerticalGroup(
            menu_patient_add2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pasien_menu2.add(menu_patient_add2);

        menu_patient_edit2.setBackground(new java.awt.Color(153, 153, 153));
        menu_patient_edit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_patient_edit2MouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Edit Patient");

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b_edit.png"))); // NOI18N

        javax.swing.GroupLayout menu_patient_edit2Layout = new javax.swing.GroupLayout(menu_patient_edit2);
        menu_patient_edit2.setLayout(menu_patient_edit2Layout);
        menu_patient_edit2Layout.setHorizontalGroup(
            menu_patient_edit2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_patient_edit2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu_patient_edit2Layout.setVerticalGroup(
            menu_patient_edit2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pasien_menu2.add(menu_patient_edit2);

        menu_patient_del2.setBackground(new java.awt.Color(153, 153, 153));
        menu_patient_del2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_patient_del2MouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Remove Patient");

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b_drop.png"))); // NOI18N

        javax.swing.GroupLayout menu_patient_del2Layout = new javax.swing.GroupLayout(menu_patient_del2);
        menu_patient_del2.setLayout(menu_patient_del2Layout);
        menu_patient_del2Layout.setHorizontalGroup(
            menu_patient_del2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_patient_del2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu_patient_del2Layout.setVerticalGroup(
            menu_patient_del2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        pasien_menu2.add(menu_patient_del2);

        menu_patient_dropdown2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aksi.gif"))); // NOI18N

        javax.swing.GroupLayout menu_patient_dropdown2Layout = new javax.swing.GroupLayout(menu_patient_dropdown2);
        menu_patient_dropdown2.setLayout(menu_patient_dropdown2Layout);
        menu_patient_dropdown2Layout.setHorizontalGroup(
            menu_patient_dropdown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_patient_dropdown2Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(48, 48, 48))
        );
        menu_patient_dropdown2Layout.setVerticalGroup(
            menu_patient_dropdown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        pasien_menu2.add(menu_patient_dropdown2);

        javax.swing.GroupLayout edit_patient_pageLayout = new javax.swing.GroupLayout(edit_patient_page);
        edit_patient_page.setLayout(edit_patient_pageLayout);
        edit_patient_pageLayout.setHorizontalGroup(
            edit_patient_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_patient_pageLayout.createSequentialGroup()
                .addGroup(edit_patient_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pasien_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(edit_patient_pageLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel24)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        edit_patient_pageLayout.setVerticalGroup(
            edit_patient_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_patient_pageLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel24)
                .addGap(26, 26, 26)
                .addComponent(pasien_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(499, Short.MAX_VALUE))
        );

        edit_patient.setViewportView(edit_patient_page);

        main.add(edit_patient, "card2");

        del_patient.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        del_patient_page.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(153, 153, 153));
        jLabel32.setText("Remove Patient");

        pasien_menu3.setBackground(new java.awt.Color(153, 153, 153));
        pasien_menu3.setLayout(new java.awt.GridLayout());

        menu_patient_add3.setBackground(new java.awt.Color(153, 153, 153));
        menu_patient_add3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_patient_add3MouseClicked(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Add Patient");

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_add_user_kecil.png"))); // NOI18N

        javax.swing.GroupLayout menu_patient_add3Layout = new javax.swing.GroupLayout(menu_patient_add3);
        menu_patient_add3.setLayout(menu_patient_add3Layout);
        menu_patient_add3Layout.setHorizontalGroup(
            menu_patient_add3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_patient_add3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(27, 27, 27)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_patient_add3Layout.setVerticalGroup(
            menu_patient_add3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pasien_menu3.add(menu_patient_add3);

        menu_patient_edit3.setBackground(new java.awt.Color(153, 153, 153));
        menu_patient_edit3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_patient_edit3MouseClicked(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Edit Patient");

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b_edit.png"))); // NOI18N

        javax.swing.GroupLayout menu_patient_edit3Layout = new javax.swing.GroupLayout(menu_patient_edit3);
        menu_patient_edit3.setLayout(menu_patient_edit3Layout);
        menu_patient_edit3Layout.setHorizontalGroup(
            menu_patient_edit3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_patient_edit3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu_patient_edit3Layout.setVerticalGroup(
            menu_patient_edit3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pasien_menu3.add(menu_patient_edit3);

        menu_patient_del3.setBackground(new java.awt.Color(153, 153, 153));
        menu_patient_del3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_patient_del3MouseClicked(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Remove Patient");

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b_drop.png"))); // NOI18N

        javax.swing.GroupLayout menu_patient_del3Layout = new javax.swing.GroupLayout(menu_patient_del3);
        menu_patient_del3.setLayout(menu_patient_del3Layout);
        menu_patient_del3Layout.setHorizontalGroup(
            menu_patient_del3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_patient_del3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu_patient_del3Layout.setVerticalGroup(
            menu_patient_del3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        pasien_menu3.add(menu_patient_del3);

        menu_patient_dropdown3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aksi.gif"))); // NOI18N

        javax.swing.GroupLayout menu_patient_dropdown3Layout = new javax.swing.GroupLayout(menu_patient_dropdown3);
        menu_patient_dropdown3.setLayout(menu_patient_dropdown3Layout);
        menu_patient_dropdown3Layout.setHorizontalGroup(
            menu_patient_dropdown3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_patient_dropdown3Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(48, 48, 48))
        );
        menu_patient_dropdown3Layout.setVerticalGroup(
            menu_patient_dropdown3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        pasien_menu3.add(menu_patient_dropdown3);

        javax.swing.GroupLayout del_patient_pageLayout = new javax.swing.GroupLayout(del_patient_page);
        del_patient_page.setLayout(del_patient_pageLayout);
        del_patient_pageLayout.setHorizontalGroup(
            del_patient_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(del_patient_pageLayout.createSequentialGroup()
                .addGroup(del_patient_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pasien_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(del_patient_pageLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel32)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        del_patient_pageLayout.setVerticalGroup(
            del_patient_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(del_patient_pageLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel32)
                .addGap(26, 26, 26)
                .addComponent(pasien_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(499, Short.MAX_VALUE))
        );

        del_patient.setViewportView(del_patient_page);

        main.add(del_patient, "card2");

        javax.swing.GroupLayout alasLayout = new javax.swing.GroupLayout(alas);
        alas.setLayout(alasLayout);
        alasLayout.setHorizontalGroup(
            alasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alasLayout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE))
        );
        alasLayout.setVerticalGroup(
            alasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alasLayout.createSequentialGroup()
                .addGroup(alasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 408, Short.MAX_VALUE))
        );

        top_bar.setBackground(new java.awt.Color(237, 235, 235));

        close_box.setBackground(new java.awt.Color(255, 0, 0));

        close_x.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        close_x.setForeground(new java.awt.Color(255, 255, 255));
        close_x.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_x.setText("x");
        close_x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_xMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout close_boxLayout = new javax.swing.GroupLayout(close_box);
        close_box.setLayout(close_boxLayout);
        close_boxLayout.setHorizontalGroup(
            close_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close_x, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );
        close_boxLayout.setVerticalGroup(
            close_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(close_boxLayout.createSequentialGroup()
                .addComponent(close_x, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout top_barLayout = new javax.swing.GroupLayout(top_bar);
        top_bar.setLayout(top_barLayout);
        top_barLayout.setHorizontalGroup(
            top_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, top_barLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        top_barLayout.setVerticalGroup(
            top_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_barLayout.createSequentialGroup()
                .addComponent(close_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(alas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(top_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1137, 611));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close_xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_xMouseClicked
        if(JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit?","Warning",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            //keluar program 
            System.exit(0); 
        }
    }//GEN-LAST:event_close_xMouseClicked

    private void patients_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patients_menuMouseClicked
        // direct ke halaman patient
        patient_menu_choose();
    }//GEN-LAST:event_patients_menuMouseClicked

    private void appointment_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointment_menuMouseClicked
        // direct ke halaman appointment
        appointment_menu_choose();
    }//GEN-LAST:event_appointment_menuMouseClicked

    private void menu_patient_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_patient_addMouseClicked
        // halaman dialihkan ke halaman tambah pasien
        add_patient_menu_choose();
    }//GEN-LAST:event_menu_patient_addMouseClicked

    private void menu_patient_add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_patient_add1MouseClicked
        // halaman dialihkan ke halaman tambah pasien
        add_patient_menu_choose();
    }//GEN-LAST:event_menu_patient_add1MouseClicked

    private void menu_patient_add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_patient_add2MouseClicked
        // halaman dialihkan ke halaman tambah pasien
        add_patient_menu_choose();
    }//GEN-LAST:event_menu_patient_add2MouseClicked

    private void menu_patient_add3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_patient_add3MouseClicked
        // halaman dialihkan ke halaman tambah pasien
        add_patient_menu_choose();
    }//GEN-LAST:event_menu_patient_add3MouseClicked

    private void menu_patient_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_patient_editMouseClicked
        // halaman dialihkan ke halaman edit pasien
        edit_patient_menu_choose();
    }//GEN-LAST:event_menu_patient_editMouseClicked

    private void menu_patient_edit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_patient_edit1MouseClicked
        // halaman dialihkan ke halaman edit pasien
        edit_patient_menu_choose();
    }//GEN-LAST:event_menu_patient_edit1MouseClicked

    private void menu_patient_edit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_patient_edit2MouseClicked
        // halaman dialihkan ke halaman edit pasien
        edit_patient_menu_choose();
    }//GEN-LAST:event_menu_patient_edit2MouseClicked

    private void menu_patient_edit3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_patient_edit3MouseClicked
        // halaman dialihkan ke halaman edit pasien
        edit_patient_menu_choose();
    }//GEN-LAST:event_menu_patient_edit3MouseClicked

    private void menu_patient_delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_patient_delMouseClicked
        // halaman dialihkan ke halaman delete pasien
        del_patient_menu_choose();
    }//GEN-LAST:event_menu_patient_delMouseClicked

    private void menu_patient_del1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_patient_del1MouseClicked
        // halaman dialihkan ke halaman delete pasien
        del_patient_menu_choose();
    }//GEN-LAST:event_menu_patient_del1MouseClicked

    private void menu_patient_del2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_patient_del2MouseClicked
        // halaman dialihkan ke halaman delete pasien
        del_patient_menu_choose();
    }//GEN-LAST:event_menu_patient_del2MouseClicked

    private void menu_patient_del3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_patient_del3MouseClicked
        // halaman dialihkan ke halaman delete pasien
        del_patient_menu_choose();
    }//GEN-LAST:event_menu_patient_del3MouseClicked

    private void patient_menu_choose(){
        main.removeAll();
        main.revalidate();
        main.repaint();
        
        main.add(patient);
        ShowData();
    }
    
    private void add_patient_menu_choose(){
        main.removeAll();
        main.revalidate();
        main.repaint();
        
        main.add(add_patient);
        ShowData();
    }
    
    private void edit_patient_menu_choose(){
        main.removeAll();
        main.revalidate();
        main.repaint();
        
        main.add(edit_patient);
        ShowData();
    }
    
    private void del_patient_menu_choose(){
        main.removeAll();
        main.revalidate();
        main.repaint();
        
        main.add(del_patient);
        ShowData();
    }
    
    private void appointment_menu_choose(){
        main.removeAll();
        main.revalidate();
        main.repaint();
        
        main.add(appointment);
    }
    
    private void KoneksiDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rumah_sakit", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR \n Gagal Membaca KeDatabase \n Aktifkan Database Sebelum Memulai");
        }
    }
    
    private void ShowData(){
        DefaultTableModel data = new DefaultTableModel();
        data.addColumn ("No");
        data.addColumn ("Patient ID");
        data.addColumn ("Name");
        data.addColumn ("Gender");
        data.addColumn ("Age");
        data.addColumn ("Address");
        data.addColumn ("Member Since");
        
        //koneksi ke database
        KoneksiDB();   //membuat koneksi
        
        try{   
            int i = 1;
            st=con.createStatement();
            hasil=st.executeQuery("SELECT * FROM daftar_pasien");
            while (hasil.next())
                data.addRow(new Object[]{
                (""+i++),
                    hasil.getString("kode_pasien"),  //kode pasien
                    hasil.getString("nama"),  //nama
                    hasil.getString("jenis_kelamin"),  //jenis kelamin
                    hasil.getString("umur"),  //umur
                    hasil.getString("alamat"),  //alamat
                    hasil.getString("member_since")  //member since
                });
            tabel_pasien.setModel(data);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR \n Gagal Membaca Database");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane add_patient;
    private javax.swing.JPanel add_patient_page;
    private javax.swing.JPanel alas;
    private javax.swing.JScrollPane appointment;
    private javax.swing.JPanel appointment_menu;
    private javax.swing.JPanel close_box;
    private javax.swing.JLabel close_x;
    private javax.swing.JScrollPane del_patient;
    private javax.swing.JPanel del_patient_page;
    private javax.swing.JScrollPane edit_patient;
    private javax.swing.JPanel edit_patient_page;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel main;
    private javax.swing.JPanel menu_patient_add;
    private javax.swing.JPanel menu_patient_add1;
    private javax.swing.JPanel menu_patient_add2;
    private javax.swing.JPanel menu_patient_add3;
    private javax.swing.JPanel menu_patient_del;
    private javax.swing.JPanel menu_patient_del1;
    private javax.swing.JPanel menu_patient_del2;
    private javax.swing.JPanel menu_patient_del3;
    private javax.swing.JPanel menu_patient_dropdown;
    private javax.swing.JPanel menu_patient_dropdown1;
    private javax.swing.JPanel menu_patient_dropdown2;
    private javax.swing.JPanel menu_patient_dropdown3;
    private javax.swing.JPanel menu_patient_edit;
    private javax.swing.JPanel menu_patient_edit1;
    private javax.swing.JPanel menu_patient_edit2;
    private javax.swing.JPanel menu_patient_edit3;
    private javax.swing.JPanel pasien_menu;
    private javax.swing.JPanel pasien_menu1;
    private javax.swing.JPanel pasien_menu2;
    private javax.swing.JPanel pasien_menu3;
    private javax.swing.JScrollPane patient;
    private javax.swing.JPanel patient_page;
    private javax.swing.JPanel patient_page1;
    private javax.swing.JPanel patients_menu;
    private javax.swing.JPanel scedule_menu;
    private javax.swing.JPanel setting_menu;
    private javax.swing.JPanel sidebar;
    private javax.swing.JTable tabel_pasien;
    private javax.swing.JPanel top_bar;
    private javax.swing.JPanel top_sidebar;
    // End of variables declaration//GEN-END:variables
}
