package dragandflag;
public class Inicio extends javax.swing.JFrame {
    private static Inicio inicio; 
    public Inicio() {
        initComponents();
        this.setBounds(0,0,300,300);
        this.setLocationRelativeTo(null);
        setTitle("Drag & Flag");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovato = new javax.swing.JButton();
        btnConocedor = new javax.swing.JButton();
        btnSabiondo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnErudito = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setResizable(false);

        btnNovato.setBackground(new java.awt.Color(204, 204, 204));
        btnNovato.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        btnNovato.setForeground(new java.awt.Color(0, 51, 51));
        btnNovato.setText("NOVATO");
        btnNovato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNovato.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNovato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovatoActionPerformed(evt);
            }
        });

        btnConocedor.setBackground(new java.awt.Color(204, 204, 204));
        btnConocedor.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        btnConocedor.setForeground(new java.awt.Color(0, 51, 51));
        btnConocedor.setText("CONOCEDOR");
        btnConocedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConocedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConocedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConocedorActionPerformed(evt);
            }
        });

        btnSabiondo.setBackground(new java.awt.Color(204, 204, 204));
        btnSabiondo.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        btnSabiondo.setForeground(new java.awt.Color(0, 51, 51));
        btnSabiondo.setText("SABIONDO");
        btnSabiondo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSabiondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSabiondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSabiondoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Drag & Flag");

        btnErudito.setBackground(new java.awt.Color(204, 204, 204));
        btnErudito.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        btnErudito.setForeground(new java.awt.Color(0, 51, 51));
        btnErudito.setText("ERUDITO");
        btnErudito.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnErudito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnErudito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEruditoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nivel de dificultad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNovato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConocedor, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(btnSabiondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnErudito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNovato)
                .addGap(18, 18, 18)
                .addComponent(btnConocedor)
                .addGap(18, 18, 18)
                .addComponent(btnSabiondo)
                .addGap(18, 18, 18)
                .addComponent(btnErudito)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSabiondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSabiondoActionPerformed
        Tablero t=new Tablero("sabiondo");
        t.setOrigen(this);
        t.setVisible(true);                
        this.setVisible(false);
    }//GEN-LAST:event_btnSabiondoActionPerformed

    private void btnNovatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovatoActionPerformed
        Tablero t=new Tablero("novato");
        t.setOrigen(this);
        t.setVisible(true);                
        this.setVisible(false);
    }//GEN-LAST:event_btnNovatoActionPerformed

    private void btnConocedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConocedorActionPerformed
        Tablero t=new Tablero("conocedor");
        t.setOrigen(this);
        t.setVisible(true);                
        this.setVisible(false);
    }//GEN-LAST:event_btnConocedorActionPerformed

    private void btnEruditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEruditoActionPerformed
        Tablero t=new Tablero("erudito");
        t.setOrigen(this);
        t.setVisible(true);                
        this.setVisible(false);
    }//GEN-LAST:event_btnEruditoActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run(){
                inicio=new Inicio();
                inicio.setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConocedor;
    private javax.swing.JButton btnErudito;
    private javax.swing.JButton btnNovato;
    private javax.swing.JButton btnSabiondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
