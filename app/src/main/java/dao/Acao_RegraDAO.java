package dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Index;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import model.Acao_Regra;

@Dao
public interface Acao_RegraDAO {

    @Insert
    void inserir(Acao_Regra acao_regra);

    @Query("SELECT * FROM Acao_Regra")
    List<Acao_Regra> pegaTudo();

    @Delete
    void deletar(Acao_Regra acao_regra);

}
