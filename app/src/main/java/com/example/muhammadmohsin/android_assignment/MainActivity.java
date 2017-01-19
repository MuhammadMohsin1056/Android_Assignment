package com.example.muhammadmohsin.android_assignment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uname,pass;
    Button login,saveS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = (EditText) findViewById(R.id.editText);
        pass  = (EditText) findViewById(R.id.editText2);
        login   = (Button) findViewById(R.id.login);
        saveS = (Button) findViewById(R.id.ss);

        saveS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sp = getSharedPreferences("Info", Context.MODE_PRIVATE);

                SharedPreferences.Editor editor = sp.edit();

                editor.putString("username",uname.getText().toString());
                editor.putString("password",pass.getText().toString());
                editor.apply();

                Toast.makeText(getApplicationContext(),"SAVING SESSION",Toast.LENGTH_LONG).show();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(uname.getText().toString().equals("mohsin") && pass.getText().toString().equals("1056"))
                {
                    Intent i = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"THE USER NAME/PASWRD IS INCORRECT",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
