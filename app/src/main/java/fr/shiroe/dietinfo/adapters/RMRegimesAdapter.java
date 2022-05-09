package fr.shiroe.dietinfo.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import fr.shiroe.dietinfo.PopupRegimeActivity;
import fr.shiroe.dietinfo.R;

public class RMRegimesAdapter extends RecyclerView.Adapter<RMRegimesAdapter.RMRegimesViewHolder> {

    Context ct;
    ArrayList<String> regimes;

    public RMRegimesAdapter(ArrayList<String> regs, Context context){
        regimes = regs;
        ct = context;
    }

    @NonNull
    @Override
    public RMRegimesAdapter.RMRegimesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        int[] rainbow = ct.getResources().getIntArray(R.array.rainbow);

        int random = (int)(Math.random()*rainbow.length);

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rm, parent, false);
        view.setBackgroundColor(rainbow[random]);
        return new RMRegimesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RMRegimesAdapter.RMRegimesViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.getTitleRegime().setText(regimes.get(position));

        holder.getTitleRegime().setOnClickListener(v -> {
            String regimeName = regimes.get(position);
            startRegimePopup(regimeName);
        });
    }

    @Override
    public int getItemCount() {
        return regimes.size();
    }

    //ViewHolder

    public static class RMRegimesViewHolder extends RecyclerView.ViewHolder {

        private final TextView titleRegime;

        public RMRegimesViewHolder(@NonNull View itemView) {
            super(itemView);

            titleRegime = (TextView) itemView.findViewById(R.id.title_item_rm);
        }

        public TextView getTitleRegime() {
            return titleRegime;
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    public void filterList(ArrayList<String> regimesChanged){
        this.regimes = regimesChanged;
        notifyDataSetChanged();
    }
    public void startRegimePopup(String data){
        Intent myIntent = new Intent(ct, PopupRegimeActivity.class);
        myIntent.putExtra("REGIME_NAME", data);
        ct.startActivity(myIntent);
    }
}
