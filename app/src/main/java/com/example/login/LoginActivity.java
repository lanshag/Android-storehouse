package com.example.login;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.example.login.UserService.User;
import com.example.login.UserService.UserLab;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    //声明了读取用户名和密码的参数
    private EditText mEtLoginactivityUsername;
    private EditText mEtLoginactivityPassword;
    private TextView register;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView() {
        login=findViewById(R.id.login_button);
        register=findViewById(R.id.register);
        mEtLoginactivityUsername=findViewById(R.id.name);
        mEtLoginactivityPassword=findViewById(R.id.password);
        login.setOnClickListener(this);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.register:
                startActivity(new Intent(this, RegisterActivity.class));
                finish();
                break;
            case R.id.login_button:
                //从EditText的对象上获取文本编辑框输入的数据，并把左右两边的空格去掉
                String account = mEtLoginactivityUsername.getText().toString().trim();
                String password = mEtLoginactivityPassword.getText().toString().trim();
                User user = UserLab.get(this,account,password).getUser();
                if(user == null){
                    Toast.makeText(this,"登录失败",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);
                    finish();//销毁此Activity
                }
                break;
        }

    }



    /*
    **得到字节输入流，将字节输入流转化为String类型
    * private void printInputStream(InputStream is){
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuffer sb = new StringBuffer();
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String rs = sb.toString();
        Log.e("登陆信息",rs);
    }

     */

}
