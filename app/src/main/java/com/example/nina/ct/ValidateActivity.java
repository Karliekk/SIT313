package com.example.nina.ct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ValidateActivity extends AppCompatActivity {

    private EditText emailET, passwrdET;
    private Button submit;
    private  boolean isValid=false;
    private String myEmail="";
    private String myPassword="";

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate);
        emailET=(EditText)findViewById(R.id.email);
        passwrdET=(EditText)findViewById(R.id.password);
        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEmail=emailET.getText().toString().trim();
                myPassword=passwrdET.getText().toString().trim();
                emailValidation(myEmail);

                if (isValid==false)
                {
                    Toast.makeText(ValidateActivity.this, "Please enter valid email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (myPassword.matches(""))
                {
                    Toast.makeText(ValidateActivity.this, "Please enter password", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent=new Intent(ValidateActivity.this, MenuActivity.class);

                startActivity(intent);
            }
        });

    }

    private boolean emailValidation(String email)
    {
        String emailPatteren="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


        if (email.matches(emailPatteren)&&email.length()>0)
        {
            isValid=true;
        }
        else {
            isValid=false;
        }
        return isValid;
    }


}