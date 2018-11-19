/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Calcular {

    
    // Método que calcula el número de ceros, positvos y negativos
    public void numeros(){
        double num;
        int contarCeros = 0, contarPositivos = 0, contarNegativos = 0;
     
        for(int cont =0;cont<10;cont++){
            num = Double.parseDouble(JOptionPane.showInputDialog("Introduzca un número"));
            if(num < 0){
                contarNegativos++;
            }
            else if(num > 0){
                contarPositivos++;
            }
            else{
                contarCeros++;
            }
        }
        JOptionPane.showMessageDialog(null, "Positivos: " + contarPositivos + "\nNegativos: " + contarNegativos + "\nCeros: " + contarCeros);
    }
}
    
    
    
    
