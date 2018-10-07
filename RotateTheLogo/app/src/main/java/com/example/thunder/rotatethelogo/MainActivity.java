package com.example.thunder.rotatethelogo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void halfRotation(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.animate().rotation(180f).setDuration(2000);
    }

    public void fullRotation(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.animate().rotation(360f).setDuration(2000);
    }

    public void infRotation(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.animate().rotation(36000f).setDuration(5000);
    }
}
