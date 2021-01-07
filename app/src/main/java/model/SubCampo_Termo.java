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
public class SubCampo_Termo implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_subcampo_termo")
    private Long id;
    private String descricao;
    @Embedded(prefix = "subcampo_termo_")
    private Campo_Termo campoTermo;

    public SubCampo_Termo() {
    }

    @Ignore
    public SubCampo_Termo(String descricao, Campo_Termo campoTermo) {
        this.descricao = descricao;
        this.campoTermo = campoTermo;
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

    public Campo_Termo getCampoTermo() {
        return campoTermo;
    }

    public void setCampoTermo(Campo_Termo campoTermo) {
        this.campoTermo = campoTermo;
    }
}
