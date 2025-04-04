package org.example;

import org.example.factory.Producto;
import org.example.factory.ProductoFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la tienda online");
        Scanner sc = new Scanner(System.in);
        TiendaProductos tienda = new TiendaProductos();

        while (true){
            tienda.menu();
            System.out.print("Ingrese la opcion: ");
            int opcion = sc.nextInt();
            Producto producto = ProductoFactory.getProducto(opcion);
            System.out.println("El producto es:");
            System.out.println(producto);
            System.out.println("Desea seguir comprando? (0 para salir, 1 para seguir)");
            System.out.print("Ingrese la opcion: ");
            int opcion1 = sc.nextInt();
            if (opcion1 == 0) {
                break;
            }
        }
        }
    }