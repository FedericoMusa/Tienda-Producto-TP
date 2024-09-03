package tienda.producto.tp;

public class TiendaProductoTP {
    // Atributos privados 
    private String nombre;
    private double precio;
    private int cantidad;
    
    // Constructor
    public TiendaProductoTP(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    // Métodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    // Método para mostrar la información del producto
    public void mostrarinfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad disponible: " + cantidad);
    }
    
    public static void main(String[] args) {
        // Código de la aplicación
    }
}