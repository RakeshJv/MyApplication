package com.kamalanagarkaraja;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Events extends AppCompatActivity {

    ArrayList<DataModel> dataModels;
    ListView listView;
    private static CustomAdapter adapter;
    String[] values = new String[]{"Photo", "Video", "Events", "Member"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        listView = (ListView) findViewById(R.id.evenTlistview);


        dataModels= new ArrayList<DataModel>();
        dataModels.add(new DataModel("AGAMAN", "25 August ","12.00 PM"));
        dataModels.add(new DataModel("MORNING AARTI", "Every day ","11.00 AM"));
        dataModels.add(new DataModel("EVENING AARTI", "Every day ","09.00 PM"));
        dataModels.add(new DataModel("VISARAJAN", "05 September","01.00 AM"));
        adapter= new CustomAdapter(dataModels,getApplicationContext());
        listView.setAdapter(adapter);

    }
}
