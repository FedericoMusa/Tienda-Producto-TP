/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.producto.tp;

/**
 *
 * @author USUARIO
 */
public class Main {
     public static void main(String[] args) {
        TiendaProductoTP Producto1 = new TiendaProductoTP("TV", 10000.5,15 );
        
         System.out.println("Precio y cantidad inicial");
         System.out.println("Producto: " + Producto1.getNombre());
         System.out.println("Precio: " + Producto1.getPrecio());
         System.out.println("Cantidad: " + Producto1.getCantidad());
        
         Producto1.setNombre("Monitor");
         Producto1.setPrecio(150000);
         Producto1.setCantidad(20);
         System.out.println("Precio y cantidad nuevo. ");
         System.out.println("Producto: "+ Producto1.getNombre());
         System.out.println("Precio: " + Producto1.getPrecio());
         System.out.println("Cantidad: " + Producto1.getCantidad());
                               
        // Código de la aplicación
    }
}
