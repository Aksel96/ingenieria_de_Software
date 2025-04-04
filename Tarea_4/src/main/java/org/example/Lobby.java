package org.example;

public class Lobby {
    public void jugar() {
        ConfigSingleton config = ConfigSingleton.getInstance();
        System.out.println("Configuracion actual:");
        System.out.println(config);
        config.setApodo("Shadow");
        config.setVolumen(25);
        config.setCalidadDeVideo("Alta");
        config.setListoParaComenzar(false);
        config.setPantallaCompleta(false);
        System.out.println("Configuracion actualizada en el lobby:");
        System.out.println(config);
    }
}
