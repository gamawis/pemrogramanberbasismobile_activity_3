package com.kuliahmobile.latihan3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonData = findViewById(R.id.btnData);
        buttonData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnData){
            Pertanian dataPertanian1 = new Pertanian();
            dataPertanian1.setKota("Sejahtera");
            dataPertanian1.setKecamatan("Sentosa");
            dataPertanian1.setLuasLahan(2000);
            dataPertanian1.setHasilPanen(1000);
            dataPertanian1.setPemilik("Budi");

            Intent intentPertanian = new Intent(MainActivity.this,newActivity.class);
            intentPertanian.putExtra(newActivity.EXTRA_PERTANIAN,dataPertanian1);
            startActivity(intentPertanian);
        }

    }
}
