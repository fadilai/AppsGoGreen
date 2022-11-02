package com.example.appsgogreen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewTumbuhanAdapter extends RecyclerView.Adapter<CardViewTumbuhanAdapter.CardViewHolder> {
    private ArrayList<Tumbuhan> listTumbuhan;
    private OnItemClickCallback onItemClickCallback;
    public CardViewTumbuhanAdapter(ArrayList<Tumbuhan>list) {
        this.listTumbuhan = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_tumbuhan, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Tumbuhan tumbuhan = listTumbuhan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(tumbuhan.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvNama.setText(tumbuhan.getNama());
        holder.tvDetail.setText(tumbuhan.getDetail());
        holder.btnBaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listTumbuhan.get(holder.getAdapterPosition()));
                Toast.makeText(holder.itemView.getContext(), listTumbuhan.get(holder.getAdapterPosition()).getNama(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listTumbuhan.get(holder.getAdapterPosition()));
                Toast.makeText(holder.itemView.getContext(), listTumbuhan.get(holder.getAdapterPosition()).getNama(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listTumbuhan.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvDetail;
        Button btnBaca;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.iv_item_photo);
            tvNama = itemView.findViewById(R.id.tvTitle);
            tvDetail = itemView.findViewById(R.id.tvDesc);
            btnBaca = itemView.findViewById(R.id.btnBaca);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Tumbuhan tumbuhan);
    }
}
