/**
 * @author Samuel Acosta Fernández
 * @date 09/02/2022
 * @version 01
 */
package modelo;


public class modelo {
    
    private String[] textoVentanaPrincipal;
    private int numBotones = 0;
    
    public modelo(){
        textoVentanaPrincipal = new String[]{"BOTONES ZIG ZAG"};
        numBotones = 8;
    }
    
    public String[] getTextoVentanaPrincipal(){
        return textoVentanaPrincipal;
    }
    
    public int getNumBotones(){
        return numBotones;
    }
}
