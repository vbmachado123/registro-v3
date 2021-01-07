package model;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.RoomWarnings;

import java.io.Serializable;

@Entity
@SuppressWarnings(RoomWarnings.PRIMARY_KEY_FROM_EMBEDDED_IS_DROPPED)
public class Usuario_Sistema implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private Long id;
    @Embedded(prefix = "usuario_sistema_")
    private Empresa empresa;
    private String nome;
    private String matricula;
    private String usuario;
    private String senha;
    private boolean master = false;

    public Usuario_Sistema() {
    }

    @Ignore
    public Usuario_Sistema(Empresa empresa, String nome, String matricula, String usuario, String senha, boolean master) {
        this.empresa = empresa;
        this.nome = nome;
        this.matricula = matricula;
        this.usuario = usuario;
        this.senha = senha;
        this.master = master;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getMaster() {
        return master;
    }

    public void setMaster(boolean master) {
        this.master = master;
    }
}
