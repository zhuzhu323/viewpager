package com.zjf.customlistview;

import java.util.Currency;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/**
 *Created by zjf 2016-7-4обнГ2:38:31
 */
public class CustomListView extends ListView{
View view;
	public CustomListView(Context context, AttributeSet attrs) {
		super(context, attrs);
		//shezhichushizhuangtai 
		CurrentState=STATE_DONE;
		view=View.inflate(getContext(), R.layout.listview_header, null);
		
		this.addHeaderView(view);
		
	}

	

}
