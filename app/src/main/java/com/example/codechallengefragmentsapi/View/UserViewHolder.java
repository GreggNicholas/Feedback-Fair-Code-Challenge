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
    private TextView displayFullName;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        displayFullName = itemView.findViewById(R.id.fullname_textview_userlist);
    }

    public  void onBind(final UserNameResponse userNameResponse) {
        displayFullName.setText(userNameResponse.getName());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DetailedScreen.class);


            }
        });

    }
}
