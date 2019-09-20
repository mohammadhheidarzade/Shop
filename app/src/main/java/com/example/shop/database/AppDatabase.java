package com.example.shop.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.shop.model.Goods;

@Database(entities = {Goods.class} ,version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract GoodsDao goodsDao();
}