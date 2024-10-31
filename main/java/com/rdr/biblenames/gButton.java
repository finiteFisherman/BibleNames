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

public class gButton extends AppCompatActivity {

    private AdView gAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_button);

        Random r = new Random();
        ListView gList;
        ArrayAdapter<String> gAdapter;

        final String[] nameArray = new String[]{
                "Gaal","Gaash","Gabbai","Gabbatha","Gabriel","Gad","Gadarenes","Gaddi","Gaddiel",
                "Gaius","Galal","Galatia","Galeed","Galilee","Gallim","Gallio","Gamaliel","Gammadims",
                "Gamul","Gareb","Garmites","Gatam","Gath","Gath-rimmon","Gaza","Gazabar","Gazer","Gazez",
                "Gazzam","Geba","Gebal","Geber","Gebim","Gedaliah","Geder","Gederothaim","Gehazi","Geliloth",
                "Gemalli","Gemariah","Genesis","Gennesaret","Genubath","Gera","Gerar","Gergesenes","Gerizim",
                "Gershom","Gershon","Geshur","Gether","Gethsemane","Geuel","Gezer","Giah","Gibbar","Gibbethon",
                "Gibeah","Gibeon","Giddel","Gideon","Gideoni","Gihon","Gilalai","Gilboa","Gilead","Gilgal","Giloh",
                "Gimzo","Ginath","Girgashite","Gispa","Gittah-hepher","Gittaim","Gittites","Goath","Gob","Gog","Golan",
                "Golgotha","Goliath","Gomer","Gomorrah","Goshen","Gozan","Gudgodah","Guni","Gur","Gur-baal"
        };

        final String[] wholeNameArray = new String[]{
                "Gaal: contempt; abomination ","Gaash: tempest; commotion ","Gabbai: the back ","Gabbatha: high; elevated ","Gabriel: God is my strength ","Gad: a band; a troop ","Gadarenes: men of Gadara ","Gaddi: my troop; a kid ","Gaddiel: goat of God; the Lord my happiness ","Gaius: lord; an earthly man ","Galal: a roll ","Galatia: white; the color of milk ","Galeed: the heap of witness ","Galilee: wheel; revolution ","Gallim: who heap up; who cover ","Gallio: who sucks ","Gamaliel: recompense of God; camel of God ","Gammadims: dwarfs ","Gamul: a recompense ","Gareb: a scab ","Garmites: men of Garmi ","Gatam: their lowing; their touch ","Gath: a wine-press ","Gath-rimmon: the high wine-press ","Gaza: strong; a goat ","Gazabar: a treasurer ","Gazer: a dividing; a sentence ","Gazez a passing over ","Gazzam the fleece of them ","Geba a hill; cup ","Gebal bound; limit ","Geber manly ","Gebim grasshoppers; height ","Gedaliah: God is my greatness ","Geder: or Gederah; a wall ","Gederothaim: hedges ","Gehazi: valley of sight ","Geliloth: rolling ","Gemalli: wares; a camel ","Gemariah: accomplishment or perfection of the Lord ","Gennesaret: garden of the prince ","Genesis: beginning ","Genubath: theft; robbery ","Gera: pilgrimage ","Gerar: same as Gera; dove ","Gergesenes: those who come from pilgrimage or fight ","Gerizim: cutters ","Gershom: a stranger here ","Gershon: his banishment; the change of pilgrimage ","Geshur: or Geshuri;  ","Gether: the vale of trial or searching ","Gethsemane: a very fat or plentiful vale ","Geuel: God's redemption ","Gezer: dividing ","Giah: to guide; draw out; produce; a groan or sigh ","Gibbar: strong ","Gibbethon: a back; a high house ","Gibeah: a hill ","Gibeon: hill; cup; thing lifted up ","Giddel: great ","Gideon: he that bruises or breaks; a destroyer ","Gideoni: same as Gideon ","Gihon: valley of grace ","Gilalai: a wheel ","Gilboa: revolution of inquiry ","Gilead: the heap or mass of testimony ","Gilgal: wheel; rolling; heap ","Giloh: he that rejoices; he that overturns ","Gimzo: that bulrush ","Ginath: or Ginnetho; a gardener ","Girgashite: who arrives from pilgrimage ","Gispa: coming hither ","Gittah-hepher: digging; a wine-press ","Gittaim: a wine-press ","Gittites: men of Gath ","Goath: his touching; his roaring ","Gob: cistern; grasshopper ","Gog: roof; covering ","Golan: passage; revolution ","Golgotha: a heap of skulls; something skull-shaped ","Goliath: passage; revolution; heap ","Gomer: to finish; complete ","Gomorrah: rebellious people ","Goshen: approaching; drawing near ","Gozan: fleece; pasture; who nourisheth the body ","Gudgodah: happiness ","Guni: a garden; a covering ","Gur: the young of a beast; a whelp ","Gur-baal: the governor's whelp"

        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.gText);
        text.setText(randomName);

        gList = (ListView) findViewById(R.id.gList);
        gAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        gList.setAdapter(gAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        gAd =findViewById(R.id.gAd);
        AdRequest gReq = new AdRequest.Builder().build();
        gAd.loadAd(gReq);
    }
}
