
package ejercicio11;


public class Ejercicio11 {

 
    public static void main(String[] args) {
       // Entrada
        Scanner entrada = new Scanner(System.in);
        String Producto = "";
        int cantidad = 0;
        double precio = 0.0;
        double total = 0.0;
        System.out.print("----------Venta de Producto---------");
        //proceso
        System.out.print("Ingrese el Producto:");
        Producto = entrada.nextLine();
        System.out.print("Ingrese el total:");
        precio = entrada.nextDouble();
        System.out.print("Ingrese la cantidad:");
        cantidad = entrada.nextInt();
        // calculo
        total = cantidad * precio;
        // salida
        System.out.print("EL TOTAL A CANCELAR ES :" + total);

    }

}
    
   
