/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.pages;

import controllers.ProductController;
import models.Product;
import services.DbConnection;
import utilities.CanShowPage;

/**
 *
 * @author 1styrGroupA
 */
public class UpdateProduct extends javax.swing.JFrame implements CanShowPage {

    DbConnection dbConnection;
    Product product;
    Dashboard dashboard;

    /**
     * Creates new form UpdateProduct
     */
    public UpdateProduct() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        brand = new javax.swing.JTextField();
        stocks = new javax.swing.JTextField();
        update = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cancel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coffe Shop");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dist/images/bg-1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 550));

        jPanel2.setBackground(new java.awt.Color(153, 102, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dist/images/icon-3.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Constantia", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<coffee/>");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Any Updates?");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        description.setBackground(new java.awt.Color(153, 102, 51));
        description.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        description.setForeground(new java.awt.Color(255, 255, 255));
        description.setText("Description");
        description.setBorder(null);
        description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionActionPerformed(evt);
            }
        });
        jPanel2.add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 210, 60));

        name.setBackground(new java.awt.Color(153, 102, 51));
        name.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name");
        name.setBorder(null);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 210, 40));

        price.setBackground(new java.awt.Color(153, 102, 51));
        price.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setText("Price");
        price.setBorder(null);
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        jPanel2.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 210, 30));

        brand.setBackground(new java.awt.Color(153, 102, 51));
        brand.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        brand.setForeground(new java.awt.Color(255, 255, 255));
        brand.setText("Brand");
        brand.setBorder(null);
        jPanel2.add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 210, 20));

        stocks.setBackground(new java.awt.Color(153, 102, 51));
        stocks.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        stocks.setForeground(new java.awt.Color(255, 255, 255));
        stocks.setText("Stocks");
        stocks.setBorder(null);
        jPanel2.add(stocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 210, 30));

        update.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("     Update");
        update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 80, 40));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 210, -1));

        cancel.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("     Cancel");
        cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        cancel.setPreferredSize(new java.awt.Dimension(52, 16));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        jPanel2.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 80, 40));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 210, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 210, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 210, -1));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 210, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 300, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        
        this.product.setName(this.name.getText());
        this.product.setBrand(this.brand.getText());
        this.product.setPrice(Double.parseDouble(this.price.getText()));
        this.product.setStocks(Integer.parseInt(this.stocks.getText()));
        this.product.setDescription(this.description.getText());
        
        ProductController.update(product, dbConnection,this.dashboard);
        this.dispose();
    }//GEN-LAST:event_updateMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brand;
    private javax.swing.JLabel cancel;
    private javax.swing.JTextField description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JTextField stocks;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
    @Override
    public void showPage(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
        this.populateFeilds();
        this.setVisible(true);
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public void setDashboard(Dashboard dashboard){
        this.dashboard = dashboard;
    }

    private void populateFeilds() {
        this.name.setText(this.product.getName());
        this.brand.setText(this.product.getBrand());
        this.price.setText(String.valueOf(this.product.getPrice()));
        this.stocks.setText(String.valueOf(this.product.getStocks()));
        this.description.setText(this.product.getDescription());   
    }
}
