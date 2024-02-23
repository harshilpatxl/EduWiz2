package com.example.logn;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class mainpage2 extends AppCompatActivity {

    private TextView countdownTimer;
    private CountDownTimer timer;

    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage2);

        countdownTimer = findViewById(R.id.countdown_timer);

        mButton = findViewById(R.id.start);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
            }
        });
    }

    private void startTimer() {
        MediaPlayer mysong = MediaPlayer.create (mainpage2.this,R.raw.audio); // please add your alarm tone mp3 file
        mysong.start ();

        timer = new CountDownTimer(600000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                long hours = (millisUntilFinished / 1000) / 3600;
                long minutes = ((millisUntilFinished / 1000) % 3600) / 60;
                long seconds = (millisUntilFinished / 1000) % 60;
                String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d:%02d", hours, minutes, seconds);
                countdownTimer.setText(timeLeftFormatted);
            }

            @Override
            public void onFinish() {
                countdownTimer.setText("00:00:00");
                Toast.makeText(mainpage2.this, "Time's up", Toast.LENGTH_SHORT).show();
                mysong.stop();
            }
        }.start();

    }
}
