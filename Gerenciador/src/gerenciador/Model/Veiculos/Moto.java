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
public class Moto extends Veiculo implements ObjetoVenda  {

  

    public static Moto criaMoto(double preco, String nome, int idade, String descricao) {
        Moto moto = new Moto();
        moto.valor = preco;
        moto.nome = nome;
        moto.idade = idade;
        moto.descricao = descricao;
        
        return moto;
    }

        
    
   
    
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
        return TiposUtil.MOTO;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
