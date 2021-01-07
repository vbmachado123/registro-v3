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
public class Agente implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id_agente")
    private Long id;
    private String nome;
    private String matricula;
    private String caminhoFoto;

    @Embedded(prefix = "agente_")
    private Status status;

    public Agente() {
    }

    @Ignore
    public Agente(String nome, String matricula, String caminhoFoto, Status status) {
        this.nome = nome;
        this.matricula = matricula;
        this.caminhoFoto = caminhoFoto;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCaminhoFoto() {
        return caminhoFoto;
    }

    public void setCaminhoFoto(String caminhoFoto) {
        this.caminhoFoto = caminhoFoto;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
