package com.baksoy.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        String[] forecastArray = {"Sun, Jun 1 - Clear - 31/17", "Mon, Jun 2 - Clear - 21/14",
                "Tue, Jun 3 - Cloudy - 22/17", "Wed, Jun 4 - Rainy - 18/11", "Fri, Jun 6 - Rainy - 27/15"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, forecastArray);

        //Finding our AdapterView type (ListView in this case) within the root container we declared above
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);

        //Setting our AdapterView to display the array within our adapter
        listView.setAdapter(adapter);

        return rootView;
    }
}
