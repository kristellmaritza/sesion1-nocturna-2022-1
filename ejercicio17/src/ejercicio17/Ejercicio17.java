
package ejercicio17;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Ejercicio17 {
    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        String palabra = "";
        int longitud = 0;
        String palabraNueva ="";
        //proceso
        palabra = JOptionPane.showInputDialog(null,"ingrese una palabra;");
        longitud = palabra.length();
        for(int indice = longitud-1; indice>=0; indice--){
            
            palabraNueva= palabraNueva+palabra.charAt(indice);
    }
        if(palabra.equals(palabraNueva)){
            JOptionPane.showMessageDialog(null,"es palindroma");
        }else{
            JOptionPane.showMessageDialog(null,"No es palindroma");
        }
    }
    
}
