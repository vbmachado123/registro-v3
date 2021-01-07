package br.com.registro.telas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TableRow;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import br.com.registro.R;
import dao.Acao_RegraDAO;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;
import util.Permissao;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private BottomNavigationView bnv;
    private Button ibPesquisa;
    private EditText etFiltro;
    private TableRow trNotificacao;
    private TextView txtNomeEmpresa;
    private TextView txtNomeColaborador;
    private TextView txtMatricula;
    private RecyclerView rvListagemHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        new Permissao().Permissoes(this);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bnv = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        bnv.setBackground(null);
        bnv.setOnNavigationItemSelectedListener(this);

        validaCampo();

    }

    private void validaCampo() {

        etFiltro = (EditText) findViewById(R.id.etFiltro);
        ibPesquisa = (Button) findViewById(R.id.btnPesquisar);
        txtNomeEmpresa = (TextView) findViewById(R.id.txtNomeEmpresa);
        txtNomeColaborador = (TextView) findViewById(R.id.txtNomeColaborador);
        txtMatricula = (TextView) findViewById(R.id.txtMatricula);

        rvListagemHome = (RecyclerView) findViewById(R.id.rvListagemHome);

        ibPesquisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String pesquisar = etFiltro.getText().toString();

            }
        });
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.app_bar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_home:

                return true;
            case R.id.item_form:
                    Intent it = new Intent(HomeActivity.this, AssinaturaActivity.class);
                    startActivity(it);
                return true;
            case R.id.item_servico:

                return true;
            case R.id.item_perfil:

                return true;
            default:
                return false;
        }
    }
}