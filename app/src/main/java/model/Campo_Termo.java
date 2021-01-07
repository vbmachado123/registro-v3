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
public class Campo_Termo implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_campo_termo")
    private Long id;

    private int posicao;
    private String descricao;
    @Embedded(prefix = "campo_termo_")
    private Termo termo;

    public Campo_Termo() {

    }

    @Ignore
    public Campo_Termo(int posicao, String descricao, Termo termo) {
        this.posicao = posicao;
        this.descricao = descricao;
        this.termo = termo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Termo getTermo() {
        return termo;
    }

    public void setTermo(Termo termo) {
        this.termo = termo;
    }
}
