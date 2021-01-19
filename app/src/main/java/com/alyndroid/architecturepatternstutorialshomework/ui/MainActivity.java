package com.alyndroid.architecturepatternstutorialshomework.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.alyndroid.architecturepatternstutorialshomework.R;
import com.alyndroid.architecturepatternstutorialshomework.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    NumberViewModel numberViewModel;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        numberViewModel = ViewModelProviders.of(this).get(NumberViewModel.class);
        binding.setViewModel(numberViewModel);
        binding.setLifecycleOwner(this);
    }
}
