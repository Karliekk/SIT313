package com.example.nina.ct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splashscreen extends AppCompatActivity {
    /*
   The splash screen is the activity of fist appeared, it will show the welcome screen for a while
   stop then it will show the Second Activity automatically.
   The code below is to enable the splash screen also transit to Second Activity.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Thread th = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000);

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Splashscreen.this, ValidateActivity.class);
                    startActivity(intent);
                }
            }
        };
        th.start();


    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}
