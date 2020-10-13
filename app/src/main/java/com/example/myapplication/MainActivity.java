package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if ( savedInstanceState == null ){
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, FragmentOne.newInstance())
                    .commit();
        }
    }
}
