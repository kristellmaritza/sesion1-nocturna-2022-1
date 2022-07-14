
package ejercicio13;


public class Ejercicio13 {

    
    public static void main(String[] args) {
        //ENTRADA 
        String numeroenterostring ="5";
        String numerodecimalstring ="2.50";
        int numeroenteroconvertido=0;
        double numerodecimalconvertido=0.0;
        //PROCESO
        numeroenteroconvertido=Integer.parseInt(numeroenterostring);
        numerodecimalconvertido=Double.parseDouble(numerodecimalstring);
        //SALIDA
        JOptionPane.showMessageDialog(null, "El numero entero convertido es: "+numeroenterostring);
        JOptionPane.showMessageDialog(null, "El numero decimal convertido es: "+numerodecimalconvertido);

    }

    
}
    
