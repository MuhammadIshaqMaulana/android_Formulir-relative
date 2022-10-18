package com.if3b.formulirrelattive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity
{
    private TextView tvnpm, tvnama, tvjk, tvprodi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvnpm = findViewById(R.id.tv_npm);
        tvnama = findViewById(R.id.tv_nama);
        tvjk = findViewById(R.id.tv_jk);
        tvprodi = findViewById(R.id.tv_prodi);

        //tangkap intent dari main MainActivity
        Intent intent = getIntent();
        tvnpm.setText(intent.getStringExtra("VarNPM"));
        tvnama.setText(intent.getStringExtra("VarNama"));
        tvjk.setText(intent.getStringExtra("VarJK"));
        tvprodi.setText(intent.getStringExtra("VarProdi"));


    }
}