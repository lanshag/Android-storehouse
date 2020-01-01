package com.example.login.Work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.login.R;

public class MyAdviceActivity extends AppCompatActivity {

    private ImageView maBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_advice);

        maBack=findViewById(R.id.my_advice_left);
        maBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyAdviceActivity.this,WorkActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
