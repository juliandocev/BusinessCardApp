package com.example.businesscardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.businesscardapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.layoutCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(binding.logo.getVisibility() == View.VISIBLE) {

                    binding.logo.setVisibility(View.GONE);
                    binding.businessDescription.setVisibility(View.VISIBLE);
                }else {
                    binding.logo.setVisibility(View.VISIBLE);
                    binding.businessDescription.setVisibility(View.GONE);
                }
            }
        });



    }
}