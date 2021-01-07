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
public class Campo_Formulario implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_campo_formulario")
    private Long id;
    private String descricao;

    @Embedded(prefix = "campo_formulario_")
    private Formulario formulario;
    @Embedded(prefix = "campo_formulario_")
    private Categoria categoria;

    public Campo_Formulario() {
    }

    @Ignore
    public Campo_Formulario(String descricao, Formulario formulario, Categoria categoria) {
        this.descricao = descricao;
        this.formulario = formulario;
        this.categoria = categoria;
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

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
