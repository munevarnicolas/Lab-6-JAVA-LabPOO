public class Pelicula
{
    String titulo;
    String genero;
    int duracion;
    int entradasDisponibles;

    public Pelicula(String titulo, String genero, int duracion, int entradasDisponibles)
    {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.entradasDisponibles = entradasDisponibles;
    }

    boolean venderEntrada()
    {
        if(entradasDisponibles > 0)
        {
            entradasDisponibles--;
            System.out.println("Entrada vendida para " + titulo);
            return true;
        }
        else
        {
            System.out.println("No hay entradas disponibles para " + titulo);
            return false;
        }
    }

    void mostrarInfo()
    {
        System.out.println("Película: " + titulo + " | Género: " + genero + " | Duración: " + duracion + " min | Entradas disponibles: " + entradasDisponibles);
    }
}