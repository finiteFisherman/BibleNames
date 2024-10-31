package com.rdr.biblenames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.Random;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import android.util.Log;



public class fButton extends AppCompatActivity {

    private AdView fAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_button);

        Random r = new Random();
        ListView fList;
        ArrayAdapter<String> fAdapter;

        final String[] nameArray = new String[]{
                "Felix",
                "Festus",
                "Fortunatus"
        };

        final String[] wholeNameArray = new String[]{
                "Felix: happy ","Festus: festive ","Fortunatus: lucky"
        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.fText);
        text.setText(randomName);

        fList = (ListView) findViewById(R.id.fList);
        fAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        fList.setAdapter(fAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        fAd =findViewById(R.id.fAd);
        AdRequest fReq = new AdRequest.Builder().build();
        fAd.loadAd(fReq);
    }
}
