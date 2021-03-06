package paneles;

/**
 *
 * @author raul jonathan
 */
public class MenuPostres extends javax.swing.JPanel {
    public MenuPostres() {
        initComponents();
        jPopupMenu1.add(menu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        Btn_Editar = new rojerusan.RSButtonIconD();
        Btn_Eliminar = new rojerusan.RSButtonIconD();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        Btn_nuevo = new rojerusan.RSButtonHover();
        Btn_EliminarTodo = new rojerusan.RSButtonHover();
        rSTextFieldShade1 = new rscomponentshade.RSTextFieldShade();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();
        rSPanelsSlider1 = new rojeru_san.RSPanelsSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Editar.setBackground(new java.awt.Color(255, 109, 0));
        Btn_Editar.setBorder(new javax.swing.border.MatteBorder(null));
        Btn_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x48-editar.png"))); // NOI18N
        Btn_Editar.setText("E D I T A R ");
        Btn_Editar.setColorHover(new java.awt.Color(139, 195, 111));
        Btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EditarActionPerformed(evt);
            }
        });
        menu.add(Btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 51));

        Btn_Eliminar.setBackground(new java.awt.Color(255, 109, 0));
        Btn_Eliminar.setBorder(new javax.swing.border.MatteBorder(null));
        Btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x48-basura.png"))); // NOI18N
        Btn_Eliminar.setText("E L I M I N A R");
        Btn_Eliminar.setColorHover(new java.awt.Color(139, 195, 111));
        menu.add(Btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 51));

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(43, 189, 126)));

        Btn_nuevo.setBackground(new java.awt.Color(255, 109, 0));
        Btn_nuevo.setText("N U E V O");
        Btn_nuevo.setColorHover(new java.awt.Color(139, 195, 111));
        Btn_nuevo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_nuevoActionPerformed(evt);
            }
        });

        Btn_EliminarTodo.setBackground(new java.awt.Color(255, 109, 0));
        Btn_EliminarTodo.setText("E L I M I N A R   T O D O ");
        Btn_EliminarTodo.setColorHover(new java.awt.Color(139, 195, 111));
        Btn_EliminarTodo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        rSTextFieldShade1.setDisabledTextColor(new java.awt.Color(255, 109, 0));
        rSTextFieldShade1.setPlaceholder("B U S C A R ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(43, 189, 126)));

        rSTableMetro1.setBackground(new java.awt.Color(0, 204, 153));
        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
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
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(43, 189, 126));
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(105, 240, 174));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(0, 150, 36));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(0, 150, 36));
        rSTableMetro1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(rSTableMetro1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );

        rSPanelsSlider1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("P O S T R E S");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelsSlider1Layout = new javax.swing.GroupLayout(rSPanelsSlider1);
        rSPanelsSlider1.setLayout(rSPanelsSlider1Layout);
        rSPanelsSlider1Layout.setHorizontalGroup(
            rSPanelsSlider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelsSlider1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rSPanelsSlider1Layout.setVerticalGroup(
            rSPanelsSlider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelsSlider1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x64-buscar.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_EliminarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSTextFieldShade1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_EliminarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSTextFieldShade1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void modifocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifocarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifocarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        new agregarPostres().setVisible(true);
    }//GEN-LAST:event_agregarActionPerformed

    private void ACTUALIZA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ACTUALIZA2ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed

    private void Btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_nuevoActionPerformed
        new agregarPostres().setVisible(true);
    }//GEN-LAST:event_Btn_nuevoActionPerformed

    private void Btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditarActionPerformed
        new ActualizarPostres().setVisible(true);
    }//GEN-LAST:event_Btn_EditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconD Btn_Editar;
    private rojerusan.RSButtonIconD Btn_Eliminar;
    private rojerusan.RSButtonHover Btn_EliminarTodo;
    private rojerusan.RSButtonHover Btn_nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu;
    private rojeru_san.RSPanelsSlider rSPanelsSlider1;
    private rojerusan.RSTableMetro rSTableMetro1;
    private rscomponentshade.RSTextFieldShade rSTextFieldShade1;
    // End of variables declaration//GEN-END:variables
}
