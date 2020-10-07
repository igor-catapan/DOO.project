
package gerenciador.Herancas;

import gerenciador.utils.TiposUtil;
import java.io.Serializable;


public abstract class Animal implements Serializable {
    
  
    protected String nome;
    protected String tipo = TiposUtil.ANIMAIS;
    protected double valor;
    protected String descricao;
    protected int idade;
    
}
