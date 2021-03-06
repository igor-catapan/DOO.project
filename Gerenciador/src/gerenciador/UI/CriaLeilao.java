/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.UI;

import gerenciador.Exceptions.ValorMenorQueMaiorLance;
import gerenciador.Interfaces.ObjetoVenda;
import gerenciador.LojaDeLeiloes;
import gerenciador.Model.Animais.Boi;
import gerenciador.Model.Comprador;
import gerenciador.Model.Lance;
import gerenciador.Controller.Leilao;
import gerenciador.MyLogger;
import gerenciador.utils.FrameUtils;
import static gerenciador.utils.FrameUtils.setScreenPosition;
import static gerenciador.utils.JOptionsPaneUtil.showErrorMessage;
import gerenciador.utils.TiposUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;


public class CriaLeilao extends javax.swing.JFrame {

  
    private Leiloes leiloes;
    private static final String TAG = "CriaLeilao";

    //Tela de criacao de leilao
    public CriaLeilao(Leiloes leiloes) {
        initComponents();
        this.leiloes = leiloes;
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        FrameUtils.setClosingEvent(TAG, this, leiloes);
        setOnTypeChange();
        setItens(cbCriaLeilaoTipo, TiposUtil.getTipos());
        setScreenPosition(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbCriaLeilaoTipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        spCriaLeilaoIdade = new javax.swing.JSpinner();
        btCriaLeilaoCriar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbCriaLeilaSuboTipo = new javax.swing.JComboBox<>();
        tfCriaLeilaoNome = new javax.swing.JTextField();
        tfCriaLeilaoPreco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Adicionar Leilao");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel2.setText("Nome:");

        jLabel3.setText("Preco:");

        jLabel4.setText("Tipo:");

        cbCriaLeilaoTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Idade:");

        btCriaLeilaoCriar.setText("Criar");
        btCriaLeilaoCriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCriaLeilaoCriarMouseClicked(evt);
            }
        });

        jLabel6.setText("Sub-tipo:");

        cbCriaLeilaSuboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tfCriaLeilaoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCriaLeilaoPrecoActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Descrição");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btCriaLeilaoCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbCriaLeilaoTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbCriaLeilaSuboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(41, 41, 41))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfCriaLeilaoNome)))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spCriaLeilaoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfCriaLeilaoPreco))))
                            .addComponent(jScrollPane1))))
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(tfCriaLeilaoNome)
                    .addComponent(tfCriaLeilaoPreco))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbCriaLeilaoTipo)
                    .addComponent(jLabel5)
                    .addComponent(spCriaLeilaoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbCriaLeilaSuboTipo))
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(19, 19, 19)
                .addComponent(btCriaLeilaoCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    //acao de criar leilao
    private void btCriaLeilaoCriarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCriaLeilaoCriarMouseClicked

        
        
        String preco = tfCriaLeilaoPreco.getText();
        String nome = tfCriaLeilaoNome.getText();
        
        int idade = (int) spCriaLeilaoIdade.getValue();
        String tipo = (String) cbCriaLeilaoTipo.getSelectedItem();
        String subTipo = (String) cbCriaLeilaSuboTipo.getSelectedItem();
        String descricao = jTextArea1.getText();

        
        try {//caso alguma excecao seja lancada nas verificacoes dos campos, uma tela de erro aparecerá
            Leilao leilao = leiloes.adicionaLeilao(preco, nome, idade, tipo, subTipo, descricao);
            MyLogger.info(TAG, "Adicionando leilao: " + leilao.getNome());
            leiloes.atualizaTabela();
            close();

        } catch (Exception e) {
            showErrorMessage(e.getMessage(), "Valores invalidos!");
            
        }


    }//GEN-LAST:event_btCriaLeilaoCriarMouseClicked

    private void tfCriaLeilaoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCriaLeilaoPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCriaLeilaoPrecoActionPerformed

    //seta os tipos/subtipos nos comboBox recebido
    private void setItens(JComboBox<String> jComboBox, List<String> tipos) {
        jComboBox.removeAllItems();
        for (String tipo : tipos) {
            jComboBox.addItem(tipo);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCriaLeilaoCriar;
    private javax.swing.JComboBox<String> cbCriaLeilaSuboTipo;
    private javax.swing.JComboBox<String> cbCriaLeilaoTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JSpinner spCriaLeilaoIdade;
    private javax.swing.JTextField tfCriaLeilaoNome;
    private javax.swing.JTextField tfCriaLeilaoPreco;
    // End of variables declaration//GEN-END:variables

    private void close() {
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }

    
    
    private void setOnTypeChange() {
        cbCriaLeilaoTipo.addActionListener(new ActionListener() {

            //sempre q o tipo for trocado, os subtipos serao atualizados
            public void actionPerformed(ActionEvent e) {
                String selectedType = (String) cbCriaLeilaoTipo.getSelectedItem();
                if (selectedType == null) {
                    return;
                }
                MyLogger.debug(TAG, "tipo selecionado: " + selectedType);
                mudaSubTipos(selectedType);

            }
        });
    }

    private void mudaSubTipos(String selectedType) {
        switch (selectedType) {
            case TiposUtil.ANIMAIS:
                setItens(cbCriaLeilaSuboTipo, TiposUtil.getTiposDeAnimais());
                break;
            case TiposUtil.VEICULOS:
                setItens(cbCriaLeilaSuboTipo, TiposUtil.getTiposDeVeiculos());
                break;
            case TiposUtil.OUTROS:
                setItens(cbCriaLeilaSuboTipo, TiposUtil.getTiposDeOutros());
                break;
            default:
                cbCriaLeilaSuboTipo.removeAllItems();
                break;

        }
    }
}
