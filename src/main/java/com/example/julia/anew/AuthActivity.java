package com.example.julia.anew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Julia on 28.02.2018.
 */

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.author);
    }
    public void okk (View v) {
        Intent intObj = new Intent(this, MainActivity.class);
        startActivity(intObj);
    }
}
