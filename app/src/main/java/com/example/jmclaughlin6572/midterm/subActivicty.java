package com.example.jmclaughlin6572.midterm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class subActivicty extends AppCompatActivity implements fragmentEditText.OnFragmentInteractionListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_activicty);



    }

    @Override
    public void onFragmentInteraction(String name, String comment) {

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("comment", comment);
        Toast.makeText(getApplicationContext(), name + " says " + comment, Toast.LENGTH_LONG).show();
        startActivity(intent);
    }


}
