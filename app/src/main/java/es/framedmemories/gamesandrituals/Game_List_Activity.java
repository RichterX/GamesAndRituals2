package es.framedmemories.gamesandrituals;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        category.add(new Category("1", "1. Sever the cord", "Game", res));

        category.add(new Category("2", "2. The Picture", "Ritual", res2));

        category.add(new Category("3", "3. Concentrate", "Game", res));

        category.add(new Category("4", "4. The Answer Man", "Ritual", res2));

        category.add(new Category("5", "5. Charlotte´s Web", "Game", res));

        category.add(new Category("6", "6. The Red Book Game", "Game", res));

        category.add(new Category("7", "7. The Dark Music", "Ritual", res2));

        category.add(new Category("8", "8. 11 Miles", "Game", res));

        category.add(new Category("9", "9. The Japanese New Year", "Ritual", res2));

        category.add(new Category("10", "10. Dry Bones", "Game", res));

        category.add(new Category("11", "11. The Closet", "Game", res));

        category.add(new Category("12", "12. The Musical Chairs Alone", "Game", res));

        category.add(new Category("13", "13. The White Kimono", "Ritual", res2));

        category.add(new Category("14", "14. The Corner", "Game", res));

        category.add(new Category("15", "15. A Small Radio", "Ritual", res2));

        category.add(new Category("16", "16. Channel Infinity", "Game", res));

        category.add(new Category("17", "17. Tomino´s Hell", "Ritual", res2));

        category.add(new Category("18", "18. The Man In the Fields", "Ritual", res2));

        category.add(new Category("19", "19. Bed of Sorrow", "Game", res));

        category.add(new Category("20", "20. Lady Spades", "Ritual", res2));

        category.add(new Category ("21", "21. The Stranger Ritual", "Ritual", res2 ));

        category.add(new Category ("22", "22. The Apex", "Game", res ));

        category.add(new Category ("23", "23. The Knockertell", "Game", res ));

        category.add(new Category ("24", "24. The Raven Man", "Ritual", res2 ));

        category.add(new Category ("25", "25. The Gambler´s Game", "Game", res ));

        category.add(new Category ("26", "26. The Doors of your Mind", "Game", res ));

        category.add(new Category ("27", "27. The Hooded Man Ritual", "Ritual", res2 ));

        category.add(new Category ("28", "28. The Dark Reflection", "Ritual", res2 ));

        category.add(new Category ("29", "29. The Bath Game (Daruma-San)", "Game", res ));

        category.add(new Category ("30", "30. The Staircase Ritual", "Ritual", res2 ));

        category.add(new Category ("31", "31. 100 Ghost Stories", "Game", res ));

        category.add(new Category ("32", "32. The Candles Game", "Game", res ));



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
