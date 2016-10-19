package com.example.t00063414.tourguideapp;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ListOfLocation.OnFragmentInteractionListener, DisplayDataFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(int id) {

        FragmentManager FragManager = getSupportFragmentManager();
        DisplayDataFragment fragmentB = (DisplayDataFragment) FragManager.findFragmentById(R.id.fragmentDisplay);
        fragmentB.updateText(id);

    }
}
