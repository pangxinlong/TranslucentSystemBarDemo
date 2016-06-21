package com.example.activitystartmode.translucentsystembardemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtImage;
    private Button mBtColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtImage=(Button)findViewById(R.id.bt_image);
        mBtColor=(Button)findViewById(R.id.bt_color);
        mBtImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,ImageTestActivity.class);
                startActivity(intent);
            }
        });

        mBtColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,SolidColorTestActivity.class);
                startActivity(intent);
            }
        });
    }
}
