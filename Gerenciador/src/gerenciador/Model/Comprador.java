/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.Model;

import gerenciador.Herancas.Pessoa;
import java.io.Serializable;

/**
 *
 * @author PICHAU
 */
public class Comprador extends Pessoa  {

    
    private float dinheiro;
    
    public Comprador(String nome) {
        super(nome);
        this.dinheiro = 666.0f;
        
    }
    
    public Comprador(String nome, float dinheiro) {
        super(nome);
        this.dinheiro = dinheiro;
        
    }

  
    

 
    
}
