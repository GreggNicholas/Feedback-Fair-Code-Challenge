package com.example.codechallengefragmentsapi.Controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.codechallengefragmentsapi.Model.UserNameResponse;
import com.example.codechallengefragmentsapi.R;
import com.example.codechallengefragmentsapi.View.UserViewHolder;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private List<UserNameResponse> userNameList;

    public UserAdapter(List<UserNameResponse> userNameList) {
        this.userNameList = userNameList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_list_view, viewGroup, false);

        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder userViewHolder, int position) {
        userViewHolder.onBind(userNameList.get(position));
    }

    @Override
    public int getItemCount() {
        return userNameList.size();
    }
}
