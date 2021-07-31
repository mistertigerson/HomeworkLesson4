package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.first_frame,new FirstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.second_frame, new SecondFragment()).commit();

//        button.setOnClickListener(v -> {
//            getSupportFragmentManager().beginTransaction().replace(R.id.second_frame, new SecondFragment()).commit();
//        });
    }
}