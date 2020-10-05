/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.Model;

import gerenciador.Exceptions.SemDinheiroParaLance;
import gerenciador.Herancas.Pessoa;
import static gerenciador.utils.JOptionsPaneUtil.showSuccessMessage;
import java.io.Serializable;

/**
 *
 * @author PICHAU
 */
public class Comprador extends Pessoa  {

    
    private double dinheiro;
    
   
    
    public Comprador(String nome, double dinheiro) {
        super(nome);
        this.dinheiro = dinheiro;
        
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void podeDarLance(double valor) throws SemDinheiroParaLance{
        if(valor > dinheiro)
            throw new SemDinheiroParaLance("VOce nao tem dinheiro suficiente para fazer um lance");
        
        valor = valor - dinheiro;
        
        showSuccessMessage("Lance feito com sucesso, saldo novo: " + valor, "Sucesso");
        
    }

  
    

 
    
}
