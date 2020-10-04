/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.Model;

import gerenciador.Exceptions.ValorMenorQueMaiorLance;
import gerenciador.Interfaces.ObjetoVenda;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author PICHAU
 */
public class Leilao implements Serializable {

    private List<Lance> lances;
    
    private double valorMaisAlto = 0;
    
    private String estado = "Ativo";
    
    private ObjetoVenda objeto;

    public Leilao(ObjetoVenda objeto) {
        lances = new ArrayList<>();
        this.objeto = objeto;
        
    }
    
    public String getNome(){
        return objeto.getNome();
    }
    

     public void proposta(String nome, int idade, double dinheiro, Double valor) throws ValorMenorQueMaiorLance {
        Comprador user = new Comprador(nome, idade, dinheiro);
        Lance lance = new Lance(user, valor);   

        proposta(lance);

    }
    
    
    public void proposta(Comprador user, Double valor) throws ValorMenorQueMaiorLance {
        Lance lance = new Lance(user, valor);
        proposta(lance);

    }

    public void proposta(Lance lance)  throws ValorMenorQueMaiorLance{

        validaLance(lance);
        lances.add(lance);
        Collections.sort(lances);
        valorMaisAlto = lances.get(0).getValor();

    }

    public boolean validaLance(Lance lance) throws ValorMenorQueMaiorLance{
        if (!lances.isEmpty()) {
            if (lance.getValor() < lances.get(0).getValor()) {
                throw new ValorMenorQueMaiorLance("Novo lance tem que ser maior que o valor mais alto!");
            }
        }

        return true;
    }

    public double getValorMaisAlto() {
        return Math.max(valorMaisAlto, objeto.getValor());
    }
    
     public List<Lance> getTresMaioresLances(){
         
         int lastIndex = Math.min(this.lances.size(), 3);
         
        return lances.subList(0, lastIndex);
        
    }

    public int getIdade() {
        return objeto.getIdade();
    }

    public Object getTipo() {
        return objeto.getTipo();
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getEstado() {
        return estado;
    }
     
    

}
