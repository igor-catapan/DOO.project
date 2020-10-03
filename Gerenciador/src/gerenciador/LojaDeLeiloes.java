/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador;

import gerenciador.Exceptions.LeilaoNaoEncontrado;
import gerenciador.Exceptions.LeilaoNaoSelecionadoParaVisualizar;
import gerenciador.Model.Leilao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PICHAU
 */
public class LojaDeLeiloes {
    
    
    private ArrayList<Leilao> leiloes = new ArrayList<>();
    private ArrayList<Leilao> finalizados = new ArrayList<>();
    
    
    public void adicionaLeilao(Leilao leilao){
        leiloes.add(leilao);
    }
    
    public void removeLeilao(int indice){
        validaIndice(indice);
        
        finalizados.add(leiloes.remove(indice));
        
        
    }
    
    private void validaIndice(int index) throws LeilaoNaoEncontrado, LeilaoNaoSelecionadoParaVisualizar {
        if(index < 0)
            throw new LeilaoNaoSelecionadoParaVisualizar("Por favor selecione um leião");
        
        if(index >= leiloes.size())
            throw new LeilaoNaoEncontrado("Por favor selecione um leilao valido");       
        
        
    }

    public List<Leilao> getLeiloes() {
        return leiloes;
    }

    public Leilao getLeilao(int leilaoIndex) {
        validaIndice(leilaoIndex);
        
        return leiloes.get(leilaoIndex);
    }
    
    
    
}
