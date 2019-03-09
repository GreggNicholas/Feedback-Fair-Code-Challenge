package com.example.codechallengefragmentsapi.Controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.codechallengefragmentsapi.View.UserViewHolder;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder userViewHolder, int position) {
UserViewHolder.onBind();
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
