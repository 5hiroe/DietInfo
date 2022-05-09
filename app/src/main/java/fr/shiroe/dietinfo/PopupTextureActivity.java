package fr.shiroe.dietinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

import fr.shiroe.dietinfo.adapters.TexturePopupAdapter;

public class PopupTextureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_texture);

        String textureName = getIntent().getStringExtra("TEXTURE_NAME");

        ArrayList<String> sections = new ArrayList<>();
        ArrayList<String> contenus = new ArrayList<>();

        switch (textureName) {
            case "Texture Normale":
                sections.add("Bases");
                contenus.add("Repas normaux : aucune adaptation de texture particulière");
                break;
            case "Texture Facile à Macher":
                sections.add("Bases");
                contenus.add("Repas composés d'aliments faciles à macher :\n " +
                        "Potage/potage de vermicelles\n " +
                        "Viandes/Poissons/Oeufs tendres\n " +
                        "Légumes tendres : courgettes, aubergines, haricots verts, choux, carottes...\n " +
                        "Féculents : purée, pommes de terre, pâtes, semoule au lait\n " +
                        "Laitages et fromages : tous\n " +
                        "Dessert : fruits crus (fraises, clémentines, kiwis, abricots...), compote de fuits, fruits cuits au sirop, entremet...");
                sections.add("Interdits");
                contenus.add("Charcuterie : saucisson, jambon cru\n" +
                        "Friand, pizza, salade de riz, salade d'ebly, salade de lentilles\n " +
                        "VPO : Escalope de volaille, lapin roti, steak, rosbeef, cote de porc, rotis de viande\n " +
                        "Légumes : Epinards en branche, blettes, poireaux, carottes rapées, céleri rave, chou rouge cru, ...\n " +
                        "Féculents : riz, ebly, petits pois, pois chiches, semoule couscous beurre\n " +
                        "Fruits crus : poire, orange, pomme, ananas\n " +
                        "Dessert : patisserie à base de pate feuilletée (millefeuille, chausson aux pommes...");
                break;
            case "Texture Facile à Macher VPO Mixte":
                sections.add("Bases");
                contenus.add("Même base que la texture facile à mâcher avec le VPO mixée en association");
                break;
            case "Texture Mixée":
                sections.add("Bases");
                contenus.add("Entrée mixée ou potage\n " +
                        "Viande ou poisson mixé\n " +
                        "Légumes mixés\n " +
                        "Féculents : purée de pommes de terre ou légumes, semoule au lait\n " +
                        "Laitage / fromage fondus / fromages frais (Saint-Moret, demi-sel...)\n" +
                        "Compote ou entremet\n " +
                        "Pain 25 g");
                sections.add("Interdits");
                contenus.add("Crudités texture normale\n " +
                        "Charcuterie : saucisson, jambon cru\n " +
                        "Friand, pizza, salade de riz, salade d'ebly, salade de lentilles...\n " +
                        "VPO non mixés\n " +
                        "Légumes entiers non mixés\n " +
                        "Féculents : tous sauf autorisés\n " +
                        "Fruits crus, patisserie à base de pate feuilletée (millefeuille, chausson aux pommes...)...");
                break;
            case "Texture Hachée (Centre Long Séjour)":
                sections.add("Bases");
                contenus.add("Entrée mixée ou potage ou crudité tendre\n " +
                        "Viande ou poisson haché\n " +
                        "Légumes mixés\n " +
                        "Féculents : purée de pomme de terre ou légumes, semoule au lait\n " +
                        "Laitage ou fromage fondus (vache qui rit, king frais ou à l'ail ...)\n " +
                        "Compote ou entremet ou chou à la crème ou éclair\n " +
                        "Pain");
                break;
            case "Complet (Salé / Sucré)":
                sections.add("Bases");
                contenus.add("SALE : VPO + Accompagnement mixés ensembles\n " +
                        "SUCRE : Laitage + Compote mixés ensembles (ex : petits suisses + compote, petits suisses + crème de marron)");
                break;

        }

        RecyclerView popupTextureRecyclerView = findViewById(R.id.texture_recycler_view);
        popupTextureRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        TexturePopupAdapter textureAdapter = new TexturePopupAdapter(textureName, sections, contenus);
        popupTextureRecyclerView.setAdapter(textureAdapter);

        ImageButton homeButton = findViewById(R.id.icon_home_texture);
        ImageButton backButton = findViewById(R.id.icon_back_texture);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMainActivity();
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTextureActivity();
            }
        });

        TextView title = findViewById(R.id.title_texture_popup);
        title.setText(textureName);
    }

    private void startMainActivity(){
        Intent myIntent = new Intent(this, MainActivity.class);
        this.startActivity(myIntent);
    }

    private void startTextureActivity(){
        Intent myIntent = new Intent(this, TextureActivity.class);
        this.startActivity(myIntent);
    }
}