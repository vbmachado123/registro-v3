package br.com.registro.telas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

import br.com.registro.R;
import model.list.ServicoItinerario;
import util.Permissao;

public class ItinerarioActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    List<ServicoItinerario> servicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerario);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync((OnMapReadyCallback) this);
        validaCampo();
    }

    private void validaCampo() {

        recuperaListaItinerario();
    }

    private void recuperaListaItinerario() {
        servicos = new ArrayList<>();

        servicos.add(new ServicoItinerario(-23.561313654996685, -46.656507778979, "Av Paulista, 2512"));
        servicos.add(new ServicoItinerario(-23.55091626198774, -46.67088695573156, "Av Paulista 2213"));
        servicos.add(new ServicoItinerario(-23.527744310531116, -46.66665103180127, "Av Consolação 9982"));
        servicos.add(new ServicoItinerario(-23.54047125869611, -46.584178103230435, "Av Pinheiros 7682"));
        servicos.add(new ServicoItinerario(-23.596978994998075, -46.604796335373145, "Av Taubaté 1829"));
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType( GoogleMap.MAP_TYPE_NORMAL );

        LatLng servico = new LatLng(-23.596978994998075, -46.604796335373145);

        for(ServicoItinerario si : servicos)
            mMap.addMarker(new MarkerOptions().position(new LatLng(si.getLatitude(), si.getLongitude())).title(si.getTitulo()));

        mMap.addMarker(new MarkerOptions().position(servico).title("Marker in Sydney"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(servico));
    }
}