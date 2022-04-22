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

        TextView hw = findViewById(R.id.hw);
        ImageButton imc_button = findViewById(R.id.imc_button);
        ImageButton rm_button = findViewById(R.id.rm_button);
        ImageButton kal_button = findViewById(R.id.kal_button);

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


        hw.setText(motsdoux[random]);
    }

    private void startIMCActivity(){
        Intent myIntent = new Intent(this, IMCActivity.class);
        this.startActivity(myIntent);
    }
    private void startKalActivity(){
        Intent myIntent = new Intent(this, KalActivity.class);
        this.startActivity(myIntent);
    }
}