package db;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import dao.*;
import model.*;

@androidx.room.Database(entities = {Acao_Regra.class, Agente.class,
                Campo_Formulario.class, Campo_Termo.class, Categoria.class,
                Condicao.class, Datas_Servico.class, Empresa.class, Equipe.class,
                Equipe_Agente.class, Execucao_Servico.class, Formulario.class, Foto.class,
                Grupo_Termo.class, Item_Servico.class, Local.class, Regra.class,
                Servico.class, Status.class, SubCampo_Termo.class, Sublocal.class, Termo.class,
                Tipo_Execucao.class, Usuario_Sistema.class}, version = 1, exportSchema = false)
public abstract class Database extends RoomDatabase {

    public abstract Acao_RegraDAO getAcao_RegraDAO();
    public abstract AgenteDAO getAgenteDAO();
    public abstract Campo_FormularioDAO getCampo_FormularioDAO();
    public abstract Campo_TermoDAO getCampo_TermoDAO();
    public abstract CategoriaDAO getCategoriaDAO();
    public abstract CondicaoDAO getCondicaoDAO();
    public abstract Datas_ServicoDAO getDatas_ServicoDAO();
    public abstract EmpresaDAO getEmpresaDAO();
    public abstract EquipeDAO getEquipeDAO();
    public abstract Equipe_AgenteDAO getEquipe_AgenteDAO();
    public abstract Execucao_ServicoDAO getExecucao_ServicoDAO();
    public abstract FormularioDAO getFormularioDAO();
    public abstract FotoDAO getFotoDAO();
    public abstract Grupo_TermoDAO getGrupo_termoDAO();
    public abstract Item_ServicoDAO getItem_ServicoDAO();
    public abstract LocalDAO getLocalDAO();
    public abstract RegraDAO getRegraDAO();
    public abstract ServicoDAO getServicoDAO();
    public abstract StatusDAO getStatusDAO();
    public abstract SubCampo_TermoDAO getSubCampo_TermoDAO();
    public abstract SublocalDAO getSublocalDAO();
    public abstract TermoDAO getTermoDAO();
    public abstract Tipo_ExecucaoDAO getTipo_ExecucaoDAO();
    public abstract Usuario_SistemaDAO getUsuario_SistemaDAO();

    public Database getInstance(Context context) {
        Database database = Room.databaseBuilder(context, Database.class, "registro.db")
                .allowMainThreadQueries()
                .build();

        return database;
    }
}
