package com.erikasari.persediaantoko.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.erikasari.persediaantoko.MainActivity;
import com.erikasari.persediaantoko.R;
import com.erikasari.persediaantoko.models.Transaction;

import java.util.List;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.ViewHolder> {

    private List<Transaction> items;
    private OnItemTransactionListener listener;
    private Context context;

    public static final int KOSONG = 1;
    public static final int TERSEDIA = 2;

    public TransactionAdapter(List<Transaction> items, OnItemTransactionListener listener) {
        this.items = items;
        this.listener = listener;
    }

    @NonNull
    @Override
    public TransactionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_transaction, parent, false);
//        return new ViewHolder(view);

        View view = null;
        if (viewType == KOSONG){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_transaction, parent, false);
        } else if (viewType == TERSEDIA ){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_transaction_, parent, false);
        }
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Transaction item = items.get(position);
        holder.bind(position, item);

    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView descriptionText;
        TextView amountText;
        TextView stockText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            descriptionText = itemView.findViewById(R.id.text_description);
            amountText = itemView.findViewById(R.id.text_amount);
            stockText = itemView.findViewById(R.id.text_stok);
        }
        public void bind(final int index, final Transaction item){
            descriptionText.setText(item.getDescription());
            amountText.setText(MainActivity.generateRupiah(item.getAmount()));
            stockText.setText(item.getStock());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onTransactionClicked(index, item);
                }
            });
        }
    }

    public interface OnItemTransactionListener {
        void onTransactionClicked(int index, Transaction item);
    }

    @Override
    public int getItemViewType(int position){
        return (items.get(position).getType()==Transaction.Type.KOSONG) ? TERSEDIA : KOSONG;
    }

}
