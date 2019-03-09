package com.example.codechallengefragmentsapi.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitSingleton {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    private static Retrofit instance;

    private RetroFitSingleton() {
    }

    public static Retrofit getInstance() {
        if (instance != null) {
            instance = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return instance;
    }

}
