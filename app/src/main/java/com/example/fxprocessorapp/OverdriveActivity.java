package com.example.fxprocessorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

public class OverdriveActivity extends AppCompatActivity {
    public static final String TAG = "OverdriveActivity";

    static public float blend = 1.0f;
    static public float volume = 1.0f;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overdrive);

        Log.d(TAG, "onCreate: blend: " + blend);
        
        SeekBar blendSlider = findViewById(R.id.blendSlider);
        SeekBar volSlider = findViewById(R.id.volSlider);

        blendSlider.setProgress((int)(blend * 1000));
        ((TextView)findViewById(R.id.blendVal)).setText((blend) + "\n");

        volSlider.setProgress((int)(volume * 1000));
        ((TextView)findViewById(R.id.volVal)).setText((volume) + "\n");

        blendSlider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(progress > 0) {
                    blend = (float) progress / 1000.0f;
                }
                else {
                    blend = progress;
                }

                ((TextView)findViewById(R.id.blendVal)).setText((blend) + "\n");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                ((TextView)findViewById(R.id.blendVal)).setText((blend) + "\n");
            }
        });

        volSlider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(progress > 0) {
                    volume = (float) progress / 1000.0f;
                }
                else {
                    volume = progress;
                }

                ((TextView)findViewById(R.id.volVal)).setText((volume) + "\n");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                ((TextView)findViewById(R.id.volVal)).setText((volume) + "\n");
            }
        });
    }
}
