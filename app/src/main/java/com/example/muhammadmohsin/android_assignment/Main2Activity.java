package com.example.muhammadmohsin.android_assignment;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv = (TextView) findViewById(R.id.display);

        SharedPreferences sp = getSharedPreferences("Info", Context.MODE_PRIVATE);
        String name = sp.getString("username","");

        tv.setText("Welcome "+ name);


    }
}
