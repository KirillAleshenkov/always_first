package com.example.xakatoh;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(@Nullable Context context) {
        super(context, DB.DATABASE_NAME, null, DB.DATABASE_VERSION);}
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DB.CREATE_TABLE);}
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {db.execSQL(DB.DELETE_TABLE);}}
