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
public class Execucao_Servico implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_execucao_servico")
    private Long id;
    private String descricao;
    @Embedded(prefix = "execucao_servico_")
    private Item_Servico itemServico;
    @Embedded(prefix = "execucao_servico_")
    private Tipo_Execucao tipoExecucao;

    public Execucao_Servico() {

    }

    @Ignore
    public Execucao_Servico(String descricao, Item_Servico itemServico, Tipo_Execucao tipoExecucao) {
        this.descricao = descricao;
        this.itemServico = itemServico;
        this.tipoExecucao = tipoExecucao;
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

    public Item_Servico getItemServico() {
        return itemServico;
    }

    public void setItemServico(Item_Servico itemServico) {
        this.itemServico = itemServico;
    }

    public Tipo_Execucao getTipoExecucao() {
        return tipoExecucao;
    }

    public void setTipoExecucao(Tipo_Execucao tipoExecucao) {
        this.tipoExecucao = tipoExecucao;
    }
}
