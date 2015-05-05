package com.example.caiocalado.studypool;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by caiocalado on 5/4/15.
 */
public class SettingsFragment extends Fragment {

    private View rootView;

    public SettingsFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fragment_settings, container, false);
        return rootView;
    }

}
