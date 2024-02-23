package com.example.logn;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class mainpage1 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage1);

        Button VideoButton1 = findViewById(R.id.v1);
        Button VideoButton2 = findViewById(R.id.v2);
        Button VideoButton3 = findViewById(R.id.v3);


        VideoButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mainpage1.this, VideoActivity1.class);
                startActivity(intent);
            }
        });

        VideoButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mainpage1.this, VideoActivity2.class);
                startActivity(intent);
            }
        });

        VideoButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mainpage1.this, VideoActivity3.class);
                startActivity(intent);
            }
        });



    }

}
