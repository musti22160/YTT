package com.mustafasahin.ytt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Mustafa on 27.08.2017.
 */
public class kayitobjesi  {
    private String litre_fiyati;
    private String alinan_litre;
    private String son_kilometre;
    private String tarih;

    public  kayitobjesi (String mFiyat, String mLitre, String mKm, String mTarih){
        litre_fiyati = mFiyat;
        alinan_litre = mLitre;
        son_kilometre = mKm;
        tarih = mTarih;
    }




    public String getFiyat() {
        return litre_fiyati;
    }

    public void setFiyat(String litre_fiyati) {
        this.litre_fiyati = litre_fiyati;
    }

    public String getLitre() {
        return alinan_litre;
    }

    public void setLitre(String alinan_litre) {
        this.alinan_litre = alinan_litre;
    }

    public String getKm() {
        return son_kilometre;
    }

    public void setKm(String son_kilometre) {
        this.son_kilometre = son_kilometre;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
}
