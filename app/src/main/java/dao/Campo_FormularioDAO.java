package dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import model.Campo_Formulario;

@Dao
public interface Campo_FormularioDAO {

    @Insert
    void inserir(Campo_Formulario campo_formulario);

    @Query("SELECT * FROM Campo_Formulario")
    List<Campo_Formulario> pegaTudo();

    @Delete
    void deletar(Campo_Formulario campo_formulario);
}
