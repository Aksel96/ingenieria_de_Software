package org.example;

public class ConfigSingleton {
    private static ConfigSingleton instance;
    private String apodo;
    private int volumen;
    private String calidadDeVideo;
    private boolean listoParaComenzar;
    private boolean pantallaCompleta;


    private ConfigSingleton() {}

    public static ConfigSingleton getInstance() {
        if (instance == null) {
            instance = new ConfigSingleton();
        }
        return instance;
    }

    public String getApodo() {
        return apodo;
    }

    public int getVolumen() {
        return volumen;
    }

    public boolean isListoParaComenzar() {
        return listoParaComenzar;
    }

    public String getCalidadDeVideo() {
        return calidadDeVideo;
    }

    public boolean isPantallaCompleta() {
        return pantallaCompleta;
    }

    public static void setInstance(ConfigSingleton instance) {
        ConfigSingleton.instance = instance;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void setCalidadDeVideo(String calidadDeVideo) {
        this.calidadDeVideo = calidadDeVideo;
    }

    public void setListoParaComenzar(boolean listoParaComenzar) {
        this.listoParaComenzar = listoParaComenzar;
    }

    public void setPantallaCompleta(boolean pantallaCompleta) {
        this.pantallaCompleta = pantallaCompleta;
    }

    @Override
    public String toString() {
        return "apodo='" + apodo + '\'' +
                ", volumen=" + volumen +
                ", calidadDeVideo='" + calidadDeVideo + '\'' +
                ", listoParaComenzar=" + listoParaComenzar +
                ", pantallaCompleta=" + pantallaCompleta;
    }
}
