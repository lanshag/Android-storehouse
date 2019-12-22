package com.example.login.projectmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.login.R;
import com.example.login.projectmanger.FirstBulid.FirstBulidActivity;
import com.example.login.projectmanger.FourBulid.FourBulidActivity;
import com.example.login.projectmanger.MainBulid.MainBulidActivity;

public class ProjectMangerActivity extends AppCompatActivity {

    private RelativeLayout mRL_1,mRl_2,mRl_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_manger);
        mRL_1 = findViewById(R.id.rea_1);
        mRL_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProjectMangerActivity.this, MainBulidActivity.class);
                startActivity(intent);
            }
        });

        mRl_2 = findViewById(R.id.rea_2);
        mRl_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProjectMangerActivity.this, FirstBulidActivity.class);
                startActivity(intent);
            }
        });

        mRl_3 = findViewById(R.id.rea_3);
        mRl_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ProjectMangerActivity.this, FourBulidActivity.class);
                startActivity(intent);
            }
        });
    }
}
