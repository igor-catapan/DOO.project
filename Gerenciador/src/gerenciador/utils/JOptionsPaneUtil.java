/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.utils;

import javax.swing.JOptionPane;

/**
 *
 * @author PICHAU
 */
public class JOptionsPaneUtil {
    
    public static void showErrorMessage(String message, String titulo){
        JOptionPane.showMessageDialog(null, message, titulo, JOptionPane.ERROR_MESSAGE);
    }
    
}
