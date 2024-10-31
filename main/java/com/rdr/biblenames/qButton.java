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

public class qButton extends AppCompatActivity {

    private AdView qAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_button);

        Random r = new Random();
        ListView qList;
        ArrayAdapter<String> qAdapter;

        final String[] nameArray = new String[]{
                "Quartus"
        };

        final String[] wholeNameArray = new String[]{
                "Quartus: fourth"

        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.qText);
        text.setText(randomName);

        qList = (ListView) findViewById(R.id.qList);
        qAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        qList.setAdapter(qAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        qAd =findViewById(R.id.qAd);
        AdRequest qReq = new AdRequest.Builder().build();
        qAd.loadAd(qReq);
    }
}
