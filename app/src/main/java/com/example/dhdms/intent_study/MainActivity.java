package com.example.dhdms.intent_study;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button call,internet,sms,google;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        call = findViewById(R.id.btn_call);
        internet = findViewById(R.id.btn_internet);
        sms = findViewById(R.id.btn_sms);
        google = findViewById(R.id.btn_google);
        call.setOnClickListener(this);
        internet.setOnClickListener(this);
        sms.setOnClickListener(this);
        google.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

    }
}
