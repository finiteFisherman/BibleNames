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



public class aButton extends AppCompatActivity {

    private AdView aAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_button);

        Random r = new Random();
        ListView aList;
        ArrayAdapter<String> aAdapter;

        final String[] nameArray = new String[]{
                "Aaron","Abaddon","Abagtha","Abana","Abarim","Abba","Abda","Abdeel","Abdi","Abdiel",
                "Abdon","Abednego","Abel","Abel","Abel-beth-maachah","Abel-maim","Abel-meholah","Abel-mizraim",
                "Abel-shittim","Abez","Abi","Abiah","Abi-albon","Abiasaph","Abiathar","Abib","Abidah","Abidan",
                "Abiel","Abiezer","Abigail","Abihail","Abihu","Abihud","Abijah","Abijam","Abilene","Abimael",
                "Abimelech","Abinadab","Abinoam","Abiram","Abishag","Abishai","Abishalom","Abishua","Abishur",
                "Abital","Abitub","Abiud","Abner","Abraham","Abram","Absalom","Accad","Accho","Aceldama","Achab",
                "Achaia","Achaicus","Achan","Achaz","Achbor","Achim","Achish","Achmetha","Achor","Achsah","Achshaph",
                "Achzib","Adadah","Adah","Adaiah","Adaliah","Adam","Adamah","Adami","Adar","Adbeel","Addi","Addin",
                "Addon","Adiel","Adin","Adithaim","Adlai","Admah","Admatha","Adna","Adnah","Adoni-bezek","Adonijah",
                "Adonikam","Adoniram","Adoni-zedek","Adoraim","Adoram","Adrammelech","Adramyttium","Adriel","Adullam",
                "Adummim","Aeneas","Aenon","Agabus","Agag","Agar","Agee","Agrippa","Agur","Ahab","Aharah","Aharhel",
                "Ahasbai","Ahasuerus","Ahava","Ahaz","Ahaziah","Ahi","Ahiah","Ahiam","Ahian","Ahiezer","Ahihud","Ahijah",
                "Ahikam","Ahilud","Ahimaaz","Ahiman","Ahimelech","Ahimoth","Ahinadab","Ahinoam","Ahio","Ahira","Ahiram",
                "Ahisamach","Ahishahur","Ahishar","Ahithophel","Ahitub","Ahlab","Ahlai","Ahoah","Aholah","Aholiab","Aholibah",
                "Aholibamah","Ahumai","Ahuzam","Ahuzzah","Ai","Aiah","Aiath","Aijeleth-Shahar","Ain","Ajalon","Akkub","Akrabbim",
                "Alammelech","Alemeth","Alexander","Alian","Alleluia","Allon","Allon-bachuth","Almodad","Almon","Almon-diblathaim",
                "Alpheus","Alush","Alvah","Amad","Amal","Amalek","Aman","Amana","Amariah","Amasa","Amasai","Amashai","Amashi-ali",
                "Amaziah","Ami","Aminadab","Amittai","Ammah","Ammi","Ammiel","Ammihud","Ammi-nadab","Ammishaddai","Ammizabad","Ammon",
                "Amnon","Amok","Amon","Amorite","Amos","Amoz","Amplias","Amram","Amraphel","Amzi","Anab","Anah","Anaharath","Anak",
                "Anamim","Anammelech","Anani","Ananias","Anathema","Anathoth","Andrew","Andronicus","Anem","Aner","Aniam","Anim",
                "Anna","Annas","Antichrist","Antioch","Antipas","Antipatris","Antothijah","Anub","Apelles","Apharsathchites",
                "Aphek","Aphiah","Apocalypse","Apocrypha","Apollonia","Apollonius","Apollos","Apollyon","Appaim","Apphia",
                "Aquila","Ar","Ara","Arab","Arabia","Arad","Arah","Aram","Aran","Ararat","Araunah","Arba","Archelaus","Archippus",
                "Arcturus","Ard","Ardon","Areli","Areopagus","Aretas","Argob","Ariel","Arimathea","Arioch","Aristarchus","Aristobulus",
                "Armageddon","Arnon","Aroer","Arpad","Arphaxad","Artaxerxes","Artemas","Arumah","Asa","Asahel","Asaiah","Asaph",
                "Asareel","Asenath","Ashan","Ashbel","Ashdod","Asher","Ashima","Ashkenaz","Ashnah","Ashriel","Ashtaroth","Ashur",
                "Asia","Asiel","Askelon","Asnapper","Asriel","Asshurim","Assir","Assos","Assur","Assyria","Asuppim","Asyncritus",
                "Atad","Atarah","Ataroth","Ataroth-addar","Ater","Athach","Athaiah","Athaliah","Athlai","Attai","Attalia","Attalus",
                "Augustus","Ava","Aven","Avim","Avith","Azaliah","Azaniah","Azareel","Azariah","Azaz","Azazel","Azaziah","Azekah",
                "Azgad","Azmaveth","Azmon","Aznoth-tabor","Azor","Azotus","Azriel","Azrikam","Azubah","Azur","Azzan","Azzur"
        };

        final String[] wholeNameArray = new String[]{
                "Aaron: a teacher; lofty; mountain of strength","Abaddon: the destroyer","Abagtha: father of the wine-press ",
                "Abana: made of stone; a building ","Abarim: passages; passengers ","Abba: father ","Abda: a servant; servitude ",
                "Abdeel: a vapor; a cloud of God","Abdi: my servant ","Abdiel: servant of God ",
                "Abdon: servant; cloud of judgment ","Abednego: servant of light; shining ","Abel: vanity; breath; vapor ",
                "Abel: a city; mourning ","Abel-beth-maachah: mourning to the house of Maachah ","Abel-maim: mourning of waters ",
                "Abel-meholah: mourning of sickness ","Abel-mizraim: the mourning of Egyptians ","Abel-shittim: mourning of thorns ",
                "Abez: an egg; muddy ","Abi: my father ","Abiah: the Lord is my father ","Abi-albon: most intelligent father ",
                "Abiasaph: consuming father; gathering ","Abiathar: excellent father; father of the remnant ","Abib: green fruit; ears of corn ",
                "Abidah: father of knowledge ","Abidan: father of judgment ","Abiel: God my father ","Abiezer: father of help ","Abigail: the father's joy ",
                "Abihail: the father of strength ","Abihu: he is my father ","Abihud: father of praise; confession ","Abijah: the Lord is my father ",
                "Abijam: father of the sea ","Abilene: the father of mourning ","Abimael: a father sent from God ","Abimelech: father of the king ",
                "Abinadab: father of a vow ","Abinoam: father of beauty ","Abiram: high father; father of deceit ","Abishag: ignorance of the father ",
                "Abishai: the present of my father ","Abishalom: father of peace ","Abishua: father of salvation ","Abishur: father of the wall; father of uprightness ",
                "Abital: the father of the dew; or of the shadow ","Abitub: father of goodness ","Abiud: father of praise ","Abner father of light ","Abram: high father ",
                "Abraham: father of a great multitude ","Absalom: father of peace ","Accad: a vessel; pitcher; spark ","Accho: close; pressed together ","Aceldama: field of blood ",
                "Achab: brother of the father ","Achaia: grief; trouble ","Achaicus: a native of Achaia; sorrowing; sad ","Achan: or Achar ","Achaz: one that takes ",
                "Achbor: a rat; bruising ","Achim: preparing; revenging; confirming ","Achish: thus it is; how is this ","Achmetha: brother of death ","Achor: trouble ",
                "Achsah: adorned; bursting the veil ","Achshaph: poison; tricks ","Achzib: liar; lying; one that runs ","Adadah: testimony of the assembly ","Adah: an assembly ",
                "Adaiah: the witness of the Lord ","Adaliah: one that draws water; poverty; cloud; death ","Adam earthy; red ","Adamah: red earth; of blood ","Adami: my man; red; earthy; human ",
                "Adar: high; eminent ","Adbeel: vapor ","Addi: my witness; adorned; prey ","Addin: adorned; delicious; voluptuous ","Addon: basis; foundation; the Lord ","Adiel: the witness of the Lord ",
                "Adin: or Adina ","Adithaim: assemblies; testimonies ","Adlai: my witness; my ornament ","Admah: earthy; red; bloody ","Admatha: a cloud of death; a mortal vapor ","Adna: pleasure; delight ",
                "Adnah: eternal rest ","Adoni-bezek: the lightning of the Lord; the Lord of lightning ","Adonijah: the Lord is my master ","Adonikam: the Lord is raised ",
                "Adoniram: my Lord is most high; Lord of might and elevation ","Adoni-zedek: justice of the Lord; lord of justice ","Adoraim: strength of the sea ",
                "Adoram: their beauty; their power ","Adrammelech: the cloak ","Adramyttium: the court of death ","Adriel: the flock of God ","Adullam: their testimony; their prey; their ornament ",
                "Adummim: earthy; red; bloody things ","Aeneas: praised; praiseworthy ","Aenon: a cloud; fountain; his eye ","Agabus: a locust; the father's joy or feast ","Agag: roof; upper floor ",
                "Agar: or Hagar ","Agee: a valley; deepness ","Agrippa: one who causes great pain at his birth ","Agur: stranger; gathered together ","Ahab: uncle ",
                "Aharah: a smiling brother; a meadow of a sweet savor ","Aharhel: another host; the last sorrow; a brother's sheep ","Ahasbai: trusting in me; a grown-up brother ",
                "Ahasuerus: prince; head; chief ","Ahava: essence; being; generation ","Ahaz: one that takes or possesses ","Ahaziah: seizure; vision of the Lord ","Ahi: my brother; my brethren ",
                "Ahiah: brother of the Lord ","Ahiam: mother's brother; brother of a nation ","Ahian: brother of wine ","Ahiezer: brother of assistance ","Ahihud: brother of vanity ",
                "Ahijah: same with Ahiah ","Ahikam: a brother who raises up or avenges ","Ahilud: a brother born ","Ahimaaz: a brother of the council ","Ahiman: brother of the right hand ",
                "Ahimelech: my brother is a king; my king's brother ","Ahimoth: brother of death ","Ahinadab: a willing brother; brother of a vow ","Ahinoam: beauty of the brother; brother of motion ",
                "Ahio: his brother; his brethren ","Ahira: brother of iniquity; brother of the shepherd ","Ahiram: brother of craft ","Ahisamach: brother of strength ",
                "Ahishahur: brother of the morning or dew; brother of blackness ","Ahishar: brother of a prince; brother of a song ","Ahithophel: brother of ruin or folly ","Ahitub: brother of goodness ","Ahlab: made of milk ","Ahlai: beseeching; sorrowing; expecting ","Ahoah: a live brother; my thorn or thistle ","Aholah: his tabernacle; his tent ","Aholiab: the tent of the father ","Aholibah: my tent ","Aholibamah: my tabernacle is exalted ","Ahumai: a meadow of waters; a brother of waters ","Ahuzam: their taking or possessing vision ","Ahuzzah: possession; seizing; collecting ","Ai: or Hai ","Aiah: vulture ","Aiath: same as Ai; an hour; eye; fountain ","Aijeleth-Shahar: the land of the morning ","Ain: same as Aiath ","Ajalon: a chain; strength; a stag ","Akkub: foot-print; supplanting; crookedness; lewdness ","Akrabbim: scorpions ","Alammelech: God is king ","Alemeth: hiding; youth; worlds; upon the dead ","Alexander: one who assists men ","Alian: high ","Alleluia: praise the Lord ","Allon: an oak; strong ","Allon-bachuth: the oak of weeping ","Almodad: measure of God ","Almon: hidden ","Almon-diblathaim: hidden in a cluster of fig trees ","Alpheus: a thousand; learned; chief ","Alush: mingling together ","Alvah: his rising up; his highness ","Amad: people of witness; a prey ","Amal: labor; iniquity ","Amalek: a people that licks up ","Aman: mother; fear of them ","Amana: integrity; truth; a nurse ","Amariah: the Lord says; the integrity of the Lord ","Amasa: sparing the people ","Amasai: strong ","Amashai: the people's gift ","Amashi-ali: same as Amaziah ","Ami: mother; fear; people ","Amaziah: the strength of the Lord ","Aminadab: same as Amminadab ","Amittai: true; fearing ","Ammah: my ","Ammi: same as Ammah ","Ammiel: the people of God ","Ammihud: people of praise ","Ammi-nadab: my people is liberal ","Ammishaddai: the people of the Almighty; the Almighty is with me ","Ammizabad: dowry of the people ","Ammon: a people; the son of my people ","Amnon: faithful and true; tutor ","Amok: a valley; a depth ","Amon: faithful; true ","Amorite: bitter; a rebel; a babbler ","Amos: loading; weighty ","Amoz: strong; robust ","Amplias: large; extensive ","Amram: an exalted people; their sheaves; handfuls of corn ","Amraphel: one that speaks of secrets ","Amzi: strong ","Anab a grape; a knot ","Anah: one who answers; afflicted ","Anaharath: dryness ","Anak: a collar; ornament ","Anamim: a fountain; answer; affliction ","Anammelech: answer; poverty of the king ","Anani: a cloud; prophecy; divination ","Ananias: or Ananiah ","Anathema: separated; set apart ","Anathoth: or Anath ","Andrew: a strong man ","Andronicus: a man excelling others ","Anem: or Anen ","Aner: answer; song; affliction ","Aniam: a people; the strength or sorrow of people ","Anim: answerings; singings; afflicted ","Anna: gracious; one who gives ","Annas: one who answers; humble ","Antichrist: an adversary to Christ ","Antioch: speedy as a chariot ","Antipas: for all ","Antipatris: for ","Antothijah: answers or songs of the Lord; afflictions ","Anub: same as Anab ","Apelles: exclusion; separation ","Apharsathchites: or Apharsites (from a root meaning) dividing or rending ","Aphek: or Aphekah ","Aphiah: speaking ","Apocalypse: uncovering ","Apocrypha: hidden ","Apollonia: perdition ","Apollonius: destroying ","Apollos: one who destroys; destroyer ","Apollyon: a destroyer ","Appaim: face; nostrils ","Apphia: productive; fruitful ","Aquila: an eagle ","Ar: awakening; uncovering ","Ara: cursing; seeing ","Arab: multiplying; sowing sedition; a window; a locust ","Arabia: evening; desert; ravens ","Arad: a wild ass; a dragon ","Arah: the way; a traveler ","Aram: highness ","Aran: an ark; their curse ","Ararat: the curse of trembling ","Araunah: ark; song; joyful cry ","Arba: four ","Archelaus: the prince of the people ","Archippus: a master of horses ","Arcturus: a gathering together ","Ard: one that commands; he that descends ","Ardon: ruling; a judgment of malediction ","Areli: the light or vision of God ","Areopagus: the hill of Mars ","Aretas: agreeable ","Argob: a turf ","Ariel: altar; light or lion of God ","Arimathea: a lion dead to the Lord ","Arioch: long; great; tall ","Aristarchus: the best prince ","Aristobulus: a good counselor ","Armageddon: hill of fruits; mountain of Megiddo ","Arnon: rejoicing; sunlight ","Aroer: heath; tamarisk ","Arpad: the light of redemption ","Arphaxad: a healer; a releaser ","Artaxerxes: the silence of light; fervent to spoil ","Artemas: whole ","Arumah: high; exalted ","Asa: physician; cure ","Asahel: creature of God ","Asaiah: the Lord hath wrought ","Asaph: who gathers together ","Asareel: the beatitude of God ","Asenath: peril; misfortune ","Ashan: smoke ","Ashbel: an old fire ","Ashdod: effusion; inclination; theft ","Asher: happiness ","Ashima: crime; offense ","Ashkenaz: a fire that spreads ","Ashnah: change ","Ashriel: same as Asareel ","Ashtaroth: or Ashtoreth ","Ashur: who is happy; or walks; or looks ","Asia: muddy; boggy ","Asiel: the work of God ","Askelon: weight; balance; fire of infamy ","Asnapper: unhappiness; increase of danger ","Asriel: help of God ","Assir: prisoner; fettered ","Asshurim: liers in want; beholders ","Assos: approaching; coming near ","Assur: same as Ashur ","Assyria: country of Assur or Ashur ","Asuppim: gatherings ","Asyncritus: incomparable ","Atad: a thorn ","Atarah: a crown ","Ataroth: crowns ","Ataroth-addar: crowns of power ","Ater: left hand; shut ","Athach: thy time ","Athaiah: the Lord's time ","Athaliah: the time of the Lord ","Athlai: my hour or time ","Attai: same as Athlai ","Attalia: that increases or sends ","Attalus: increased ","Augustus: increased ","Ava: or Ivah ","Aven: iniquity; force; riches; sorrow ","Avim: wicked or perverse men ","Avith: wicked ","Azaliah: near the Lord ","Azaniah: hearing the Lord; the Lord's weapons ","Azareel: help of God ","Azariah: he that hears the Lord ","Azaz: strong one ","Azazel: the scape-goat ","Azaziah: strength of the Lord ","Azekah: strength of walls ","Azgad: a strong army; a gang of robbers ","Azmaveth: strong death; a he-goat ","Azmon: bone of a bone; our strength ","Aznoth-tabor: the ears of Tabor; the ears of purity or contrition ","Azor: a helper; a court ","Azotus: the same as Ashdod ","Azriel: same as Asriel ","Azrikam: help ","Azubah: forsaken ","Azur: he that assists or is assisted ","Azzan: their strength ","Azzur: same as Azur",
        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.aText);
        text.setText(randomName);

        aList = (ListView) findViewById(R.id.aList);
        aAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        aList.setAdapter(aAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        aAd =findViewById(R.id.aAd);
        AdRequest aReq = new AdRequest.Builder().build();
        aAd.loadAd(aReq);
    }
}
