/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.Model;

/**
 *
 * @author PICHAU
 */
public class Lance implements Comparable<Lance>{
    
    private Comprador user;
    private Double valor;
    
    public Lance(Comprador user, Double valor){
        this.user = user;
        this.valor = valor;
    }

    public Comprador getUser() {
        return user;
    }

    public void setUser(Comprador user) {
        this.user = user;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

     @Override
    public int compareTo(Lance o) {
       return Double.compare(this.valor, o.getValor());
    }
    
          
            
}
