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
public class Regra implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_regra")
    private Long id;
    @Embedded(prefix = "regra_")
    private Termo termo_regra;

    public Regra() {
    }

    @Ignore
    public Regra(Termo termo_regra) {
        this.termo_regra = termo_regra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Termo getTermo_regra() {
        return termo_regra;
    }

    public void setTermo_regra(Termo termo_regra) {
        this.termo_regra = termo_regra;
    }
}
