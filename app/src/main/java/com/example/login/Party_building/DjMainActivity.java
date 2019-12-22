package com.example.login.Party_building;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login.MainActivity;
import com.example.login.R;
import com.example.login.Work.CunQingActivity;
import com.example.login.Work.MemorandumActivity;
import com.example.login.Work.MyAdviceActivity;
import com.example.login.Work.MyFileActivity;
import com.example.login.Work.WorkRecordActivity;

public class DjMainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button back;
    private Button next1,next2,next3,next4,next5;

    private Button mBtnWork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);
        initView();
    }

    private void initView(){
        back=findViewById(R.id.DJ_manage_back);
        next1=findViewById(R.id.btn_djmanage_1);
        next2=findViewById(R.id.btn_djmanage_2);
        next3=findViewById(R.id.btn_djmanage_3);
        next4=findViewById(R.id.btn_djmanage_4);
        next5=findViewById(R.id.btn_djmanage_5);

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
                Intent intent2=new Intent(this, WorkRecordActivity.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.work_next2:
                Intent intent3=new Intent(this, MyAdviceActivity.class);
                startActivity(intent3);
                finish();
                break;
            case R.id.work_next3:
                Intent intent4=new Intent(this, MemorandumActivity.class);
                startActivity(intent4);
                finish();
                break;
            case R.id.work_next4:
                Intent intent5=new Intent(this, CunQingActivity.class);
                startActivity(intent5);
                finish();
                break;
            case R.id.work_next5:
                Intent intent6=new Intent(this, MyFileActivity.class);
                startActivity(intent6);
                finish();
        }
    }
}

