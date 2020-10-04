package gerenciador.UI;

import gerenciador.Exceptions.IdadeInvalida;
import gerenciador.Exceptions.LeilaoNaoEncontrado;
import gerenciador.Exceptions.LeilaoNaoSelecionadoParaVisualizar;
import gerenciador.Exceptions.NomeInvalido;
import gerenciador.Exceptions.PrecoInvalido;
import gerenciador.Exceptions.PrecoNaoENumero;
import gerenciador.Exceptions.ValorMenorQueMaiorLance;
import gerenciador.Herancas.Animal;
import gerenciador.Interfaces.ObjetoVenda;
import gerenciador.LojaDeLeiloes;
import gerenciador.Model.Lance;
import gerenciador.Model.Leilao;
import gerenciador.Model.Animais.Boi;
import gerenciador.Model.Comprador;
import gerenciador.MyLogger;
import static gerenciador.utils.JOptionsPaneUtil.showErrorMessage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Leiloes extends javax.swing.JFrame {

    public Leiloes() {
        initComponents();
        salva();
    }

    private static final String TAG = "Leiloes";

    public LojaDeLeiloes leiloes = new LojaDeLeiloes();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLeiloes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbLeilaoLeiloes = new javax.swing.JTable();
        jbLeiloesAdicionar = new javax.swing.JButton();
        jbLeiloesDeletar = new javax.swing.JButton();
        jbLeiloesFinalizar = new javax.swing.JButton();
        jbLeiloesDarLance = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbLeilaoLeiloes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tipo", "Preco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbLeilaoLeiloes);

        jbLeiloesAdicionar.setText("Adicionar");
        jbLeiloesAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbLeiloesAdicionarMouseClicked(evt);
            }
        });

        jbLeiloesDeletar.setText("Deletar");

        jbLeiloesFinalizar.setText("Finalizar");
        jbLeiloesFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbLeiloesFinalizarMouseClicked(evt);
            }
        });
        jbLeiloesFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLeiloesFinalizarActionPerformed(evt);
            }
        });

        jbLeiloesDarLance.setText("Dar Lance");
        jbLeiloesDarLance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbLeiloesDarLanceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpLeiloesLayout = new javax.swing.GroupLayout(jpLeiloes);
        jpLeiloes.setLayout(jpLeiloesLayout);
        jpLeiloesLayout.setHorizontalGroup(
            jpLeiloesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeiloesLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLeiloesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jbLeiloesAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(jbLeiloesDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(jbLeiloesFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(jbLeiloesDarLance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        jpLeiloesLayout.setVerticalGroup(
            jpLeiloesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLeiloesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpLeiloesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLeiloesAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbLeiloesDeletar)
                    .addComponent(jbLeiloesFinalizar)
                    .addComponent(jbLeiloesDarLance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Leilões Disponíveis");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpLeiloes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpLeiloes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLeiloesAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLeiloesAdicionarMouseClicked

        new CriaLeilao(this).setVisible(true);//    
        setVisible(false);
        return;

//      

    }//GEN-LAST:event_jbLeiloesAdicionarMouseClicked

    private void jbLeiloesFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLeiloesFinalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLeiloesFinalizarActionPerformed

    private void jbLeiloesFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLeiloesFinalizarMouseClicked

        try {
            finalizaLeilao();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ErroCaixaNaoSelecionada", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jbLeiloesFinalizarMouseClicked

    private void jbLeiloesDarLanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLeiloesDarLanceMouseClicked

        try {
            Visualizar();
        } catch (Exception e) {
            showErrorMessage(e.getMessage(), "Campos invalidos!");
        }
    }//GEN-LAST:event_jbLeiloesDarLanceMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbLeiloesAdicionar;
    private javax.swing.JButton jbLeiloesDarLance;
    private javax.swing.JButton jbLeiloesDeletar;
    private javax.swing.JButton jbLeiloesFinalizar;
    private javax.swing.JPanel jpLeiloes;
    private javax.swing.JTable tbLeilaoLeiloes;
    // End of variables declaration//GEN-END:variables

    private void Visualizar() throws LeilaoNaoEncontrado, LeilaoNaoSelecionadoParaVisualizar {
        int leilaoIndex = tbLeilaoLeiloes.getSelectedRow();
        Leilao leilao = leiloes.getLeilao(leilaoIndex);
        new VisualizaLeilao(leilao).setVisible(true);
    }

    private void finalizaLeilao() {
        int leilaoIndex = tbLeilaoLeiloes.getSelectedRow();
        leiloes.finalizaLeilao(leilaoIndex);

        DefaultTableModel modelo = (DefaultTableModel) tbLeilaoLeiloes.getModel();
        modelo.removeRow(leilaoIndex);
    }

    public void atualizaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) tbLeilaoLeiloes.getModel();
        modelo.setNumRows(0);
        for (Leilao cont : leiloes.getLeiloes()) {
            modelo.addRow(new Object[]{
                cont.getNome(),
                cont.getTipo(),
                cont.getValorMaisAlto(),
                cont.getIdade()});
        }
    }

    void adicionaLeilao(Leilao leilao) {
        leiloes.adicionaLeilao(leilao);
        atualizaTabela();
    }

    public Leilao adicionaLeilao(String precoStr, String nome, int idade, String tipo, String subTipo, String descricao) throws PrecoInvalido, NomeInvalido, IdadeInvalida, PrecoNaoENumero {
        return leiloes.adicionaLeilao(precoStr, nome, idade, tipo, subTipo, descricao);
    }

    public void salva() {
        URL filePath = Class.class.getClassLoader().getResource("teste");

        System.out.println(filePath.getPath());

    }

}
