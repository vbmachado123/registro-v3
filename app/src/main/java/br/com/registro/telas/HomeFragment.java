package br.com.registro.telas;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;

import br.com.registro.R;

public class HomeFragment extends Fragment {

    private Button ibPesquisa;
    private EditText etFiltro;
    private TableRow trNotificacao;
    private TextView txtNomeEmpresa;
    private TextView txtNomeColaborador;
    private TextView txtMatricula;
    private RecyclerView rvListagemHome;


    public HomeFragment() {
        super(R.layout.fragment_home);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        validaCampo();
    }

    private void validaCampo() {

        etFiltro = (EditText) getView().findViewById(R.id.etFiltro);
        ibPesquisa = (Button) getView().findViewById(R.id.btnPesquisar);
        txtNomeEmpresa = (TextView) getView().findViewById(R.id.txtNomeEmpresa);
        txtNomeColaborador = (TextView) getView().findViewById(R.id.txtNomeColaborador);
        txtMatricula = (TextView) getView().findViewById(R.id.txtMatricula);

        rvListagemHome = (RecyclerView) getView().findViewById(R.id.rvListagemHome);

        ibPesquisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pesquisar = etFiltro.getText().toString();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
               // super.onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}