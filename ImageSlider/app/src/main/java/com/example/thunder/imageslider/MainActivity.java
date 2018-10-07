package com.example.thunder.imageslider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setTranslationX(-3000f);
    }

    public void translateImg(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.animate().translationXBy(3000f).setDuration(2000);
    }
}
