package com.example.fxprocessorapp;

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

    public void updateOverdrive(View view) {
        Intent odIntent = new Intent(this, OverdriveActivity.class);
        startActivity(odIntent);
    }

    public void updateEQ(View view) {
        Intent eqIntent = new Intent(this, EQActivity.class);
        startActivity(eqIntent);
    }

    public void updateDelay(View view) {
        Intent delayIntent = new Intent(this, DelayActivity.class);
        startActivity(delayIntent);
    }

    public void updateFuzz(View view) {
        Intent fuzzIntent = new Intent(this, FuzzActivity.class);
        startActivity(fuzzIntent);
    }
}
