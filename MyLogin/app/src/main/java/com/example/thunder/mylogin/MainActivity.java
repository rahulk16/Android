package com.example.thunder.mylogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void submitFun(View view){



        EditText username = (EditText) findViewById(R.id.username) ;
        //EditText password = (EditText) findViewById(R.id.password) ;

       // Log.i("Username",username.getText().toString());
        //Log.i("Password", password.getText().toString()) ;

        Toast.makeText(this, "Welcome!  "+username.getText().toString(), Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
