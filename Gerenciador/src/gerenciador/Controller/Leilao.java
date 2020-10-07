/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.Controller;

import gerenciador.Exceptions.SemDinheiroParaLance;
import gerenciador.Exceptions.UsuarioInvalido;
import gerenciador.Exceptions.ValorMenorQueMaiorLance;
import gerenciador.Interfaces.ObjetoVenda;
import gerenciador.Model.Comprador;
import gerenciador.Model.Lance;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author PICHAU
 */

//classe que controla o leilao
public class Leilao implements Serializable {

    //estados do leilao, pois novos lances só podem ser feitos caso esteja ativo
    public static final String ATIVO = "Ativo";
    public static final String FINALIZADO = "Finalizado";

    private List<Lance> lances;

    private double valorMaisAlto = 0;

    private String estado = ATIVO;

    private ObjetoVenda objeto;

    private double valorInicial;

    public Leilao(ObjetoVenda objeto) {
        lances = new ArrayList<>();
        this.objeto = objeto;
        valorInicial = objeto.getValor();

    }

    public String getNome() {
        return objeto.getNome();
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void proposta(Comprador user, Double valor) throws ValorMenorQueMaiorLance, SemDinheiroParaLance, UsuarioInvalido {
        Lance lance = new Lance(user, valor);
        proposta(lance);

    }

    public void proposta(Lance lance) throws ValorMenorQueMaiorLance, SemDinheiroParaLance, UsuarioInvalido {

        
        validaLance(lance);
        lances.add(lance);
        Collections.sort(lances);
        valorMaisAlto = lances.get(0).getValor();
        
        retornaDinheiroAntigoComprador();

    }

    //Verifica se é um lance valido seguindo os seguintes criterios:
    //  fez o ultimo lance
    //  lance menor que o ultimo ou que o valor inicial
    public boolean validaLance(Lance lance) throws ValorMenorQueMaiorLance, SemDinheiroParaLance, UsuarioInvalido {

        
        if (!lances.isEmpty()) {
            if(lance.getUser().equals(lances.get(0).getUser()))
                throw new UsuarioInvalido("Comprador " + lance.getUser().getNome() + " deve esperar outra pessoa fazer um lance!");
            if (lance.getValor() <= lances.get(0).getValor()) {
                throw new ValorMenorQueMaiorLance("Novo lance tem que ser maior que o valor mais alto!");
            }
        }else if (lance.getValor() <= getValorInicial()) {
                throw new ValorMenorQueMaiorLance("Novo lance tem que ser maior que o valor inicial!");
           }
            
        lance.getUser().podeDarLance(lance.getValor());
        return true;
    }

    public double getValorMaisAlto() {
        return Math.max(valorMaisAlto, objeto.getValor());
    }

    public List<Lance> getTresMaioresLances() {

        int lastIndex = Math.min(this.lances.size(), 3);

        return lances.subList(0, lastIndex);

    }

    public int getIdade() {
        return objeto.getIdade();
    }

    public String getTipo() {
        return objeto.getTipo();
    }

    public String getSubtipo() {
        return objeto.getSubTIpo();
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public String getDescricao() {
        return objeto.getDescricao();
    }

    public int getQuantidadeDeLances() {
        return lances.size();
    }

    //devolve o dinheiro do ulitmo comprador caso alguem faça lance maior
    private void retornaDinheiroAntigoComprador() {
        if(lances.size() < 2)
            return;
        
        lances.get(1).estornar();
                    
    }

}
