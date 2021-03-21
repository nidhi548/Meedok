package com.example.meedok.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.meedok.activities.databinding.ActivityProductDescriptionBinding;

public class ProductDescriptionActivity extends Activity {

    private TextView mTextView;
    private ActivityProductDescriptionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityProductDescriptionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
}