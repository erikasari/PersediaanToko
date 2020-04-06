package com.erikasari.persediaantoko.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.erikasari.persediaantoko.R;
import com.erikasari.persediaantoko.models.data;


import java.util.List;

public class dataAdapter  extends RecyclerView.Adapter<dataAdapter.ViewHolder> {
    private Context context;
    private List<data> items;

    public dataAdapter(Context context, List<data> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_transaction, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dataAdapter.ViewHolder holder, int position) {
        data item = items.get(position);
        //ATUR IMAGE DIBARIS INI, DAPAT MENGGUNAKAN PICASSO ATAU GLIDE
        holder.deskripsiText.setText(item.getDeskripsi());
        holder.stokText.setText(item.getStok());
        holder.hargaText.setText(item.getHarga());

    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView deskripsiText;
        TextView stokText;
        TextView hargaText;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            deskripsiText =itemView.findViewById(R.id.text_description);
            stokText =itemView.findViewById(R.id.text_stok);
           hargaText =itemView.findViewById(R.id.text_amount);
        }
    }
}
