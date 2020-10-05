package gerenciador.UI;

import gerenciador.Exceptions.DinheiroNaoPreenchido;
import gerenciador.Exceptions.NomeInvalido;
import gerenciador.Exceptions.ValorInvalido;
import gerenciador.Herancas.Pessoa;
import gerenciador.Model.Comprador;
import gerenciador.Model.Leiloeiro;
import gerenciador.MyLogger;
import static gerenciador.utils.FrameUtils.setScreenPosition;
import static gerenciador.utils.JOptionsPaneUtil.showErrorMessage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setScreenPosition(this);

        setSelectionListener();

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
        lbLoginDinheiro = new javax.swing.JLabel();
        tfLoginDinheiro = new javax.swing.JTextField();

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

        lbLoginDinheiro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbLoginDinheiro.setText("Dinheiro:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbLoginDinheiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfLoginDinheiro)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbLoginNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfLoginNome)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbLoginEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rbLoginLeiloeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(32, 32, 32)
                                        .addComponent(rbLoginComprador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(10, 10, 10)))))
                        .addGap(16, 16, 16))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLoginNome)
                    .addComponent(lbLoginNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLoginLeiloeiro)
                    .addComponent(rbLoginComprador))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLoginDinheiro)
                    .addComponent(tfLoginDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jbLoginEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbLoginLeiloeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLoginLeiloeiroActionPerformed

    }//GEN-LAST:event_rbLoginLeiloeiroActionPerformed

    private void jbLoginEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginEntrarActionPerformed
        String nome = tfLoginNome.getText();
        boolean comprador = rbLoginComprador.isSelected();
        boolean leiloeiro = rbLoginLeiloeiro.isSelected();
        String dinheiro = tfLoginDinheiro.getText();

        if (leiloeiro) {
            iniciarLeiloeiro(nome);
        } else if (comprador) {
            iniciarComprador(nome, dinheiro);
            
        } else         
            showErrorMessage("Selecione se você é leiloeiro ou comprador", "Faca uma selecao!");
        


    }//GEN-LAST:event_jbLoginEntrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgLoginLeiloeiroComprador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbLoginEntrar;
    private javax.swing.JLabel lbLoginDinheiro;
    private javax.swing.JLabel lbLoginNome;
    private javax.swing.JLabel lbLoginTitulo;
    private javax.swing.JRadioButton rbLoginComprador;
    private javax.swing.JRadioButton rbLoginLeiloeiro;
    private javax.swing.JTextField tfLoginDinheiro;
    private javax.swing.JTextField tfLoginNome;
    // End of variables declaration//GEN-END:variables

    private double validaCampos(String nome, String dinheiro) throws ValorInvalido, DinheiroNaoPreenchido, NomeInvalido {
        if (nome.isBlank()) {
            throw new NomeInvalido("Por favor insira um nome");
        }

        if (dinheiro.isBlank()) {
            throw new DinheiroNaoPreenchido("Por favor insira seu dinheiro");
        }

        double valor;
        try {
            valor = Double.parseDouble(dinheiro);
            if (valor < 0) {
                throw new NumberFormatException();
            }

        } catch (NumberFormatException e) {
            throw new ValorInvalido("Por favor insira um valor valido");

        }
        return valor;
    }

     private void validaCampos(String nome) throws NomeInvalido {
        if (nome.isBlank()) {
            throw new NomeInvalido("Por favor insira um nome");
        }
        
    }
    
    private void setSelectionListener() {
        setDinheiroVisibilidade(false);
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setDinheiroVisibilidade(rbLoginComprador.isSelected());
            }

        };

        rbLoginComprador.addActionListener(listener);
        rbLoginLeiloeiro.addActionListener(listener);

    }

    private void setDinheiroVisibilidade(boolean selected) {
        
        lbLoginDinheiro.setVisible(selected);
        tfLoginDinheiro.setVisible(selected);
    }

    private void iniciarLeiloeiro(String nome) {
         try {
                validaCampos(nome);
            } catch (Exception e) {
                showErrorMessage(e.getMessage(), "Preencha Corretamente!");
                return;
            }
            new Leiloes((Pessoa) new Leiloeiro(nome)).setVisible(true);
            this.setVisible(false);
    }

    private void iniciarComprador(String nome, String dinheiro) {
        double valor = 0;
            try {
                valor = validaCampos(nome, dinheiro);
            } catch (Exception e) {
                showErrorMessage(e.getMessage(), "Preencha Corretamente!");
                return;
            }

            new Leiloes((Pessoa) new Comprador(nome, valor)).setVisible(true);
            this.setVisible(false);
    }

  
}
