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
        double cuentaBebidas = precioBebida*numeroBebidas;
        double cuentaBocadillos = numeroBocadillos*precioBocadillo;
        double cuentaGeneral = (numeroBebidas*precioBebida)+(numeroBocadillos*precioBocadillo);
        double cuenta = cuentaBebidas+cuentaBocadillos;//ESTO ES LO MISMO QUE LA LINEA DE ARRIBA

        System.out.printf("Coste parcial de las bebidas: %.2f\n",cuentaBebidas);//SI NO GENERAMOS EL SALTO DE LINEA LA SIGUIENTE LINEA SE QUEDA PEGADA
        System.out.println("Coste parcial de los bocadillos: "+cuentaBocadillos);
        System.out.printf("Bueno!Espero que hayáis pasado buena tarde, como habéis tomado %d bebidas y %d bocadillos, \n la cuenta os va a salir por %.2f",numeroBebidas,numeroBocadillos,cuentaGeneral);
        //ESTA VEZ EN EL $f HE PUESTO '.2' PARA DECIRLE QUE SOLO ME MUESTRE 2 DECIMALES.

    }
}
