package com.kamalanagarkaraja;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by anurag on 25/08/17.
 */


public class CustomAdapter extends ArrayAdapter<DataModel>{

    private ArrayList<DataModel> dataSet;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView infoTitle;
        TextView info;
        TextView infoTime;

    }

    public CustomAdapter(ArrayList<DataModel> data, Context context) {
        super(context, R.layout.list_row, data);
        this.dataSet = data;
        this.mContext=context;

    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        DataModel dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_row, parent, false);
            viewHolder.infoTitle = (TextView) convertView.findViewById(R.id.infoTitle);
            viewHolder.info = (TextView) convertView.findViewById(R.id.info);
            viewHolder.infoTime = (TextView) convertView.findViewById(R.id.infoTime);
            result=convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }



        viewHolder.infoTitle.setText(dataModel.getTitle());
        viewHolder.info.setText(dataModel.getInfoMesseg());
        viewHolder.infoTime.setText(dataModel.getDate());

        return convertView;
    }
}