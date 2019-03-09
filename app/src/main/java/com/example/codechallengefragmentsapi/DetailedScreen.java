package com.example.codechallengefragmentsapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailedScreen extends AppCompatActivity {
    private TextView displayPhoneNumber;
    private TextView displayEmailAddy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_screen);
        displayPhoneNumber = findViewById(R.id.phonenumber_detailedscreen);
        displayEmailAddy = findViewById(R.id.email_detailedscreen);

    }

}
