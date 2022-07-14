
package ejercicio18;


public class Ejercicio18 {

    
    public static void main(String[] args) {
        // entrada
        String celular = "";
        int longitud = 0;
        //proceso
        celular = JOptionPane.showInputDialog("ingrese su numero celular correctamente:");
        longitud = celular.length();
        for(int indice = 0; indice <longitud; indice++){
            //validacion
            if(celular.charAt(indice)!= '0'||celular.charAt(indice)!= '1'||celular.charAt(indice)!= '2'||
                    celular.charAt(indice)!= '3'||celular.charAt(indice)!= '4'||celular.charAt(indice)!= '5'||
                    celular.charAt(indice)!= '6'||celular.charAt(indice)!= '7'||celular.charAt(indice)!= '8'||
                  celular.charAt(indice)!= '9'){
                //romper el ciclo
                indice = longitud;
                JoptionPane.showMessageDialog(null,"el numero ingresado esta correcto");
                
            }
        }
    }
    
}
