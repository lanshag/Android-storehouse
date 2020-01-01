package com.example.login.Work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.login.R;

public class WorkRecordActivity extends AppCompatActivity {

    private ImageView wrBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_record);

        wrBack=findViewById(R.id.work_record_left);
        wrBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WorkRecordActivity.this,WorkActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
