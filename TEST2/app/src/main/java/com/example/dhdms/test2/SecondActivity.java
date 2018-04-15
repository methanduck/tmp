package com.example.dhdms.test2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    EditText input_name,input_age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent input = getIntent();
        Toast.makeText(this,"이름은"+input.getExtras().getString("name").toString()+"이고 나이는"+input.getExtras().getString("age").toString()+"입니다.",Toast.LENGTH_LONG).show();

        Button rtn = findViewById(R.id.Btn_return);
        input_age = findViewById(R.id.Txt_age);
        input_name = findViewById(R.id.Txt_name);
        rtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent output = new Intent(this,MainActivity.class);
        output.putExtra("name",input_name.getText().toString());
        output.putExtra("age",input_age.getText().toString());
        setResult(Activity.RESULT_OK, output);
        finish();
    }
}
