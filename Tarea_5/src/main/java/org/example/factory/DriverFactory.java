package org.example.factory;

public class DriverFactory {
    public static void main(String[] args) {
        System.out.println(ProductoFactory.getProducto(Producto.LIBRO_SHERLOCK_HOLMES_ESTUDIO_ESCARLATA));
        System.out.println(ProductoFactory.getProducto(Producto.REVISTA_MUY_INTERESANTE));
        System.out.println(ProductoFactory.getProducto(Producto.PERIODICO_METRO));
    }
}
