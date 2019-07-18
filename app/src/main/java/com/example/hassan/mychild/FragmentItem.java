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
public class FragmentItem extends Fragment {

    PDFView book;
    View view;
    public FragmentItem() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


          view=inflater.inflate(R.layout.fragment_fragment_item, container, false);
          book=view.findViewById(R.id.pdfView);

            book.fromAsset("7.pdf").load() ;


         return  view;
    }

}
