public class Producto
{
    String nombre;
    double precio;
    int cantidadVendida;

    public Producto(String nombre, double precio)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadVendida = 0;
    }

    void marcarVenta()
    {
        cantidadVendida = cantidadVendida + 1;
    }

    void mostrarInfo()
    {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Vendidos: " + cantidadVendida);
    }
}
