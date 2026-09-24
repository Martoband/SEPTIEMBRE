package carpeta;
/*
Define cinco variables con diferentes tipos de datos (String, int, boolean, double, char)
y muestra tanto su valor como su tipo.

Nombre: Carlos - Tipo: String
Edad: 30 - Tipo: int
¿Es estudiante?: true - Tipo: boolean
Altura: 1.75 - Tipo: double
Inicial: C - Tipo: char*/

//IMPORTANTE RECORDAR LOS ESPACIOS DESPUES DE CONCATENAR VARIABLES Y STRINGS
public class E3 {
    public static void main (String[] args){
       String nombre = "Carlos";
       int edad = 30;
       boolean estudia = true;
       double altura = 1.75;
       char inicial = 'C';

        System.out.println("Nombre: " +nombre+" - Tipo: String");
        System.out.println("Edad: "+edad+" - Tipo: int");
        System.out.println("¿Es estudiante?: "+ estudia+" - Tipo: boolean");
        System.out.println("Altura: "+altura+" - Tipo: double");
        System.out.println("Inicial: "+inicial+" - Tipo: char");

    }
}
