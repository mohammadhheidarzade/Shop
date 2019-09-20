package com.example.shop;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.shop.adapter.GoodsRecyclerViewAdapter;
import com.example.shop.database.AppDatabase;
import com.example.shop.model.Goods;

import java.util.List;

public class GoodsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods);
        init();

        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "production")
                .allowMainThreadQueries()
                .build();

        List<Goods> goods = db.goodsDao().getAllUsers();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new GoodsRecyclerViewAdapter(goods);
        recyclerView.setAdapter(adapter);
    }

    private void init() {
        recyclerView = findViewById(R.id.recyclerView);
    }
}
