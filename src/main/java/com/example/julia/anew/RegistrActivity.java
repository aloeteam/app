package com.example.julia.anew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Julia on 28.02.2018.
 */

public class RegistrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registr);
    }
    public void regis (View v) {
        Intent intObj = new Intent(this, RegLayActivity.class);
        startActivity(intObj);
    }
    public void auth (View v) {
        Intent intObj = new Intent(this, AuthActivity.class);
        startActivity(intObj);
    }

}