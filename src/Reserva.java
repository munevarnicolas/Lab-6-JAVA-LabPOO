public class Reserva
{
    Pelicula pelicula;
    Sala sala;
    String nombreCliente;
    boolean exitosa;

    public Reserva(Pelicula pelicula, Sala sala, String nombreCliente)
    {
        this.pelicula = pelicula;
        this.sala = sala;
        this.nombreCliente = nombreCliente;
        this.exitosa = false;
    }

    void procesarReserva()
    {
        System.out.println("\nProcesando reserva de " + nombreCliente);
        boolean entradaVendida = pelicula.venderEntrada();
        boolean asientoOcupado = sala.ocuparAsiento();

        if(entradaVendida && asientoOcupado)
        {
            this.exitosa = true;
            System.out.println("Reserva completa :D");
        }
        else
        {
            this.exitosa = false;
            System.out.println("No se pudo completar la reserva :(");
        }
    }

    void mostrarDetalles()
    {
        if(exitosa == true)
        {
            System.out.println("La reserva de " + nombreCliente + " para " + pelicula.titulo + " en sala " + sala.identificador + " tiene estado: EXITOSA");
        }
        else
        {
            System.out.println("La reserva de " + nombreCliente + " para " + pelicula.titulo + " en sala " + sala.identificador + " tiene estado: FALLIDA");
        }
    }
}