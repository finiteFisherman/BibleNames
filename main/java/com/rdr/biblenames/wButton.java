package com.rdr.biblenames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import java.util.Random;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import android.util.Log;

public class wButton extends AppCompatActivity {

    private AdView wAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w_button);

        Random r = new Random();
        final String[] nameArray = new String[]{
                "There are none "

        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.wText);
        text.setText(randomName);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        wAd =findViewById(R.id.wAd);
        AdRequest wReq = new AdRequest.Builder().build();
        wAd.loadAd(wReq);
    }
}
