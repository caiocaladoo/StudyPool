package com.example.caiocalado.studypool;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by caiocalado on 5/4/15.
 */
public class MessagesFragment extends Fragment {

    private View rootView;
    private ListView list;

    public MessagesFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fragment_messages, container, false);

        String [] values = new String[]{
                "Caio Calado",
                "Sagar nanda"
        };

        list = (ListView) rootView.findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        list.setAdapter(adapter);


        return rootView;
    }

}
