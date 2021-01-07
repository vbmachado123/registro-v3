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
public class Condicao implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_condicao")
    private Long id;
    private String campo;
    private boolean ativo = true;

    @Embedded(prefix = "condicao_")
    private Regra regra;

    public Condicao() {

    }

    @Ignore
    public Condicao(String campo, boolean ativo, Regra regra) {
        this.campo = campo;
        this.ativo = ativo;
        this.regra = regra;
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

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Regra getRegra() {
        return regra;
    }

    public void setRegra(Regra regra) {
        this.regra = regra;
    }

}
