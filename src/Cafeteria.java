import java.util.ArrayList;

public class Cafeteria
{
    String nombre;
    ArrayList<Pedido> pedidos;

    public Cafeteria(String nombre)
    {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }

    void agregarPedido(Pedido pedido)
    {
        pedidos.add(pedido);
        System.out.println("Pedido agregado");
    }

    void mostrarTodosPedidos()
    {
        System.out.println("\nTodos los pedidos");

        for(Pedido pedido : pedidos)
        {
            pedido.mostrarDetalle();
        }
    }

    void calcularVentasTotales()
    {
        double total = 0;

        for(Pedido pedido : pedidos)
        {
            if(pedido.entregado == true)
            {
                total = total + pedido.calcularTotal();
            }
        }

        System.out.println("\nVentas Totales");
        System.out.println("Total vendido de: $" + total);
    }
}