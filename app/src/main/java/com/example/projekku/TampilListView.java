package com.example.projekku;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TampilListView extends AppCompatActivity {

    BantuDatabase bd;
    ListView listView;
    EditText editText;
    Button tbltambah;
    ArrayList <String> lisviewku;


    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_list_view);

        listView    = findViewById(R.id.list_buah);
        editText    = findViewById(R.id.data_buah);
        tbltambah   = findViewById(R.id.tambah);
        bd=new BantuDatabase(this);
        lisviewku= new ArrayList<>();
        tampilkan_buah();
        lisviewku = new ArrayList<>();

        tbltambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bd.tambahData(editText.getText().toString());
                Toast.makeText(TampilListView.this, "Data Tersimpan", Toast.LENGTH_SHORT).show();
                lisviewku.clear();
                tampilkan_buah();
            }
        });

    }

    private void tampilkan_buah()
    {
        Cursor cursor= bd.tampilBuah();
        if (cursor.getCount()== 0)
        {
            Toast.makeText(this, "Record Kosong", Toast.LENGTH_SHORT).show();
        }
        else
        {
            while(cursor.moveToNext())
            {
                lisviewku.add(String.valueOf( cursor.getInt( 0))+""+cursor.getString(1));
            }
            adapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,lisviewku);
            listView.setAdapter(adapter);
        }
    }

}