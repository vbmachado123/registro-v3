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
public class Equipe_Agente implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_equipe_agente")
    private Long id;
    @Embedded(prefix = "equipe_agente_")
    private Agente agente;
    @Embedded(prefix = "equipe_agente_")
    private Equipe equipe;

    public Equipe_Agente() {

    }

    @Ignore
    public Equipe_Agente(Agente agente, Equipe equipe) {
        this.agente = agente;
        this.equipe = equipe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
}
