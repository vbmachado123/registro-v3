package db;

import androidx.room.RoomDatabase;

import model.*;

@androidx.room.Database(entities = {Acao_Regra.class, Agente.class,
                Campo_Formulario.class, Campo_Termo.class, Categoria.class,
                Condicao.class, Datas_Servico.class, Empresa.class, Equipe.class,
                Equipe_Agente.class, Execucao_Servico.class, Formulario.class, Foto.class,
                Grupo_Termo.class, Item_Servico.class, Local.class, Regra.class,
                Servico.class, Status.class, SubCampo_Termo.class, Sublocal.class, Termo.class,
                Tipo_Execucao.class, UsuarioSistema.class}, version = 1, exportSchema = false)
public abstract class Database extends RoomDatabase {


}
