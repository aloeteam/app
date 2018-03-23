package com.example.julia.anew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Julia on 09.03.2018.
 */

public class VolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volonteer);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.vol_menu, menu);
        return true;
    }


    public void prv (MenuItem menu) {
        Intent intObj = new Intent(this, VolPrActivity.class);
        startActivity(intObj);
    }

    public void nastrv (MenuItem menu) {
        Intent intObj = new Intent(this, SettingsActivity.class);
        startActivity(intObj);
    }








}
