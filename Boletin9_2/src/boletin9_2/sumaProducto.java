/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class sumaProducto {
    public void sumarMultiplicar(){
        int suma = 0, contador = 10;
        double producto = 1;
        
        for(int cont = 10; cont < 90; cont++){
            suma+=contador;
            producto*=contador;
            contador++;
        }
        JOptionPane.showMessageDialog(null, "Suma: " + suma + "\nProducto: " + producto);
    }
}
