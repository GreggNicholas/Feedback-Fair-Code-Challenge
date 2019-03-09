package com.example.codechallengefragmentsapi.View;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.codechallengefragmentsapi.DetailedScreen;
import com.example.codechallengefragmentsapi.Model.UserNameResponse;
import com.example.codechallengefragmentsapi.R;

public class UserViewHolder extends RecyclerView.ViewHolder {
    public static final String PHONE = "params1";
    public static final String EMAIl = "param2";
    public static final String ADDRESS = "params3";
    private TextView displayFullName;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        displayFullName = itemView.findViewById(R.id.fullname_textview_userlist);
    }

    public void onBind(final UserNameResponse userNameResponse) {
        displayFullName.setText(userNameResponse.getName());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(v.getContext(), DetailedScreen.class);
                i.putExtra(PHONE, userNameResponse.getPhone());
                i.putExtra(EMAIl, userNameResponse.getEmail());
                i.putExtra(ADDRESS, userNameResponse.getAddress().getGeo());
                v.getContext().startActivity(i);

            }
        });

    }
}
