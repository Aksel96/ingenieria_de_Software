package org.example;

public class Juego {
    public void jugar() {
        ConfigSingleton config = ConfigSingleton.getInstance();
        System.out.println("Configuracion actual:");
        System.out.println(config);
        config.setApodo("Aksel");
        config.setVolumen(100);
        config.setCalidadDeVideo("Media");
        config.setListoParaComenzar(true);
        config.setPantallaCompleta(true);
        System.out.println("Configuracion actualizada en el juego:");
        System.out.println(config);

    }
}
