package carpeta;
/*Crea un programa que use constantes para almacenar información que no debe cambiar
(como el valor de PI o el nombre de una aplicación) y variables para información que puede cambiar.
Muestra todos los valores.

Ejemplo de salida por consola:
Aplicación: MiApp
Versión: 1.0.0
Valor de PI: 3.14159
Usuario actual: Laura
Nivel: 1
Puntuación: 0
Usuario actualizado: Miguel
Nivel actualizado: 2
Puntuación actualizada: 150
*/

//para declarar valores que NO VAN A CAMBIAR declaramos las variables anteponiendo la palabra reservada 'final'
public class E5 {
    public static void main (String[] args){
        final double pi = 3.14159;
        final String nombreApp = "Mi Aplicación";
        String versionApp = "1.0.0";
        String usuario = "Laura";
        int nivelUsuario = 1;
        int puntuacionUsuario = 0;

        //CON TODAS LAS VARIABLES DECLARADAS, EMPEZAMOS LOS SOUTS

        System.out.println("Aplicación: " +nombreApp);
        System.out.println("Versión: " +versionApp);
        System.out.println("Valor de PI: " +pi);
        System.out.println("Usuario actual: " +usuario);
        System.out.println("Nivel: " +nivelUsuario);
        System.out.println("Puntuación: " +puntuacionUsuario);

        //AHORA CAMBIAMOS LOS DATOS DE USUARIO NIVEL Y PUNTUACION
        usuario = "Miguel";
        nivelUsuario = 2;
        puntuacionUsuario = 150;

        //Y REALIZAMOS LOS SOUTS, AUNQUE SE VAN A VER TODOS JUNTOS

        System.out.println("Usuario Actualizado: " +usuario);
        System.out.println("Nivel actualizado: " +nivelUsuario);
        System.out.println("Puntuación actualizada: " +puntuacionUsuario);






    }
}
