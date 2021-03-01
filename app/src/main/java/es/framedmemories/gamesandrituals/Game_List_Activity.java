package es.framedmemories.gamesandrituals;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Game_List_Activity extends AppCompatActivity {

    private TextView tv_fraseInicial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game__list_);

        // ESTE CÓDIGO HACE QUE SOLAMENTE SE EJECUTE EN HORIZONTAL
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        tv_fraseInicial = (TextView) findViewById(R.id.tv_choose);

        Typeface trajan = Typeface.createFromAsset(getAssets(),"fonts/trajanpro.ttf");

        tv_fraseInicial.setTypeface(trajan);


        ////////////////////    INICIAMOS LA LISTVIEW Y EL ADAPTER     /////////////////////////
        ArrayList<Category> category = new ArrayList<Category>();

        ListView lv = (ListView) findViewById(R.id.listView);

        AdapterCategory adapter = new AdapterCategory(this, category);

        lv.setAdapter(adapter);


        /////////////////////////    CONTENIDO DE LA LISTVIEW     //////////////////////////////
        Drawable res = getResources().getDrawable(R.drawable.dice); //Icono para los juegos
        Drawable res2 = getResources().getDrawable(R.drawable.symbol2); //Icono para los rituales

        category.add(new Category("1", getString(R.string.Title_1), getString(R.string.Type_Game), res));

        category.add(new Category("2", getString(R.string.Title_2), getString(R.string.Type_Ritual), res2));

        category.add(new Category("3", getString(R.string.Title_3), getString(R.string.Type_Game), res));

        category.add(new Category("4", getString(R.string.Title_4), getString(R.string.Type_Ritual), res2));

        category.add(new Category("5", getString(R.string.Title_5), getString(R.string.Type_Game), res));

        category.add(new Category("6", getString(R.string.Title_6), getString(R.string.Type_Game), res));

        category.add(new Category("7", getString(R.string.Title_7), getString(R.string.Type_Ritual), res2));

        category.add(new Category("8", getString(R.string.Title_8), getString(R.string.Type_Game), res));

        category.add(new Category("9", getString(R.string.Title_9), getString(R.string.Type_Ritual), res2));

        category.add(new Category("10", getString(R.string.Title_10), getString(R.string.Type_Game), res));

        category.add(new Category("11", getString(R.string.Title_11), getString(R.string.Type_Game), res));

        category.add(new Category("12", getString(R.string.Title_12), getString(R.string.Type_Game), res));

        category.add(new Category("13", getString(R.string.Title_13), getString(R.string.Type_Ritual), res2));

        category.add(new Category("14", getString(R.string.Title_14), getString(R.string.Type_Game), res));

        category.add(new Category("15", getString(R.string.Title_15), getString(R.string.Type_Ritual), res2));

        category.add(new Category("16", getString(R.string.Title_16), getString(R.string.Type_Game), res));

        category.add(new Category("17", getString(R.string.Title_17), getString(R.string.Type_Ritual), res2));

        category.add(new Category("18", getString(R.string.Title_18), getString(R.string.Type_Ritual), res2));

        category.add(new Category("19", getString(R.string.Title_19), getString(R.string.Type_Game), res));

        category.add(new Category("20", getString(R.string.Title_20), getString(R.string.Type_Ritual), res2));

        category.add(new Category ("21", getString(R.string.Title_21), getString(R.string.Type_Ritual), res2 ));

        category.add(new Category ("22", getString(R.string.Title_22), getString(R.string.Type_Game), res ));

        category.add(new Category ("23", getString(R.string.Title_23), getString(R.string.Type_Game), res ));

        category.add(new Category ("24", getString(R.string.Title_24), getString(R.string.Type_Ritual), res2 ));

        category.add(new Category ("25", getString(R.string.Title_25), getString(R.string.Type_Game), res ));

        category.add(new Category ("26", getString(R.string.Title_26), getString(R.string.Type_Game), res ));

        category.add(new Category ("27", getString(R.string.Title_27), getString(R.string.Type_Ritual), res2 ));

        category.add(new Category ("28", getString(R.string.Title_28), getString(R.string.Type_Ritual), res2 ));

        category.add(new Category ("29", getString(R.string.Title_29), getString(R.string.Type_Game), res ));

        category.add(new Category ("30", getString(R.string.Title_30), getString(R.string.Type_Ritual), res2 ));

        category.add(new Category ("31", getString(R.string.Title_31), getString(R.string.Type_Game), res ));

        category.add(new Category ("32", getString(R.string.Title_32), getString(R.string.Type_Game), res ));

        category.add(new Category ("33", getString(R.string.Title_33), getString(R.string.Type_Game), res ));

        category.add(new Category ("34", getString(R.string.Title_34), getString(R.string.Type_Game), res ));

        category.add(new Category ("35", getString(R.string.Title_35), getString(R.string.Type_Ritual), res2 ));



        //////////    LO QUE OCURRE AL HACER TOUCH EN UN ELEMENTO DE LA LISTVIEW    ////////////
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final int pos = position; //INDICA LA POSICIÓN DEL ITEM EN LA ARRAYLIST

                Toast.makeText(getApplicationContext(),getString(R.string.AcesingChapter)+" "+(pos+1)+"...", Toast.LENGTH_SHORT).show();

                Intent juego1 = new Intent(getApplicationContext(), Game1.class);

                juego1.putExtra("indice",pos);

                startActivity(juego1);

            }
        });






    }
}
