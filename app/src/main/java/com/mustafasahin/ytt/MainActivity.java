package com.mustafasahin.ytt;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;




public class MainActivity extends AppCompatActivity {

    private EditText edt_litre_fiyati;
    private EditText edt_alinan_litre;
    private EditText edt_km;
    private Button btn_kaydet;


    private void init() {
        edt_litre_fiyati = (EditText) findViewById(R.id.edt_litre_fiyati);
        edt_alinan_litre = (EditText) findViewById(R.id.edt_alinan_litre);
        edt_km = (EditText) findViewById(R.id.edt_km);
        btn_kaydet= (Button) findViewById(R.id.btn_kaydet);
    }

    public String tarih(String tarihFormati)
    {
        Calendar takvim = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(tarihFormati);
        return sdf.format(takvim.getTime());

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btn_kaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kayitobjesi obje = new kayitobjesi("mFiyat","mLitre","mKm","mTarih");
                obje.setFiyat(edt_litre_fiyati.getText().toString());
                obje.setLitre(edt_alinan_litre.getText().toString());
                obje.setKm(edt_km.getText().toString());
                obje.setTarih(tarih("dd/MM/yyyy H:mm:ss"));


                kayitobjesi obje2 =new kayitobjesi("mFiyat","mLitre","mKm","mTarih");
                obje2.getFiyat();
                obje2.getLitre();
                obje2.getKm();
                obje2.getTarih();





                SharedPreferences mPrefs = getSharedPreferences("a",MODE_PRIVATE);
                Editor kayittutucu = mPrefs.edit();

                Gson gson = new Gson();



                String json = gson.toJson(obje2);
                kayittutucu.putString("a",json);



                kayittutucu.commit();
                Intent i =new Intent(MainActivity.this,ListActivity.class);
                startActivity(i);



            }
        });
    }


}
