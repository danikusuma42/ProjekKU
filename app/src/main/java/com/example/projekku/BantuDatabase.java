package com.example.projekku;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BantuDatabase extends SQLiteOpenHelper {


    private static final String Database_Buah = "db_buah";
    private static final String kode = "kode";
    private static final String nama_buah = "nm_buah";
    private static final String tabel_buah = "tabel_buah";

    public BantuDatabase(@Nullable Context context) {
        super(context, Database_Buah, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String nama_tabel = "create table "+ tabel_buah+ "(" + kode + " integer primary key autoincrement," + nama_buah + "  text)";
        db.execSQL(nama_tabel);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public  boolean tambahData (String namabuah)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(nama_buah, namabuah);
        long hasil = db.insert(tabel_buah,null, contentValues);

        return hasil != -1;
    }
     public Cursor tampilBuah()
     {
         SQLiteDatabase db = this.getWritableDatabase();
         String sql = "select * from "+ tabel_buah;
         Cursor cursor = db.rawQuery(sql,null);

         return cursor;
     }
}
