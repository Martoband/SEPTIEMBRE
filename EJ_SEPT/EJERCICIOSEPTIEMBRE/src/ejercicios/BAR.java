package ejercicios;

import java.util.Scanner;

/*Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a 2,05€. El camarero les pregunta cuántas bebidas y bocadillos quieren.

Calcula el coste de la consumición, mostrando primero el coste de las bebidas y de los bocadillos.
 */
public class BAR {
    public static void main(String[] args){
        double precioBebida = 1.25;
        double precioBocadillo = 2.05;
        System.out.println("Muy buenos días! Tenemos bebidas fresquitas a 1,25€ y bocadillos calentitos a 2,05.\n¿Cuantas bebidas vais a querer?");
        Scanner teclado = new Scanner(System.in); //ESTA VEZ HE DECLARADO LA VARIABLE 'TECLADO'
        int numeroBebidas = teclado.nextInt();
        System.out.println("¿Y cuantos bocadillos os pongo?");
        int numeroBocadillos = teclado.nextInt();
        double cuenta = (numeroBebidas*precioBebida)+(numeroBocadillos*precioBocadillo);

        System.out.printf("Bueno!Espero que hayáis pasado buena tarde, como habéis tomado %d bebidas y %d bocadillos, \n la cuenta os va a salir por %.2f",numeroBebidas,numeroBocadillos,cuenta);
        //ESTA VEZ EN EL $f HE PUESTO '.2' PARA DECIRLE QUE SOLO ME MUESTRE 2 DECIMALES.

    }
}
