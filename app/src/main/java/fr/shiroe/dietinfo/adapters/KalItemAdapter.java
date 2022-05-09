package fr.shiroe.dietinfo.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import fr.shiroe.dietinfo.R;

public class KalItemAdapter extends RecyclerView.Adapter<KalItemAdapter.KalItemViewHolder> {

    @NonNull
    @Override
    public KalItemAdapter.KalItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull KalItemAdapter.KalItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    //ViewHolder

    public static class KalItemViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageItem;
        private final TextView titleItem;

        public KalItemViewHolder(@NonNull View itemView) {
            super(itemView);

            imageItem = (ImageView) itemView.findViewById(R.id.img_kal_item);
            titleItem = (TextView) itemView.findViewById(R.id.title_kal_item);
        }

        public ImageView getImageItem() {
            return imageItem;
        }

        public TextView getTitleItem() {
            return titleItem;
        }
    }
}
