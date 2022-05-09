package fr.shiroe.dietinfo.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import fr.shiroe.dietinfo.PopupTextureActivity;
import fr.shiroe.dietinfo.R;


public class TextureAdapter extends RecyclerView.Adapter<TextureAdapter.TextureViewHolder> {

    Context ct;
    ArrayList<String> textures;

    public TextureAdapter(ArrayList<String> list, Context context){
        textures = list;
        ct = context;
    }

    @NonNull
    @Override
    public TextureAdapter.TextureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_texture, parent, false);
        return new TextureViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull TextureAdapter.TextureViewHolder holder, int position) {

        holder.getTitleTexture().setText(textures.get(position));

        holder.getTitleTexture().setOnClickListener(v -> {
            String texturename = textures.get(position);
            startTexturePopup(texturename);
        });

        switch (textures.get(position)) {
            case "Texture Normale":
                holder.getTitleTexture().setBackgroundResource(R.color.blue1);
                break;
            case "Texture Facile à Macher":
                holder.getTitleTexture().setBackgroundResource(R.color.green1);
                break;
            case "Texture Facile à Macher VPO Mixte":
                holder.getTitleTexture().setBackgroundResource(R.color.darkgreen1);
                break;
            case "Texture Mixée":
                holder.getTitleTexture().setBackgroundResource(R.color.orange1);
                break;
            case "Texture Hachée (Centre Long Séjour)":
                holder.getTitleTexture().setBackgroundResource(R.color.pink1);
                break;
            case "Complet (Salé / Sucré)":
                holder.getTitleTexture().setBackgroundResource(R.color.purple1);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return textures.size();
    }

    //ViewHolder

    public static class TextureViewHolder extends RecyclerView.ViewHolder {

        private final TextView titleTexture;

        public TextureViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTexture = (TextView) itemView.findViewById(R.id.title_item_texture);
        }

        public TextView getTitleTexture() {
            return titleTexture;
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    public void filterList(ArrayList<String> regimesChanged){
        this.textures = regimesChanged;
        notifyDataSetChanged();
    }
    public void startTexturePopup(String data){
        Intent myIntent = new Intent(ct, PopupTextureActivity.class);
        myIntent.putExtra("TEXTURE_NAME", data);
        ct.startActivity(myIntent);
    }
}
