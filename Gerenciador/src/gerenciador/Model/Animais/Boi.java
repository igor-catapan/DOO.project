/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.Model.Animais;

import gerenciador.Herancas.Animal;
import gerenciador.Interfaces.ObjetoVenda;
import gerenciador.utils.TiposUtil;
import java.io.Serializable;

/**
 *
 * @author PICHAU
 */
public class Boi extends Animal implements ObjetoVenda {

    
    
    
    
    public static Boi criaBoi(double preco, String nome, int idade, String descricao){
        Boi boi = new Boi();
        boi.valor = preco;
        boi.nome = nome;
        boi.idade = idade;
        boi.descricao = descricao;
        
        return boi;
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
    
    public void setValorInicial(double valor){
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getSubTIpo() {
        return TiposUtil.BOI;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

}
