package com.sata.izonovel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class DaftarNovelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_novel);

        Intent Intent = getIntent();
        String id = Intent.getStringExtra( "id");
        String judul = Intent.getStringExtra( "judul")
        setTitle("Detail Novel - "+judul);

        Log.d("INFO-id",id );
        Log.d( "INFO-judul",judul );
    }
}