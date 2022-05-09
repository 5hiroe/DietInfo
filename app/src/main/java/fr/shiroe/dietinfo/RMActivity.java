package fr.shiroe.dietinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

import fr.shiroe.dietinfo.adapters.RMRegimesAdapter;

public class RMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rmactivity);

        ArrayList<String> regimes = new ArrayList<>();

        String[] regimesTemp = new String[] {
                "B.Y.C (Bouillon/Yaourt/Compote)",
                "P.Y.C (Potage/Yaourt/Compote)",
                "Sans Résidus Strinct",
                "Sans Résidus Standard",
                "Epargne Digestive Sans Gras",
                "Epargne Digestive",
                "Lacte Froid",
                "Sans Gras",
                "Sans Lait",
                "Sans Gluten",
                "Riche en Fibres",
                "Anti-Diarrheique",
                "Régime Riche en Fer",
                "Hyperprotidique",
                "Sans Histamine",
                "Diabétique 160 Hypocalorique",
                "Diabétique 200 et +",
                "Sans Sucre",
                "Sans Sel inférieur à 4g NACL",
                "Sans Sel Strict inférieur à 1g NACL",
                "Sous A.V.K",
                "Hypoprotidique",
                "Normal",
                "Sans Porc",
                "Végétarien",
                "Sans Alcool"
        };

        Arrays.sort(regimesTemp);
        Collections.addAll(regimes, regimesTemp);


        RecyclerView regimesRecyclerView = findViewById(R.id.regimes_recycler_view);
        regimesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        RMRegimesAdapter regimesAdapter = new RMRegimesAdapter(regimes, this);
        regimesRecyclerView.setAdapter(regimesAdapter);

        ImageButton homeButton = findViewById(R.id.icon_home_rm);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMainActivity();
            }
        });

        EditText editTextSearch = findViewById(R.id.editText_search_regimes);

        editTextSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                filter(editable.toString());
            }

            private void filter(String text){

                ArrayList<String> regimesChanged = new ArrayList<>();

                for (String s : regimes){
                    if (s.toLowerCase().contains(text.toLowerCase())){
                        regimesChanged.add(s);
                    }
                }

                regimesAdapter.filterList(regimesChanged);
            }
        });

    }

    private void startMainActivity(){
        Intent myIntent = new Intent(this, MainActivity.class);
        this.startActivity(myIntent);
    }
}