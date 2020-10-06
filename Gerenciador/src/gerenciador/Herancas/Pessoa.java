/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.Herancas;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author PICHAU
 */
abstract public class Pessoa implements Serializable{
    
    protected String nome;


    public Pessoa(String nome) {
        this.nome = nome;
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   

//    @Override
//    public boolean equals(Object obj) {
//      
//        if (obj == null) {
//            return false;
//        }
//        
//        final Pessoa other = (Pessoa) obj;
//        if (this.nome == other.nome) {
//            return true;
//        }
//        
//        return false;
//    }
    
    
    
}
