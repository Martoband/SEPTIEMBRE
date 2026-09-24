package carpeta;

public class E2 {
    public static void main (String[] args){

        int puntuacion = 0;
        System.out.println("Puntuación inicial: " +puntuacion);//aquí la puntuación todavía vale 0

        puntuacion = 5;//cambiamos el valor a 5
        System.out.println("Después de primera modificación: " +puntuacion);//mostramos 5 en pantalla

        puntuacion = 10;//repetimos la operación
        System.out.println("Después de la segunda modificación: " +puntuacion);

        puntuacion = 15;
        System.out.println("Puntuación final: " +puntuacion );
        /*ES IMPORTANTE DEJAR ESPACIOS ANTES DE CERRAR LAS COMILLAS DEL STRING, DE NO SER ASÍ EL int DE puntuacion
        SE VERÁ PEGADO AL TEXTO DEL STRING. EJEMPLO AQUI DEBAJO*/
        //System.out.println("texto ejemplo"+puntuacion);
    }
}
