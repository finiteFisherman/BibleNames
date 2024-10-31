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

public class iButton extends AppCompatActivity {

    private AdView iAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_button);

        Random r = new Random();
        ListView iList;
        ArrayAdapter<String> iAdapter;

        final String[] nameArray = new String[]{
                "Ibhar","Ibleam","Ibneiah","Ibri","Ibzan","Ichabod","Iconium","Idalah","Idbash",
                "Iddo","Idumea","Igal","Igdaliah","Igeal","Iim","Ije-abarim","Ijon","Ikkesh","Illyricum",
                "Imlah","Immanuel","Immer","Imnah","Imrah","Imri","India","Iphedeiah","Ir","Ira","Irad",
                "Iram","Iri","Irijah","Irpeel","Irshemesh","Isaac","Isaiah","Iscah","Iscariot","Ishbak",
                "Ishbi-benob","Ishbosheth","Ishi","Ishiah","Ishma","Ishmachiah","Ishmael","Ishmaiah",
                "Ishmerai","Ishod","Ish-pan","Ish-tob","Ishua","Ispah","Israel","Issachar","Isui",
                "Italy","Ithai","Ithamar","Ithiel","Ithmah","Ithran","Ithream","Ittah-kazin","Iturea",
                "Ivah","Izehar","Izrahiah","Izri"
        };

        final String[] wholeNameArray = new String[]{
                "Ibhar: election; he that is chosen ","Ibleam: ancient people; people decreasing ","Ibneiah: or Ibniah the building of the Lord; the understanding of the Lord","Ibri: passing over; being angry; being with young ","Ibzan: father of a target; father of coldness ","Ichabod: where is the glory?","Iconium: coming ","Idalah: the hand of slander ","Idbash: flowing with honey; the land of destruction ","Iddo: his band; power; praise ","Idumea: red; earthy; bloody ","Igal: redeemed; defiled ","Igeal: a redeemer; redeemed; defiled ","Igdaliah: the greatness of the Lord ","Iim: heaps of Hebrews ","Ije-abarim: heaps of Hebrews ","Ijon: look; eye; fountain ","Ikkesh: forward; wicked ","Illyricum: joy; rejoicing ","Imlah: plentitude; circumcision ","Immanuel: God with us ","Immer: saying; speaking; a lamb ","Imnah: same as Jimnah ","Imrah: a rebel; waxing bitter; changing ","Imri: speaking; exalting; bitter; a lamb ","India: praise; law ","Iphedeiah: redemption of the Lord ","Ir: watchman; city; vision ","Ira: watchman; making bare; pouring out ","Irad: wild ass; heap of empire; dragon ","Iram: the effusion of them; a high heap ","Iri: fire; light ","Irijah: the fear of the Lord ","Irpeel: the health ",
                "Irshemesh: a city of bondage ","Isaac: laughter ","Isaiah: the salvation of the Lord ","Iscah: he that anoints ","Iscariot: a man of murder; a hireling ","Ishbak: who is empty or exhausted ","Ishbi-benob: respiration; conversion; taking captive ","Ishbosheth: a man of shame ","Ishi: salvation ","Ishiah: it is the Lord ","Ishma: named; marveling; desolation ","Ishmael: God that hears ","Ishmaiah: hearing or obeying the Lord ","Ishmerai: keeper ","Ishod: a comely man ","Ish-pan: hid; broken in two ","Ish-tob: good man ","Ishua plainness: equal ","Ishmachiah: cleaving to the Lord ","Ispah: a jasper stone ","Israel: who prevails with God ","Issachar: reward; recompense ","Isui: same as Ishuah; quiet ","Ithai: strong; my sign; a plowshare ","Italy: abounding with calves or heifers ","Ithamar: island of the palm-tree ","Ithiel: sign ","Ithmah: an orphan ","Ithran: remaining; searching out diligently ","Ithream: excellence of the people ","Ittah-kazin: hour ","Iturea: guarded; mountainous ","Ivah: iniquity ","Izehar: or Izhar; oil ","Izrahiah: the Lord ariseth; the clearness of the Lord ","Izri: fasting; tribulation "

        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.iText);
        text.setText(randomName);

        iList = (ListView) findViewById(R.id.iList);
        iAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        iList.setAdapter(iAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        iAd =findViewById(R.id.iAd);
        AdRequest iReq = new AdRequest.Builder().build();
        iAd.loadAd(iReq);
    }
}
