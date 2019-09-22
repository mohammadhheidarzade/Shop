package com.example.shop;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.shop.database.AppDatabase;
import com.example.shop.model.Goods;
import com.example.shop.model.Unit;

public class StoreRoom extends AppCompatActivity {

    TextInputEditText name, price;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_room);
        init();
    }


    private void init() {
        name = findViewById(R.id.txt_name);
        price = findViewById(R.id.txt_price);
    }

    String unit = "";

    public void buttonRecord(View view) {
        final AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "production")
                .allowMainThreadQueries()
                .build();
        if (unit.equals("") || name.getText().toString().equals("") || price.getText().toString().equals(""))
            return;
        Goods goods = new Goods(name.getText().toString(),
                unit,
                Long.valueOf(price.getText().toString()));
        db.goodsDao().insertAll(goods);
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.unit, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.tedad:
                unit = "تعداد";
                return true;
            case R.id.baste:
                unit = "بسته";
                return true;
            case R.id.kilo:
                unit = "کیلو";
                return true;
            case R.id.karton:
                unit = "کارتون";
                return true;
            case R.id.tory :
                unit = "توری";
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
