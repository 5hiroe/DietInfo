package fr.shiroe.dietinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import fr.shiroe.dietinfo.adapters.KalCategoryAdapter;

public class KalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kal);

        RecyclerView categoryRecyclerView = findViewById(R.id.kal_category_recycler_view);
        categoryRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        KalCategoryAdapter categoryAdapter = new KalCategoryAdapter();
        categoryRecyclerView.setAdapter(categoryAdapter);

        ImageButton homeButton = findViewById(R.id.icon_home_kal);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMainActivity();
            }
        });
    }

    private void startMainActivity(){
        Intent myIntent = new Intent(this, MainActivity.class);
        this.startActivity(myIntent);
    }
}