/**
 * @author Samuel Acosta Fernandez
 * @date 09/02/2022
 * @version 01
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import modelo.modelo;
import vista.vista;

public class eventos implements ActionListener{

    private modelo modelo;
    private vista vista;
    private int contador = 0;

    
    public eventos(vista vista){
        this.vista = vista;
        modelo = new modelo();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        
        
        if (vista.getCheckBox().isSelected()) {
            if(source instanceof JButton) { 
            contador++;
            if (contador > 3) {
               sumarPares();
            }else{
              restarPares();  
            }
            if (contador == 6) {
                contador = 0;
            }
        }
        }else{
            if(source instanceof JButton) { 

            contador++;
            if (contador > 3) {
               sumar();
            }else{
              restar();  
            }
            if (contador == 6) {
                contador = 0;
            }
        }
        }
        
    }

    private void restar() {
         for(int i=0; i<modelo.getNumBotones(); i++){
            vista.restarNumeros(i);
        }
    }

    private void sumar() {
        for(int i=0; i<modelo.getNumBotones(); i++){
            vista.sumarNumeros(i);
        }
    }
    
        private void restarPares() {
         for(int i=0; i<modelo.getNumBotones(); i++){
            vista.restarNumerosPares(i);
        }
    }

    private void sumarPares() {
        for(int i=0; i<modelo.getNumBotones(); i++){
            vista.sumarNumerosPares(i);
        }
    }
    
    
}
