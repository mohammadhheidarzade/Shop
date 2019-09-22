package com.example.shop;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.shop.database.AppDatabase;
import com.example.shop.model.Goods;
import com.example.shop.model.Moshtary;

public class MoshtaryActivity extends AppCompatActivity {

    TextInputEditText name, code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moshtary);
        init();
    }

    private void init() {
        name = findViewById(R.id.txt_name_moshtary);
        code = findViewById(R.id.txt_code_moshtary);
    }

    public void codeMoshtary(View view) {
        final AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "production")
                .allowMainThreadQueries()
                .build();
        if (code.getText().toString().equals("") || name.getText().toString().equals(""))
            return;

        Moshtary moshtary = new Moshtary(name.getText().toString(),
                code.getText().toString());

        db.moshtaryDao().insertAll(moshtary);
        startActivity(new Intent(this, MainActivity.class));
    }
}
