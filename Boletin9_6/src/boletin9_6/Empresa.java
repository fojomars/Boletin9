/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Empresa {  
    public void calcularSueldo(){
        double sueldo;
        int contTrabajadores = 0,contSueldo1 = 0,contPorcentaje = 0;

        do{
           sueldo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el suelo: "));
           if(sueldo < 0 || sueldo > 0){
               contTrabajadores++;
           }
           else if(sueldo >= 1000 && sueldo <= 1750){
               contSueldo1++;
           }
           else if(sueldo < 1000 && sueldo > 0){
               contPorcentaje++;
           }
           else{
               
           }
        }while(sueldo != 0);
        
        JOptionPane.showMessageDialog(null, "Trabajadores entre 1000 y 1750 " + contSueldo1 + " Porcentaje de trabajadores que ganan menos de 1000 " + (contPorcentaje*100/contTrabajadores +"%"));
    }
    
}
