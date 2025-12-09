public class Sala
{
    int identificador;
    String tipo;
    int capacidadTotal;
    int asientosOcupados;

    public Sala(int identificador, String tipo, int capacidadTotal)
    {
        this.identificador = identificador;
        this.tipo = tipo;
        this.capacidadTotal = capacidadTotal;
        this.asientosOcupados = 0;
    }

    boolean ocuparAsiento()
    {
        if(asientosOcupados < capacidadTotal)
        {
            asientosOcupados++;
            System.out.println("Asiento ocupado en sala " + identificador);
            return true;
        }
        else
        {
            System.out.println("La sala " + identificador + " está llena");
            return false;
        }
    }

    void mostrarEstado()
    {
        System.out.println("Sala " + identificador + " | Tipo: " + tipo + " | Ocupados: " + asientosOcupados + "/" + capacidadTotal);
    }
}