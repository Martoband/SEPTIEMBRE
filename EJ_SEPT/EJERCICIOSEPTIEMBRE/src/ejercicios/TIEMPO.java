package ejercicios;

import java.util.Scanner;

/*Hágase un programa que convierta segundos en horas, minutos y segundos.(Segundos)*

 */
public class TIEMPO {
    public static void main (String[] args){
        System.out.println("Cuantos segundos quieres saber horas, minutos y segundos?");
        Scanner entrada = new Scanner (System.in);
        int segundos = entrada.nextInt();
        int minutos = segundos / 60;
        int restoSegundos = segundos%60;
        int horas = minutos / 60;
        int restoMinutos = minutos%60;
        System.out.println("Horas: "+ horas);
        System.out.println("Minutos: " +restoMinutos);
        System.out.println("Segundos: " +restoSegundos);
//SE PUEDE HACER SIN DECLARAR LA VARIABLE 'MINUTOS'

    }
}
