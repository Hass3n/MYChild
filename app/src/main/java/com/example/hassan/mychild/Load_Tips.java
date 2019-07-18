package com.example.hassan.mychild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Load_Tips extends AppCompatActivity {
     PDFView book;
     public  static String name_pdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load__tips);
        book=findViewById(R.id.pdfView);
        book.fromAsset(name_pdf).load();



    }


}
