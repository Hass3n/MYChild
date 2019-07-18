package com.example.hassan.mychild;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoadTips extends AppCompatActivity {
     Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_tip);



        btn1=findViewById(R.id.button3_frement);
        btn2=findViewById(R.id.button4_frement);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment load=new tips_Fragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fram,load).commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment L=new tipsFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fram,L).commit();
            }
        });


    }
}
