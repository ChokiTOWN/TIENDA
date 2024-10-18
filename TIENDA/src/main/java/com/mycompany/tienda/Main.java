
package com.mycompany.tienda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario(10);  
        
        boolean continuar = true;  
        while (continuar) {
            
            System.out.println("Menú de administración de la tienda:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Registrar venta");
            System.out.println("4. Mostrar ventas");
            System.out.println("5. Editar producto");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = sc.nextInt(); 

            switch (opcion) {
                case 1:  
                    System.out.print("Ingrese ID del producto: ");
                    String id = sc.next();
                    System.out.print("Ingrese nombre del producto: ");
                    String nombre = sc.next();
                    System.out.print("Ingrese cantidad en stock(solo numeros enteros): ");
                    int cantidad = sc.nextInt();
                    System.out.print("Ingrese precio del producto(con coma como separador decimal): $");
                    double precio = sc.nextDouble();
                    
                    Producto nuevoProducto = new Producto(id, nombre, cantidad, precio);
                    inventario.agregarProducto(nuevoProducto);  
                    System.out.println("Producto agregado exitosamente.\n");
                    break;

                case 2:  
                    inventario.mostrarInventario();  
                    break;

                case 3:  
                    System.out.print("Ingrese ID del producto a vender: ");
                    String idVenta = sc.next();
                    Producto productoAVender = null;

                    
                    for (int i = 0; i < inventario.getNumProductos(); i++) {
                        if (inventario.getProductos()[i].getID().equals(idVenta)) {
                            productoAVender = inventario.getProductos()[i];
                            break;
                        }
                    }

                    if (productoAVender != null) {
                        System.out.print("Ingrese cantidad a vender: ");
                        int cantidadVendida = sc.nextInt();
                        System.out.print("Ingrese fecha de la venta: ");
                        String fecha = sc.next();

                        
                        inventario.registrarVenta(productoAVender, cantidadVendida, fecha);
                        System.out.println("Venta registrada exitosamente.\n");
                    } else {
                        System.out.println("Produocto no encontrado en el inventario.\n");
                    }
                    break;

                case 4:  
                    inventario.mostrarVentas();  
                    break;

                case 5:  
                    System.out.print("Ingrese ID del producto a editar: ");
                    String idEditar = sc.next();
                    System.out.print("Ingrese nuevo precio: ");
                    double nuevoPrecio = sc.nextDouble();
                    System.out.print("Ingrese nueva cantidad en stock: ");
                    int nuevaCantidad = sc.nextInt();
                    
                    
                    inventario.editarProducto(idEditar, nuevoPrecio, nuevaCantidad);
                    break;

                case 6:  
                    continuar = false;  
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;    

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.\n");
                    break;
            }
        }
        sc.close();  
    }
}
