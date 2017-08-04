package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by GhOst -ProtocoL on 03/08/2017.
 */

public class Bitcoinresult {
    private String mprice;


        public static Bitcoinresult fromjson (JSONObject jsonObject){

                try {

                    Bitcoinresult Result = new Bitcoinresult();



                    Result.mprice= jsonObject.getString("ask");
                    return  Result;
                } catch (JSONException e){

                    e.printStackTrace();
                    return null;

                }


        }


    public String getMprice() {
        return mprice;
    }
}
