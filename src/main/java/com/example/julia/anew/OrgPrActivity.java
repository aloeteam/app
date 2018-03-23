package com.example.julia.anew;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Julia on 13.03.2018.
 */

public class OrgPrActivity extends AppCompatActivity {

    TextView n, nc, o, a, p, e;
    private FloatingActionButton FAB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.org_pr);

        n = (TextView) findViewById(R.id.n);
        nc = (TextView) findViewById(R.id.nc);
        o = (TextView) findViewById(R.id.o);
        a = (TextView) findViewById(R.id.a);
        p = (TextView) findViewById(R.id.p);
        e = (TextView) findViewById(R.id.e);

        Intent intent = getIntent();

        String fam = intent.getStringExtra("fam");
        String nam = intent.getStringExtra("nam");
        String snam = intent.getStringExtra("snam");
        String namcomp = intent.getStringExtra("namcomp");
        String desc = intent.getStringExtra("desc");
        String adds = intent.getStringExtra("adds");
        String phone = intent.getStringExtra("phone");
        String email = intent.getStringExtra("email");

        n.setText(" " + fam + " " + nam + " " + snam);
        nc.setText(" " + namcomp);
        o.setText("" + desc);
        a.setText(" " + adds);
        p.setText(" " + phone);
        e.setText(" " + email);

        FAB = (FloatingActionButton) findViewById(R.id.FAB);
        FAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrgPrActivity.this, SettingsActivity.class));
            }
        });


    }

}
