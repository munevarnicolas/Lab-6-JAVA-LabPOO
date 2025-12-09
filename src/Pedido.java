public class Pedido
{
    int id;
    Producto producto;
    int cantidad;
    boolean entregado;

    public Pedido(int id, Producto producto, int cantidad)
    {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.entregado = false;
    }

    void marcarComoEntregado()
    {
        entregado = true;

        int i = 0;
        while(i < cantidad)
        {
            producto.marcarVenta();
            i = i + 1;
        }

        System.out.println("Pedido " + id + " entregado");
    }

    double calcularTotal()
    {
        double total = producto.precio * cantidad;
        return total;
    }

    void mostrarDetalle()
    {
        System.out.println("Pedido " + id + " | " + producto.nombre + " x " + cantidad + " | Total: $" + calcularTotal() + " | Entregado: " + entregado);
    }
}
