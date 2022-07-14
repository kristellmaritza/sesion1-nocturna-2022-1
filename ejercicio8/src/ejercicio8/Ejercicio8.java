
package ejercicio8;


public class Ejercicio8 {

  
    public static void main(String[] args) {
          // entrada
        String vehiculo = "ford-f150";
        boolean licencia = true;
        boolean efectivo = false;
        // proceso
        if (licencia == true) {
            if (efectivo == true) {
                System.out.println(vehiculo + "se ejecuta la venta del vehiculo");
            } else {
                System.out.println(vehiculo + " no se ejecuta la venta del vehiculo");
            }
        } else {
            System.out.println(vehiculo + " no se ejecuta la venta del vehiculo");

        }

    }

}
 
