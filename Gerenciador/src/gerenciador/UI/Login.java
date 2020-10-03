

package gerenciador.UI;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class Login extends javax.swing.JFrame {

 
    public Login() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgLoginLeiloeiroComprador = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbLoginTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbLoginNome = new javax.swing.JLabel();
        tfLoginNome = new javax.swing.JTextField();
        rbLoginLeiloeiro = new javax.swing.JRadioButton();
        rbLoginComprador = new javax.swing.JRadioButton();
        jbLoginEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbLoginTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbLoginTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLoginTitulo.setText("LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLoginTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLoginTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        lbLoginNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbLoginNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLoginNome.setText("Nome:");

        tfLoginNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        bgLoginLeiloeiroComprador.add(rbLoginLeiloeiro);
        rbLoginLeiloeiro.setText("Leiloeiro");
        rbLoginLeiloeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLoginLeiloeiroActionPerformed(evt);
            }
        });

        bgLoginLeiloeiroComprador.add(rbLoginComprador);
        rbLoginComprador.setText("Comprador");

        jbLoginEntrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbLoginEntrar.setText("Entrar");
        jbLoginEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbLoginNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfLoginNome, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jbLoginEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(rbLoginLeiloeiro)
                            .addGap(32, 32, 32)
                            .addComponent(rbLoginComprador))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLoginNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLoginNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLoginLeiloeiro)
                    .addComponent(rbLoginComprador))
                .addGap(18, 18, 18)
                .addComponent(jbLoginEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbLoginLeiloeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLoginLeiloeiroActionPerformed
        
    }//GEN-LAST:event_rbLoginLeiloeiroActionPerformed

    private void jbLoginEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginEntrarActionPerformed
        String nome = tfLoginNome.getText();
        boolean comprador = rbLoginComprador.isSelected();
        boolean leiloeiro = rbLoginLeiloeiro.isSelected();
        new Leiloes().setVisible(true);
        this.setVisible(false);
        if(true)
            return;
        
        if (leiloeiro)
            new Leiloes().setVisible(true);
        else if (comprador)
            new Leiloes().setVisible(true);
        else
            JOptionPane.showMessageDialog(null, "Selecione se você é leiloeiro ou comprador", "ErroCaixaNaoSelecionada", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jbLoginEntrarActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgLoginLeiloeiroComprador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbLoginEntrar;
    private javax.swing.JLabel lbLoginNome;
    private javax.swing.JLabel lbLoginTitulo;
    private javax.swing.JRadioButton rbLoginComprador;
    private javax.swing.JRadioButton rbLoginLeiloeiro;
    private javax.swing.JTextField tfLoginNome;
    // End of variables declaration//GEN-END:variables
}
