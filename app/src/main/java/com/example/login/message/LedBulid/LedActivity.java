package com.example.login.message.LedBulid;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.login.R;


import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;






public class LedActivity extends AppCompatActivity {
    private Button mbtnLed;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_led);
        mbtnLed=findViewById(R.id.Ledtn_1);
        mbtnLed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LedActivity.this,"发送成功！！！", Toast.LENGTH_SHORT).show();
            }
        });



    }

}






