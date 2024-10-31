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

public class cButton extends AppCompatActivity {

    private AdView cAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_button);

        Random r = new Random();
        ListView cList;
        ArrayAdapter<String> cAdapter;

        final String[] nameArray = new String[]{
                "Cabbon","Cabul","Cain","Cainan","Caiphas","Calah","Calcol","Caleb","Caleb-Ephratah",
                "Calneh","Calno","Calvary","Camon","Cana","Canaan","Candace","Capernaum","Caphtor",
                "Cappadocia","Carcas","Careah","Carmel","Carmi","Carpus","Carshena","Casiphia","Casluhim",
                "Cedron","Cenchrea","Cephas","Cesar","Chalcol","Chaldea","Charchemish","Charran","Chebar",
                "Chedorlaomer","Chelal","Chelluh","Chelub","Chelubai","Chemarims","Chemosh","Chenaanah",
                "Chenani","Chenaniah","Chephirah","Cheran","Cherethims","Cherith","Chesed","Chesil",
                "Chesulloth","Chidon","Chiliab","Chilion","Chilmad","Chimham","Chios","Chisleu","Chislon",
                "Chisloth-tabor","Chittem","Chloe","Chorazin","Chozeba","Christ","Chun","Chushan-rishathaim",
                "Chuza","Cilicia","Cis","Clauda","Claudia","Clement","Cleophas","Cnidus","Colhozeh","Colosse",
                "Coniah","Coos","Corinth","Cornelius","Cosam","Coz","Cozbi","Crescens","Crete","Crispus","Cush",
                "Cuth","Cyprus","Cyrene","Cyrenius","Cyrus"
        };

        final String[] wholeNameArray = new String[]{
                "Cabbon: as though understanding ","Cabul: displeasing; dirty ","Caiphas: he that seeks with diligence; one that vomiteth ",
                "Cain: possession ","Cainan: possessor; purchaser ","Calah: favorable; opportunity ","Calcol: nourishing ","Caleb: a dog; a crow; a basket ",
                "Caleb-Ephratah: see Ephratah ","Calneh: our consummation ","Calno: our consummation; altogether himself ",
                "Calvary: the place of a skull ","Camon: his resurrection ","Cana: zeal; jealousy; possession ","Canaan: merchant; trader; or that humbles and subdues ",
                "Candace: who possesses contrition ","Capernaum: the field of repentance; city of comfort ","Caphtor: a sphere ","Cappadocia: the same as Caphtor ",
                "Carcas: the covering of a lamb ","Charchemish: a lamb; as taken away; withdrawn ","Careah: bald; ice ","Carmel: circumcised lamb; harvest; full of ears of corn ",
                "Carmi: my vineyard; lamb of the waters ","Carpus: fruit; fruitful ","Carshena: a lamb; sleeping ","Casiphia: money; covetousness ","Casluhim: hopes of life ",
                "Cedron: black; sad ","Cenchrea: millet; small pulse ","Cephas: a rock or stone ","Cesar: a name applied to those who are cut out of the womb ",
                "Chalcol: who nourishes ","Chaldea: as demons ","Charran: a singing or calling out ","Chebar: force or strength ","Chedorlaomer: roundness of a sheaf ",
                "Chelal: as night ","Chelub: a basket ","Chelluh: all ","Chelubai: he altogether against me ","Chemarims: black ones ","Chemosh: handling; stroking; taking away ",
                "Chenaanah: broken in pieces ","Chenani: my pillar ","Chenaniah: preparation ","Chephirah: a little lioness ","Cheran: anger ","Cherethims: or Cherethites; executioners or life-guardsmen ",
                "Cherith: cutting; piercing; slaying ","Chesed: as a devil ","Chesil: foolishness ","Chesulloth: fearfulness ","Chidon: a dart ",
                "Chiliab: totality; or the perfection of the father ","Chilion: finished; complete; perfect ","Chilmad: teaching or learning ",
                "Chimham: as they; like to them ","Chios: open; opening ","Chisleu: or Cisleu ","Chislon: hope ","Chisloth-tabor: fears; purity ","Chittem: those that bruise; gold ",
                "Chloe: green herb ","Chorazin: the secret; here is a mystery ","Chozeba: men liers in wait ","Christ: anointed ","Chun: making ready ",
                "Chushan-rishathaim: blackness of iniquities ","Chuza: the seer or prophet ","Cilicia: which rolls or overturns ","Cis: same as Kish ",
                "Clauda: a lamentable voice ","Claudia: or Claudius; lame or enclosure ","Clement: mild; good; merciful ","Cleophas: the whole glory ","Cnidus: age ","Colhozeh: every prophet ",
                "Colosse: punishment; correction ","Coniah: strength of the Lord ","Coos: top ","Corinth: which is satisfied; ornament; beauty ","Cornelius: of a horn ",
                "Cosam: divining ","Coz: a thorn ","Cozbi: a liar; sliding away ","Crescens: growing; increasing ","Crete: carnal; fleshly ","Crispus: curled ","Cush: Cushan ",
                "Cuth: Cuthah ","Cyprus: fair; fairness ","Cyrene: a wall; coldness; the floor ","Cyrenius: who governs ","Cyrus: as miserable; as heir"
        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.cText);
        text.setText(randomName);

        cList = (ListView) findViewById(R.id.cList);
        cAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        cList.setAdapter(cAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        cAd =findViewById(R.id.cAd);
        AdRequest cReq = new AdRequest.Builder().build();
        cAd.loadAd(cReq);
    }
}
