package model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.RoomWarnings;

import java.io.Serializable;

@Entity
@SuppressWarnings(RoomWarnings.PRIMARY_KEY_FROM_EMBEDDED_IS_DROPPED)
public class Categoria implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_categoria")
    private Long id;

    @ColumnInfo(name = "descricao_categoria")
    private String descricao;
    private String sigla;

    @ColumnInfo(name="finalidade_categoria") //Qual Caso se Refere
    private String finalidade;

    public Categoria() {

    }

    @Ignore
    public Categoria(String descricao, String sigla, String finalidade) {
        this.descricao = descricao;
        this.sigla = sigla;
        this.finalidade = finalidade;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }
}
