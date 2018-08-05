package com.example.nina.ct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView email, passwrd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        email=(TextView)findViewById(R.id.myEmail);
        passwrd=(TextView)findViewById(R.id.myPass);

        Intent intent=getIntent();
        String myEmail=intent.getStringExtra("email");
        String myPassword=intent.getStringExtra("password");

        email.setText(myEmail);
        passwrd.setText(myPassword);

    }
}