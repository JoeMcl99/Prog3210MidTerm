package com.example.jmclaughlin6572.midterm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.w3c.dom.Comment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{


    private static ArrayList<String> listOfNames = new ArrayList<String>();
    private static ListView listViewOfNames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewOfNames = (ListView)findViewById(R.id.lstNames);

        String name = getIntent().getStringExtra("name");
        String comment = getIntent().getStringExtra("comment");
        String listString = name + " says, " + comment;

        if (name != null || comment != null){
            listOfNames.add(listString);

            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listOfNames);

            listViewOfNames.setAdapter(arrayAdapter);
        }

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

