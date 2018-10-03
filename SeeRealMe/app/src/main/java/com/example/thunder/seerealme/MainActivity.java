package com.example.thunder.seerealme;

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


    public void changeImg(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        switch (view.getId()){
            case R.id.button:
                imageView.setImageResource(R.drawable.boy);
                break;

            case R.id.button2:
                imageView.setImageResource(R.drawable.tie);
        }

    }
}
