package com.example.shop.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.shop.model.Goods;

import java.util.List;

@Dao
public interface MoshtaryDao {

    @Query("SELECT * FROM moshtary")
    List<Goods> getAllMoshtary();

    @Insert
    void insertAll(Goods... moshtary);

}
