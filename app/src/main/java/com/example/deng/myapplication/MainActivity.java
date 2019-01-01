package com.example.deng.myapplication;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intUi();
        Button myButton=(Button) findViewById(R.id.btn);
        chenge(myButton);
    }
    public void chenge(Button myButton){
        myButton.setText("Play/Stop");
    }
    public void intUi(){
        final MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.shui);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying())
                    mediaPlayer.pause();
                else
                    mediaPlayer.start();
            }
        });
    }
}
