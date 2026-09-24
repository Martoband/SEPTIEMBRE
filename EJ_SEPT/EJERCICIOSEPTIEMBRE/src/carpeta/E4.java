package carpeta;
/*Crea un programa que simule la información de un libro usando variables con nombres descriptivos.
Muestra toda la información del libro en la consola.

Título: Don Quijote de la Mancha
Autor: Miguel de Cervantes
Año de publicación: 1605
Número de páginas: 863
¿Disponible en biblioteca?: true */

public class E4 {
    public static void main(String[] args){
        String tituloQuijote = "Don Quijote de la Mancha";
        String autorQuijote = "Miguel de Cervantes";
        int publicacionQuijote = 1605; //podría valer también la variable anyoQuijote
        int paginasQuijote = 863 ;
        boolean stockQuijote = true;

        System.out.println("Titulo: "+ tituloQuijote);
        System.out.println("Autor: "+autorQuijote);
        System.out.println("Año de publicacion: "+publicacionQuijote);
        System.out.println("Número de páginas: "+ paginasQuijote);
        System.out.println("¿Disponible en la biblioteca?: "+stockQuijote);





    }
}
