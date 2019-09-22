package com.example.shop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonStoreroom(View view) {

    }

    public void buttonGoods(View view) {
        startActivity(new Intent(this, GoodsActivity.class));
    }

    public void buttonEmkanat(View view) {
        startActivity(new Intent(this , Emkanat.class));
    }
}