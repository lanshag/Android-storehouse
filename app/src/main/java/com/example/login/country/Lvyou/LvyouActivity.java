package com.example.login.country.Lvyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.login.R;
import com.example.login.country.Lvyou.Lvyou_1.Lvyou_1Activity;
import com.example.login.country.Xuanchuan.XuanchuanActivity;
import com.example.login.country.Xuanchuan.Xuanchuan_1.Xuanchuan_1Activity;

public class LvyouActivity extends AppCompatActivity {
    private RelativeLayout mRL_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvyou);
        mRL_1 = findViewById(R.id.rea_1);
        mRL_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LvyouActivity.this, Lvyou_1Activity.class);
                startActivity(intent);
            }
        });
    }
}
