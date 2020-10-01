/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador;

/**
 *
 * @author PICHAU
 */
public class MyLogger {
    
    public static void error(String ClassName, String message){
        System.err.println("Error/" + formatter(ClassName, message));
    }
    
    public static void debug(String ClassName, String message){
        System.out.println("Debug/" + formatter(ClassName, message));
    }
    
    public static void info(String ClassName, String message){
        System.out.println("Info/" + formatter(ClassName, message));
    }
    
    private static String formatter(String ClassName, String message){
        return ClassName + " >>> " + message;
    }
    
}
