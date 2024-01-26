package com.cscorner.myapp;

import static com.cscorner.myapp.MainActivity.imgUri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Toast.makeText(this,imgUri.toString(), Toast.LENGTH_SHORT).show();
    }
}