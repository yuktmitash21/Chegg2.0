package com.example.chegg20.Views;

import android.arch.lifecycle.ViewModel;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.arch.lifecycle.ViewModelProviders;
import android.widget.Toast;

import com.example.chegg20.R;
import com.example.chegg20.ViewModels.UserViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
