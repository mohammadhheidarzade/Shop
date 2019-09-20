package com.example.shop;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;

public class StoreRoom extends AppCompatActivity {

    TextInputEditText name, number, price;

    TextView totalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_room);
        init();
        setToatalPirce();
    }

    private void setToatalPirce() {
        number.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (number.getText().toString().equals("") ||
                        price.getText().toString().equals(""))
                    return;
                long num = Long.valueOf(number.getText().toString());
                long pri = Long.valueOf(price.getText().toString());
                totalPrice.setText(String.valueOf(num * pri));
            }
        });
        price.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (number.getText().toString().equals("") ||
                        price.getText().toString().equals(""))
                    return;
                long num = Long.valueOf(number.getText().toString());
                long pri = Long.valueOf(price.getText().toString());
                totalPrice.setText(String.valueOf(num * pri));
            }
        });
    }

    private void init() {
        name = findViewById(R.id.txt_name);
        number = findViewById(R.id.txt_number);
        price = findViewById(R.id.txt_price);
        totalPrice = findViewById(R.id.txt_view_total_price);
    }


}
