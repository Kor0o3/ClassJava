public class Producto {
    private String nombre;
    private String codProducto;
    private String categoria;
    private float precio;
    private float descuento;
    private int stock;

    private String crearCodigo() {
        return nombre.substring(0, 3).toUpperCase() + String.valueOf(precio);
    }

    public Producto(String n, float p, int st, String c, int d) {
        this.nombre = n;
        this.precio = p;
        this.stock = st;
        this.categoria = c;
        this.descuento = d;
        this.codProducto = crearCodigo();
    }

    public Producto(String n, float p, int st) {
        this.nombre = n;
        this.precio = p;
        this.stock = st;
        this.categoria = "Sin Categoria";
        this.descuento = 0;
        this.codProducto = crearCodigo();
    }

    public String getCodProducto() {
        return this.codProducto;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void aplicarDescuento(float porcentaje) {

        if (this.descuento >= 0 && this.descuento <= 100) {
            this.precio = this.precio - (this.precio * porcentaje) / 100;
            this.descuento = porcentaje;
        }
    }

    public void actualizarStock(int cantidad) {
        if (cantidad >= 0) {
            this.stock = this.stock + cantidad;
        } else {
            if ((this.stock + cantidad) > 0) {
                this.stock = this.stock + cantidad;
            } else {
                System.out.println("No hay suficiente stock");
            }
        }
    }

    public String consultarEstadoStock() {
        if (this.stock < 10) {
            return "Stock bajo";
        } else if (this.stock >= 10 && this.stock <= 50) {
            return "Stock medio";
        } else {
            return "Stock alto";
        }
    }

    public void mostrarInformacionProducto() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Codigo: " + this.codProducto);
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad en stock : " + consultarEstadoStock());
        System.out.println("Categoria: " + this.categoria);
    }

    public String toString() {
        return (this.nombre + " - " + this.precio + " - " + this.stock + " - " + this.categoria);
    }

    public static void main(String[] args) {
        Producto p;
        p = new Producto("Camisa", 10, 100);
        p.aplicarDescuento(50);
        p.mostrarInformacionProducto();
        //System.out.println(p.consultarEstadoStock());
        System.out.println(p.toString());


    }
}
