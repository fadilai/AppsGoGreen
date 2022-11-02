package com.example.appsgogreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private ImageView imgPhoto;
    private TextView tvNama, tvDesc;

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imgPhoto = findViewById(R.id.iv_item_photo);
        tvNama = findViewById(R.id.tvTitle);
        tvDesc = findViewById(R.id.tvDesc);



        Tumbuhan tumbuhan = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (tumbuhan != null) {
            Glide.with(this)
                    .load(tumbuhan.getPhoto())
                    .into(imgPhoto);
            tvNama.setText(tumbuhan.getNama());
            tvDesc.setText(tumbuhan.getDetail());

        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Penjelasan");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}