package com.example.jmush.android_session10_assignment_101;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jmush on 9/5/17.
 */

public class SimpleAddition extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.activity_addition, container, false);

        TextView textView= (TextView) view.findViewById(R.id.tvPopulate);
        //getting value from mainActivity as "key"
        String number = getArguments().getString("Number");
        //Setting the number to a textview
        textView.setText(number);

    return view;

    }
}
