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
import java.util.Collections;
import java.util.Locale;

import fr.shiroe.dietinfo.adapters.TextureAdapter;

public class TextureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texture);

        ArrayList<String> textures = new ArrayList<>();

        String[] texturesTemp = new String[] {
                "Texture Normale",
                "Texture Facile à Macher",
                "Texture Facile à Macher VPO Mixte",
                "Texture Mixée",
                "Texture Hachée (Centre Long Séjour)",
                "Complet (Salé / Sucré)"
        };

        Collections.addAll(textures, texturesTemp);

        RecyclerView textureRecyclerView = findViewById(R.id.textures_recycler_view);
        textureRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        TextureAdapter textureAdapter = new TextureAdapter(textures, this);
        textureRecyclerView.setAdapter(textureAdapter);

        ImageButton homeButton = findViewById(R.id.icon_home_textures);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMainActivity();
            }
        });

        EditText  editTextSearchTextures = findViewById(R.id.editText_search_textures);

        editTextSearchTextures.addTextChangedListener(new TextWatcher() {
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
                ArrayList<String> texturesChanged = new ArrayList<>();

                for (String s : textures){
                    if (s.toLowerCase().contains(text.toLowerCase())){
                        texturesChanged.add(s);
                    }
                }

                textureAdapter.filterList(texturesChanged);
            }
        });
    }

    private void startMainActivity(){
        Intent myIntent = new Intent(this, MainActivity.class);
        this.startActivity(myIntent);
    }
}