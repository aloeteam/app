package com.example.julia.anew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Julia on 28.02.2018.
 */

public class RegLayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reg_lay);
    }
    public void ok (View v) {
        Intent intObj = new Intent(this, MainActivity.class);
        startActivity(intObj);
    }
}
