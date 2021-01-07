package model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.RoomWarnings;

import java.io.Serializable;

@Entity
@SuppressWarnings(RoomWarnings.PRIMARY_KEY_FROM_EMBEDDED_IS_DROPPED)
public class Empresa implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_empresa")
    private Long id;
    private String razaoSocial;
    private String fantasia;

    public Empresa() {

    }

    @Ignore
    public Empresa(String razaoSocial, String fantasia) {
        this.razaoSocial = razaoSocial;
        this.fantasia = fantasia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }
}
