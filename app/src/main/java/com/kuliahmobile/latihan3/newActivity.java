package com.kuliahmobile.latihan3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class newActivity extends AppCompatActivity {
    public static final String EXTRA_PERTANIAN="extra_pertanian";
    TextView textData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Pertanian dataPertanian = getIntent().getParcelableExtra(EXTRA_PERTANIAN);
        String tampilkanText = "Kota: "+dataPertanian.getKota()+"\nKecamatan: "+dataPertanian.getKecamatan()+"\nLuas Lahan: "+dataPertanian.getLuasLahan();
        textData = findViewById(R.id.txtData);
        textData.setText(tampilkanText);
    }
}
