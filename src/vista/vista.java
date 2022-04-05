/**
 * @author Samuel Acosta Fernandez
 * @date 09/02/2022
 * @version 01
 */
package vista;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import modelo.modelo;

public class vista extends JFrame{
    
    private modelo modelo;
    private ArrayList<JButton> botones = new ArrayList<JButton>();
    private JCheckBox checkbox = new JCheckBox();

    public vista(){
    	modelo = new modelo();
        propiedadesVentana();
    }
    
    /*
     * Configuraci�n de Ventana Principal
     */
    private void propiedadesVentana() {
        this.setTitle(modelo.getTextoVentanaPrincipal()[0]);
        this.setLayout(new FlowLayout());
        this.setSize(520, 300);
        this.requestFocus();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(100, 100);
    }
    
 
    
    public void mostrarVentana() {
    	this.setVisible(true);
    }
    
    public void crearBotones(int i){
        botones.add(new JButton());
        botones.get(i).setText((i+1) + "");
        this.add(botones.get(i));
    }
    
    public void crearCheckBox(int i){
        this.add(checkbox);
    }
    
    public JCheckBox getCheckBox(){
        return checkbox;
    }
    
    public ArrayList<JButton> getBotones(){
        return botones;
    }
    
    public void restarNumeros(int i){
       String textoBoton = botones.get(i).getText();
       int nombreBoton = Integer.parseInt(textoBoton);
       nombreBoton--;
        if (nombreBoton == 0) {
            nombreBoton = modelo.getNumBotones();
        }
       botones.get(i).setText((nombreBoton) + "");
    }
    
    public void sumarNumeros(int i){
       String textoBoton = botones.get(i).getText();
       int nombreBoton = Integer.parseInt(textoBoton);
       nombreBoton++;
        if (nombreBoton == (modelo.getNumBotones() + 1)) {
            nombreBoton = 1;
        }
       botones.get(i).setText((nombreBoton) + "");
    }
    
    public void restarNumerosPares(int i){
       String textoBoton = botones.get(i).getText();
       int nombreBoton = Integer.parseInt(textoBoton);
        if (nombreBoton%2 == 0) {
            nombreBoton = nombreBoton - 2;
            if (modelo.getNumBotones()%2 == 0) {
                if (nombreBoton == 0) {
                    nombreBoton = modelo.getNumBotones();
                }
            }else{
                if (nombreBoton == 0) {
                    nombreBoton = modelo.getNumBotones()-1;
                }
            }
        }
       
        
       botones.get(i).setText((nombreBoton) + "");
    }
    
    public void sumarNumerosPares(int i){
       String textoBoton = botones.get(i).getText();
       int nombreBoton = Integer.parseInt(textoBoton);
       if (nombreBoton%2 == 0) {
            nombreBoton = nombreBoton + 2;
            
            if (modelo.getNumBotones()%2 == 0) {
                if (nombreBoton == (modelo.getNumBotones() + 2)) {
                    nombreBoton = 2;
                }
            }else{
                if (nombreBoton == (modelo.getNumBotones() + 1)) {
                    nombreBoton = 2;
                }
            }
        }
        
       botones.get(i).setText((nombreBoton) + "");
    }
}
