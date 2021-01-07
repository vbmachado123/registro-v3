package model;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.RoomWarnings;

import java.io.Serializable;

@Entity
@SuppressWarnings(RoomWarnings.PRIMARY_KEY_FROM_EMBEDDED_IS_DROPPED)
public class Datas_Servico implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_datas_servico")
    private Long id;
    @ColumnInfo(name = "latitude_data")
    private long latitude;
    @ColumnInfo(name="longitude_data")
    private long longitude;

    private String dataHora;

    @Embedded(prefix = "datas_")
    private Status status;
    @Embedded(prefix = "datas_")
    private Item_Servico itemServico;

    public Datas_Servico() {

    }

    @Ignore
    public Datas_Servico(long latitude, long longitude, String dataHora, Status status, Item_Servico itemServico) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.dataHora = dataHora;
        this.status = status;
        this.itemServico = itemServico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Item_Servico getItemServico() {
        return itemServico;
    }

    public void setItemServico(Item_Servico itemServico) {
        this.itemServico = itemServico;
    }
}
