package com.example.android.materialme;

import android.content.Intent;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.android.materialme.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageView imageView = findViewById(R.id.sportsImageDetail);
        TextView titleTextView = findViewById(R.id.titleDetail);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("title")) {
            String title = intent.getStringExtra("title");
            titleTextView.setText(title);
        }

        if (intent != null && intent.hasExtra("image_resource")) {
            int imageResource = intent.getIntExtra("image_resource", 0);
            Glide.with(this).load(imageResource).into(imageView);
        }

    }
}