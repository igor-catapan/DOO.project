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
 * @author PICHAU
 */
public class Carro extends Veiculo implements ObjetoVenda  {

  

    public static Carro criaCarro(double preco, String nome, int idade, String Veicolos) {
        Carro carro = new Carro();
        carro.valor = preco;
        carro.nome = nome;
        carro.idade = idade;
        carro.descricao = Veicolos;
        
        return carro;
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
        return TiposUtil.CARRO;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
