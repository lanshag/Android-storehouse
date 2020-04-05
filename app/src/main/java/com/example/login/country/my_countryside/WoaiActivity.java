package com.example.login.country.my_countryside;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.login.R;
import com.example.login.country.my_countryside.Woai_1.Woai_1Activity;

public class WoaiActivity extends AppCompatActivity {
    private RelativeLayout mRL_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woai);
        mRL_1 = findViewById(R.id.rea_1);
        mRL_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WoaiActivity.this, Woai_1Activity.class);
                startActivity(intent);
            }
        });
    }
}
