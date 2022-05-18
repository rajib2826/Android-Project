package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addData(View view) {
        Intent intent = new Intent(getApplicationContext(), AddData.class);
        startActivity(intent);
    }

    public void viewData(View view) {
        Intent intent = new Intent(getApplicationContext(), ShowData.class);
        startActivity(intent);
    }
}