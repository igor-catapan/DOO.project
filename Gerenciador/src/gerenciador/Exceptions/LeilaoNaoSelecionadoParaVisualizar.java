/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.Exceptions;

/**
 *
 * @author PICHAU
 */
public class LeilaoNaoSelecionadoParaVisualizar extends IndexOutOfBoundsException {
     public LeilaoNaoSelecionadoParaVisualizar(String message) {
        super(message);
    }
     
      public LeilaoNaoSelecionadoParaVisualizar() {
       
    }
    
}
