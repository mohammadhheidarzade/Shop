package com.example.shop.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.shop.model.Goods;
import com.example.shop.model.Moshtary;

@Database(entities = {Goods.class , Moshtary.class} ,version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract GoodsDao goodsDao();
    public abstract MoshtaryDao moshtaryDao();
}