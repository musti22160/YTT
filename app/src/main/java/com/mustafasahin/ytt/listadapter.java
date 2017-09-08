package com.mustafasahin.ytt;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;



public class listadapter extends BaseAdapter {

    LayoutInflater layoutInflater;
    List<kayitobjesi> list;
    Activity activity;
    public listadapter(Activity activity,List<kayitobjesi> mList){
        layoutInflater=(LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        list = mList;
        this.activity = activity;
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
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satirview;


        satirview = layoutInflater.inflate(R.layout.listitem,null);


        TextView fiyat = (TextView)satirview.findViewById(R.id.yFiyat);
        TextView litre = (TextView)satirview.findViewById(R.id.yLitre);
        TextView km = (TextView)satirview.findViewById(R.id.yKm);
        TextView tarih = (TextView) satirview.findViewById(R.id.yTarih);

        final kayitobjesi kayitlar = list.get(position);



        return satirview;
    }
}
