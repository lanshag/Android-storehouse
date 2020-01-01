package com.example.login.Work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.login.R;

public class CunQingActivity extends AppCompatActivity {

    private ImageView cqivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cun_qing);

        cqivBack =findViewById(R.id.cun_qing_left);
        cqivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CunQingActivity.this,WorkActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
