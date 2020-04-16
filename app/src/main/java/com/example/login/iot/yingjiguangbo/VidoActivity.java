package com.example.login.iot.yingjiguangbo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.login.R;

public class VidoActivity extends AppCompatActivity {

    VideoView vv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vido);
        vv1=findViewById(R.id.videoView);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(vv1);
        Uri uri =Uri.parse("https://qiniu-xpc0.xpccdn.com/5b4c8f1691dea.mp4");
        vv1.setMediaController(mediaController);
        vv1.setVideoURI(uri);
        vv1.start();
    }
}
