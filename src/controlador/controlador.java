/**
 * @author Samuel Acosta Fernandez
 * @date 09/02/2022
 * @version 01
 */

package controlador;

import modelo.modelo;
import vista.vista;

public class controlador {
    
    private modelo modelo;
    private vista vista;
    private eventos eventos;
    
    
    public controlador(){
        modelo = new modelo();
        vista = new vista();
        eventos = new eventos(vista);
        
        crearBotones();
        crearCheckBox();

        vista.mostrarVentana();
    }

    private void crearBotones() {
        for(int i=0; i<modelo.getNumBotones(); i++){
            vista.crearBotones(i);
            vista.getBotones().get(i).addActionListener(eventos);
        }
    }

    private void crearCheckBox(){
        vista.crearCheckBox(0);
        vista.getCheckBox().addActionListener(eventos);
    }

	
}
