package com.mycompany.tienda;

public class Inventario {
    private Producto[] productos;  
    private Venta[] ventas;        
    private int numProductos;      
    private int numVentas;         

    
    public Inventario(int tamañoMaximo) {
        productos = new Producto[tamañoMaximo];  
        ventas = new Venta[tamañoMaximo];        
        numProductos = 0;  
        numVentas = 0;     
    }

    
    public void agregarProducto(Producto producto) {
        if (numProductos < productos.length) {   // Verifica si aún hay espacio en el inventario
            productos[numProductos++] = producto;  
              
        } else {
            System.out.println("Inventario lleno. No se pueden agregar más productos.");
        }
    }
    public Producto[] getProductos() {
        return productos;
    }

    public int getNumProductos() {
        return numProductos;
    }

    public void editarProducto(String id, double nuevoPrecio, int nuevaCantidad) {
        for (int i = 0; i < numProductos; i++) {
            if (productos[i].getID().equals(id)) {
                productos[i].setPrecio(nuevoPrecio); 
                productos[i].setCantidadStock(nuevaCantidad); 
                System.out.println("Producto actualizado exitosamente.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    
    public void mostrarInventario() {
        System.out.println("Inventario de productos:");
        for (int i = 0; i < numProductos; i++) {  
            productos[i].mostrarInfo();  
        }
    }

    public void registrarVenta(Producto producto, int cantidadVendida, String fecha) {
        if (numVentas < ventas.length) {  
            Venta venta = new Venta(producto, cantidadVendida, fecha);  
            ventas[numVentas++] = venta;  
        } else {
            System.out.println("No se pueden registrar más ventas.");
        }
    }

    
    public void mostrarVentas() {
        System.out.println("Historial de ventas:");
        for (int i = 0; i < numVentas; i++) {  
            ventas[i].mostrarVenta();  
        }
    }

}
