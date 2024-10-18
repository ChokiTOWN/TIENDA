package com.mycompany.tienda;

public class Producto {
    private String iD;
    private String nombre;
    private int cantidadStock;
    private double precio;
    
    public Producto(String iD, String nombre, int cantidadStock, double precio) {
        this.iD = iD;
        this.nombre = nombre;
        setCantidadStock(cantidadStock);
        setPrecio(precio);
    }

    public void actualizarStock(int cantidadVendida) {
        this.cantidadStock -= cantidadVendida;
    }
    
    public void mostrarInfo(){
        System.out.println("--------------------\nID: "+iD+"\nProducto: " + nombre + "\nStock: " + cantidadStock + "\nPrecio: $" + precio+"\n--------------------");
    }

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        if (cantidadStock>0) {
            this.cantidadStock = cantidadStock;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio>0) {
            this.precio = precio;
        }
    }

    

}
