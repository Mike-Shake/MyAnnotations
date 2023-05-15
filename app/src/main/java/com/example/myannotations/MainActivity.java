package com.example.myannotations;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.annstations.BindView;
import com.example.annstations.GET;

public class MainActivity extends AppCompatActivity {

    @BindView(value = R.id.tv_text)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}