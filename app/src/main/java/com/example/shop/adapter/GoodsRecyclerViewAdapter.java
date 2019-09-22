package com.example.shop.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.shop.R;
import com.example.shop.model.Goods;
import com.example.shop.model.Moshtary;

import java.util.List;

public class GoodsRecyclerViewAdapter extends RecyclerView.Adapter<GoodsRecyclerViewAdapter.ViewHolder> {

    private List<Moshtary> moshtaries;

    public GoodsRecyclerViewAdapter(List<Moshtary> moshtaries) {
        this.moshtaries = moshtaries;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.goods_item , viewGroup , false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.name.setText(moshtaries.get(i).getName());
        viewHolder.number.setText(String.valueOf(moshtaries.get(i).getName()));
        viewHolder.price.setText(String.valueOf(moshtaries.get(i).getCode()));
    }

    @Override
    public int getItemCount() {
        return moshtaries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView number;
        TextView price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            number = itemView.findViewById(R.id.number);
            price = itemView.findViewById(R.id.price);
        }
    }
}
