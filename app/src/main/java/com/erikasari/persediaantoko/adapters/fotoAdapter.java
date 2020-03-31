package com.erikasari.persediaantoko.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.erikasari.persediaantoko.R;
import com.erikasari.persediaantoko.models.foto;
import com.squareup.picasso.Picasso;

import java.util.List;

public class fotoAdapter extends RecyclerView.Adapter<fotoAdapter.ViewHolder> {

    private Context context;
    private List<foto> items;

    public fotoAdapter(Context context, List<foto> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_foto, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        foto item = items.get(position);
        //ATUR IMAGE DIBARIS INI, DAPAT MENGGUNAKAN PICASSO ATAU GLIDE
        Picasso.get().load(item.getFoto()).into(holder.logoImage);
        holder.nameText.setText(item.getDeskripsi());

    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView nameText;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
        }
    }
}
