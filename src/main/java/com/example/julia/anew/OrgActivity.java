package com.example.julia.anew;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class OrgActivity extends AppCompatActivity {

    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.organiz);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrgActivity.this, AddActivity.class));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.org_menu, menu);
        return true;
    }


    public void orgpr (MenuItem menu) {
        Intent intObj = new Intent(this, OrgPrActivity.class);
        startActivity(intObj);
    }

    public void nas (MenuItem menu) {
        Intent intObj = new Intent(this, SettingsActivity.class);
        startActivity(intObj);
    }
}



