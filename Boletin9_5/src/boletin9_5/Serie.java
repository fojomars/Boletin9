/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Serie {
    // Apartado a Suma de dos
    public void serieSumaPar(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de repeticiones: "));
        int cont,contador = 2;
        
        for(cont = 0; cont < numero; cont++){
            JOptionPane.showMessageDialog(null,contador + "+");
            contador = contador + 2;
        }
    }
    
    // Apartado b Resta y Suma
    public void serieRestaSuma(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de repeticiones: "));
        int contador = 1;
        for(int i = 0; i < num; i++){
           if(contador%2==0){
               JOptionPane.showMessageDialog(null,"+" + contador);
           }
           else{
               JOptionPane.showMessageDialog(null,"-" + contador);
           }
           contador++;
        }
    }
    
    // Apartado c Suma
    public void serieSuma(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de repeticiones: "));
        int cont, contador1 =0,contador2 =1,contador3 = contador1+contador2;
        for(cont = 0; cont < numero; cont++){
            switch (cont) {
                case 0: 
                    JOptionPane.showMessageDialog(null,0 +", ");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null,1 + ", ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,contador3 + ", ");
                    contador1 = contador2;
                    contador2 = contador3;
                    contador3 = contador1 + contador2;   
                    break;
            }
        }
        
    }
}
