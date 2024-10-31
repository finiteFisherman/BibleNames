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

public class oButton extends AppCompatActivity {

    private AdView oAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_button);

        Random r = new Random();
        ListView oList;
        ArrayAdapter<String> oAdapter;

        final String[] nameArray = new String[]{
                "Obadiah","Obal","Obed","Obed-edom","Obil","Oboth","Ocran","Oded","Og","Ohad","Ohel",
                "Olympas","Omar","Omega","Omri","On","Onam","Onesimus","Onesiphorus","Ono","Ophel",
                "Ophir","Ophni","Ophrah","Oreb","Ornan","Orpah","Oshea","Othni","Othniel","Ozem","Ozias",
                "Ozni"
        };

        final String[] wholeNameArray = new String[]{
                "Obadiah: servant of the Lord","Obal: inconvenience of old age","Obed: a servant; workman","Obed-edom: servant of Edom","Obil: that weeps; who deserves to be bewailed","Oboth: dragons; fathers; desires","Ocran: a disturber; that disorders","Oded: to sustain","Og: a cake; bread baked in ashes","Ohad: praising; confessing","Ohel: tent; tabernacle; brightness","Olympas: heavenly","Omar: he that speaks; bitter","Omega: the last letter of the Greek alphabet; long O",
                "Omri: sheaf of corn","On: pain; force; iniquity","Onam: or Onan; vigorous","Onesimus: profitable; useful","Onesiphorus: who brings profit","Ono: grief or strength or iniquity of him","Ophel: a tower; darkness; small white cloud","Ophir: fruitful region","Ophni: wearisomeness; folding together","Ophrah: dust; lead; a fawn","Oreb: a raven","Ornan: that rejoices","Orpah: the neck or skull","Oshea: same as Joshua","Othni: my time; my hour","Othniel: the hour of God","Ozem: that fasts; their eagerness","Ozias: strength from the Lord","Ozni: an ear; my hearkening"

        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.oText);
        text.setText(randomName);

        oList = (ListView) findViewById(R.id.oList);
        oAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        oList.setAdapter(oAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        oAd =findViewById(R.id.oAd);
        AdRequest oReq = new AdRequest.Builder().build();
        oAd.loadAd(oReq);
    }
}
