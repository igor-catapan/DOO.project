/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.Model.Carros;

import gerenciador.Herancas.Veiculo;
import gerenciador.Interfaces.ObjetoVenda;

/**
 *
 * @author PICHAU
 */
public class Classicos extends Veiculo implements ObjetoVenda {

    @Override
    public String getNome() {
        return "";
    }

    @Override
    public String getTipo() {
        return "";
    }

    @Override
    public Double getValor() {
        return 1600.6;
    }

    @Override
    public int getIdade() {
       return 10;
    }
    
}
