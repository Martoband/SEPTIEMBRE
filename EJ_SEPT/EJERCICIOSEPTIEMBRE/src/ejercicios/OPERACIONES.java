package ejercicios;
//Hágase un programa que lea dos variables enteras y obtenga las siguientes operaciones:
/*
a) Suma
b) Resta
c) Multiplicación
d) División entera
e) Resto
f) División real
g) Resto real
*/

import java.util.Scanner;

public class OPERACIONES {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);//DECLARAMOS LA VARIABLE DEL ESCANER, YO LO LLAMO 'INPUT'
        int var1 ;
        int var2 ;

        System.out.println("Dime un entero");
        var1 = input.nextInt(); //LE ASIGNAMOS A var1 EL VALOR QUE EL USUARIO VAYA A METER POR TECLADO
        System.out.println("Dime otro entero");
        var2 = input.nextInt();//REPETIMOS LA OPERACION CON LA VARIABLE var2.

        int suma = var1 + var2;
        int resta = var1 - var2;
        int producto = var1 * var2;
        int divisionEntera = var1 / var2; //UTILIZAMOS 'camelCase' PARA DIFERENCIAR LOS DOS TIPOS DE VARIABLES DE DIVISIONES
        int resto = var1%var2;
        double divisionReal = (double)var1 / var2; /*AQUÍ HACEMOS 'CASTEO' DE UNA DE LAS DOS VARIABLES INT A DOUBLE
        PARA PODER EJECUTAR LA DIVISIÓN CON DECIMALES*/

        System.out.println("La suma de las dos variables es "+suma);
        System.out.println("La resta de las dos variables es "+resta);
        System.out.println("El product de las dos variables es "+producto);
        System.out.println("La division entera entre " +var1+ " y " +var2+ " es: "+divisionEntera);
        System.out.println("El resto de la division entre "+var1+" y "+var2+" es: "+resto);
        System.out.printf("La division entre %d y %d es %f",var1,var2,divisionReal);
        /*EN ESTE ULTIMO SOUT HE USADO PRINTF PARA QUE SE VEA LA DIFERENCIA DE ANDAR CONCATENANDO SUMAS
        O ANDAR DIRECTAMENTE ESCRIBIENDO LO QUE QUIERES Y LUEGO PONER LAS VARIABLES QUE QUIERES LLAMAR.
        %d->enteros; %s->textos; %f->numeros con decimales (doubles y floats)
        FYI */
    }
}
