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
    
    private Usuario user;
    private Double valor;
    
    public Lance(Usuario user, Double valor){
        this.user = user;
        this.valor = valor;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
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
