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
public class Servico implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id_servico")
    private Long id;
    private String obsInicial;
    @Embedded(prefix = "servico_")
    private Categoria categoria;
    @Embedded(prefix = "servico_")
    private Status status;

    public Servico() {
    }

    @Ignore
    public Servico(String obsInicial, Categoria categoria, Status status) {
        this.obsInicial = obsInicial;
        this.categoria = categoria;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObsInicial() {
        return obsInicial;
    }

    public void setObsInicial(String obsInicial) {
        this.obsInicial = obsInicial;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
