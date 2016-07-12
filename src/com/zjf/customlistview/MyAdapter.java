package com.zjf.customlistview;

import java.util.ArrayList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 *Created by zjf 2016-7-4ÏÂÎç2:35:51
 */
public class MyAdapter extends BaseAdapter{
	Context context;
	ArrayList<String> list;

	

	public MyAdapter(Context context, ArrayList<String> list) {
		super();
		this.context = context;
		this.list = list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	TextView tv=new TextView(context);
	tv.setText(list.get(position));
		return null;
	}

}
