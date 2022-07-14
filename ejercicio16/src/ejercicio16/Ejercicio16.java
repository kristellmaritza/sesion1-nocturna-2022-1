
package ejercicio16;


public class Ejercicio16 {

    
    public static void main(String[] args) {
         //Entrada    
        String palabra = "";
        int cantidadCaracteres = 0;
        int contador = 0;
        palabra = JOptionPane.showInputDialog("Ingrese una palabra:");
        do{
           cantidadCaracteres++;
           contador++;
        }while(contador<palabra.length());
        //Salida
        JOptionPane.showMessageDialog(null, "La palabra " +palabra+ " tiene una cantidad de caracteres de: "+cantidadCaracteres);
     }
}
    
    

