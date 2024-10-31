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

public class uButton extends AppCompatActivity {

    private AdView uAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_button);

        Random r = new Random();
        ListView uList;
        ArrayAdapter<String> uAdapter;

        final String[] nameArray = new String[]{
                "Ucal","Uel","Ulai","Ulam","Ulla","Ummah","Unni","Upharsin","Uphaz","Ur","Urbane","Uri",
                "Uriah","Uriel","Urim","Uthai","Uz","Uzai","Uzal","Uzzah","Uzzen-sherah","Uzzi","Uzziah"
        };

        final String[] wholeNameArray = new String[]{
                "Ucal: power","Uel: desiring God","Ulai: strength; fool; senseless","Ulam: the porch; the court; their strength; their folly","Ulla: elevation; leaf; young child","Ummah: darkened; covered; his people","Unni: poor; afflicted; that answers","Uphaz: pure gold; gold of Phasis or Pison",
                "Upharsin: divided","Ur: fire","Urbane: courteous","Uri: my light","Uriah: or Urijah; God is my light","Uriel: same as Uriah","Urim: lights; fires","Uthai: my iniquity","Uz: counsel; words","Uzai: he","Uzal: wandering","Uzzah: strength; goat","Uzzen-sherah: ear of the flesh","Uzzi: my strength; my kid","Uzziah: same as Uzziel; kid of the Lord"
        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.uText);
        text.setText(randomName);

        uList = (ListView) findViewById(R.id.uList);
        uAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        uList.setAdapter(uAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        uAd =findViewById(R.id.uAd);
        AdRequest uReq = new AdRequest.Builder().build();
        uAd.loadAd(uReq);
    }
}
