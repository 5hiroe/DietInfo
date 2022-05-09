package fr.shiroe.dietinfo.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import fr.shiroe.dietinfo.R;

public class TexturePopupAdapter extends RecyclerView.Adapter<TexturePopupAdapter.TexturePopupViewHolder> {

    String textureName;
    ArrayList<String> bases = new ArrayList<>();
    ArrayList<String> contenus = new ArrayList<>();

    public TexturePopupAdapter(String texture, ArrayList<String> base, ArrayList<String> contenu){
        textureName = texture;
        bases = base;
        contenus = contenu;
    }

    @NonNull
    @Override
    public TexturePopupAdapter.TexturePopupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_popup_texture, parent, false);
        return new TexturePopupViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TexturePopupAdapter.TexturePopupViewHolder holder, int position) {

        holder.getTitleTexture().setText(bases.get(position));
        holder.getContentTexture().setText(contenus.get(position));

        switch (bases.get(position)){
            case "Bases":
                holder.getLayoutTexture().setBackgroundResource(R.color.lightblue1);
                break;
            case "Interdits":
                holder.getLayoutTexture().setBackgroundResource(R.color.red1);
        }

    }

    @Override
    public int getItemCount() {
        return bases.size();
    }

    public static class TexturePopupViewHolder extends RecyclerView.ViewHolder {

        private final TextView titleTexture;
        private final TextView contentTexture;
        private final ConstraintLayout layoutTexture;

        public TexturePopupViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTexture = (TextView) itemView.findViewById(R.id.title_texture_popup);
            contentTexture = (TextView) itemView.findViewById(R.id.content_texture_popup);
            layoutTexture = (ConstraintLayout) itemView.findViewById(R.id.texture_layout);
        }

        public TextView getTitleTexture() {
            return titleTexture;
        }

        public TextView getContentTexture() {
            return contentTexture;
        }

        public ConstraintLayout getLayoutTexture() {
            return layoutTexture;
        }
    }
}
