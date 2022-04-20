package fr.shiroe.dietinfo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import fr.shiroe.dietinfo.KalActivity;
import fr.shiroe.dietinfo.R;
import fr.shiroe.dietinfo.models.KalModel;

public class KalAdapter extends RecyclerView.Adapter<KalAdapter.ViewHolder> {

    public Spinner spinnerKal;
    public EditText editKal;

    private List<KalModel> kalList;

    public KalAdapter(List<KalModel> kalModelList){
        kalList = kalModelList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            spinnerKal = itemView.findViewById(R.id.spinner_kal);
            editKal = itemView.findViewById(R.id.et_kal);
        }
    }


    @NonNull
    @Override
    public KalAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View kalView = inflater.inflate(R.layout.kal_add_layout, parent, false);

        return new ViewHolder(kalView);
    }

    @Override
    public void onBindViewHolder(@NonNull KalAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return kalList.size();
    }
}
