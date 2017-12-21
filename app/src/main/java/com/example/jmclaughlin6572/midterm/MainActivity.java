package com.example.jmclaughlin6572.midterm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoSubActivicty(View view) {
        Toast.makeText(getApplicationContext(), "Jordan McLaughlin", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, subActivicty.class);
        startActivity(intent);
    }

    public void implicitIntent(View view) {
        Intent intent = new Intent();
        intent.setAction(intent.ACTION_SEND);
        intent.setType("text/plain");


        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}

