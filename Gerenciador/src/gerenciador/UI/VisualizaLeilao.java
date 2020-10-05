/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.UI;

import gerenciador.Exceptions.SemDinheiroParaLance;
import gerenciador.Exceptions.ValorNaoNumerico;
import gerenciador.Exceptions.ValorInvalido;
import gerenciador.Exceptions.ValorMenorQueMaiorLance;
import gerenciador.Herancas.Pessoa;
import gerenciador.Model.Comprador;
import gerenciador.Model.Lance;
import gerenciador.Model.Leilao;
import gerenciador.Model.Leiloeiro;
import gerenciador.MyLogger;
import gerenciador.utils.FrameUtils;
import static gerenciador.utils.JOptionsPaneUtil.showErrorMessage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author igor-
 */
public class VisualizaLeilao extends javax.swing.JFrame {

    /**
     * Creates new form VisualizaLeilao
     */
    private final String TAG = "VisualizaLeilao";
    private Leilao leilao;
    private Pessoa user;

    public VisualizaLeilao(Leilao leilao, Leiloes leiloes, Pessoa user) {
        initComponents();
        this.leilao = leilao;
        this.user = user;
        
        MyLogger.debug(TAG, leilao.getNome());
        atualizaTabela();

        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        FrameUtils.setClosingEvent(TAG, this, leiloes);
        
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlVizualizaLeilaoNome = new javax.swing.JLabel();
        lbVizualizaLeilaoNome = new javax.swing.JLabel();
        jlVisualizaLeilao = new javax.swing.JLabel();
        lbVisualizaLeilaoTipo = new javax.swing.JLabel();
        asdasd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVisualizaLeilaoLances = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btVisualizaLeilaoDarLance = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlVizualizaLeilaoNome.setText("Nome do item: ");

        lbVizualizaLeilaoNome.setText("Crf 230");

        jlVisualizaLeilao.setText("Tipo:");

        lbVisualizaLeilaoTipo.setText("Veiculo");

        asdasd.setText("Descrição:");

        tbVisualizaLeilaoLances.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Comprador", "Lance"
            }
        ));
        jScrollPane1.setViewportView(tbVisualizaLeilaoLances);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lances");

        jLabel2.setText("Subtipo:");

        jLabel3.setText("Moto");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Moto de trilha, semi-nova. Conservada, correia e \namortecedor novos");
        jScrollPane2.setViewportView(jTextArea1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LEILAO");

        jLabel5.setText("Idade:");

        jLabel6.setText("1.2 anos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlVizualizaLeilaoNome)
                        .addGap(11, 11, 11)
                        .addComponent(lbVizualizaLeilaoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlVisualizaLeilao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(lbVisualizaLeilaoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(asdasd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(148, 148, 148))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlVizualizaLeilaoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVizualizaLeilaoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlVisualizaLeilao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVisualizaLeilaoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(asdasd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btVisualizaLeilaoDarLance.setText("Dar Lance");
        btVisualizaLeilaoDarLance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVisualizaLeilaoDarLanceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btVisualizaLeilaoDarLance, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVisualizaLeilaoDarLance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVisualizaLeilaoDarLanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVisualizaLeilaoDarLanceMouseClicked
        try {
            darLance();

        } catch (Exception e) {
           showErrorMessage(e.getMessage(), "Erro Lance!");
        }
    }//GEN-LAST:event_btVisualizaLeilaoDarLanceMouseClicked

    public void atualizaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) tbVisualizaLeilaoLances.getModel();
        modelo.setNumRows(0);
        for (Lance cont : leilao.getTresMaioresLances()) {
            modelo.addRow(new Object[]{
                cont.getUser().getNome(),
                cont.getValor()
            });
        }
    }

    private void darLance() throws ValorInvalido, ValorNaoNumerico, ValorMenorQueMaiorLance, SemDinheiroParaLance {
        
        if(user instanceof Leiloeiro){
            showErrorMessage("Leloeiro nao pode dar lance", "Problema ao dar lance");
            return;
        }
            
        
        MyLogger.debug(TAG, "teste");
        String valorStr = JOptionPane.showInputDialog(null, "Digite Seu lance");
        double valor = validaLance(valorStr);        
        
        
        leilao.proposta((Comprador)user, valor);
        atualizaTabela();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asdasd;
    private javax.swing.JButton btVisualizaLeilaoDarLance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlVisualizaLeilao;
    private javax.swing.JLabel jlVizualizaLeilaoNome;
    private javax.swing.JLabel lbVisualizaLeilaoTipo;
    private javax.swing.JLabel lbVizualizaLeilaoNome;
    private javax.swing.JTable tbVisualizaLeilaoLances;
    // End of variables declaration//GEN-END:variables

    private double validaLance(String valor) throws ValorInvalido, ValorNaoNumerico {
     if(valor.isBlank())
            throw new ValorInvalido("Por favor digite algo");
        
        try{
            double valorNum = Double.parseDouble(valor);
            return valorNum;
                    
        }catch(NumberFormatException e){
            throw new ValorNaoNumerico("Por favor digite um numero valido");
        }
    
    }

    
}