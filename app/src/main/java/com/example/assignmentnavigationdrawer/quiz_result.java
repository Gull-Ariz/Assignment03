package com.example.assignmentnavigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class quiz_result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);
        TextView textView = findViewById(R.id.textview2);
        Intent intent = getIntent();
        String score = intent.getStringExtra("score");
        textView.setText(score);
    }
}