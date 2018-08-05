package com.example.nina.ct;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BDHelper extends SQLiteOpenHelper {

    public static final String TABLE_NAME = "players";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_SCORE = "score";
    public static final String DATABASE_NAME = "player.db";
    public static final int DATABASE_VERSION = 1;

    //sql
    private static final String DATABASE_CRETAE = "create table " + TABLE_NAME
            + "(" + COLUMN_ID + " integer primary key autoincrement, "
            + COLUMN_NAME + " text not null, "
            + COLUMN_SCORE + " integer not null);";

    Context context;
    public BDHelper(Context context){ super(context, DATABASE_NAME, null ,DATABASE_VERSION);}
    @Override
    public void onCreate(SQLiteDatabase db){ db.execSQL(DATABASE_CRETAE);}
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);
    }
}