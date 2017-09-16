package com.kamalanagarkaraja;

import android.app.Activity;
import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class EventList extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);


        final ListView listview = (ListView) findViewById(R.id.listview);
        String[] values = new String[]{"Photo",  "Events", "Video","Member"
        };


        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, values);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Intent intent  =null;
        switch (position) {

            case 0:
                intent = new Intent(EventList.this,MandalPicture.class);
                startActivity(intent);

                break;

            case 1:
                intent = new Intent(EventList.this,Events.class);
                startActivity(intent);

                break;

            case 2:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watchv=PYqdBNIKG_U"));
                startActivity(intent);
                break;

            case 3:
                intent = new Intent(EventList.this,Member.class);
                startActivity(intent);
                break;

        }
    }

    public void alertToast() {
        Toast.makeText(this, "Page is under Contruction", Toast.LENGTH_LONG).show();

    }
}
