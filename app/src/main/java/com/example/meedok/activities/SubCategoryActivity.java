package com.example.meedok.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.meedok.activities.databinding.ActivitySubCategoryBinding;

public class SubCategoryActivity extends Activity {

    private TextView mTextView;
    private ActivitySubCategoryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySubCategoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
}