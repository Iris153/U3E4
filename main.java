package u3e4_pilas;

import java.util.InputMismatchException;
import java.util.Scanner;
import pilas.Pila;

public class U3E4_pilas {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        int op = 1, tamaño_actual = 0, valor_rand = 0;
        Pila A = new Pila();
        Pila B = new Pila();

        while (op != 0) {

            System.out.println("\n=== M E N U ===");
            System.out.println("1. Mostrar");
            System.out.println("2. Eliminar");
            System.out.println("3. Insertar");
            System.out.println("0. Salir");
            System.out.print("OPCION -> ");
            op = t.nextInt();
            System.out.println("");

            switch (op) {
                case 1: //MOSTRAR
                    System.out.print("PILA A: ");
                    A.listar(); //Muestra la pila completa
                    System.out.print("PILA B: ");
                    B.listar(); //Muestra la pila completa
                    break;

                case 2://ELIMINAR
                    A.retirar();//Elimina solo el elemento en el tope de la lisata
                    System.out.print("PILA A: ");
                    A.listar();//Muestra la pila completa
                    break;

                case 3://INSERTAR

                    for (int i = 0; i < 10; i++) { //Inicia un ciclo fora dependiendo del tamaño actual de la pila

                        valor_rand = (int) (Math.random() * (10 - 1 + 1) + 1); //Genera un valor aleatorio entre 50 y 500
                        if (A.esVacia()) {
                            A.apilar(valor_rand);
                        } else if (valor_rand > A.cima()) {
                            A.apilar(valor_rand);
                        } else {
                            B.apilar(valor_rand);
                        }
                    }
                    System.out.print("PILA A: ");
                    A.listar(); //Muestra la pila completa
                    System.out.print("PILA B: ");
                    B.listar(); //Muestra la pila completa

                    break;

                case 0://SALIR
                    System.out.println("BYE! BYE!");
                    break;

                default:
                    System.out.println("OPCIÓN INVALIDA");
                    op = 1;
                    break;
            }
        }
    }
}
