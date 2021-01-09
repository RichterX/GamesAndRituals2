package es.framedmemories.gamesandrituals;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Game1 extends AppCompatActivity {

    TextView name, player, requirements, instructions;
    int fichero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);

        name = findViewById(R.id.tv_title);
        player = findViewById(R.id.tv_players);
        requirements = findViewById(R.id.tv_requirements);
        instructions = findViewById(R.id.tv_instructions);

        ///////// Vemos qué juego se ha seleccionado y asignamos el texto según la selección///////
        Bundle bundle = getIntent().getExtras(); //Creamos el Bundle que recibirá la selección del intent Game_List_Activity
        fichero = bundle.getInt("indice"); //Guardamos la key de tipo int recibida.

        switch (fichero) //comparamos la key recibida y según su número cargamos un texto u otro.
        {
            case 0: name.setText(R.string.Game1Name);
                    player.setText(R.string.Game1Players);
                    requirements.setText(R.string.Game1Requi);
                    instructions.setText(R.string.Game1Inst);
                    break;

            case 1: name.setText(R.string.Game2Name);
                    player.setText(R.string.Game2Players);
                    requirements.setText(R.string.Game2Requi);
                    instructions.setText(R.string.Game2Inst);
                    break;

            case 2: name.setText(R.string.Game3Name);
                    player.setText(R.string.Game3Players);
                    requirements.setText(R.string.Game3Requi);
                    instructions.setText(R.string.Game3Inst);
                    break;

            case 3: name.setText(R.string.Game4Name);
                    player.setText(R.string.Game4Players);
                    requirements.setText(R.string.Game4Requi);
                    instructions.setText(R.string.Game4Inst);
                    break;

            case 4: name.setText(R.string.Game5Name);
                    player.setText(R.string.Game5Players);
                    requirements.setText(R.string.Game5Requi);
                    instructions.setText(R.string.Game5Inst);
                    break;

            case 5: name.setText(R.string.Game6Name);
                    player.setText(R.string.Game6Players);
                    requirements.setText(R.string.Game6Requi);
                    instructions.setText(R.string.Game6Inst);
                    break;

            case 6: name.setText(R.string.Game7Name);
                    player.setText(R.string.Game7Players);
                    requirements.setText(R.string.Game7Requi);
                    instructions.setText(R.string.Game7Inst);
                    break;

            case 7: name.setText(R.string.Game8Name);
                    player.setText(R.string.Game8Players);
                    requirements.setText(R.string.Game8Requi);
                    instructions.setText(R.string.Game8Inst);
                    break;

            case 8: name.setText(R.string.Game9Name);
                    player.setText(R.string.Game9Players);
                    requirements.setText(R.string.Game9Requi);
                    instructions.setText(R.string.Game9Inst);
                    break;

            case 9: name.setText(R.string.Game10Name);
                    player.setText(R.string.Game10Players);
                    requirements.setText(R.string.Game10Requi);
                    instructions.setText(R.string.Game10Inst);
                    break;

            case 10: name.setText(R.string.Game11Name);
                    player.setText(R.string.Game11Players);
                    requirements.setText(R.string.Game11Requi);
                    instructions.setText(R.string.Game11Inst);
                    break;

            case 11: name.setText(R.string.Game12Name);
                    player.setText(R.string.Game12Players);
                    requirements.setText(R.string.Game12Requi);
                    instructions.setText(R.string.Game12Inst);
                    break;

            case 12: name.setText(R.string.Game13Name);
                    player.setText(R.string.Game13Players);
                    requirements.setText(R.string.Game13Requi);
                    instructions.setText(R.string.Game13Inst);
                    break;

            case 13: name.setText(R.string.Game14Name);
                    player.setText(R.string.Game14Players);
                    requirements.setText(R.string.Game14Requi);
                    instructions.setText(R.string.Game14Inst);
                    break;

            case 14: name.setText(R.string.Game15Name);
                    player.setText(R.string.Game15Players);
                    requirements.setText(R.string.Game15Requi);
                    instructions.setText(R.string.Game15Inst);
                break;

            case 15: name.setText(R.string.Game16Name);
                    player.setText(R.string.Game16Players);
                    requirements.setText(R.string.Game16Requi);
                    instructions.setText(R.string.Game16Inst);
                    break;

            case 16: name.setText(R.string.Game17Name);
                    player.setText(R.string.Game17Players);
                    requirements.setText(R.string.Game17Requi);
                    instructions.setText(R.string.Game17Inst);
                    break;

            case 17: name.setText(R.string.Game18Name);
                    player.setText(R.string.Game18Players);
                    requirements.setText(R.string.Game18Requi);
                    instructions.setText(R.string.Game18Inst);
                    break;

            case 18: name.setText(R.string.Game19Name);
                    player.setText(R.string.Game19Players);
                    requirements.setText(R.string.Game19Requi);
                    instructions.setText(R.string.Game19Inst);
                    break;

            case 19: name.setText(R.string.Game20Name);
                    player.setText(R.string.Game20Players);
                    requirements.setText(R.string.Game20Requi);
                    instructions.setText(R.string.Game20Inst);
                    break;

            case 20: name.setText(R.string.Game21Name);
                    player.setText(R.string.Game21Players);
                    requirements.setText(R.string.Game21Requi);
                    instructions.setText(R.string.Game21Inst);
                    break;

            case 21: name.setText(R.string.Game22Name);
                    player.setText(R.string.Game22Players);
                    requirements.setText(R.string.Game22Requi);
                    instructions.setText(R.string.Game22Inst);
                    break;

            case 22: name.setText(R.string.Game23Name);
                    player.setText(R.string.Game23Players);
                    requirements.setText(R.string.Game23Requi);
                    instructions.setText(R.string.Game23Inst);
                    break;

            case 23: name.setText(R.string.Game24Name);
                    player.setText(R.string.Game24Players);
                    requirements.setText(R.string.Game24Requi);
                    instructions.setText(R.string.Game24Inst);
                    break;

            case 24: name.setText(R.string.Game25Name);
                    player.setText(R.string.Game25Players);
                    requirements.setText(R.string.Game25Requi);
                    instructions.setText(R.string.Game25Inst);
                    break;

            case 25: name.setText(R.string.Game26Name);
                    player.setText(R.string.Game26Players);
                    requirements.setText(R.string.Game26Requi);
                    instructions.setText(R.string.Game26Inst);
                    break;

            case 26: name.setText(R.string.Game27Name);
                    player.setText(R.string.Game27Players);
                    requirements.setText(R.string.Game27Requi);
                    instructions.setText(R.string.Game27Inst);
                    break;

            case 27: name.setText(R.string.Game28Name);
                    player.setText(R.string.Game28Players);
                    requirements.setText(R.string.Game28Requi);
                    instructions.setText(R.string.Game28Inst);
                    break;

            case 28: name.setText(R.string.Game29Name);
                    player.setText(R.string.Game29Players);
                    requirements.setText(R.string.Game29Requi);
                    instructions.setText(R.string.Game29Inst);
                    break;

            case 29: name.setText(R.string.Game30Name);
                    player.setText(R.string.Game30Players);
                    requirements.setText(R.string.Game30Requi);
                    instructions.setText(R.string.Game30Inst);
                    break;
        }
        //instructions.setText(R.string.note1);


    }
}
