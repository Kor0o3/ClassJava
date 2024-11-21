import java.util.Random;

public class CuentaBancaria {
    private String titular;
    private String nCuenta;
    private double saldo;
    private double limiteRetiroDiario;
    private double retiroDiarioAcumulado;

    public CuentaBancaria(String t, double s, double l) {
        this.titular = t;
        this.saldo = s;
        this.limiteRetiroDiario = l;
        this.nCuenta = generarNumeroCuenta();
    }

    public CuentaBancaria() {
        this.titular = "Sin Titular";
        this.saldo = 0;
        this.limiteRetiroDiario = 0;
        this.nCuenta = generarNumeroCuenta();
    }

    public String getNumeroCuenta() {
        return this.nCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double dinero) {
        if (dinero < 0) {
            System.out.println("No se puede ingresar una cantidad negativa");
        } else {
            this.saldo = this.saldo + dinero;
            //this.saldo += dinero;
        }
    }

    public boolean retirar(double dinero) {
        if (dinero <= 0) {
            System.out.println("No se puede retirar una cantidad negativa");
            return false;

        } else if (dinero > this.saldo) {
            System.out.println("No hay saldo suficiente");
            return false;

        } else if (dinero + this.retiroDiarioAcumulado > this.limiteRetiroDiario) {
            System.out.println("Se ha sobrepasado el limite diario de: " + this.limiteRetiroDiario);
            return false;

        } else {
            this.saldo = this.saldo - dinero;
            this.retiroDiarioAcumulado = this.retiroDiarioAcumulado + dinero;
            return true;
        }
    }

    private String generarNumeroCuenta() {
        Random random = new Random();
        int numero = 10000000 + random.nextInt(90000000);
        // Genera un número entre 10000000 y 99999999
        return String.valueOf(numero);
    }

    public void reiniciarRetiroDiario() {
        this.retiroDiarioAcumulado = 0;
    }

    public boolean transferir(double cantidad, CuentaBancaria destino) {
        if (this.saldo < cantidad) {
            System.out.println("No tienes saldo suficiente");
            return false;

        } else if (cantidad <= 0) {
            System.out.println("Se tieen que trasnferir una cantidad positiva");
            return false;

        } else {
            this.saldo = this.saldo - cantidad;
            destino.depositar(cantidad);
            return true;
        }
    }

    public static void main(String[] args) {
        CuentaBancaria cuentaOrigen = new CuentaBancaria("Juan", 5000, 100);
        CuentaBancaria cuentaDestino = new CuentaBancaria("DAW", 0, 100);

        System.out.println("Saldo cuenta origen: " + cuentaOrigen.getSaldo());
        System.out.println("Saldo cuenta destino: " + cuentaDestino.getSaldo());

        cuentaOrigen.transferir(50, cuentaDestino);

        System.out.println("Saldo cuenta origen: " + cuentaOrigen.getSaldo());
        System.out.println("Saldo cuenta destino: " + cuentaDestino.getSaldo());
    }
}
