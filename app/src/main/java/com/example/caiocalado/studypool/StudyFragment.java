package com.example.caiocalado.studypool;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by caiocalado on 5/4/15.
 */
public class StudyFragment extends Fragment{

    private View rootView;

    private Button helpButton, studyButton;

    public StudyFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fragment_study, container, false);

        helpButton = (Button) rootView.findViewById(R.id.helpButton);

        helpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //to-do map!
                Toast.makeText(rootView.getContext(), "Look for help pressed", Toast.LENGTH_SHORT).show();
            }
        });

        studyButton = (Button) rootView.findViewById(R.id.studyButton);

        studyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(rootView.getContext(), "Study pressed", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }

}
