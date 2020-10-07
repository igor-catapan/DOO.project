/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador;

import gerenciador.Exceptions.LeilaoInvalidoParaFinalizar;
import gerenciador.Exceptions.LeilaoInvalidoParaDeletar;
import gerenciador.Exceptions.IdadeInvalida;
import gerenciador.Exceptions.PrecoNaoNumerico;
import gerenciador.Exceptions.PrecoInvalido;
import gerenciador.Exceptions.NomeInvalido;
import gerenciador.Exceptions.LeilaoNaoEncontrado;
import gerenciador.Exceptions.LeilaoNaoSelecionadoParaVisualizar;
import gerenciador.Interfaces.ObjetoVenda;
import gerenciador.Model.Animais.Boi;
import gerenciador.Model.Veiculos.Carro;
import gerenciador.Controller.Leilao;
import static gerenciador.utils.TiposUtil.criaObjeto;
import java.beans.PropertyChangeEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//principal controlador se comunica com a tela de leiloes
public class LojaDeLeiloes implements Serializable {

    
    private ArrayList<Leilao> leiloes = new ArrayList<>();
    

    public void adicionaLeilao(Leilao leilao) {
        leiloes.add(leilao);

    }

    //
    public void finalizaLeilao(int indice) throws LeilaoInvalidoParaFinalizar {
        validaIndice(indice);

        Leilao leilao = leiloes.get(indice);
        if(leilao.getQuantidadeDeLances() == 0)
            throw new LeilaoInvalidoParaFinalizar("Nao pode finalizar leilao sem lance, delete ou espere!");
        
        leilao.setEstado(Leilao.FINALIZADO);
       

    }

    //remove somente caso esteja finalizado ou sem lances
    public void removeLeilao(int indice) throws LeilaoInvalidoParaDeletar {
        
        validaIndice(indice);
        Leilao leilao = leiloes.get(indice);
        
        if(leilao.getEstado().equals(Leilao.ATIVO) && leilao.getQuantidadeDeLances() != 0)
            throw new LeilaoInvalidoParaDeletar("Nao pode deletar Leilao ativo e com lances");
        
        leiloes.remove(indice);

    }

    //valida o leilao selecionado
    private void validaIndice(int index) throws LeilaoNaoEncontrado, LeilaoNaoSelecionadoParaVisualizar {
        if (index < 0) {
            throw new LeilaoNaoSelecionadoParaVisualizar("Por favor selecione um leião");
        }

        if (index >= leiloes.size()) {
            throw new LeilaoNaoEncontrado("Por favor selecione um leilao valido");
        }

    }

    public List<Leilao> getLeiloes() {
        return leiloes;
    }

    public Leilao getLeilao(int leilaoIndex) {
        validaIndice(leilaoIndex);

        return leiloes.get(leilaoIndex);
    }

    
    //adiciona leilao e cria objeto de venda de acordo com as propriedades
    public Leilao adicionaLeilao(String precoStr, String nome, int idade, String tipo, String subTipo, String descricao) throws PrecoInvalido, NomeInvalido, IdadeInvalida, PrecoNaoNumerico {
        validaCampos(precoStr, nome, idade);

        ObjetoVenda obj = criaObjeto(Double.parseDouble(precoStr), nome, idade, subTipo, descricao);

        Leilao leilao = new Leilao(obj);
        adicionaLeilao(leilao);
        
        return leilao;

    }

    //valida as informacoes passadas para o usuarios
    private void validaCampos(String precoStr, String nome, int idade) throws PrecoInvalido, NomeInvalido, IdadeInvalida, PrecoNaoNumerico {
        if (precoStr.isBlank()) {
            throw new PrecoInvalido("Por favor preencha o preco");
        }
        if (nome.isBlank()) {
            throw new NomeInvalido("Por favor preencha o nome");
        }
        
        if (idade < 0) {
            throw new IdadeInvalida("Por favor coloque uma idade valida (idade >= 0)");
        }

        try {
            Double.parseDouble(precoStr);
        } catch (NumberFormatException ex) {
            throw new PrecoNaoNumerico("Por favor coloque um numero no preco");
        }

    }

   

}
