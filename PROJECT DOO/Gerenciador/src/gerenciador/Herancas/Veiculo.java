/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.Herancas;

import gerenciador.utils.TiposUtil;
import java.io.Serializable;

/**
 *
 * @author PICHAU
 */
public abstract class Veiculo implements Serializable{
    
    protected String nome;
    protected String tipo = TiposUtil.VEICULOS;
    protected double valor;
    protected String descricao;
    protected int idade;
    
    
    
}
