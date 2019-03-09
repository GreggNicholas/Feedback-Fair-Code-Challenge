package com.example.codechallengefragmentsapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.codechallengefragmentsapi.Fragment.UserListFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        UserListFragment userListFragment = new UserListFragment().getinstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_main, userListFragment)
                .addToBackStack("main")
                .commit();
    }


}
