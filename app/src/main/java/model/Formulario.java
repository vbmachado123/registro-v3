package model;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import androidx.room.RoomWarnings;
import androidx.room.Transaction;

import java.io.Serializable;
import java.util.List;

@Entity
@SuppressWarnings(RoomWarnings.PRIMARY_KEY_FROM_EMBEDDED_IS_DROPPED)
public class Formulario implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_formulario")
    private Long id;
    @Embedded(prefix = "formulario_")
    private Termo termo;

    @Embedded(prefix = "formulario_")
    private Foto fotos;

    public Formulario() {

    }

    @Ignore
    public Formulario(Termo termo, Foto foto) {
        this.termo = termo;
        this.fotos = foto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Termo getTermo() {
        return termo;
    }

    public void setTermo(Termo termo) {
        this.termo = termo;
    }

    public Foto getFotos() {
        return fotos;
    }

    public void setFotos(Foto foto) {
        this.fotos = foto;
    }
}
