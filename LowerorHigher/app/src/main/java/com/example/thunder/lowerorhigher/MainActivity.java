package com.example.thunder.lowerorhigher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int value;
    public void messagePrint(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        value = rand.nextInt(20)+1;
    }

    public void lowerHigher(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        if(editText.getText().toString() == null || editText.getText().toString().equals("")){
            messagePrint("Type something.");
        }
        int num = Integer.parseInt(editText.getText().toString());

        if(num < value){
            messagePrint("Go Higher.");
        }
        else if(num > value){
            messagePrint("Go Lower.");
        }
        else{
            messagePrint("Congrats!!!\nPlay Again.");
            Random rand = new Random();
            value = rand.nextInt(20)+1;
        }
    }

}
