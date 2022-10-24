package es.framedmemories.gamesandrituals;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        MediaPlayer mPlayer2;

        mPlayer2 = MediaPlayer.create(this,R.raw.abyssintro);
        mPlayer2.start();

        ImageView logo = (ImageView) findViewById(R.id.LogoFramed);

        //Creamos una animación y la llamamos para animar el logo.
        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.animacion);
        logo.startAnimation(animacion);

        //Creamos un Handler para gestionar el Splash Screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                ///////// Pedimos que cargue la Main Activity ////////////////
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish(); // Hacemos que no vuelva a la Splash Screen si pulsamos "atrás" desde la Main Activity

            }
        },4000); //El tiempo que queremos que tarde en la splash screen
    }
}
