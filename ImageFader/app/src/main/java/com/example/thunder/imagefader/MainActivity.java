package com.example.thunder.imagefader;

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


    public void fadeImg(View view){
        ImageView hm = (ImageView) findViewById(R.id.imageView2);
        ImageView hmn = (ImageView) findViewById(R.id.imageView3);
        hm.animate().alpha(0f).setDuration(2000);
        hmn.animate().alpha(1f).setDuration(2000);

    }

//    public void appearImg(View view){
//        ImageView hmn = (ImageView) findViewById(R.id.imageView3);
//        hmn.animate().alpha(1f).setDuration(2000);
//    }
}
