package model;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.RoomWarnings;

import java.io.Serializable;

@Entity(tableName = "foto")
@SuppressWarnings(RoomWarnings.PRIMARY_KEY_FROM_EMBEDDED_IS_DROPPED)
public class Foto implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_foto")
    private Long id;
    private String caminho;
    private String descricao;
    private long latitude;
    private long longitude;
    private String dataHora;
    @Embedded(prefix = "foto_")
    private Item_Servico itemServico;

    public Foto() {

    }

    @Ignore
    public Foto(String caminho, String descricao, long latitude, long longitude, String dataHora, Item_Servico itemServico) {
        this.caminho = caminho;
        this.descricao = descricao;
        this.latitude = latitude;
        this.longitude = longitude;
        this.dataHora = dataHora;
        this.itemServico = itemServico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public Item_Servico getItemServico() {
        return itemServico;
    }

    public void setItemServico(Item_Servico itemServico) {
        this.itemServico = itemServico;
    }
}
