package com.example.mylevering;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class MyOrderFrag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        MainActivity main = (MainActivity) getActivity();
        if (main != null) {
            main.setTitle("My Order");
        }
        return inflater.inflate(R.layout.fragment_my_order, container, false);
    }
}