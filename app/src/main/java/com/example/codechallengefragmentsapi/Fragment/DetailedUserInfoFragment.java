package com.example.codechallengefragmentsapi.Fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.codechallengefragmentsapi.R;
import com.example.codechallengefragmentsapi.View.UserViewHolder;


public class DetailedUserInfoFragment extends Fragment {

    private static final String EMAIL_KEY = "Params1";
    private static final String PHONE_KEY = "Params2";
    private static final String ADDRESS_KEY = "Params3";
    private TextView displayPhoneNumber;
    private TextView displayEmailAddy;
    private TextView displayStreetAddress;
    private String phone;
    private String email;
    private String address;


    public DetailedUserInfoFragment getinstance(String email, String phone, String address) {
        DetailedUserInfoFragment detailedUserInfoFragment = new DetailedUserInfoFragment();
        Bundle args = new Bundle();
        args.getString(EMAIL_KEY, email);
        args.getString(PHONE_KEY, phone);
        args.getString(ADDRESS_KEY, address);
        detailedUserInfoFragment.setArguments(args);
        return detailedUserInfoFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detailed_user_info, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        displayPhoneNumber = view.findViewById(R.id.phonenumber_detailedscreen);
        displayEmailAddy = view.findViewById(R.id.email_detailedscreen);
        displayStreetAddress = view.findViewById(R.id.streetaddress_detailedScreen);


        displayEmailAddy.setText(email);
        displayPhoneNumber.setText(phone);
        displayStreetAddress.setText(address);


        displayPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse(phone));
                v.getContext().startActivity(i);
            }
        });


    }
}
