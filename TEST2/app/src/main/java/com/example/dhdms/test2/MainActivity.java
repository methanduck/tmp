package com.example.dhdms.test2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements View.OnClickListener{

   EditText input_Name,input_Age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button confirm = findViewById(R.id.Btn_confirm);
        input_Age = findViewById(R.id.Txt_age);
        input_Name = findViewById(R.id.Txt_name);
        confirm.setOnClickListener(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1)
        {
            if(resultCode == RESULT_OK)
            {
                Toast.makeText(this,"이름은"+data.getExtras().getString("name").toString()+"이고 나이는"+data.getExtras().getString("age")+"입니다.",Toast.LENGTH_LONG).show();

            }
        }
    }

    @Override
    public void onClick(View v) {
        Intent secondAct = new Intent(this,SecondActivity.class);
        secondAct.putExtra("name",input_Name.getText().toString());
        secondAct.putExtra("age",input_Age.getText().toString());
        startActivityForResult(secondAct,1);
    }

}
