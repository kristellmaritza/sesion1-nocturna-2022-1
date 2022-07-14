/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

public class Ejercicio12 {

    
    public static void main(String[] args) {
        // Entrada 
        String numeroEnteroString = "10";
        String numeroDecimalString = "5.5";
        int numeroEnteroConvertido = 0;
        Double numeroDecimalConvertido = 0.0;
        //Proceso
        numeroEnteroConvertido = Integer.parseInt(numeroEnteroString);
        numeroDecimalConvertido = Double.parseDouble(numeroEnteroString);
        //Salida
        JOptionPane.showMessageDialog(null, "El numero entero Convertido entero es: " + numeroEnteroConvertido);
        JOptionPane.showMessageDialog(null, "El numero string Convertido decimal es: " + numeroDecimalConvertido);

    }
    }
    

