package com.example.irfan.fragment;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addFragment(R.id.frame_a,new FragmentA());
        addFragment(R.id.frame_b,new FragmentB());
    }


    private void addFragment(@IdRes int container, Fragment fragment) {
        getSupportFragmentManager().beginTransaction().add(container, fragment).commit();
    }
}
