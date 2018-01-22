package com.hust.haolv.foody.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hust.haolv.foody.R;


public class ODauFragment extends Fragment {


    public ODauFragment() {
        // Required empty public constructor
    }


    public static ODauFragment newInstance() {
        ODauFragment fragment = new ODauFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_odau, container, false);
        return view;
    }

}
