package com.example.hassan.mychild;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Load_Fragment extends AppCompatActivity {
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load__fragment);
        btn1=findViewById(R.id.button1_frement);
        btn2=findViewById(R.id.button2_frement);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment load=new FragmentItem();
                getSupportFragmentManager().beginTransaction().replace(R.id.fram,load).commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment L=new Fragment_item();
                getSupportFragmentManager().beginTransaction().replace(R.id.fram,L).commit();
            }
        });

    }
}
