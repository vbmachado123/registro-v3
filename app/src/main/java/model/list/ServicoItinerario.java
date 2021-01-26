package model.list;

public class ServicoItinerario {

    private double latitude;
    private double longitude;
    private String titulo;

    public ServicoItinerario(double latitude, double longitude, String titulo) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.titulo = titulo;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
