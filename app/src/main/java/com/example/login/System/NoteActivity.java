package com.example.login.System;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.login.R;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class NoteActivity extends AppCompatActivity {
      private EditText inputInfo;
      private Button save;
      private Button reset;
      private TextView count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                setFullScreen();
                hideBar();

 inputInfo = findViewById(R.id.editText3);
 save =  findViewById(R.id.button4);
 reset = findViewById(R.id.button5);
 count = findViewById(R.id.textView4);

 inputInfo.addTextChangedListener(new TextWatcher() {
 @Override
 public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

 }
     @Override

 public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

 }

 @Override
 public void afterTextChanged(Editable editable) {
 count.setText(inputInfo.getText().length()+"个字");
 }
 });

 onload();
        inputInfo.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 inputInfo.setCursorVisible(true);
 }
 });
 save.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 FileOutputStream fos = null;
 try{
 fos = openFileOutput("txt", Context.MODE_PRIVATE);
 String text = inputInfo.getText().toString();
 fos.write(text.getBytes());
 }catch (Exception e){
 e.printStackTrace();
 }finally {
 try{
 if(fos!=null){
 fos.flush();
 Toast.makeText(NoteActivity.this,"保存成功！", Toast.LENGTH_SHORT).show();
 fos.close();
 }
 }catch(Exception e){
 e.printStackTrace();
 }
 }
 }
 });

 reset.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 FileOutputStream fos = null;
 inputInfo.setText("");
 try{
 fos = openFileOutput("txt", Context.MODE_PRIVATE);
 String text = "";
 fos.write(text.getBytes());
 }catch (Exception e){
 e.printStackTrace();
 }finally {
 try{
 if(fos!=null){
 fos.flush();
 Toast.makeText(NoteActivity.this,"清空成功！",Toast.LENGTH_SHORT).show();
 fos.close();
 }
 }catch(Exception e){
 e.printStackTrace();
 }
 }
 }
 });
 }
    public void onload(){
 FileInputStream fis = null;
 try{
 fis = openFileInput("txt");
 if(fis.available()==0){
 return;
 }else{
 byte[] con = new byte[fis.available()];
 while(fis.read(con)!=-1){

 }
 inputInfo.setText(new String(con));
 inputInfo.setSelection(inputInfo.getText().length());
 inputInfo.setCursorVisible(false);
 }
 }catch(Exception e){
 e.printStackTrace();
 }
 }

 long time;
 public boolean onKeyDown(int keyCode, KeyEvent event){
 if(keyCode==KeyEvent.KEYCODE_BACK&&event.getAction()== KeyEvent.ACTION_DOWN){
 if(System.currentTimeMillis()-time>2000){
 Toast.makeText(NoteActivity.this,"再次点击返回键，程序退出",Toast.LENGTH_SHORT).show();
 time = System.currentTimeMillis();
 }else{
 NoteActivity.this.finish();
 }
 return true;
 }
 return super.onKeyDown(keyCode,event);
 }

 private void hideBar(){
 ActionBar actionBar = getSupportActionBar();
 if(actionBar!=null){
 actionBar.hide();
 }
 }

 private void setFullScreen(){
 this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                 WindowManager.LayoutParams.FLAG_FULLSCREEN);
 }

}
