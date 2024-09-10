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

    public void setPrecio(double nuevoprecio) {
        if (nuevoprecio < 0){
            System.out.println("Error: no se puede ingresar un precio negativo");
        }
        this.precio = nuevoprecio;                          
    }

    public void setCantidad(int nuevacantidad) {
        if (nuevacantidad <0){
            System.out.println("Error: No se puede ingresar una cantidad negativa");
        }
        else{
            this.cantidad = nuevacantidad ;
        }
        
    }
    
    // Método para mostrar la información del producto
    public void mostrarinfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad disponible: " + cantidad);
    }
    
   
}