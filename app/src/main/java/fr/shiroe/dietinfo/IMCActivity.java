package fr.shiroe.dietinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class IMCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcactivity);

        ImageButton ic_home = findViewById(R.id.icon_home_imc);
        EditText taille = findViewById(R.id.edit_taille_imc);
        EditText poids = findViewById(R.id.edit_poids_imc);
        Button result = findViewById(R.id.button_result);
        TextView result_text = findViewById(R.id.result_text_imc);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcul(taille, poids, result_text);
            }
        });

        ic_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMainActivity();
            }
        });



    }

    @SuppressLint("SetTextI18n")
    private void calcul(EditText taille, EditText poids, TextView result) {

        closeKeyboard();

        ImageView insuffisance = findViewById(R.id.insuffisance_img);
        ImageView normal = findViewById(R.id.normal_img);
        ImageView surpoids = findViewById(R.id.surpoids_img);
        ImageView obesite = findViewById(R.id.obesite_img);
        ImageView obesites = findViewById(R.id.obesites_img);

        ImageView insuffisanceBig = findViewById(R.id.bigimageViewinsuffisance);
        ImageView normalBig = findViewById(R.id.bigimageViewnormal);
        ImageView surpoidsBig = findViewById(R.id.bigimageViewsurpoids);
        ImageView obesiteBig = findViewById(R.id.bigimageViewobesite);
        ImageView obesitesBig = findViewById(R.id.bigimageViewobesites);

        insuffisance.setVisibility(View.INVISIBLE);
        normal.setVisibility(View.INVISIBLE);
        surpoids.setVisibility(View.INVISIBLE);
        obesite.setVisibility(View.INVISIBLE);
        obesites.setVisibility(View.INVISIBLE);

        insuffisanceBig.setVisibility(View.INVISIBLE);
        normalBig.setVisibility(View.INVISIBLE);
        surpoidsBig.setVisibility(View.INVISIBLE);
        obesiteBig.setVisibility(View.INVISIBLE);
        obesitesBig.setVisibility(View.INVISIBLE);

        float valueTaille = Float.parseFloat(taille.getText().toString());
        float valuePoids = Float.parseFloat(poids.getText().toString());

        float tailleM = valueTaille / 100;

        float resultat = valuePoids / (tailleM * tailleM);
        String resultatText = String.valueOf(resultat);
        result.setText("Résultat : " + resultatText);
        if (resultat <= 18.0){
            insuffisance.setVisibility(View.VISIBLE);
            insuffisanceBig.setVisibility(View.VISIBLE);
        } else if (resultat > 18.0 && resultat <= 25.0) {
            normal.setVisibility(View.VISIBLE);
            normalBig.setVisibility(View.VISIBLE);
        } else if (resultat > 25.0 && resultat <= 30.0) {
            surpoids.setVisibility(View.VISIBLE);
            surpoidsBig.setVisibility(View.VISIBLE);
        } else if (resultat > 30.0 && resultat <= 35.0) {
            obesite.setVisibility(View.VISIBLE);
            obesiteBig.setVisibility(View.VISIBLE);
        } else if (resultat > 35.0) {
            obesites.setVisibility(View.VISIBLE);
            obesitesBig.setVisibility(View.VISIBLE);
        }
    }

    private void startMainActivity(){
        Intent myIntent = new Intent(IMCActivity.this, MainActivity.class);
        IMCActivity.this.startActivity(myIntent);
    }

    private void closeKeyboard()
    {
        // this will give us the view
        // which is currently focus
        // in this layout
        View view = this.getCurrentFocus();

        // if nothing is currently
        // focus then this will protect
        // the app from crash
        if (view != null) {

            // now assign the system
            // service to InputMethodManager
            InputMethodManager manager
                    = (InputMethodManager)
                    getSystemService(
                            Context.INPUT_METHOD_SERVICE);
            manager
                    .hideSoftInputFromWindow(
                            view.getWindowToken(), 0);
        }
    }
}