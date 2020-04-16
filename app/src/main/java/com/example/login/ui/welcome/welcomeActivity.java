package com.example.login.ui.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.login.MainActivity;
import com.example.login.R;

public class welcomeActivity extends AppCompatActivity {

    private  Button btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        btnback = findViewById(R.id.back11);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(welcomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
