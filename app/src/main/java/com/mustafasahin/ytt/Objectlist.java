package com.mustafasahin.ytt;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Mustafa on 05.09.2017.
 */

public class Objectlist  {

    @SerializedName("mobjelistesi")
    private
    ArrayList<kayitobjesi> mobjelistesi;


    public ArrayList<kayitobjesi> getmobjelistesi() {
        return mobjelistesi;
    }

    public void setmobjelistesi(ArrayList<kayitobjesi> mobjelistesi) {
        this.mobjelistesi = mobjelistesi;
    }
}
