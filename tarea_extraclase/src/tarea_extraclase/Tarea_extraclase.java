/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_extraclase;

import java.util.Scanner;

/**
 *
 * @author INSPIRON
 */
public class Tarea_extraclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        int tarifa_b = 3;
        int n = 40;
        double tarifatotal = 0;
        double iva;

        System.out.println("¿Cuantos mensajes envio este mes?");
        int mensaje = entrada.nextInt();

        if (mensaje <= 40) {
            tarifatotal = 0;
        } else {
            if ((mensaje > 40) && (mensaje <= 200)) {
                do {
                    tarifatotal = tarifatotal + 0.05;
                    n += 1;
                } while (n < mensaje);
            } else {
                if (mensaje > 200) {
                    do {
                        tarifatotal = tarifatotal + 0.05;
                        n += 1;
                    } while (n < 200);

                    do {
                        tarifatotal = tarifatotal + 0.10;
                        n += 1;
                    } while (n < mensaje);
                }
            }
        }
        tarifatotal = tarifa_b + tarifatotal;
        iva = tarifatotal + (tarifatotal * 12) / 100;
        System.out.printf("El total a pagar es: %f$\n", iva);
    }

}
