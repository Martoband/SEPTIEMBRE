package carpeta;

//ASÍ SE LLAMA UN Metodo
/* public = modificador de acceso -> public/private/protected
       static = este metodo pertenece a la clase Main.java
       void = el retorno del metodo (en este caso void)
       main = el nombre del METODO que estamos llamando
       String =
       args= ¿argumentos?
     */

/*TODO GLOSARIO
      BANDERAS PARA ESPECIFICADORES DE FORMATO
      %s -> palabra / String
      %d -> numero sin decimales / integer
      %f -> numero con decimales / double. Si se pone %.3f, el numero 3, indica el numero de decimales a mostrar
      %n -> salto de linea
      String nombre = "Andreu";
        String city = "Madrid";
        int edad = 33;
        System.out.printf("El nombre %s, la edad %d, la ciudad %s", nombre, edad, city) ;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Para el que le sirva");

        //Ejercicio 1 resuelto facil.
        String nombre = "Andreu";
        String ciudad = "Madrid";
        int dia = 23;
        System.out.println(nombre);
        System.out.println(ciudad);
        System.out.println(dia);

        //Ejercicio 1 con concatenación

        System.out.println("Este código lo ha escrito "+nombre+",en "+ciudad+" el dia "+dia+".");

        //Ejercicio 1 con modificación

        Scanner teclado = new Scanner(System.in); // declaramos el escáner (automáticamente se ha importado,linea 24)
        System.out.println("dime otro nombre");
        nombre = teclado.nextLine();
        System.out.println("El otro nombre es "+ nombre);

        //EJERCICIO 2

        int valor;
        int valor1;
        int valor2;
        System.out.println("Dime tres  numeros enteros");
        valor = teclado.nextInt();
        valor1 = teclado.nextInt();
        valor2 = teclado.nextInt();
        System.out.println("0");
        System.out.println(valor);
        System.out.println(valor1);
        System.out.println(valor2);

        //Ejercicio 2 MODO ENREVESADO
        double puntuacionInicial = 0.0;
        double puntuacionAcumulada;
        double primerValor; //he creado estas variables para poder guardar el acumulativo de mitad de ejercicio
        double segundoValor;

        System.out.println("Dime cuanto le quieres sumar a tu puntuación");
        puntuacionAcumulada = teclado.nextDouble();
        puntuacionInicial = puntuacionInicial + puntuacionAcumulada;
        primerValor = puntuacionInicial;
        //System.out.println(puntuacionInicial); Por si se quieren ver las operaciones aritmeticas


        System.out.println("Dime por cuanto quieres dividir tu puntuación");
        puntuacionAcumulada = teclado.nextDouble();
        puntuacionInicial = puntuacionInicial / puntuacionAcumulada;
        segundoValor = puntuacionInicial;
        //System.out.println(puntuacionInicial); Por si se quieren ver las operaciones aritmeticas


        System.out.println("Dime por cuanto quieres multiplicar tu puntuación");
        puntuacionAcumulada = teclado.nextDouble();
        puntuacionInicial = puntuacionInicial * puntuacionAcumulada;

        System.out.println("0"); // Saco el 0 por texto para no declarar ninguna variable, ya que he creado con dobles por la division
        System.out.println(primerValor);
        System.out.println(segundoValor);
        System.out.println(puntuacionInicial);

        System.out.println("Nombre: "+nombre+" -tipo: ");





    }
}
