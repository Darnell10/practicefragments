package com.example.fragmentpractice.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tabs.R;

public class StoreFragment extends Fragment {

    View storeView;

    public StoreFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        storeView = inflater.inflate(R.layout.store_fragment, container, false);
        return storeView;
    }
}
