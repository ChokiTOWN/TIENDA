package com.mycompany.tienda;

public class Venta {
    private Producto producto;
    private int cantidadVendida;
    private String fecha;

    public Venta(Producto producto, int cantidadVendida, String fecha) {
        this.producto = producto;
        this.cantidadVendida=cantidadVendida;
        this.fecha = fecha;
        producto.actualizarStock(cantidadVendida);
    }

    public void mostrarVenta() {
        System.out.println("Venta: " + cantidadVendida + "\nNunidades de " + producto.getNombre() + "\nEl " + fecha);
    }


}
