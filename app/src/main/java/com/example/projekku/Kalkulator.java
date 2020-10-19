package com.example.projekku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {
    EditText ang1,ang2;
    TextView hasilnya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        ang1=(EditText) findViewById(R.id.angka1);
        ang2=(EditText) findViewById(R.id.angka2);
        hasilnya=(TextView) findViewById(R.id.hasil);

    }



    public void tambah(View view) {
        int a1 = Integer.parseInt(ang1.getText().toString());
        int a2 = Integer.parseInt(ang2.getText().toString());
        Integer hasil = a1+a2;
        hasilnya.setText(hasil.toString());
    }

    public void kurang(View view) {
        int a1 = Integer.parseInt(ang1.getText().toString());
        int a2 = Integer.parseInt(ang2.getText().toString());
        Integer hasil = a1-a2;
        hasilnya.setText(hasil.toString());
    }

    public void kali(View view) {
        int a1 = Integer.parseInt(ang1.getText().toString());
        int a2 = Integer.parseInt(ang2.getText().toString());
        Integer hasil = a1*a2;
        hasilnya.setText(hasil.toString());
    }

    public void bagi(View view) {
        double a1 = Double.parseDouble(ang1.getText().toString());
        double a2 = Double.parseDouble(ang2.getText().toString());
        Double hasil = a1/a2;
        hasilnya.setText(hasil.toString());
    }

    public void clear(View view) {
        hasilnya.setText("");
        ang1.setText("");
        ang2.setText("");

    }
}