package es.framedmemories.gamesandrituals;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnContinuar, btnInfo, btnSound;

    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView botonPoliticaPrivacidad;


        btnContinuar = findViewById(R.id.btnGo);
        btnInfo = findViewById(R.id.infoButton);
        btnSound = findViewById(R.id.soundButton);
        botonPoliticaPrivacidad = (TextView) findViewById(R.id.privacyButton);

        //////////////IR A A POLÍTICA DE PRIVACIDAD ///////////////////////////
        botonPoliticaPrivacidad.setMovementMethod(LinkMovementMethod.getInstance());


        ///////// REPRODUCIMOS MÚSICA AL COMIENZO DE LA APP

        btnSound.setBackgroundResource(R.drawable.phonograph); //Ponemos el icono correcto primero.

        mPlayer = MediaPlayer.create(this,R.raw.horrormusicmono);
        mPlayer.start();
        mPlayer.setLooping(true);

        //////// EL BOTÓN COMENZAR LLEVA A LA PANTALLA DE SELECCIÓN DE JUEGO
        View.OnClickListener btnComenzar = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listaJuegos = new Intent(getApplicationContext(), Game_List_Activity.class);
                startActivity(listaJuegos);
            }
        };
        btnContinuar.setOnClickListener(btnComenzar);


        //////// EL BOTÓN INFO VA A LA PANTALLA DE INFO
        View.OnClickListener btnInformacion = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent(getApplicationContext(), InfoScreen.class);
                startActivity(info);
            }
        };
        btnInfo.setOnClickListener(btnInformacion);


        //////// EL BOTÓN PARA ENCENDER/APAGAR EL SONIDO
        View.OnClickListener btnSonido = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mPlayer.isPlaying())
                {
                    mPlayer.pause();
                    btnSound.setBackgroundResource(R.drawable.phonographoff);
                    Toast.makeText(MainActivity.this, getString(R.string.PauseMusic), Toast.LENGTH_SHORT).show();
                }else
                {
                    mPlayer.start();
                    btnSound.setBackgroundResource(R.drawable.phonograph);
                    Toast.makeText(MainActivity.this, getString(R.string.PlayMusic), Toast.LENGTH_SHORT).show();
                }
            }
        };
        btnSound.setOnClickListener(btnSonido);

    }
    @Override
    public void onDestroy() {
        super.onDestroy();

        if (mPlayer != null && mPlayer.isPlaying())
        {
            mPlayer.stop();
            mPlayer.release();
        }
    }
}
