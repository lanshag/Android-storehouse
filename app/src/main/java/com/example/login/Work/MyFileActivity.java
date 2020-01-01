package com.example.login.Work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;

import com.example.login.R;

public class MyFileActivity extends AppCompatActivity {

    private ImageView mfBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_file);

        mfBack = findViewById(R.id.my_file_left);
        mfBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyFileActivity.this,WorkActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
