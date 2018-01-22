package com.example.aaron.sos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class infoPage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);

        final TextView info = (TextView) findViewById(R.id.info);
        final TextView phone = (TextView) findViewById(R.id.phone);
        final TextView address = (TextView) findViewById(R.id.address);

    }
}
