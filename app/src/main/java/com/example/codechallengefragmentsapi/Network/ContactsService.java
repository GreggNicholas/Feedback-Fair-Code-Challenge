package com.example.codechallengefragmentsapi.Network;

import com.example.codechallengefragmentsapi.Model.UserNameResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ContactsService {

    String END_POINT = "users";


    @GET(END_POINT)
    Call<List<UserNameResponse>> getUserList();

}
