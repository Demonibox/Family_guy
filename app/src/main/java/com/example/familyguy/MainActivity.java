package com.example.familyguy;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void erasePeter(View view) {
        ImageView peterImageView = findViewById(R.id.peterimageView);
        peterImageView.animate().alpha(0).setDuration(3000);

        ImageView loisImageView = findViewById(R.id.loisimageView);
        loisImageView.animate().alpha(1).setDuration(3000);
    }


    }