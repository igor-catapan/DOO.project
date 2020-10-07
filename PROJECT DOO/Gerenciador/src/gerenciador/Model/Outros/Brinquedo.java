/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.Model.Outros;

import gerenciador.Herancas.Outros;
import gerenciador.Interfaces.ObjetoVenda;
import gerenciador.utils.TiposUtil;
import java.io.Serializable;

/**
 *
 * @author PICHAU
 */
public class Brinquedo extends Outros implements ObjetoVenda  {

  

    public static Brinquedo criaBrinquedo(double preco, String nome, int idade, String Veicolos) {
        Brinquedo brinquedo = new Brinquedo();
        brinquedo.valor = preco;
        brinquedo.nome = nome;
        brinquedo.idade = idade;
        brinquedo.descricao = Veicolos;
        
        return brinquedo;
    }

        
    
   
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public Double getValor() {
        return valor;
    }

    @Override
    public int getIdade() {
       return idade;
    }
    
    @Override
    public String getSubTIpo() {
        return TiposUtil.BRINQUEDO;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
