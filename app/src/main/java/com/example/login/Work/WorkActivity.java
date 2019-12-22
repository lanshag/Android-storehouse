package com.example.login.Work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.login.MainActivity;
import com.example.login.R;

public class WorkActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView back;
    private ImageView next1,next2,next3,next4,next5;

    private Button mBtnWork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);
        initView();
    }

    private void initView(){
        back=findViewById(R.id.work_left);
        next1=findViewById(R.id.work_next1);
        next2=findViewById(R.id.work_next2);
        next3=findViewById(R.id.work_next3);
        next4=findViewById(R.id.work_next4);
        next5=findViewById(R.id.work_next5);

        back.setOnClickListener(this);
        next1.setOnClickListener(this);
        next2.setOnClickListener(this);
        next3.setOnClickListener(this);
        next4.setOnClickListener(this);
        next5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.work_left:
                Intent intent1=new Intent(this, MainActivity.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.work_next1:
                Intent intent2=new Intent(this,WorkRecordActivity.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.work_next2:
                Intent intent3=new Intent(this,MyAdviceActivity.class);
                startActivity(intent3);
                finish();
                break;
            case R.id.work_next3:
                Intent intent4=new Intent(this,MemorandumActivity.class);
                startActivity(intent4);
                finish();
                break;
            case R.id.work_next4:
                Intent intent5=new Intent(this,CunQingActivity.class);
                startActivity(intent5);
                finish();
                break;
            case R.id.work_next5:
                Intent intent6=new Intent(this,MyFileActivity.class);
                startActivity(intent6);
                finish();
        }
    }
}
