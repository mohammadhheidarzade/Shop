package com.example.shop.model;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "goods")
public class Goods {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo
    private String name;

    @ColumnInfo
    private long number;

    @ColumnInfo
    private long price;

    public Goods(String name, long number, long price) {
        this.name = name;
        this.number = number;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
