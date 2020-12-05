package br.com.registro.telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

import br.com.registro.R;

public class SplashScreen extends AppCompatActivity {

    private GifImageView gifRegistro;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        View decorView = getWindow().getDecorView();
        // Esconde tanto a barra de navegação e a barra de status .
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        gifRegistro = (GifImageView) findViewById(R.id.gifRegistro);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setVisibility( progressBar.VISIBLE );

        //Setando a resolução do gif
        try{
            InputStream inputStream = getAssets().open("registro.gif");
            byte[] bytes = IOUtils.toByteArray(inputStream);
            gifRegistro.setBytes(bytes);
            gifRegistro.startAnimation();
        } catch (IOException e){
            //Faz alguma coisa

        }

        //Aguardando um tempo para redirecionar
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SplashScreen.this.startActivity(new Intent(SplashScreen.this, HomeActivity.class));
                SplashScreen.this.finish();
            }
        }, 3000);


    }
}