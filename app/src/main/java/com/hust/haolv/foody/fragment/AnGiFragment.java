package com.hust.haolv.foody.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hust.haolv.foody.R;


public class AnGiFragment extends Fragment {


    public AnGiFragment() {
        // Required empty public constructor
    }

    public static AnGiFragment newInstance() {
        AnGiFragment fragment = new AnGiFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_an_gi, container, false);

        return view;
    }

}
