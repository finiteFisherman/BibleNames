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

public class kButton extends AppCompatActivity {

    private AdView kAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_button);

        Random r = new Random();
        ListView kList;
        ArrayAdapter<String> kAdapter;

        final String[] nameArray = new String[]{
                "Kabzeel","Kadesh","Kadesh-barnea","Kadmiel","Kadmonites","Kallai","Kanah","Kareah",
                "Karkaa","Karkor","Karnaim","Kartah","Kedar","Kedemah","Kedemoth","Kehelahath","Keiiah",
                "Kelaiah","Kelitah","Kemuel","Kenah","Kenan","Kenaz","Kenites","Kenizzites","Keren-happuch",
                "Kerioth","Keros","Keturah","Kezia","Keziz","Kibroth-hattaavah","Kibzaim","Kidron","Kinah",
                "Kir","Kirharaseth","Kirioth","Kirjath","Kirjathaim","Kirjath-arba","Kirjath-arim",
                "Kirjath-baal","Kirjath-huzoth","Kirjath-jearim","Kirjath-sannah","Kirjath-sepher",
                "Kish","Kishi","Kishion","Kishon","Kithlish","Kitron","Kittim","Koa","Kohath",
                "Kolariah","Korah","Kushaiah"
        };

        final String[] wholeNameArray = new String[]{
                "Kabzeel: the congregation of God","Kadesh: holiness","Kadesh-barnea: holiness of an inconstant son","Kadmiel: God of antiquity; God of rising","Kadmonites: ancients; chiefs","Kallai: light; resting by fire; my voice","Kanah: of reeds","Kareah: bald; ice","Karkaa: floor; dissolving coldness","Karkor: they rested","Karnaim: horns","Kartah: calling; meeting","Kedar: blackness; sorrow","Kedemah: oriental; ancient; first","Kedemoth: antiquity; old age","Kehelahath: a whole; a congregation","Keiiah: she that divides or cuts","Kelaiah: voice of the Lord; gathering together","Kelitah: same as Kelaiah","Kemuel: God hath raised up","Kenah: buying; possession","Kenan: buyer; owner","Kenaz: this purchase; this lamentation","Kenites: possession; purchase; lamentation","Kenizzites: possession; purchase","Keren-happuch: the horn or child of beauty","Kerioth: the cities; the callings","Keros: crooked; crookedness","Keturah: that makes the incense to fume","Kezia: superficies; the angle; cassia","Keziz: end; extremity","Kibroth-hattaavah: the graves of lust","Kibzaim: congregation","Kidron: obscure; making black or sad","Kinah: same as Kenah; seat",
                "Kir: a city; wall; meeting","Kirharaseth: or Kirharesh; city","Kirioth: same as Kerioth","Kirjath: city; vocation; meeting","Kirjathaim: the two cities; callings; or meetings","Kirjath-arba: city of four; fourth city","Kirjath-arim: city of those who watch","Kirjath-baal: city of Baal","Kirjath-huzoth: city of streets; populous city","Kirjath-jearim: city of woods","Kirjath-sannah: city of enmity","Kirjath-sepher: city of letters","Kish: hard; difficult; straw; for age","Kishi: hardness; his gravity; his offense","Kishion: hardness; soreness","Kishon: hard; sore","Kithlish: it is a wall; the company of a lioness","Kitron: making sweet; binding together","Kittim: breaking; bruising small; gold; coloring","Koa: hope; a congregation; a line; a rule","Kohath: congregation; wrinkle; bluntness","Kolariah: voice of the Lord","Korah: baldness; ice; frost","Kushaiah: same as Kishi; bow of Jehovah"
        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.kText);
        text.setText(randomName);

        kList = (ListView) findViewById(R.id.kList);
        kAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        kList.setAdapter(kAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        kAd =findViewById(R.id.kAd);
        AdRequest kReq = new AdRequest.Builder().build();
        kAd.loadAd(kReq);
    }
}
