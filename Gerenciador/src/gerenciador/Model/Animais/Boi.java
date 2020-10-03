/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.Model.Animais;

import gerenciador.Herancas.Animal;
import gerenciador.Interfaces.ObjetoVenda;

/**
 *
 * @author PICHAU
 */
public class Boi extends Animal implements ObjetoVenda {

    
    private double valor;
    
    
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return "eae";
    }

 
    @Override
    public Double getValor() {
        return valor;
    }

    @Override
    public int getIdade() {
        return 6;
    }
    
    public void setValorInicial(double valor){
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
