package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText city;
    private EditText password;
    private EditText email;
    private TextView info;
    private Button signUp;
    private int counter=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        city = (EditText) findViewById(R.id.city);
        password = (EditText) findViewById(R.id.password);
        email = (EditText) findViewById(R.id.email);
        info = (TextView) findViewById(R.id.info);
        signUp = (Button) findViewById(R.id.signUp);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(username.getText().toString(),password.getText().toString());
            }
        });
    }

    private void validate(String username,String pass){
        if(username.equals("admin") && pass.equals("1234"))
        {
            Intent temp=new Intent(MainActivity.this , Login.class);
            temp.putExtra("usernamevalue",this.username.getText().toString());
            temp.putExtra("passwordvalue",this.password.getText().toString());
            temp.putExtra("cityvalue",this.city.getText().toString());
            startActivity(temp);
        }
        else
        {
            counter--;
            info.setText("invalid...!!! "+String.valueOf(counter)+"try remaining");
            if(counter==0)
            {
                signUp.setEnabled(false);
            }
        }
    }
}
