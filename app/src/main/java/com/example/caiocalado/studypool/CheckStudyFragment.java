package com.example.caiocalado.studypool;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

/**
 * Created by caiocalado on 5/4/15.
 */
public class CheckStudyFragment extends Fragment {

    private View rootView;
    private Button tellOthers;
    private EditText classText, subjectClassText;
    private RatingBar confidenceRating;

    public CheckStudyFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fragment_check_study, container, false);

        tellOthers = (Button) rootView.findViewById(R.id.tellOthersButton);

        classText = (EditText) rootView.findViewById(R.id.questionClassET);
        subjectClassText = (EditText) rootView.findViewById(R.id.infoClassED);
        confidenceRating = (RatingBar) rootView.findViewById(R.id.ratingConfidence);

        tellOthers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//                Toast.makeText(rootView.getContext(), "Look for help pressed", Toast.LENGTH_SHORT).show();
                if(!checkClassCompleted()){
                    Toast.makeText(rootView.getContext(), "Complete Class", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return rootView;
    }

    private boolean checkClassCompleted() {
        return classText.getText().length() > 0;
    }

    private boolean checkSubjectClassCompleted() {
        return subjectClassText.getText().length() > 0;
    }

    private boolean checkRating(){
        return confidenceRating.getRating() > 0;
    }

}
