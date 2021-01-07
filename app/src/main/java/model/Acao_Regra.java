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
public class Acao_Regra implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_acao_regra")
    private Long id;

    @ColumnInfo(name ="campo_acao")
    private String campo;

    @Embedded(prefix = "acao_regra_")
    private Condicao condicao;

    @Embedded(prefix = "acao_regra_")
    private Status status;

    public Acao_Regra() {
    }

    @Ignore
    public Acao_Regra(String campo, Condicao condicao, Status status) {
        this.campo = campo;
        this.condicao = condicao;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Condicao getCondicao() {
        return condicao;
    }

    public void setCondicao(Condicao condicao) {
        this.condicao = condicao;
    }
}
