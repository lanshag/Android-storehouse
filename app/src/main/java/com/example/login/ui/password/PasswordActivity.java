package com.example.login.ui.password;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.login.R;

public class PasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiugai);
    }
    public void showToast(View view){
        Toast.makeText(this,"修改成功",Toast.LENGTH_SHORT).show();

    }
}
