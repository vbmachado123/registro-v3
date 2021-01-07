package model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.RoomWarnings;

import java.io.Serializable;

@Entity
@SuppressWarnings(RoomWarnings.PRIMARY_KEY_FROM_EMBEDDED_IS_DROPPED)
public class Equipe implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_equipe")
    private Long id;
    private String dataHoraInicio;
    private String dataHoraFim;
    private long latitudeInicial, longitudeInicial;
    private long latitudeFinal, longitudeFinal;

    public Equipe() {

    }

    @Ignore
    public Equipe(String dataHoraInicio, String dataHoraFim, long latitudeInicial, long longitudeInicial, long latitudeFinal, long longitudeFinal) {
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.latitudeInicial = latitudeInicial;
        this.longitudeInicial = longitudeInicial;
        this.latitudeFinal = latitudeFinal;
        this.longitudeFinal = longitudeFinal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(String dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public String getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(String dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public long getLatitudeInicial() {
        return latitudeInicial;
    }

    public void setLatitudeInicial(long latitudeInicial) {
        this.latitudeInicial = latitudeInicial;
    }

    public long getLongitudeInicial() {
        return longitudeInicial;
    }

    public void setLongitudeInicial(long longitudeInicial) {
        this.longitudeInicial = longitudeInicial;
    }

    public long getLatitudeFinal() {
        return latitudeFinal;
    }

    public void setLatitudeFinal(long latitudeFinal) {
        this.latitudeFinal = latitudeFinal;
    }

    public long getLongitudeFinal() {
        return longitudeFinal;
    }

    public void setLongitudeFinal(long longitudeFinal) {
        this.longitudeFinal = longitudeFinal;
    }
}
