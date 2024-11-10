public class piscina {
    private int capacidadMaxima;
    private int capacidadActual;

    public piscina() {
        this.capacidadMaxima = 5000;
        this.capacidadActual = 0;
    }

    public piscina(int capMax) {
        this.capacidadActual = capMax;
        this.capacidadMaxima = capMax;
    }

    public piscina(int capMax, int capActual) {
        this.capacidadMaxima = capMax;
        this.capacidadActual = (capMax <= capActual) ? capMax : capActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void llenarPiscina() {
        this.capacidadActual = this.capacidadMaxima;
    }

    public void vaciarPiscina() {
        this.capacidadActual = 0;
    }

    public void extraerAgua(int cantidad) {
        if (capacidadActual >= cantidad) {
            this.capacidadActual = capacidadActual - cantidad;
        } else {
            System.out.println("La cantidad supera la capacidad actual por lo tanto se ha vaciado la piscina completamente");
            vaciarPiscina();
        }
    }

    public void agregarAgua(int cantidad) {
        if (capacidadActual + cantidad <= capacidadMaxima) {
            this.capacidadActual = capacidadActual + cantidad;
        } else {
            llenarPiscina();
        }
    }

    public static void main(String[] args) {
        piscina pisc = new piscina(5000, 5000);

        System.out.println("Cantidad maxima de la piscina: " + pisc.getCapacidadMaxima());
        System.out.println("La cantidad actual es " + pisc.getCapacidadActual());
        pisc.extraerAgua(1500);
        System.out.println("La cantidad actual tras retirar es " + pisc.getCapacidadActual());
    }
}
