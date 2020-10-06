/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.UI;

import gerenciador.Exceptions.LeilaoFinalizado;
import gerenciador.Exceptions.UsuarioInvalido;
import gerenciador.Exceptions.SemDinheiroParaLance;
import gerenciador.Exceptions.ValorNaoNumerico;
import gerenciador.Exceptions.ValorInvalido;
import gerenciador.Exceptions.ValorMenorQueMaiorLance;
import gerenciador.Herancas.Pessoa;
import gerenciador.Model.Comprador;
import gerenciador.Model.Lance;
import gerenciador.Controller.Leilao;
import gerenciador.Model.Leiloeiro;
import gerenciador.MyLogger;
import gerenciador.utils.FrameUtils;
import static gerenciador.utils.FrameUtils.setScreenPosition;
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

        taVisualizaLeilaoDescricao.setLineWrap(true);
        taVisualizaLeilaoDescricao.setWrapStyleWord(true);
        taVisualizaLeilaoDescricao.setEditable(false);
        setScreenPosition(this);

        preencherCampos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlVizualizaLeilaoNome = new javax.swing.JLabel();
        lbVisualizaLeilaoNome = new javax.swing.JLabel();
        jlVisualizaLeilao = new javax.swing.JLabel();
        lbVisualizaLeilaoTipo = new javax.swing.JLabel();
        asdasd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVisualizaLeilaoLances = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbVisualizaLeilaoSubtipo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taVisualizaLeilaoDescricao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbVisualizaLeilaoIdade = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbVisualizaLeilaoEstado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbVisualizaLeilaoValorInicial = new javax.swing.JLabel();
        btVisualizaLeilaoDarLance = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlVizualizaLeilaoNome.setText("Nome do item: ");

        lbVisualizaLeilaoNome.setText("Crf 230");

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

        lbVisualizaLeilaoSubtipo.setText("Moto");

        taVisualizaLeilaoDescricao.setColumns(20);
        taVisualizaLeilaoDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        taVisualizaLeilaoDescricao.setRows(5);
        taVisualizaLeilaoDescricao.setText("Moto de trilha, semi-nova. Conservada, correia e \namortecedor novos");
        jScrollPane2.setViewportView(taVisualizaLeilaoDescricao);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LEILAO");

        jLabel5.setText("Idade:");

        lbVisualizaLeilaoIdade.setText("1.2 anos");

        jLabel3.setText("Estado:");

        lbVisualizaLeilaoEstado.setText("Finalizado");

        jLabel6.setText("Valor Inicial:");

        lbVisualizaLeilaoValorInicial.setText("R$ 1600");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlVisualizaLeilao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbVisualizaLeilaoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(asdasd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbVisualizaLeilaoValorInicial))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlVizualizaLeilaoNome)
                                .addGap(11, 11, 11)
                                .addComponent(lbVisualizaLeilaoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbVisualizaLeilaoSubtipo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbVisualizaLeilaoIdade)
                                            .addComponent(lbVisualizaLeilaoEstado))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlVizualizaLeilaoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVisualizaLeilaoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lbVisualizaLeilaoEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlVisualizaLeilao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVisualizaLeilaoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVisualizaLeilaoSubtipo)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbVisualizaLeilaoIdade)
                    .addComponent(jLabel6)
                    .addComponent(lbVisualizaLeilaoValorInicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(asdasd)
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
                .addContainerGap(25, Short.MAX_VALUE))
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
            showErrorMessage(e.getMessage(), "Erro ao Dar Lance!");
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

    private void darLance() throws ValorInvalido, ValorNaoNumerico, ValorMenorQueMaiorLance, SemDinheiroParaLance, UsuarioInvalido, LeilaoFinalizado {

        if (user instanceof Leiloeiro) {
            throw new UsuarioInvalido("Leloeiro nao pode dar lance");
        }else if(leilao.getEstado().equals(Leilao.FINALIZADO))
            throw new LeilaoFinalizado("Leilao finalizado, nao pode fazer mais lances!");

       
        String valorStr = JOptionPane.showInputDialog(null, "Digite Seu lance");
        if (valorStr == null) {
            return;
        }
        double valor = validaLance(valorStr);

        leilao.proposta((Comprador) user, valor);
        atualizaTabela();
    }

    private double validaLance(String valor) throws ValorInvalido, ValorNaoNumerico {
        if (valor.isBlank()) {
            throw new ValorInvalido("Por favor digite algo");
        }

        try {
            double valorNum = Double.parseDouble(valor);
            return valorNum;

        } catch (NumberFormatException e) {
            throw new ValorNaoNumerico("Por favor digite um numero valido");
        }

    }

    private void preencherCampos() {

        lbVisualizaLeilaoIdade.setText(String.valueOf(leilao.getIdade()) + " anos.");
        lbVisualizaLeilaoSubtipo.setText(leilao.getSubtipo());
        lbVisualizaLeilaoTipo.setText(leilao.getTipo());
        lbVisualizaLeilaoNome.setText(leilao.getNome());
        taVisualizaLeilaoDescricao.setText(leilao.getDescricao());
        lbVisualizaLeilaoEstado.setText(leilao.getEstado());
        lbVisualizaLeilaoValorInicial.setText(String.valueOf(leilao.getValorInicial()));

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
    private javax.swing.JLabel jlVisualizaLeilao;
    private javax.swing.JLabel jlVizualizaLeilaoNome;
    private javax.swing.JLabel lbVisualizaLeilaoEstado;
    private javax.swing.JLabel lbVisualizaLeilaoIdade;
    private javax.swing.JLabel lbVisualizaLeilaoNome;
    private javax.swing.JLabel lbVisualizaLeilaoSubtipo;
    private javax.swing.JLabel lbVisualizaLeilaoTipo;
    private javax.swing.JLabel lbVisualizaLeilaoValorInicial;
    private javax.swing.JTextArea taVisualizaLeilaoDescricao;
    private javax.swing.JTable tbVisualizaLeilaoLances;
    // End of variables declaration//GEN-END:variables

}
