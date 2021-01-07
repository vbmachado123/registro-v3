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
public class Item_Servico implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_item_servico")
    private Long id;
    private String obsFinal;
    @Embedded(prefix = "item_servico_")
    private Servico servico;
    @Embedded(prefix = "item_servico_")
    private Local local;

    public Item_Servico() {

    }

    @Ignore
    public Item_Servico(String obsFinal, Servico servico, Local local) {
        this.obsFinal = obsFinal;
        this.servico = servico;
        this.local = local;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObsFinal() {
        return obsFinal;
    }

    public void setObsFinal(String obsFinal) {
        this.obsFinal = obsFinal;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
