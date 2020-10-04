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
    
    private String nome;


    public Pessoa(String nome) {
        this.nome = nome;
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
    
}
