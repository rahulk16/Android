package com.example.thunder.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

//    public void clickFunction(View view){
//        Log.i("Info", "Button Pressed!");
//    }


    public void buttonFunction(View view1){

        EditText editText = (EditText) findViewById(R.id.editText2);
        Log.i("Info",editText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
