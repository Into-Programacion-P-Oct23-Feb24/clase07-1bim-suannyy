/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double suma_total = 0;
        double calificacion;
        boolean bandera = true;
        double promedio;
        int n=0;

        System.out.println("Ingrese las notas de los estudiantes de su materia");
        // true 
        // while (bandera) {
        while(bandera==true){
            System.out.println("Ingrese calificación");
            calificacion = entrada.nextDouble();
            n=n+1;
            if (calificacion > 20) {
                calificacion = 20;
            }
            suma_total = suma_total + calificacion;
            // proceso para salir del ciclo.
            System.out.println("Ingrese el valor -1 para salir del ciclo");
            int temporal = entrada.nextInt();

            if (temporal == -1) {
                bandera = false;
            }
        }
        promedio=suma_total/n;
        System.out.printf("El promedio es %.1f\nSumatotal:", promedio,suma_total);

    }
}
