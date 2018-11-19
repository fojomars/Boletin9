/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Tabla {
    public void tablaDeMultiplicar(){
        int numero,cont;
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: "));
            if(numero > 0){
                JOptionPane.showMessageDialog(null, "La tabla de multiplicar de " + numero + " es: ");
                for(cont = 0; cont < 10; cont++){
                    JOptionPane.showMessageDialog(null, numero + " * " + cont + " = " + numero*cont);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Número incorrecto.");
            }
        }while(numero != 0);
    }
}
