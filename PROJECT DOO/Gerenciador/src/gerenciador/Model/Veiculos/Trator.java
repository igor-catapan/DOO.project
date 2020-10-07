/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.Model.Veiculos;

import gerenciador.Herancas.Veiculo;
import gerenciador.Interfaces.ObjetoVenda;
import gerenciador.utils.TiposUtil;
import java.io.Serializable;

/**
 *
 * @author Igor
 */
public class Trator extends Veiculo implements ObjetoVenda  {

  

    public static Trator criaTrator(double preco, String nome, int idade, String descricao) {
        Trator trator = new Trator();
        trator.valor = preco;
        trator.nome = nome;
        trator.idade = idade;
        trator.descricao = descricao;
        
        return trator;
    }
    double valor;

        
    
   
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public Double getValor() {
        return valor;
    }

    @Override
    public int getIdade() {
       return idade;
    }
    
    @Override
    public String getSubTIpo() {
        return TiposUtil.TRATOR;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
