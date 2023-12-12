package com.myapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailMovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        // Ambil data Movie dari Intent
        Movie movie = getIntent().getParcelableExtra("MOVIE_DATA");

        // Tampilkan data Movie di layout detail
        ImageView imgPhoto = findViewById(R.id.detail_imagecover);
        TextView textTitle = findViewById(R.id.detail_texttitle);
        TextView textDescription = findViewById(R.id.detail_textdescription);

        Glide.with(this)
                .load(movie.getPhoto())
                .into(imgPhoto);
        textTitle.setText(movie.getTitle());
        textDescription.setText(movie.getDeskripsi());
    }
}
