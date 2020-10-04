/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.utils;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author PICHAU
 */
public class TiposUtil {
    
    public static List<String> getTipos(){
        LinkedList lista = new LinkedList<String>();
        lista.add("Animais");        
        lista.add("Veiculos");
        
        
        
        
        return lista;
        
    }
     public static List<String> getTiposDeVeiculos(){
        LinkedList lista = new LinkedList<String>();
        lista.add("Classico");        
        
        
        
        
        
        return lista;
        
    }
     
       public static List<String> getTiposDeAnimais(){
        LinkedList lista = new LinkedList<String>();
        lista.add("Boi");        
        lista.add("Ovelha");
        
        
        
        
        return lista;
        
    }
    
}
