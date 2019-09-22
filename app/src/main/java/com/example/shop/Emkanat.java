package com.example.shop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Emkanat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emkanat);
    }


    public void btnKalaInformation(View view) {
       startActivity(new Intent(this , StoreRoom.class));
    }

    public void btnMoshtaryInformation(View view) {
        startActivity(new Intent(this , MoshtaryActivity.class));
    }
}
