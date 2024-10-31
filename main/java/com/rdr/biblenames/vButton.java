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

public class vButton extends AppCompatActivity {

    private AdView vAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_button);

        Random r = new Random();
        ListView vList;
        ArrayAdapter<String> vAdapter;

        final String[] nameArray = new String[]{
                "Vajezatha",
                "Vaniah",
                "Vashni",
                "Vashti",
                "Vophsi"
        };

        final String[] wholeNameArray = new String[]{
                "Vajezatha: sprinkling the chamber","Vaniah: nourishment","Vashni: the second; changed; a tooth","Vashti: that drinks; thread","Vophsi: fragrant; diminution"
        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.vText);
        text.setText(randomName);

        vList = (ListView) findViewById(R.id.vList);
        vAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        vList.setAdapter(vAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        vAd =findViewById(R.id.vAd);
        AdRequest vReq = new AdRequest.Builder().build();
        vAd.loadAd(vReq);
    }
}
