package com.example.jmush.android_session10_assignment_101;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etNumber;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber= (EditText) findViewById(R.id.etValue);
        btnSubmit= (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number=etNumber.getText().toString();
                //To pass the value using key pair to next screen
                Bundle bundle=new Bundle();
                bundle.putString("Number",number);
                Fragment myfragment;
                myfragment = new SimpleAddition();
                //passing value to to a fragment
                myfragment.setArguments(bundle);
                // create a FragmentManager
                FragmentManager fm = getFragmentManager();
                // create a FragmentTransaction to begin the transaction and replace the Fragment
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                // replace the FrameLayout with new Fragment
                fragmentTransaction.replace(R.id.frameLayout, myfragment);
                // save the changes
                fragmentTransaction.commit();

            }
        });

    }




}
