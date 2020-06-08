package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button Signin;
    private TextView city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        city = (TextView) findViewById(R.id.cityformsignup);
        Signin = (Button) findViewById(R.id.signIn);
        Intent temp=getIntent();
        city.setText(temp.getStringExtra("cityvalue"));

    }
}
