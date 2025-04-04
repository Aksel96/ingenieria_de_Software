package org.example;

public class Main {
    public static void main(String[] args) {
        ConfigSingleton config = ConfigSingleton.getInstance();
        config.setApodo("EkkoGamer");
        config.setVolumen(50);
        config.setCalidadDeVideo("Baja");
        config.setListoParaComenzar(true);
        config.setPantallaCompleta(false);
        System.out.println("Configuracion actual:");
        System.out.println(config);
        Juego juego = new Juego();
        Lobby lobby = new Lobby();

        juego.jugar();
        lobby.jugar();

        System.out.println("Configuracion actual:");
        System.out.println(config);


    }
}