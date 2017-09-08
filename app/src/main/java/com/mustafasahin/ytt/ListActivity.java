package com.mustafasahin.ytt;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class ListActivity extends AppCompatActivity {

     ListView listView;


    public static com.mustafasahin.ytt.kayitobjesi kayitobjesi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = (ListView)findViewById(R.id.lst_liste);

        SharedPreferences mPrefs = getSharedPreferences("a",MODE_PRIVATE);
        Gson gson = new Gson();
        String json =mPrefs.getString("a",null);

        kayitobjesi = (gson.fromJson(json, kayitobjesi.class));




        listadapter adapter = new listadapter(this,objeeeeler);
        listView.setAdapter(adapter);



s


}


}
