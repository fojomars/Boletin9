/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Rectangulo {
    // Variable 
    private double base;
    private double altura;
    
    // Método calcular area
    public double calcularArea(){
        boolean verdadero = false;
        do{
            double b = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la base: "));
            if(b > 0){
                base = b;
                verdadero = true;
            }
            else{
                JOptionPane.showInputDialog("Introduzca la base de nuevo: ");
            }
        }while(verdadero == false);

        do{
            double a = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la altura: "));
            if(a > 0){
                altura = a;
                verdadero= true;
            }
            else{
                JOptionPane.showInputDialog( "Introduzca la altura de nuevo: ");
            }
        }while(verdadero == false);
        return base*altura;
        
    }
}
