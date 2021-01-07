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
public class Local implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name ="id_local")
    private Long id;
    @ColumnInfo(name = "local_descricao")
    private String descricao;
    private String endereco;
    private String cep;
    private long latitude;
    private long longitude;
    private String municipio_nome;
    @Embedded(prefix = "local_")
    private Empresa empresa;

    public Local() {
    }

    @Ignore
    public Local(String descricao, String endereco, String cep, long latitude, long longitude, String municipio_nome, Empresa empresa) {
        this.descricao = descricao;
        this.endereco = endereco;
        this.cep = cep;
        this.latitude = latitude;
        this.longitude = longitude;
        this.municipio_nome = municipio_nome;
        this.empresa = empresa;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public String getMunicipio_nome() {
        return municipio_nome;
    }

    public void setMunicipio_nome(String municipio_nome) {
        this.municipio_nome = municipio_nome;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
