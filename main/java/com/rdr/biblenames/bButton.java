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

public class bButton extends AppCompatActivity {

    private AdView bAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_button);

        Random r = new Random();
        ListView bList;
        ArrayAdapter<String> bAdapter;

        final String[] nameArray = new String[]{
                "Baal","Baalah","Baalath","Baalath-beer","Baal-berith","Baale","Baal-gad","Baal-hamon",
                "Baal-hermon","Baali","Baalim","Baalis","Baal-meon","Baal-peor","Baal-perazim","Baal-shalisha",
                "Baal-tamar","Baal-zebub","Baal-zephon","Baanah","Baara","Baaseiah","Baasha","Babel",
                "Babylon","Baca","Bahurim","Bajith","Balaam","Baladan","Balak","Bamah","Barabbas",
                "Barachel","Barachias","Barak","Barjesus","Barjona","Barnabas","Barsabas","Bartholomew",
                "Bartimeus","Baruch","Barzillai","Bashan","Bashemath","Bathsheba","Bathsuha","Bealiah",
                "Bealoth","Bebai","Becher","Bechorath","Bedad","Bedaiah","Bedan","Beeliada","Beelzebub",
                "Beer","Beera","Beerelim","Beeri","Beer-lahai-roi","Beeroth","Beersheba","Behemoth","Bekah",
                "Belah","Belial","Belshazzar","Belteshazzar","Ben","Benaiah","Ben-ammi","Beneberak",
                "Bene-jaakan","Benhadad","Benhail","Benhanan","Benimi","Benjamin","Beno","Benoni","Benzoheth",
                "Beon","Beor","Bera","Berachah","Berachiah","Beraiah","Berea","Bered","Beri","Beriah",
                "Berith","Bernice","Berodach-baladan","Berothai","Berothath","Besai","Besodeiah","Besor",
                "Betah","Beten","Bethabara","Bethanath","Bethany","Betharabah","Beth-aram","Beth-aven",
                "Beth-azmaveth","Beth-baalmeon","Beth-barah","Beth-birei","Beth-car","Beth-dagon","Beth-diblathaim",
                "Beth-el","Bethemek","Bether","Bethesda","Beth-ezal","Beth-gader","Beth-gamul",
                "Beth-haccerem","Beth-haran","Beth-horon","Beth-lebaoth","Beth-lehem","Beth-marcaboth",
                "Beth-meon","Beth-nimrah","Beth-palet","Beth-pazzez","Beth-peor","Bethphage","Beth-phelet",
                "Beth-rapha","Bethsaida","Bethshan","Beth-shemesh","Bethuel","Beth-zur","Betonim","Beulah",
                "Bezai","Bezaleel","Bezek","Bezer","Bichri","Bidkar","Bigthan","Bigvai","Bildad","Bileam",
                "Bilgah","Bilhah","Bilshan","Binea","Binnui","Birsha","Bishlam","Bithiah","Bithron",
                "Bithynia","Bizjothjah","Blastus","Boanerges","Boaz","Bocheru","Bochim","Bohan","Boskath",
                "Boson","Bozez","Bozrah","Bukki","Bukkiah","Bul","Bunah","Bunni","Buz","Buzi"
        };

        final String[] wholeNameArray = new String[]{
                "Baal: master; lord ","Baalah: her idol; she that is governed or subdued; a spouse ","Baalath: a rejoicing; our proud lord ","Baalath-beer: subjected pit ","Baal-berith: idol of the covenant ","Baale: same as Baalath ","Baal-gad: idol of fortune or felicity ","Baal-hamon: who rules a crowd ","Baal-hermon: possessor of destruction or of a thing cursed ","Baali: my idol; lord over me ","Baalim: idols; masters; false gods ","Baalis: a rejoicing; a proud lord ","Baal-meon: idol or master of the house ","Baal-peor: master of the opening ","Baal-perazim: god of divisions ","Baal-shalisha: the god that presides over three; the third idol ","Baal-tamar: master of the palm-tree ","Baal-zebub: god of the fly ","Baal-zephon: the idol or possession of the north; hidden; secret ","Baanah: in the answer; in affliction ","Baara: a flame; purging ","Baaseiah: in making; in pressing together ","Baasha: he that seeks ","Babel: confusion; mixture ","Babylon: same as Babel ","Baca: a mulberry-tree ","Bahurim: choice; warlike; valiant ","Bajith: a house ","Balaam: the ancient of the people; the destruction of the people ","Baladan: one without judgment ","Balak: who lays waste or destroys ","Bamah: an eminence or high place ","Barabbas: son of shame ","Barachel: that bows before God ","Barachias: same as Barachel ","Barak: thunder ","Barjesus: son of Jesus or Joshua ","Barjona: son of a Jona; of a dove ","Barnabas: son of the prophet ","Barsabas: son of return; son of rest ","Bartholomew: a son that suspends the waters ","Bartimeus: son of the honorable ","Baruch: who is blessed ","Barzillai: son of contempt; made of iron ","Bashan: in the tooth ","Bashemath: perfumed; confusion of death; in desolation ","Bathsheba: the seventh daughter; the daughter of satiety ","Bathsuha: same as Bathsheba ","Bealiah: the god of an idol; in an assembly ","Bealoth: cast under ","Bebai: void ","Becher: first begotten; first fruits ","Bechorath: first fruits ","Bedad: alone; solitary ","Bedaiah: or Bedeiah ","Bedan: according to judgment ","Beeliada: an open idol ","Beelzebub: same as Baalzebub; lord of flies","Beer: a well ","Beera: a well; declaring ","Beerelim: the well of Elim ","Beeri: my well ","Beer-lahai-roi: the well of him that liveth and seeth me ","Beeroth: wells; explaining ","Beersheba: the well of an oath; the seventh well ","Behemoth: beasts ","Bekah: half a shekel ","Belah: destroying ","Belial: wicked ","Belshazzar: master of the treasure ","Belteshazzar: who lays up treasures in secret ","Ben: a son ","Benaiah: son of the Lord ","Ben-ammi: son of my people ","Beneberak: sons of lightning ","Bene-jaakan: sons of sorrow ","Benhadad: son of Hadad ","Benhail: son of strength ","Benhanan: son of grace ","Benjamin: son of the right hand ","Benimi: our sons ","Beno: his son ","Benoni: son of my sorrow ","Benzoheth: son of separation ","Beon: in affliction ","Beor: burning; foolish; mad ","Bera: a well; declaring ","Berachah: blessing; bending the knee ","Berachiah: speaking well of the Lord ","Beraiah: the choosing of the Lord ","Berea: heavy; weighty ","Bered: hail ","Beri: my son; my corn ","Beriah: in fellowship; in envy ","Berith: covenant ","Bernice: one that brings victory ","Berodach-baladan: the son of death ","Berothai: wells; a cypress ","Berothath: of a well ","Besai: a despising; dirty ","Besodeiah: counsel of the Lord ","Besor: glad news; incarnation ","Betah: confidence ","Beten: belly ","Bethabara: the house of confidence ","Bethanath: house of affliction ","Bethany: the house of song; the house of affliction ","Betharabah: house of sweet smell ","Beth-aram: house of height ","Beth-aven: the house of vanity; of iniquity of trouble ","Beth-azmaveth: house of death's strength ","Beth-baalmeon: an idol of the dwelling-place ","Beth-barah: the chosen house ","Beth-birei: the house of my Creator ","Beth-car: the house of the lamb ","Beth-dagon: the house of corn ","Beth-diblathaim: house of dry figs ","Beth-el: the house of God ","Bethemek: house of deepness ","Bether: division ","Bethesda: house of pity or mercy ","Beth-ezal: a neighbor's house ","Beth-gader: a house for a mouse ","Beth-gamul: house of recompense ","Beth-haccerem: house of the vineyard ","Beth-haran: house of grace ","Beth-horon: house of wrath ","Beth-lebaoth: house of lionesses ","Beth-lehem: house of bread ","Beth-marcaboth: house of bitterness wiped out ","Beth-meon: house of the dwelling-place ","Beth-nimrah: house of rebellion ","Beth-palet: house of expulsion ","Beth-pazzez: house of dividing asunder ","Beth-peor: house of gaping ","Bethphage: house of my month ","Beth-phelet: same as Beth-palet ","Beth-rapha: house of health ","Bethsaida: house of fruits ","Bethshan: or Beth-shean ","Beth-shemesh: house of the sun ","Bethuel: filiation of God ","Beth-zur: house of a rock ","Betonim: bellies ","Beulah: married ","Bezai: eggs ","Bezaleel: in the shadow of God ","Bezek: lightning; in the chains ","Bezer: vine branches ","Bichri: first-born; first fruits ","Bidkar: in compunction ","Bigthan: in the press; giving meat ","Bigvai: in my body ","Bildad: old friendship ","Bileam: the ancient of the people; the devourer ","Bilgah: ancient countenance ","Bilhah: or Bilhan ","Bilshan: in the tongue ","Binea: son of the Lord ","Binnui: building ","Birsha: an evil; a son who beholds ","Bishlam: in peace ","Bithiah: daughter of the Lord ","Bithron: divisions ","Bithynia: violent precipitation ","Bizjothjah: despite ","Blastus: that buds or brings forth ","Boanerges: son of thunder ","Boaz: or Booz; swiftness ","Bocheru: the first born ","Bochim: the place of weeping; or of mulberry-trees ","Bohan: in them ","Boskath: in poverty ","Boson: taking away ","Bozez: mud; bog ","Bozrah: in tribulation or distress ","Bukki: void ","Bukkiah: the dissipation of the Lord ","Bul: old age; perishing ","Bunah: building; understanding ","Bunni: building me ","Buz: despised; plundered ","Buzi: my contempt "

        };


        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.bText);
        text.setText(randomName);

        bList = (ListView) findViewById(R.id.bList);
        bAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        bList.setAdapter(bAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        bAd =findViewById(R.id.bAd);
        AdRequest bReq = new AdRequest.Builder().build();
        bAd.loadAd(bReq);
    }
}
