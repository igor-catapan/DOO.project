package gerenciador.UI;

import gerenciador.Exceptions.LeilaoNaoEncontrado;
import gerenciador.Exceptions.LeilaoNaoSelecionadoParaVisualizar;
import gerenciador.Exceptions.ValorMenorQueMaiorLance;
import gerenciador.Herancas.Animal;
import gerenciador.Interfaces.ObjetoVenda;
import gerenciador.Model.Lance;
import gerenciador.Model.Leilao;
import gerenciador.Model.Animais.Boi;
import gerenciador.Model.Comprador;
import gerenciador.MyLogger;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Leiloes extends javax.swing.JFrame {

    public Leiloes() {
        initComponents();
    }

    private static final String TAG = "Leiloes";
    public ArrayList<Leilao> leiloes = new ArrayList<>();

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
        tfLeilaoNomeTesteLista = new javax.swing.JTextField();
        tfLeilaoPrecoTesteLista = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbLeilaoLeiloes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Tipo", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
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

        javax.swing.GroupLayout jpLeiloesLayout = new javax.swing.GroupLayout(jpLeiloes);
        jpLeiloes.setLayout(jpLeiloesLayout);
        jpLeiloesLayout.setHorizontalGroup(
            jpLeiloesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLeiloesLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jpLeiloesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpLeiloesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLeiloesLayout.createSequentialGroup()
                        .addComponent(jbLeiloesAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(jbLeiloesDeletar)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLeiloesLayout.createSequentialGroup()
                        .addComponent(tfLeilaoNomeTesteLista, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addGroup(jpLeiloesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLeiloesLayout.createSequentialGroup()
                        .addComponent(jbLeiloesFinalizar)
                        .addGap(18, 18, 18)
                        .addComponent(jbLeiloesDarLance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLeiloesLayout.createSequentialGroup()
                        .addComponent(tfLeilaoPrecoTesteLista, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jpLeiloesLayout.setVerticalGroup(
            jpLeiloesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLeiloesLayout.createSequentialGroup()
                .addGroup(jpLeiloesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLeilaoNomeTesteLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLeilaoPrecoTesteLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jpLeiloesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLeiloesAdicionar)
                    .addComponent(jbLeiloesDeletar)
                    .addComponent(jbLeiloesFinalizar)
                    .addComponent(jbLeiloesDarLance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpLeiloes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpLeiloes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLeiloesAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLeiloesAdicionarMouseClicked
        //TODO NA VERDADE AQUI ABRE OUTRA TELA que a lista com leiloes para adicionar
        
        String nome = tfLeilaoNomeTesteLista.getText();
        double preco = Double.parseDouble(tfLeilaoPrecoTesteLista.getText());

        Boi boi = new Boi();

        boi.setValorInicial(preco);
        boi.setNome(nome);

        Leilao leilao = new Leilao((ObjetoVenda) boi);

        Lance lance = new Lance(new Comprador("robert", 37, 42000), boi.getValor());

        try {
            MyLogger.info(TAG, "Fazendo lance ");
            leilao.proposta(lance);
            leiloes.add(leilao);

            DefaultTableModel modelo = (DefaultTableModel) tbLeilaoLeiloes.getModel();
            modelo.setNumRows(0);

            for (Leilao cont : leiloes) {
                modelo.addRow(new Object[]{
                    cont.getNome(),
                    "TODO",
                    cont.getValorMaisAlto(),});
            }
        } catch (ValorMenorQueMaiorLance ex) {
            MyLogger.debug(TAG, "Valor Invalido: " + ex.getMessage());
        }


    }//GEN-LAST:event_jbLeiloesAdicionarMouseClicked

    private void jbLeiloesFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLeiloesFinalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLeiloesFinalizarActionPerformed

    private void jbLeiloesFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLeiloesFinalizarMouseClicked
        //TODO ADCIONAR BOTAO PARA VISUALIZAR LEILAO
        try{
        Visualizar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "ErroCaixaNaoSelecionada", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbLeiloesFinalizarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbLeiloesAdicionar;
    private javax.swing.JButton jbLeiloesDarLance;
    private javax.swing.JButton jbLeiloesDeletar;
    private javax.swing.JButton jbLeiloesFinalizar;
    private javax.swing.JPanel jpLeiloes;
    private javax.swing.JTable tbLeilaoLeiloes;
    private javax.swing.JTextField tfLeilaoNomeTesteLista;
    private javax.swing.JTextField tfLeilaoPrecoTesteLista;
    // End of variables declaration//GEN-END:variables

    private void Visualizar() throws LeilaoNaoEncontrado, LeilaoNaoSelecionadoParaVisualizar{
        int leilaoIndex = tbLeilaoLeiloes.getSelectedRow();
        validaIndice(leilaoIndex);    
        
        new VisualizaLeilao(leiloes.get(leilaoIndex)).setVisible(true);
    }

    private void validaIndice(int index) throws LeilaoNaoEncontrado, LeilaoNaoSelecionadoParaVisualizar {
        if(index < 0)
            throw new LeilaoNaoSelecionadoParaVisualizar("Por favor selecione um leião");
        
        if(index >= leiloes.size())
            throw new LeilaoNaoEncontrado("Por favor selecione um leilao valido");
        
        
        
    }
}
