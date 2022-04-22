package fr.shiroe.dietinfo.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import fr.shiroe.dietinfo.R;

public class KalCategoryAdapter extends RecyclerView.Adapter<KalCategoryAdapter.KalCategoryViewHolder> {

    private String[] categories = new String[] {
            "Tous les Produits",
            "Boissons",
            "Boissons Alcoolisées",
            "Céréales, Pain, Fruits Secs",
            "Fruits, Légumes",
            "Gateaux, Confiseries",
            "Produits laitiers",
            "Viande, Charcuterie",
            "Huiles, Graisses, Sauces",
            "Plats préparés"};

    @NonNull
    @Override
    public KalCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.kal_category_layout, parent, false);

        return new KalCategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KalCategoryViewHolder holder, int position) {
        holder.getButton().setText(categories[position]);
        int imgRessource = 0;
        if (categories[position].equals("Boissons")){
            imgRessource = R.drawable.ic_boisson_24;
        } else if (categories[position].equals("Boissons Alcoolisées")){
            imgRessource = R.drawable.ic_alcohol_24;
        } else if (categories[position].equals("Céréales, Pain, Fruits Secs")){
            imgRessource = R.drawable.ic_cereals_24;
        } else if (categories[position].equals("Fruits, Légumes")){
            imgRessource = R.drawable.ic_vegetables_24;
        } else if (categories[position].equals("Gateaux, Confiseries")){
            imgRessource = R.drawable.ic_candy_24;
        } else if (categories[position].equals("Produits laitiers")){
            imgRessource = R.drawable.ic_milk_24;
        } else if (categories[position].equals("Viande, Charcuterie")){
            imgRessource = R.drawable.ic_meat_24;
        } else if (categories[position].equals("Huiles, Graisses, Sauces")){
            imgRessource = R.drawable.ic_sauce_24;
        } else if (categories[position].equals("Plats préparés")){
            imgRessource = R.drawable.ic_burger_24;
        } else if (categories[position].equals("Tous les Produits")){
            imgRessource = R.drawable.ic_all_24;
        }
        holder.getButton().setCompoundDrawablesWithIntrinsicBounds(0, imgRessource,0,0);
    }

    @Override
    public int getItemCount() {
        return categories.length;
    }

    /*
    ***********VIEW HOLDER***********
     */

    public static class KalCategoryViewHolder extends RecyclerView.ViewHolder {

        private final Button categoryButton;

        public KalCategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryButton = (Button) itemView.findViewById(R.id.button_category_kal);
        }

        public Button getButton(){
            return categoryButton;
        }
    }
}
