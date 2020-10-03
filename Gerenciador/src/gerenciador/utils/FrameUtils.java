/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.utils;

import gerenciador.MyLogger;
import gerenciador.UI.Leiloes;
import javax.swing.JFrame;

/**
 *
 * @author PICHAU
 */
public class FrameUtils {
    
     public static void setClosingEvent(String TAG, JFrame frame, Leiloes leiloes) {

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                MyLogger.info(TAG, "Fechando e abrindo tela de leiloes");
                leiloes.setVisible(true);
                super.windowClosing(windowEvent);
            }
        });
    }
    
    
}
