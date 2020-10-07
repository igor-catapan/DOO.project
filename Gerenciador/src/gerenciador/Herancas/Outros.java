
package gerenciador.Herancas;

import gerenciador.utils.TiposUtil;
import java.io.Serializable;


public abstract class Outros implements Serializable {
    
  
    protected String nome;
    protected String tipo = TiposUtil.OUTROS;
    protected double valor;
    protected String descricao;
    protected int idade;
    
}
