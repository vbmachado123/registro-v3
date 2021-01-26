package br.com.registro.telas;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import br.com.registro.R;
import util.IOnBackPressed;

public class ListaFragment extends Fragment implements IOnBackPressed {

    private Toolbar toolbar;
    private String titulo = "";
    private TextView tvTitulo;
    private FloatingActionButton fabSalvar;
    private EditText etFiltro;
    private Menu menu;

    public ListaFragment() {
        super(R.layout.fragment_lista);
        //Log.i("Itinerario", "Abriu Lista Itinerario");
    }

    public ListaFragment(String titulo) {
        super(R.layout.fragment_lista);
        this.titulo = titulo;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.fragment_lista, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        //validaCampo();
        toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        tvTitulo = (TextView) view.findViewById(R.id.txtTituloToolbar);
        fabSalvar = (FloatingActionButton) view.findViewById(R.id.fabSalvar);
        etFiltro = (EditText) view.findViewById(R.id.etFiltro);

        if(titulo != "") {
                tvTitulo.setText(titulo);

                switch (titulo) {
                    case "Modelos - Formulários" :
                        //Toast.makeText(getContext(), "Formulários", Toast.LENGTH_SHORT).show();
                        fabSalvar.setVisibility(View.GONE);
                        break;
                    case "Itinerários - Serviços" :
                       // Toast.makeText(getContext(), "Serviços", Toast.LENGTH_SHORT).show();
                        fabSalvar.setVisibility(View.GONE);
                        break;
                    case "Criar Equipe" :
                       // Toast.makeText(getContext(), "Equipe", Toast.LENGTH_SHORT).show();
                        etFiltro.setHint("Pesquise por Nome ou Matrícula");
                        break;
                }
        }

        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.reload_menu, menu);
        super.onCreateOptionsMenu(menu,inflater);
    }

    @Override
    public boolean onBackPressed() {

        boolean back = true;
        if (back) {
            //action not popBackStack
            return true;
        } else {
            return false;
        }
    }
}