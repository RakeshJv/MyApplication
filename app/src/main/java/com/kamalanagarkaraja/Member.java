package com.kamalanagarkaraja;

import android.app.Activity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Member extends Activity {
    ArrayList<DataModel> dataModels;
    ListView listView;
    private static CustomAdapter adapter;
    String[] values = new String[]{"Dhanvel","Govind", "Raja", "Babu", "Rakesh","Rajesh","Krishna","Sahil Gupta"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);


        listView = (ListView) findViewById(R.id.evenTlistview);


        dataModels= new ArrayList<DataModel>();
        dataModels.add(new DataModel("DHANVEL", "","President"));
        dataModels.add(new DataModel("GOVIND", "","Vice President"));
        dataModels.add(new DataModel("RAJA","", "Board Member"));
        dataModels.add(new DataModel("BABU","", "Board Member"));
        dataModels.add(new DataModel("SAHIL", "","Board Member"));
        dataModels.add(new DataModel("RAKESH", "","Technonolgy advisor"));

        adapter= new CustomAdapter(dataModels,getApplicationContext());
        listView.setAdapter(adapter);

    }
}
