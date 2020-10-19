package com.example.projekku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dashboard);
    }

    public void Sepeda(View view)
    {
        Intent intent =new Intent(MenuDashboard.this,ActivitySepeda.class);
        startActivity(intent);
    }

    public void kalkulator(View view)
    {
        Intent intent = new Intent(MenuDashboard.this,Kalkulator.class);
                startActivity(intent);
    }

    public void pesawat(View view) {
        Intent intent = new Intent(MenuDashboard.this,ActivityPesawat.class);
        startActivity(intent);
    }

    public void restaurant(View view) {
        Intent intent = new Intent(MenuDashboard.this,ActivityRestaurant.class);
        startActivity(intent);

    }


    public void mic(View view) {
        Intent intent = new Intent(MenuDashboard.this,ActivityMic.class);
        startActivity(intent);
    }

    public void telpon(View view) {
        Intent intent = new Intent(MenuDashboard.this,ActivityTelpon.class);
        startActivity(intent);
    }
}