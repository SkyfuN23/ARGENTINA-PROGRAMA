import com.sun.source.tree.IfTree;

import java.util.Scanner;

//LINK A GITHUB
public class Main {
    public static void main(String[] args) {

        // 1) a)

        int numInicial = 5;
        int numFinal = 10;


        while (numFinal >= numInicial) {
            System.out.println(numInicial++);
        }

        // 1) b)

        numInicial = 5;
        numFinal = 10;

        while (numFinal >= numInicial) {
            if (numInicial % 2 == 0) {
                System.out.println(numInicial);
                numInicial++;
            } else {
                numInicial++;
            }
        }

        // 1) c)

        numInicial = 5;
        numFinal = 10;

        System.out.println("Elija PAR opc 1 - IMPAR opc 2");

        Scanner scanner = new Scanner(System.in);
        int parImpar = scanner.nextInt();

        if (parImpar == 1) {
            while (numFinal >= numInicial) {
                if (numInicial % 2 == 0) {
                    System.out.println(numInicial);
                    numInicial++;
                } else {
                    numInicial++;
                }
            }
        } else if (parImpar == 2) {
            while (numFinal >= numInicial) {
                if (numInicial % 2 == 1) {
                    System.out.println(numInicial);
                    numInicial++;
                } else {
                    numInicial++;
                }
            }
        } else {
            System.out.println("Opcion incorrecta");
        }

        // 1) d)

        numInicial = 5;
        numFinal = 10;

        for (int i = numFinal; i >= numInicial; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }



        int ingreso = 400000;
        int cantVehiculos = 2;
        int antigVehiculos = 2;
        int inmuebles = 2;
        boolean lujo = false;

        if ((ingreso >= 489083) || (cantVehiculos >= 3 && antigVehiculos < 5) || (inmuebles >= 3) || (lujo == true)) {
            System.out.println("PERTENECE A ALTOS INGRESOS");
        } else {
            System.out.println("NO PERTENECE A ALTOS INGRESOS");
        }


    }
}