
package ejercicio19;


public class Ejercicio19 {

    public static void main(String[] args) {
        //entrada
        int numero 4;
        int antecesores = 0;
        int residuo = 0;
        int contadorDivisible = 0;
        //proceso
        antecesores = numero - 1;
        while(antecesores>1){
            if(numero % antecesores ==0){
                contadorDivisibles++;
                
            }
            antecesores--;
        }
        JOptionPane.showMessageDialog(null, contadorDivisibles);
    }
    
}
