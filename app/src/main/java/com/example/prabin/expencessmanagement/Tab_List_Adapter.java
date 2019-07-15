package com.example.prabin.expencessmanagement;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.List;

/**
 * Created by Prabin.
 */

public class Tab_List_Adapter extends BaseAdapter{
    Context context;
    List<TabHistory_Week_List> list;


    public Tab_List_Adapter(Context context, List<TabHistory_Week_List> listWeek){
        this.context = context;
        this.list = listWeek;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = View.inflate(context, R.layout.list_expenses, null);

        TextView txtName = (TextView)view.findViewById(R.id.tbhw_name);
        TextView txtDate = (TextView)view.findViewById(R.id.tbhw_date);
        TextView txtAmount = (TextView)view.findViewById(R.id.tbhw_amount);
        TextView txtNote = (TextView)view.findViewById(R.id.tbhw_note);

        txtName.setText(list.get(position).getName());
        DecimalFormat precision = new DecimalFormat("0.00");
        txtAmount.setText(precision.format(list.get(position).getAmount()));
        txtDate.setText(list.get(position).getDate());
        txtNote.setText(list.get(position).getNote());


        return view;
    }
    }


