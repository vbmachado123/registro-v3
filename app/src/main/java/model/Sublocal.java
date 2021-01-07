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
public class Sublocal implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_sublocal")
    private Long id;
    private String descricao;
    @Embedded(prefix = "sublocal_")
    private Local local;

    public Sublocal() {
    }

    @Ignore
    public Sublocal(String descricao, Local local) {
        this.descricao = descricao;
        this.local = local;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
