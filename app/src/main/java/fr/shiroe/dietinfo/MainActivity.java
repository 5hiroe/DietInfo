package fr.shiroe.dietinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.lang.Math;

public class MainActivity extends AppCompatActivity {



    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        String[] motsdoux = res.getStringArray(R.array.encouragements);

        int random = (int)(Math.random()*9)+1;

        int[] rainbow = getResources().getIntArray(R.array.rainbow);

        int randomRainbow = (int)(Math.random()*rainbow.length);

        TextView hw = findViewById(R.id.hw);
        ImageButton imc_button = findViewById(R.id.imc_button);
        ImageButton rm_button = findViewById(R.id.rm_button);
        ImageButton kal_button = findViewById(R.id.kal_button);
        ImageButton texture_button = findViewById(R.id.texture_button);

        imc_button.setBackgroundColor(R.color.green1);

        imc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startIMCActivity();
            }
        });

        kal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startKalActivity();
            }
        });
        rm_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startRmActivity();
            }
        });
        texture_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTextureActivity();
            }
        });


        hw.setText(motsdoux[random]);
        hw.setBackgroundColor(rainbow[randomRainbow]);
    }

    private void startIMCActivity(){
        Intent myIntent = new Intent(this, IMCActivity.class);
        this.startActivity(myIntent);
    }
    private void startKalActivity(){
        Intent myIntent = new Intent(this, KalActivity.class);
        this.startActivity(myIntent);
    }
    private void startRmActivity(){
        Intent myIntent = new Intent(this, RMActivity.class);
        this.startActivity(myIntent);
    }
    private void startTextureActivity(){
        Intent myIntent = new Intent(this, TextureActivity.class);
        this.startActivity(myIntent);
    }
}