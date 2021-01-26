package br.com.registro.telas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import br.com.registro.R;
import util.Desenho;
import util.Permissao;

public class AssinaturaActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private FloatingActionButton fabSalvar;

    private Desenho desenho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assinatura);

        new Permissao().Permissoes(this);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        validaCampos();
    }

    private void validaCampos() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Assinatura");
        setSupportActionBar(toolbar);

        final RelativeLayout parent = (RelativeLayout) findViewById(R.id.rlAssinatura);
        desenho = new Desenho(this, 0xFF000000, 3);
        parent.addView(desenho);

        /* BOTÃO PARA VOLTAR */
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fabSalvar = (FloatingActionButton) findViewById(R.id.fabSalvar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.delete_menu, menu);
        return true;
    }
}