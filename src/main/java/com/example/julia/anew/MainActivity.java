package com.example.julia.anew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void org (View v) {
        Intent intObj = new Intent(this, OrgActivity.class);
        startActivity(intObj);
    }
    public void vol (View v) {
        Intent intObj = new Intent(this, VolActivity.class);
        startActivity(intObj);
    }
}

