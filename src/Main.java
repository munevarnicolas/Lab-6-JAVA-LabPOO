public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\nSISTEMA DE PELICULAS: ");
        Pelicula pelicula1 = new Pelicula("Rocky", "Accion", 120, 5);
        Pelicula pelicula2 = new Pelicula("The swimmers", "Drama", 134, 3);

        Sala sala1 = new Sala(1, "2D", 10);
        Sala sala2 = new Sala(2, "IMAX", 8);

        System.out.println("\nReserva de: ");
        Reserva reserva1 = new Reserva(pelicula1, sala1, "Nikoll");
        Reserva reserva2 = new Reserva(pelicula1, sala1, "Dilan");
        Reserva reserva3 = new Reserva(pelicula1, sala1, "Brayan");
        Reserva reserva4 = new Reserva(pelicula2, sala2, "Nicolas");
        Reserva reserva5 = new Reserva(pelicula1, sala1, "Luisa");
        Reserva reserva6 = new Reserva(pelicula1, sala1, "Evellyn");
        Reserva reserva7 = new Reserva(pelicula1, sala1, "Milton");
        Reserva reserva8 = new Reserva(pelicula2, sala2, "Daniela");

        reserva1.procesarReserva();
        reserva2.procesarReserva();
        reserva3.procesarReserva();
        reserva4.procesarReserva();
        reserva5.procesarReserva();
        reserva6.procesarReserva();
        reserva7.procesarReserva();
        reserva8.procesarReserva();


        System.out.println("\nEstado Actual: ");

        pelicula1.mostrarInfo();
        pelicula2.mostrarInfo();

        System.out.println();

        sala1.mostrarEstado();
        sala2.mostrarEstado();

        System.out.println("\nDetalles de Reservas: ");

        reserva1.mostrarDetalles();
        reserva2.mostrarDetalles();
        reserva3.mostrarDetalles();
        reserva4.mostrarDetalles();
        reserva5.mostrarDetalles();
        reserva6.mostrarDetalles();
        reserva7.mostrarDetalles();
        reserva8.mostrarDetalles();
        System.out.println("\n---------------------------");

        System.out.println("\nSISTEMA DE CAFETERIA: ");

        Producto cafe = new Producto("Cafe", 3500);
        Producto capuchino = new Producto("Capuchino", 4000);
        Producto pastel = new Producto("Pastel", 7000);

        Pedido pedido1 = new Pedido(1, cafe, 2);
        Pedido pedido2 = new Pedido(2, capuchino, 1);
        Pedido pedido3 = new Pedido(3, pastel, 3);
        Pedido pedido4 = new Pedido(4, cafe, 1);

        Cafeteria cafeteriaNiko = new Cafeteria("Cafe Central");

        cafeteriaNiko.agregarPedido(pedido1);
        cafeteriaNiko.agregarPedido(pedido2);
        cafeteriaNiko.agregarPedido(pedido3);
        cafeteriaNiko.agregarPedido(pedido4);

        System.out.println("\nEntregando pedidos");
        pedido1.marcarComoEntregado();
        pedido2.marcarComoEntregado();
        pedido3.marcarComoEntregado();

        cafeteriaNiko.mostrarTodosPedidos();
        cafeteriaNiko.calcularVentasTotales();

        System.out.println("\nProductos vendidos");
        cafe.mostrarInfo();
        capuchino.mostrarInfo();
        pastel.mostrarInfo();
    }
}