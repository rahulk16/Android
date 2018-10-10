package com.example.thunder.allaboutanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView3);
        imageView.setTranslationX(-1500f);
        imageView.setTranslationY(-1500f);
    }

    public void allAnimations(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageView3);
        imageView.animate()
                .translationXBy(1400f)
                .translationYBy(1400f)
                .rotationBy(3600)
                .setDuration(3000);
    }



}
