package com.baksoy.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<String> weatherForecast = new ArrayList<String>();
        weatherForecast.add("Sun, Jun 1 - Clear - 31/17");
        weatherForecast.add("Mon, Jun 2 - Clear - 21/14");
        weatherForecast.add("Tue, Jun 3 - Cloudy - 22/17");
        weatherForecast.add("Wed, Jun 4 - Rainy - 18/11");
        weatherForecast.add("Fri, Jun 6 - Rainy - 27/15");

        return rootView;
    }
}
