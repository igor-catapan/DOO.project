
package gerenciador.Herancas;

import java.io.Serializable;


public abstract class Animal implements Serializable {
    
  
    protected String nome;
    protected String tipo = "Animal";
    protected double valor;
    protected String descricao;
    protected int idade;
    
}
