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

public class zButton extends AppCompatActivity {

    private AdView zAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_z_button);

        Random r = new Random();
        ListView zList;
        ArrayAdapter<String> zAdapter;

        final String[] nameArray = new String[]{
                "Zaanaim","Zaanannim","Zaavan","Zabad","Zabbai","Zabbud","Zabdi","Zabdiel","Zaccai",
                "Zacchaeus","Zaccur","Zachariah","Zacharias","Zacher","Zadok","Zaham","Zair","Zalaph",
                "Zalmon","Zalmonah","Zalmunna","Zamzummims","Zanoah","Zaphnath-paaneah","Zareathites",
                "Zared","Zarephath","Zaretan","Zareth-shahar","Zarhites","Zartanah","Zarthan","Zatthu",
                "Zattu","Zavan","Zaza","Zebadiah","Zebah","Zebaim","Zebedee","Zebina","Zeboiim","Zeboim",
                "Zebudah","Zebul","Zebulonite","Zebulun","Zebulunites","Zechariah","Zedad","Zedekiah",
                "Zeeb","Zelah","Zelek","Zelophehad","Zelotes","Zelzah","Zemaraim","Zemarite","Zemira",
                "Zenan","Zenas","Zephaniah","Zephath","Zephathah","Zephi","Zepho","Zephon","Zephonites",
                "Zer","Zerah","Zerahiah","Zered","Zereda","Zeredathah","Zererath","Zeresh","Zereth","Zeri",
                "Zeror","Zeruah","Zerubbabel","Zeruiah","Zetham","Zethan","Zethar","Zia","Ziba","Zibeon",
                "Zibia","Zibiah","Zichri","Ziddim","Zidkijah","Zidon","Zidonians","Zif","Ziha","Ziklag",
                "Zillah","Zilpah","Zilthai","Zimmah","Zimran","Zimri","Zin","Zina","Zion","Zior","Ziph",
                "Ziphah","Ziphims","Ziphion","Ziphites","Ziphron","Zippor","Zipporah","Zithri","Ziz","Ziza",
                "Zizah","Zoan","Zoar","Zoba","Zobah","Zobebah","Zohar","Zoheleth","Zoheth","Zophah","Zophai",
                "Zophar","Zophim","Zorah","Zorathites","Zoreah","Zorites","Zorobabel","Zuar","Zuph","Zur",
                "Zuriel","Zurishaddai","Zuzim"
        };

        final String[] wholeNameArray = new String[]{
                "Zaanannim: movings; a person asleep","Zaavan: trembling","Zabad: dowry; endowed","Zabbai: flowing","Zaccai: pure meat; just","Zaccheus: pure; clean; just","Zaccur: of the male kind; mindful","Zachariah: memory of the Lord","Zadok: just; justified","Zaham: crime; filthiness; impurity","Zair: little; afflicted; in tribulation","Zalaph: shadow; ringing; shaking","Zalmon: his shade; his image","Zalmonah: the shade; the sound of the number; his image","Zalmunna: shadow; image; idol forbidden","Zamzummims: projects of crimes; enormous crimes","Zanoah: forgetfulness; desertion","Zaphnath-paaneah: one who discovers hidden things","Zarah: east; brightness","Zareah: leprosy; hornet","Zared: strange descent","Zarephath: ambush of the mouth","Zaretan: tribulation; perplexity","Zatthu: olive tree","Zaza: belonging to all","Zebadiah: portion of the Lord; the Lord is my portion","Zebah: victim; sacrifice","Zebedee: abundant; portion","Zebina: flowing now; selling; buying","Zeboiim: deer; goats","Zebudah: endowed; endowing","Zebul: a habitation","Zebulun: or Zebulon; exaltation; little dwelling","Zechariah: same as Zachariah; The Lord has remembered","Zedad: his side; his hunting","Zedekiah: the Lord is my justice; the justice of the Lord","Zeeb: wolf","Zelah: rib; side; halting","Zelek: the shadow or noise of him that licks or laps","Zelophehad: the shade or tingling of fear","Zelotes: zealous","Zelzah: noontide","Zemaraim: wool; pith","Zemira: song; vine; palm","Zenan: coldness; target; weapon","Zenas: living","Zephaniah: the Lord is my secret","Zephath: which beholds; that attends or that covers","Zer: perplexity",
                "Zerah: same as Zarah","Zerahiah: the Lord rising; brightness of the Lord","Zeredah: ambush; change of dominion","Zeresh: misery; strange; dispersed inheritance","Zereth: same as Zer","Zeror: root; that straitens or binds; that keeps tight","Zeruah: leprous; wasp; hornet","Zerubbabel: a stranger at Babylon; dispersion of confusion","Zeruiah: pain or tribulation of the Lord","Zethar: he that examines or beholds","Zia: sweat; swelling","Ziba: army; fight; strength","Zibeon: iniquity that dwells","Zibiah: the Lord dwells; deer; goat","Zichri: that remembers; that is a man","Ziddim: huntings; treasons; destructions","Zidkijah: justice of the Lord","Zidon: hunting; fishing; venison","Zif: this or that; brightness; comeliness","Ziha: brightness; whiteness; drought","Ziklag: measure pressed down","Zillah: shadow; the tingling of the ear","Zilpah: distillation from the mouth","Zilthai: my shadow; my talk","Zimmah: thought; wickedness","Zimran: song; singer; vine","Zimzi: my field; my vine","Zin: buckler; coldness","Zina: shining; going back","Zion: monument; raised up; sepulcher","Zior: ship of him that watches","Ziph: this mouth or mouthful; falsehood","Ziphron: falsehood of a song; rejoicing","Zippor: bird; sparrow; crown; desert","Zipporah: beauty; trumpet; mourning","Zithri: to hide; demolished","Ziz: flower; branch; a lock of hair","Ziza: same as Zina","Zoan: motion","Zoar: little; small","Zohar: white; bright; dryness","Zoheleth: that creeps","Zoheth: separation; amazing","Zophah: viol; honeycomb","Zophar: rising early; crown","Zophim: place for a watchman","Zorah: leprosy; scab; hornet","Zorobabel: same as Zerubbabel","Zuar: same as Zoar","Zuph: that beholds","Zur: stone; rock; that besieges","Zuriel: rock or strength of God","Zurishaddai: the Almighty is my rock and strength","Zuzims: the posts of a door; splendor; beauty"

        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.zText);
        text.setText(randomName);

        zList = (ListView) findViewById(R.id.zList);
        zAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        zList.setAdapter(zAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        zAd =findViewById(R.id.zAd);
        AdRequest zReq = new AdRequest.Builder().build();
        zAd.loadAd(zReq);
    }
}
