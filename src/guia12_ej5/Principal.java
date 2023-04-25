/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_ej5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int[] listaArray = new int[4];

        for (int i = 0; i < 4; i++) {

            try {

                System.out.println("Ingrese un nro: ");
                int nro = leer.nextInt();

                listaArray[i] = nro + i;
                System.out.println(listaArray[i]);

            } catch (InputMismatchException e) {
                System.out.println("No ingreso un número");
                leer.nextLine();
            }
        }

    }

}
