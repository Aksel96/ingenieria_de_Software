package org.example.factory;

import org.example.Libro;
import org.example.Periodico;
import org.example.Revista;

public class ProductoFactory {
    public static Producto getProducto(int idProducto){
        switch (idProducto){
            case Producto.LIBRO_EL_PSICOANALISTA:
                return new Libro(146347896,"El Psicoanalista","La historia comienza con una carta anónima que recibe el doctor Frederick Starks, un psicoanalista estadounidense, en su 53º cumpleaños, amenazándolo con hacerle la vida imposible en quince días. Starks debe emplear toda su astucia para descubrir la identidad del remitente y evitar peligros que amenazan su vida y la de su familia.","John Katzenbach",230f,300);
            case Producto.LIBRO_HARRY_POTTER_CALIZ_FUEGO:
                return new Libro(463434897,"Harry Potter y el Caliz de Fuego","La película comienza cuando Harry empieza a tener sueños sobre Frank Bryce, quien escucha a Lord Voldemort conspirando junto con Peter Pettigrew y otros en la habitación de una casa.","J.K. Rowling",330f,600);
            case Producto.LIBRO_SHERLOCK_HOLMES_ESTUDIO_ESCARLATA:
                return new Libro(96343597,"Sherlock Holmes: Estudio en Escarlata"," La historia gira en torno a un misterioso crimen cometido en Londres que involucra a la secta mormona y el estado de Utah. La novela es conocida por su mezcla de crimen, suspense y pistas falsas, y es el inicio de una larga serie de aventuras detectivescas","Arthur Connan Doyle",260f,230);
            case Producto.PERIODICO_EL_UNIVERSAL:
                return new Periodico(23125734,"El Universal","20/08/2015",6.5f);
            case Producto.PERIODICO_EL_ECONOMISTA:
                return new Periodico(66245735,"El Economista","06/01/2025",12f);
            case Producto.PERIODICO_METRO:
                return new Periodico(34567896,"El Metro","14/08/2020",5f);
            case Producto.REVISTA_COCINA_MEXICANA:
                return new Revista(16847382,"Cocina Mexicana",12,45f,"Semanal");
            case Producto.REVISTA_MUY_INTERESANTE:
                return new Revista(76847383,"Muy Interesante",32,80f,"Mensual");
            case Producto.REVISTA_TV_NOTAS:
                return new Revista(34567897,"TV y Notas",68,65f,"Quincenal");
        }
        return null;
    }
}
