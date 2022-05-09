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

public class RegimePopupAdapter extends RecyclerView.Adapter<RegimePopupAdapter.RegimePopupViewHolder> {

    String regimeName;
    ArrayList<String> titres = new ArrayList<>();
    ArrayList<String> contenus = new ArrayList<>();

    public RegimePopupAdapter (String regime, ArrayList<String> titre, ArrayList<String> contenu){
        regimeName = regime;
        titres = titre;
        contenus = contenu;
    }


    @NonNull
    @Override
    public RegimePopupAdapter.RegimePopupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_popup_regime, parent, false);
        return new RegimePopupViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RegimePopupAdapter.RegimePopupViewHolder holder, int position) {

        holder.getTitleRegime().setText(titres.get(position));
        holder.getContentRegime().setText(contenus.get(position));


        if (titres.get(position).equals("Public Concerné")){
            holder.getLayoutRegime().setBackgroundResource(R.color.lightblue1);
        }else if (titres.get(position).equals("Bases du Régime")){
            holder.getLayoutRegime().setBackgroundResource(R.color.lightorange1);
        }else if (titres.get(position).equals("Autorisés à Chaque Repas à l'Hopital")){
            holder.getLayoutRegime().setBackgroundResource(R.color.green1);
        }else if (titres.get(position).equals("Interdits")){
            holder.getLayoutRegime().setBackgroundResource(R.color.red1);
        }else if (titres.get(position).equals("Collation")){
            holder.getLayoutRegime().setBackgroundResource(R.color.yellow1);
        }else if (titres.get(position).equals("Informations Diverses")){
            holder.getLayoutRegime().setBackgroundResource(R.color.turquoisehard1);
        }
    }

    @Override
    public int getItemCount() {
        return titres.size();
    }

    public class RegimePopupViewHolder extends RecyclerView.ViewHolder {

        private final TextView titleRegime;
        private final TextView contentRegime;
        private final ConstraintLayout layoutRegime;

        public RegimePopupViewHolder(@NonNull View itemView) {
            super(itemView);

            titleRegime = (TextView) itemView.findViewById(R.id.title_regime_popup);
            contentRegime = (TextView) itemView.findViewById(R.id.content_regime_popup);
            layoutRegime = (ConstraintLayout) itemView.findViewById(R.id.regime_layout);
        }

        public TextView getTitleRegime() {
            return titleRegime;
        }

        public TextView getContentRegime() {
            return contentRegime;
        }

        public ConstraintLayout getLayoutRegime() {
            return layoutRegime;
        }
    }
}
