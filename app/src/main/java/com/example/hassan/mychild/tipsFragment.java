package com.example.hassan.mychild;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;


/**
 * A simple {@link Fragment} subclass.
 */
public class tipsFragment extends Fragment {

    PDFView book;
    View view;
    public tipsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

     view=  inflater.inflate(R.layout.fragment_tips, container, false);
        book=view.findViewById(R.id.pdfView);

        book.fromAsset("10.pdf").load() ;
     return view;


    }

}
