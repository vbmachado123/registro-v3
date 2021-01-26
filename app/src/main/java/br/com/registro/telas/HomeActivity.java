package br.com.registro.telas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.LabelVisibilityMode;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import br.com.registro.R;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;
import util.BottomSheet;
import util.IOnBackPressed;
import util.Permissao;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private BottomNavigationView bnv;
    private FrameLayout frameLayout;
    private FloatingActionButton fab_add;
    private Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        new Permissao().Permissoes(this);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);

        bnv = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        bnv.setBackground(null);
        fab_add = (FloatingActionButton) findViewById(R.id.fab_add);
        frameLayout = (FrameLayout) findViewById(R.id.frame_container);
        bnv.setOnNavigationItemSelectedListener(navListener);
        bnv.setLabelVisibilityMode(LabelVisibilityMode.LABEL_VISIBILITY_AUTO);
        menu = bnv.getMenu();

        alteraIcon(R.id.item_home, R.drawable.ic_home);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_container, new HomeFragment()).commit();

        fab_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent it = new Intent(HomeActivity.this, ItinerarioActivity.class);
                startActivity(it);*/

                BottomSheet bottomSheet = new BottomSheet();
                bottomSheet.show(getSupportFragmentManager(), "TAG");
            }
        });

        validaCampo();
    }

    private void validaCampo() {
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    Fragment fragment = null;

                    switch (item.getItemId()) {
                        case R.id.item_home:
                            limparSelecao();
                            alteraIcon(R.id.item_home, R.drawable.ic_home);
                            fragment = new HomeFragment();
                            break;
                        case R.id.item_form:
                            limparSelecao();
                            menu.findItem(R.id.item_form).setIcon(R.drawable.ic_form);
                            fragment = new ListaFragment("Modelos - Formulários");
                            break;
                        case R.id.item_servico:
                            limparSelecao();
                            menu.findItem(R.id.item_servico).setIcon(R.drawable.ic_work);
                            fragment = new ListaFragment("Itinerários - Serviços");
                            break;
                        case R.id.item_perfil:
                            limparSelecao();
                            menu.findItem(R.id.item_perfil).setIcon(R.drawable.ic_person);
                            fragment = new ListaFragment("Criar Equipe");
                            break;
                    }

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.frame_container, fragment).commit();

                    return true;
                }
            };

    private void alteraIcon(int item, int icone) {
        limparSelecao();
        menu.findItem(item).setIcon(icone);
    }

    private void limparSelecao() {

        menu.findItem(R.id.item_home).setIcon(R.drawable.ic_home_outline);
        menu.findItem(R.id.item_servico).setIcon(R.drawable.ic_work_outline);
        menu.findItem(R.id.item_form).setIcon(R.drawable.ic_form_outline);
        menu.findItem(R.id.item_perfil).setIcon(R.drawable.ic_person_outline);

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

    @Override public void onBackPressed() {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frame_container);
        if (!(fragment instanceof IOnBackPressed) || !((IOnBackPressed) fragment).onBackPressed()) {
            super.onBackPressed();
        }
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
        return false;
    }
}