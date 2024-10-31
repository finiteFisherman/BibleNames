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

public class dButton extends AppCompatActivity {

    private AdView dAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_button);

        Random r = new Random();
        ListView dList;
        ArrayAdapter<String> dAdapter;

        final String[] nameArray = new String[]{
                "Dabareh","Dabbasheth","Daberath","Dagon","Dalaiah","Dalmanutha","Dalmatia","Dalphon",
                "Damaris","Damascus","Dan","Daniel","Dannah","Darah","Darda","Darius","Darkon","Dathan",
                "David","Debir","Deborah","Decapolis","Dedan","Dedanim","Dekar","Delaiah","Delilah","Demas",
                "Demetrius","Derbe","Deuel","Deuteronomy","Diana","Diblaim","Diblath","Dibon","Dibon-gad","Dibri",
                "Dibzahab","Didymus","Diklah","Dilean","Dimon","Dimonah","Dinah","Dinhabah","Dionysius","Diotrephes",
                "Dishan","Dishon","Dodai","Dodavah","Dodo","Doeg","Dophkah","Dor","Dorcas","Dothan","Drusilla","Dumali","Dura"
        };

        final String[] wholeNameArray = new String[]{
                "Dabareh: the word; the thing; a bee; obedient ","Dabbasheth: flowing with honey ","Daberath: same as Dabareh; pasture",
                "Dagon: corn; a fish ","Dalaiah: the poor of the Lord ","Dalmanutha: a bucket; a branch ","Dalmatia: deceitful lamps; vain brightness ",
                "Dalphon: the house of caves ","Damaris: a little woman ","Damascus: a sack full of blood; the similitude of burning ",
                "Dan: judgment; he that judges ","Daniel: judgment of God; God my judge ","Dannah: judging ","Darah: generation; house of the shepherd or of the companion ",
                "Darda: home of knowledge ","Darius: he that informs himself ","Darkon: of generation; of possession ","Dathan: laws or rites ","David: well-beloved ",
                "Debir: an orator; a word ","Deborah: word; thing; a bee ","Decapolis: containing ten cities ","Dedan: their breasts; friendship; a judge ",
                "Dedanim: the descendants of Dedan ","Dekar: force ","Delaiah: the poor of the Lord ","Delilah: poor; small; head of hair ","Demas: popular ",
                "Demetrius: belonging to corn ","Derbe: a sting ","Deuel: the knowledge of God ","Deuteronomy: repetition of the law ","Diana: luminous ",
                "Diblaim: cluster of figs ","Diblath: paste of dry figs ","Dibon: abundance of knowledge ","Dibon-gad: great understanding; abundance of sons ",
                "Dibri: an orator ","Dibzahab: or  Dizahab; region of gold","Didymus: a twin; double ","Diklah: Dildah ","Dilean: that is poor ","Dimon: where it is red ","Dimonah: dunghill ",
                "Dinah: judgment; who judges ","Dinhabah: he gives judgment ","Dionysius: divinely touched ","Diotrephes: nourished by Jupiter ","Dishan: a threshing ",
                "Dishon: fatness; ashes ","Dodai: Dodanim ","Dodavah love ","Dodo: his uncle ","Doeg: careful ","Dophkah: a knocking ","Dor: generation ",
                "Dorcas: a female roe-deer ","Dothan: the law; custom ","Drusilla: watered by the dew ","Dumali: silence; resemblance ","Dura: same as Dor "

        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.dText);
        text.setText(randomName);

        dList = (ListView) findViewById(R.id.dList);
        dAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        dList.setAdapter(dAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        dAd =findViewById(R.id.dAd);
        AdRequest dReq = new AdRequest.Builder().build();
        dAd.loadAd(dReq);
    }
}
