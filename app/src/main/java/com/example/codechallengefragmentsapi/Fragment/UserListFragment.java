package com.example.codechallengefragmentsapi.Fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.codechallengefragmentsapi.Controller.UserAdapter;
import com.example.codechallengefragmentsapi.Model.UserNameResponse;
import com.example.codechallengefragmentsapi.Network.ContactsService;
import com.example.codechallengefragmentsapi.Network.RetroFitSingleton;
import com.example.codechallengefragmentsapi.R;

import java.util.LinkedList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class UserListFragment extends Fragment {

    private final String TAG = "UserListFrag";

    public UserListFragment getInstance() {
        return new UserListFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final RecyclerView recyclerView = view.findViewById(R.id.recyclerview_frag);
        Retrofit retrofit = RetroFitSingleton.getInstance();
        ContactsService contactsService = retrofit.create(ContactsService.class);
        Call<List<UserNameResponse>> getUserNames = contactsService.getUserList();
        getUserNames.enqueue(new Callback<List<UserNameResponse>>() {
            @Override
            public void onResponse(Call<List<UserNameResponse>> call, Response<List<UserNameResponse>> response) {
                List<UserNameResponse> userNameResponseList = new LinkedList<>();
                userNameResponseList.addAll(response.body());
                Log.d(TAG, "onResponse: " + response.body().get(0).getName());
                recyclerView.setAdapter(new UserAdapter(userNameResponseList));
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            }

            @Override
            public void onFailure(Call<List<UserNameResponse>> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
            }
        });
    }
}
