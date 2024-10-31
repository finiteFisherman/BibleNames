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

public class eButton extends AppCompatActivity {

    private AdView eAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_button);

        Random r = new Random();
        ListView eList;
        ArrayAdapter<String> eAdapter;

        final String[] nameArray = new String[]{
                "Ebal","Ebed","Ebed-melech","Eben-ezer","Eber","Ebiasaph","Ebronah","Ecclesiastes",
                "Ed","Eden","Eder","Edom","Edrei","Eglah","Eglaim","Eglon","Egypt","Ehud","Eker","Ekron",
                "Eladah","Elah","Elam","Elasah","Elath","El-beth-el","Eldaah","Eldad","Elead","Elealeh",
                "Eleazar","El-elohe-Israel","Eleph","Elhanan","Eli","Eli","Eliab","Eliada","Eliah","Eliahba",
                "Eliakim","Eliam","Elias","Eliasaph","Eliashib","Eliathah","Elidad","Eliel","Elienai","Eliezer",
                "Elihoreph","Elihu","Elijah","Elika","Elim","Elimelech","Elioenai","Eliphal","Eliphalet","Eliphaz",
                "Elisabeth","Elisha","Elishah","Elishama","Elishaphat","Elisheba","Elishua","Eliud","Elizur","Elkanah",
                "Elkeshai","Elkoshite","Ellasar","Elmodam","Elnaam","Elnathan","Elohi","Elon","Elon-beth-hanan","Elpaal",
                "Elpalet","Eltekeh","Elteketh","Eltolad","Elul","Eluzai","Elymas","Elzabad","Elzaphan","Emims","Emmanuel",
                "Emmaus","Emmor","Enam","Enan","En-dor","Eneas","En-eglaim","En-gannim","En-gedi","En-haddah","En-hakkore",
                "En-hazor","En-mishpat","Enoch","Enon","Enos","En-rimmon","En-rogel","En-shemesh","En-tappuah","Epaphras",
                "Epaphroditus","Epenetus","Ephah","Epher","Ephes-dammim","Ephesus","Eph-lal","Ephphatha","Ephraim","Ephratah",
                "Ephron","Epicurean","Er","Eran","Erastus","Erech","Esaias","Esar-haddon","Esau","Esek","Esh-baal","Esh-ban",
                "Eshcol","Eshean","Eshek","Eshkalon","Eshtaol","Eshtemoa","Esli","Esmachiah","Esrom","Esther","Etam","Etham",
                "Ethan","Ethanim","Ethbaal","Ether","Ethiopia","Ethnan","Ethni","Eubulus","Eunice","Euodias","Euphrates","Eutychus",
                "Eve","Evi","Evil-merodach","Exodus","Ezbon","Ezekiel","Ezel","Ezem","Ezer","Ezion-geber","Ezra","Ezri"
        };

        final String[] wholeNameArray = new String[]{
                "Ebal: ancient heaps ","Ebed: a servant; laborer ","Ebed-melech: the king's servant ","Eben-ezer: the stone of help ","Eber: one that passes; anger ","Ebiasaph: a father that gathers or adds ","Ebronah: passage over; being angry ","Ecclesiastes: a preacher ","Ed: witness ","Eden: pleasure; delight ","Eder: a flock ","Edom: red ","Edrei: a very great mass ","Eglah: heifer; chariot; round ","Eglaim: drops of the sea ","Eglon: same as Eglah ","Egypt: that troubles or oppresses; anguish ","Ehud: he that praises ","Eker: barren ","Ekron: barrenness; torn away ","Eladah: the eternity of God ","Elah: an oak; a curse; perjury ","Elam: a young man; a virgin; a secret ","Elasah: the doings of God ","Elath: a hind; strength; an oak ","El-beth-el: the God of Bethel ","Eldaah: knowledge of God ","Eldad: favored of God; love of God ","Elead: witness of God ","Elealeh: burnt-offering of God ","Eleazar: help of God ","El-elohe-Israel: God ","Eleph: learning ","Elhanan: grace ","Eli: the offering or lifting up ","Eliab: God is my father; God is the father ","Eliada: knowledge of God ","Eliah: God the Lord ","Eliahba: my God the Father ","Eliakim: resurrection of God ","Eliam: the people of God ","Elias: same as Elijah ","Eliasaph: the Lord increaseth ","Eliashib: the God of conversion ","Eliathah: thou art my God ","Elidad: beloved of God ","Eliel: God ","Elienai: the God of my eyes ","Eliezer: help ","Elihoreph: god of winter ","Elihu: he is my God himself ","Elijah: God the Lord ","Elika: pelican of God ","Elim: the rams; the strong; stags ","Elimelech: my God is king ","Elioenai: toward him are mine eyes; or to him are my fountains ","Eliphal: a miracle of God ","Eliphalet: the God of deliverance ","Eliphaz: the endeavor of God ","Elisabeth: or Elizabeth; my God is an oath","Elisha: salvation of God ","Elishah: it is God; the lamb of God God that gives help ","Elishama: God of hearing ","Elishaphat: my God judgeth ","Elisheba: same as Elisabeth; my God is an oath ","Elishua: God is my salvation ","Eliud: God is my praise ","Elizur: God is my strength; my rock; rock of God ","Elkanah: God the zealous; the zeal of God ","Elkeshai: hardiness or rigor of God ","Ellasar: revolting from God ","Elkoshite: a man of Elkeshai ","Elmodam: the God of measure ","Elnaam: God's fairness ","Elnathan: God hath given; the gift of God ","Elohi: or Elohim; the living God ","Elon: oak; grove; strong ","Elon-beth-hanan: the house of grace or mercy ","Elpaal: God's work ","Elpalet: same as Eliphalet; God has judged ","Eltekeh: of grace or mercy ","Elteketh: the case of God ","Eltolad: the generation of God ","Elul: cry or outcry ","Eluzai: God is my strength ","Elymas: a magician ","Elzabad: the dowry of God ","Elzaphan: God of the northeast wind ","Emims: fears; terrors; formidable; people ","Emmanuel: God with us ","Emmaus: people despised or obscure ","Emmor: an ass ","Enam: fountain ","Enan: cloud ","En-dor: fountain ","Eneas: laudable ","En-eglaim: eye ","En-gannim: eye ","En-gedi: eye ","En-haddah: quick sight; well of gladness ","En-hakkore: fountain of him that called or prayed ","En-hazor: the grass of the well ","En-mishpat: fountain of judgment ","Enoch: dedicated; disciplined ","Enon: cloud; mass of darkness; fountain; eye ","Enos: mortal man; sick; despaired of; forgetful ","En-rimmon: well of weight ","En-rogel: the fuller's fountain; the well of searching ","En-shemesh: fountain ","En-tappuah: fountain of an apple ","Epaphras: covered with foam ","Epaphroditus: agreeable; handsome ","Epenetus: laudable; worthy of praise ","Ephah: weary; tired ","Epher: dust; lead ","Ephes-dammim: effusion of blood ","Ephesus: desirable ","Eph-lal: judging; praying ","Ephphatha: be opened ","Ephraim: fruitful; increasing ","Ephratah: or Ephrath; fruitful","Ephron: dust ","Epicurean: follower of Epicurus ","Er: watchman ","Eran: follower ","Erastus: lovely ","Erech: length; health; physic ","Eri: my city ","Esaias: same as Isaiah ","Esar-haddon: that closes the point; joy; cheerfulness ","Esau: he that acts or finishes ","Esek: contention ","Esh-baal: the fire of the idol ","Esh-ban: fire of the sun ","Eshcol: bunch of grapes ","Eshean: held up ","Eshek: violence ","Eshkalon: same as Askelon ","Eshtaol: a strong woman ","Eshtemoa: the bosom of a woman ","Esli: near me; he who separates ","Esmachiah: joined to the Lord ","Esrom: dart of joy; division of a song ","Esther: secret; hidden ","Etam: their bird ","Etham: their strength; their sign ","Ethan: strong; the gift of the island ","Ethanim: strong; valiant ","Ethbaal: toward the idol ","Ether: talk ","Ethiopia: blackness; heat ","Ethnan: gift ","Ethni: strong ","Eubulus: prudent; good counselor ","Eunice: good victory ","Euodias: sweet scent ","Euphrates: that makes fruitful ","Eutychus: happy; fortunate ","Eve: living; enlivening ","Evi: unjust ","Evil-merodach: the fool of Merodach; the fool grinds bitterly ","Exodus: going out ","Ezbon: hastening to understand ","Ezekiel: the strength of God ","Ezel: going abroad; walk ","Ezem: a bone ","Ezer: a help ","Ezion-geber: the wood of the man ","Ezra: help; court ","Ezri: my help "

        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.eText);
        text.setText(randomName);

        eList = (ListView) findViewById(R.id.eList);
        eAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        eList.setAdapter(eAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        eAd =findViewById(R.id.eAd);
        AdRequest eReq = new AdRequest.Builder().build();
        eAd.loadAd(eReq);
    }
}
