package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewStructure;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.login.UserService.User;
import com.example.login.UserService.UserLab;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private String realCode;
    private CheckBox mCheckBox;
    private EditText mphoneNumET;
    private EditText mEtRegisteractivityPassword1;
    private Button mBtRegisteractivityRegister;
    private ImageView mIvRegisteractivityBack;
    private EditText mEtRegisteractivityUsername;
    private EditText mEtRegisteractivityPassword2;
    private EditText mEtRegisteractivityPhonecodes;
    private ImageView mIvRegisteractivityShowcode;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();


        //将验证码用图片的形式显示出来
        mIvRegisteractivityShowcode.setImageBitmap(Code.getInstance().createBitmap());
        realCode = Code.getInstance().getCode().toLowerCase();
    }

    private void initView() {
        mBtRegisteractivityRegister = findViewById(R.id.true_register);
        mIvRegisteractivityBack = findViewById(R.id.iv_registeractivity_back);
        mEtRegisteractivityUsername = findViewById(R.id.et_registeractivity_username);
        mEtRegisteractivityPassword1 =findViewById(R.id.et_registeractivity_password1);
        mEtRegisteractivityPassword2 = findViewById(R.id.et_registeractivity_password2);
        mEtRegisteractivityPhonecodes = findViewById(R.id.et_registeractivity_phoneCodes);
        mIvRegisteractivityShowcode = findViewById(R.id.iv_registeractivity_showCode);
        mCheckBox = findViewById(R.id.frag_register_protocol_cb);
        mphoneNumET = findViewById(R.id.et_registeractivity_phonenumber);
        mTextView = findViewById(R.id.frag_register_tip_tv);


        /**
         * 注册页面能点击的就三个地方
         * top处返回箭头、刷新验证码图片、注册按钮
         */
        mIvRegisteractivityBack.setOnClickListener(this);
        mIvRegisteractivityShowcode.setOnClickListener(this);
        mBtRegisteractivityRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_registeractivity_back: //返回登录页面
                Intent intent1 = new Intent(this, LoginActivity.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.iv_registeractivity_showCode:    //改变随机验证码的生成
                mIvRegisteractivityShowcode.setImageBitmap(Code.getInstance().createBitmap());
                realCode = Code.getInstance().getCode().toLowerCase();
                break;
            case R.id.true_register:    //注册按钮
                //获取用户输入的用户名、手机号、密码、验证码
                String username = mEtRegisteractivityUsername.getText().toString().trim();
                String phoneNum = mphoneNumET.getText().toString().trim();
                String password = mEtRegisteractivityPassword1.getText().toString().trim();
                String confirmpassword = mEtRegisteractivityPassword2.getText().toString().trim();
                String phoneCode = mEtRegisteractivityPhonecodes.getText().toString().toLowerCase();
                boolean isAgree = mCheckBox.isChecked();
                if (username.equals("")){
                    mTextView.setVisibility(View.VISIBLE);
                    mTextView.setText(getString(R.string.s_activity_main_register_input_nickname));
                    return;
                }else if (phoneNum.equals("")){
                    mTextView.setVisibility(View.VISIBLE);
                    mTextView.setText(getString(R.string.s_activity_main_register_input_phone_num));
                    return;
                }else if (password.equals("")){
                    mTextView.setVisibility(View.VISIBLE);
                    mTextView.setText(getString(R.string.s_activity_main_register_input_password));
                    return;
                }else if (confirmpassword.equals("")){
                    mTextView.setVisibility(View.VISIBLE);
                    mTextView.setText(getString(R.string.s_activity_main_register_input_confirm_password));
                    return;
                }else if(phoneCode.equals("")){
                    mTextView.setVisibility(View.VISIBLE);
                    mTextView.setText(getString(R.string.s_activity_main_register_input_code));
                    return;
                } if (!isAgree){
                    mTextView.setVisibility(View.VISIBLE);
                    mTextView.setText(getString(R.string.s_activity_main_register_input_protocol));
                    return;
                }else if(!phoneCode.equals(realCode)){
                    mTextView.setVisibility(View.VISIBLE);
                    mTextView.setText(getString(R.string.s_activity_main_register_input_code_wrong));
                    return;
                }else if(!confirmpassword.equals(password)){
                    mTextView.setVisibility(View.VISIBLE);
                    mTextView.setText(getString(R.string.s_activity_main_register_input_password_wrong));
                    return;
            }else{
                String url = getString(R.string.s_url_register);
                OkHttpClient okHttpClient = new OkHttpClient();
                RequestBody requestBody = new FormBody.Builder()
                        .add("NICKNAME",username)
                        .add("PASSWORD",password)
                        .add("PHONENUM",phoneNum)
                        .build();
                Request request = new Request.Builder()
                        .url(url)
                        .post(requestBody)
                        .build();

                okHttpClient.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        Log.d(TAG, "onFailure: " + e.getMessage());
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        String s = response.body().string();
                        JSONArray jsonArray = null;
                        try {
                            String state = "";
                            jsonArray = new JSONArray(s);
                            for (int i = 0 ; i < jsonArray.length() ; i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                state = jsonObject.getString("STATE");
                            }
                            if (state.equals("success")){
                                RegisterActivity.this.runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(RegisterActivity.this,getString(R.string.s_activity_main_register_success),Toast.LENGTH_SHORT).show();
                                    }
                                });
                                User user = new User();
                                user.setNickname(mEtRegisteractivityUsername.getText().toString());
                                user.setPassword(mEtRegisteractivityPassword1.getText().toString());
                                user.setPhoneNum(mphoneNumET.getText().toString());
                                UserLab.get(RegisterActivity.this,mphoneNumET.getText().toString(),mEtRegisteractivityPassword1.getText().toString()).setUser(user);
                                Intent intent = new Intent(RegisterActivity.this,MainActivity.class);
                                startActivity(intent);
                                RegisterActivity.this.finish();
                            }else {
                                RegisterActivity.this.runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(RegisterActivity.this,getString(R.string.s_activity_main_register_failure),Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        Log.d(TAG, "onResponse: " + s);
                    }
                });
            }
        }
    }
}
