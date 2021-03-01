package es.framedmemories.gamesandrituals;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;


public class InfoScreen extends AppCompatActivity {
    ImageButton botonIntersticial;

    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_screen);

        // ESTE CÓDIGO HACE QUE SOLAMENTE SE EJECUTE EN HORIZONTAL
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        botonIntersticial = findViewById(R.id.buttonAd);

        ///////// CREAMOS UN OBJETO INTERSTITIAL_AD/////////////////////
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-4303291848949898/2693215018");//
        mInterstitialAd.loadAd(new AdRequest.Builder().build()); //CARGAMOS EL INTERSTICIAL

        ////////CARGAMOS EL SIGUIENTE INTERSTICIAL/////////////////////
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });



        ////////////FUNCIONALIDAD DEL BOTÓN//////////////////////
        View.OnClickListener btnVerAd = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /////////MOSTRAMOS EL ANUNCIO//////////
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Toast.makeText(InfoScreen.this, "Aún no se ha cargado el anuncio :(", Toast.LENGTH_SHORT).show();
                }

            }
        };
        botonIntersticial.setOnClickListener(btnVerAd);
    }
}
