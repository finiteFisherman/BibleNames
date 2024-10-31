package com.rdr.biblenames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import android.util.Log;

public class searchButton extends AppCompatActivity {

    private AdView infoAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_button);

        TextView text = (TextView) findViewById(R.id.infoText);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        infoAd =findViewById(R.id.infoAd);
        AdRequest infoReq = new AdRequest.Builder().build();
        infoAd.loadAd(infoReq);

    }
}
