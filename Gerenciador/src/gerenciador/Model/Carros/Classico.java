/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.Model.Carros;

import gerenciador.Herancas.Veiculo;
import gerenciador.Interfaces.ObjetoVenda;

/**
 *
 * @author PICHAU
 */
public class Classico extends Veiculo implements ObjetoVenda {

  

    public static Classico criaClassico(double preco, String nome, int idade, String descricao) {
        Classico classico = new Classico();
        classico.valor = preco;
        classico.nome = nome;
        classico.idade = idade;
        classico.descricao = descricao;
        
        return classico;
    }

        
    private String subtipo = "Classico";
   
    
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
        return subtipo;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
