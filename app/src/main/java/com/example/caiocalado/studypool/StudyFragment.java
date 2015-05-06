package com.example.caiocalado.studypool;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.maps.GoogleMap;

/**
 * Created by caiocalado on 5/4/15.
 */
public class StudyFragment extends Fragment{

    private View rootView;

    private Button helpButton, studyButton;
    private GoogleMap googleMap;


    public StudyFragment(){}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fragment_study, container, false);

//        SupportMapFragment supportMapFragment = rootView.findFragmentById(R.id.map);
//        googleMap = supportMapFragment.getMap();
//        googleMap.setMyLocationEnabled(true);

//        helpButton = (Button) rootView.findViewById(R.id.helpButton);
//
//        helpButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                //to-do map!
//                Toast.makeText(rootView.getContext(), "Look for help pressed", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        studyButton = (Button) rootView.findViewById(R.id.studyButton);
//
//        studyButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//
//                Toast.makeText(rootView.getContext(), "Study", Toast.LENGTH_SHORT).show();
//
////                Intent startStudyFragment = new Intent(StartStudyFragment, StartStudyFragment.class);
////                startActivityForResult(startStudyFragment, 0);
//            }
//        });

        return rootView;
    }

}
