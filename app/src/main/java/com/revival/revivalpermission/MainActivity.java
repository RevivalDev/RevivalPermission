package com.revival.revivalpermission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.revival.permission.LogUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtils.showLog("测试成功");
        
    }
}