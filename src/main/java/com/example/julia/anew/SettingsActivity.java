package com.example.julia.anew;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Julia on 16.03.2018.
 */

public class SettingsActivity extends Activity implements OnClickListener {

    EditText fam, nam, snam, namcomp, desc, adds, phone, email;
    Button save;

    SharedPreferences sPref;
    final String SAVED_TEXT = "saved_text";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        fam = (EditText) findViewById(R.id.fam);
        nam = (EditText) findViewById(R.id.nam);
        snam = (EditText) findViewById(R.id.snam);
        namcomp = (EditText) findViewById(R.id.namcomp);
        desc = (EditText) findViewById(R.id.desc);
        adds = (EditText) findViewById(R.id.adds);
        phone = (EditText) findViewById(R.id.phone);
        email = (EditText) findViewById(R.id.email);

        save = (Button) findViewById(R.id.save);
        save.setOnClickListener(this);

        loadText();

    }

    void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, email.getText().toString());

    }
    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this, OrgPrActivity.class);
        intent.putExtra("fam", fam.getText().toString());
        intent.putExtra("nam", nam.getText().toString());
        intent.putExtra("snam", snam.getText().toString());
        intent.putExtra("namcomp", namcomp.getText().toString());
        intent.putExtra("desc", desc.getText().toString());
        intent.putExtra("adds", adds.getText().toString());
        intent.putExtra("phone", phone.getText().toString());
        intent.putExtra("email", email.getText().toString());
        startActivity(intent);

        switch (view.getId()) {
            case R.id.save:
                saveText();
                break;
            default:
                break;
        }
    }
    void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        fam.setText(savedText);
        nam.setText(savedText);
        snam.setText(savedText);
        namcomp.setText(savedText);
        desc.setText(savedText);
        adds.setText(savedText);
        phone.setText(savedText);
        email.setText(savedText);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveText();
    }


}




