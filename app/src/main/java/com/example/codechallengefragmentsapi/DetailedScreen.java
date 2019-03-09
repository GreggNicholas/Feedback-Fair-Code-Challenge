package com.example.codechallengefragmentsapi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.codechallengefragmentsapi.View.UserViewHolder;

public class DetailedScreen extends AppCompatActivity {
    private TextView displayPhoneNumber;
    private TextView displayEmailAddy;
    private TextView displayGeoLocation;
    private String phoneClickListener;
    private String emailClickListener;
    private String addressClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_screen);
        displayPhoneNumber = findViewById(R.id.phonenumber_detailedscreen);
        displayEmailAddy = findViewById(R.id.email_detailedscreen);

        emailClickListener = getIntent().getStringExtra(UserViewHolder.EMAIl);
        phoneClickListener = getIntent().getStringExtra(UserViewHolder.PHONE);
        addressClickListener = getIntent().getStringExtra(UserViewHolder.ADDRESS);

        displayEmailAddy.setText(emailClickListener);
        displayPhoneNumber.setText(phoneClickListener);
        displayGeoLocation.setText(addressClickListener);

        displayPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse(phoneClickListener));
                v.getContext().startActivity(i);
            }
        });
    }

}
