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

public class jButton extends AppCompatActivity {

    private AdView jAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_j_button);

        Random r = new Random();
        ListView jList;
        ArrayAdapter<String> jAdapter;

        final String[] nameArray = new String[]{
                "Jaakan","Jaakobah","Jaala","Jaalam","Jaanai","Jaasau","Jaasiel","Jaazah","Jaazaniah",
                "Jaaziah","Jabal","Jabbok","Jabesh","Jabez","Jabin","Jabneel","Jachan","Jachin","Jacob",
                "Jada","Jadau","Jaddua","Jael","Jagur","Jah","Jahaleel","Jahath","Jahaz","Jahaziah",
                "Jahaziel","Jahdiel","Jahdo","Jahleel","Jahmai","Jahzeel","Jair","Jakan","Jakim","Jalon",
                "Jambres","James","Jamin","Jamlech","Janna","Janoah","Janum","Japhet","Japhia","Japhlet",
                "Japho","Jarah","Jareb","Jared","Jaresiah","Jarib","Jarmuth","Jarvah","Jashem","Jasher",
                "Jashobeam","Jashub","Jasiel","Jason","Jathniel","Jattir","Javan","Jazeel","Jazer","Jaziz",
                "Jearim","Jeaterai","Jeberechiah","Jebus","Jebusi","Jecamiah","Jecoliah","Jeconiah","Jedaiah",
                "Jedeiah","Jediael","Jedidah","Jedidiah","Jediel","Jeduthun","Jeezer","Jegar-sahadutha","Jehaleleel",
                "Jehaziel","Jehdeiah","Jeheiel","Jehezekel","Jehiah","Jehiskiah","Jehoadah","Jehoaddan","Jehoahaz",
                "Jehoash","Jehohanan","Jehoiachin","Jehoiada","Jehoiakim","Jehoiarib","Jehonadab","Jehonathan",
                "Jehoram","Jehoshaphat","Jehosheba","Jehoshua","Jehovah","Jehovah-jireh","Jehovah-nissi",
                "Jehovah-shalom","Jehovah-shammah","Jehovah-tsidkenu","Jehozabad","Jehozadak","Jehu","Jehubbah",
                "Jehucal","Jehud","Jehudijah","Jehush","Jekabzeel","Jekamean","Jekamiah","Jekuthiel","Jemima",
                "Jemuel","Jephunneh","Jerah","Jerahmeel","Jerebai","Jered","Jeremai","Jeremiah","Jeremoth",
                "Jeriah","Jericho","Jeriel","Jerijah","Jerimoth","Jerioth","Jeroboam","Jeroham","Jerubbaal",
                "Jerubbesheth","Jeruel","Jerusalem","Jerusha","Jesaiah","Jeshebeab","Jesher","Jeshimon","Jeshishai",
                "Jeshohaia","Jeshua","Jesiah","Jesimiel","Jesse","Jesui","Jesus","Jether","Jetheth","Jethlah",
                "Jethro","Jetur","Jeuel","Jeush","Jew","Jezaniah","Jezebel","Jezer","Jeziah","Jezneel","Jezoar",
                "Jezrahiah","Jibsam","Jidlaph","Jimnah","Jiphtah","Jiphthael","Joab","Joah","Joahaz","Joakim",
                "Joanna","Joash","Joatham","Job","Jobab","Jochebed","Joed","Joel","Joelah","Joezer","Jogbehah",
                "Jogli","Joha","Johanan","John","Joiarib","Jokdeam","Jokim","Jokmeam","Jokneam","Jokshan",
                "Joktan","Jonadab","Jonah","Jonan","Jonathan","Joppa","Jorah","Joram","Jordan","Jorim",
                "Josabad","Josaphat","Jose","Joseph","Joses","Joshah","Joshaviah","Joshbekesha","Joshua",
                "Josiah","Josibiah","Josiphiah","Jotham","Jothath","Jozabad","Jozachar","Jubal","Jucal",
                "Judaea","Judah","Judas","Judith","Julia","Julius","Junia","Jupiter","Jushabhesed","Justus","Juttah"
        };

        final String[] wholeNameArray = new String[]{
                "Jaakan: tribulation; labor ","Jaakobah: supplanter; deceiver; the heel ","Jaala: ascending; a little doe or goat ","Jaalam: hidden; young man; heir ","Jaanai: answering; afflicting; making poor ","Jaasau: doing; my doing ","Jaasiel: God's work ","Jaazaniah: whom the Lord will hear ","Jaazah or Jaazar ","Jaaziah: or Jaaziel; The strength of the Lord","Jabal: which glides away ","Jabbok: evacuation; dissipation; wrestling ","Jabesh: dryness; confusion; shame ","Jabez: sorrow; trouble ","Jabin: or Jabneh; the wise ","Jabneel: building of God ","Jachan: wearing out; oppressing ","Jachin: he that strengthens and makes steadfast ","Jacob: that supplants ","Jada: knowing ","Jadau: his hand; his confession ","Jaddua: known ","Jael: he that ascends; a kid ","Jagur: husbandman; stranger ","Jah: the everlasting ","Jahaleel: praising God; light of God ","Jahath: broken in pieces; descending ","Jahaz: or Jahazah; praise ye Jah","Jahaziah: the vision of the Lord ","Jahaziel: seeing God ","Jahdiel: the unity ","Jahdo: I alone; his joy; his sharpness of wit; his newness ","Jahleel: waiting for ","Jahmai: warm; making warm ","Jahzeel: God hasteth ","Jair: or Jairus; my light, who diffuses light ","Jakan: same as Achan ","Jakim: rising; confirming; establishing ","Jalon: tarrying; murmuring ","Jambres: poverty; bitter; a rebel ","James: same as Jacob ","Jamin: right hand; south wind ","Jamlech: reigning; asking counsel ","Janna: or Jannes; name of one of the two Egyptian magicians who opposed Moses","Janoah or Janohah; a resting place","Janum: sleeping ","Japhet: enlarged; fair; persuading ","Japhia: enlightening; appearing ","Japhlet: or Japhleti; delivered, banished ","Japho: fairness; comeliness ","Jarah: a wood; honeycomb; watching closely ","Jareb: a revenger ","Jared: a ruling; commanding; coming down ","Jaresiah: the bed of the Lord; the Lord hath taken away; poverty ","Jarib: fighting; chiding; multiplying; avenging ","Jarmuth: fearing ","Jarvah: breathing ","Jashem Jashen: ","Jasher: righteous; upright ","Jashobeam: the people sitting; or captivity of the people ","Jashub: a returning; a controversy; a dwelling place ","Jasiel: the strength of God ","Jason: he that cures ","Jathniel: gift of God ","Jattir: a remnant; excellent ","Javan: deceiver; one who makes sad ","Jazeel: strength of God ","Jazer: assistance; helper ","Jaziz: brightness; departing ","Jearim: a leap; woods ","Jeaterai: searching out ","Jeberechiah: speaking well of ","Jebus: treading under foot; manger ","Jebusi: trodden under foot; mangers ","Jecamiah: resurrection ","Jecoliah: perfection ","Jeconiah: preparation ","Jedaiah: the hand of the Lord; confessing the Lord ","Jedeiah: one Lord; the joy of the Lord ","Jediael: the science ","Jedidah: well beloved; amiable ","Jedidiah: beloved of the Lord ","Jediel: the knowledge ","Jeduthun: his law; giving praise ","Jeezer: island of help ","Jegar-sahadutha: heap of witness ","Jehaleleel: or Jehalelel ","Jehaziel: same as Jahaziel ","Jehdeiah: joy together ","Jeheiel: God liveth ","Jehezekel: strength of God ","Jehiah: the Lord liveth ","Jehiskiah: the strength ","Jehoadah: passing over; testimony of the Lord ","Jehoaddan: pleasure ","Jehoahaz: possession of the Lord ","Jehoash: fire of the Lord ","Jehohanan: grace ","Jehoiachin: preparation ","Jehoiada: knowledge of the Lord ","Jehoiakim: avenging ","Jehoiarib: fighting ","Jehonadab: or Jonadab ","Jehonathan: gift of the Lord; gift of a dove ","Jehoram: exaltation of the Lord ","Jehoshaphat: the Lord is judge ","Jehosheba: fullness ","Jehoshua: same as Joshua ","Jehovah: self-subsisting ","Jehovah-jireh: the Lord will provide ","Jehovah-nissi: the Lord my banner ","Jehovah-shalom: the Lord send peace ","Jehovah-shammah: the Lord is there ","Jehovah-tsidkenu: the Lord our righteousness ","Jehozabad: the Lord's dowry; having a dowry ","Jehozadak: justice of the Lord ","Jehu: himself who exists ","Jehubbah: hiding ","Jehucal: mighty; perfect; wasted ","Jehud: or  Jehudi ","Jehudijah: the praise of the Lord ","Jehush: keeping counsel; fastened ","Jekabzeel: the congregation of God ","Jekamean: the people shall arise ","Jekamiah: establishing ","Jekuthiel: hope ","Jemima: handsome as the day ","Jemuel: God's day; son of God ","Jephunneh: he that beholds ","Jerah: the moon; month; smelling sweet ","Jerahmeel: the mercy ","Jered: ruling; coming down ","Jeremai: my height; throwing forth waters ","Jeremiah: exaltation of the Lord ","Jeremoth: eminences; one that fears death ","Jeriah: fear ","Jerebai: fighting; chiding; multiplying ","Jericho: his moon; his month; his sweet smell ","Jeriel: fear ","Jerijah: same as Jeriah ","Jerimoth: he that fears or rejects death ","Jerioth: kettles; breaking asunder ","Jeroboam: he that opposes the people ","Jeroham: high; merciful; beloved ","Jerubbaal: he that defends Baal ","Jerubbesheth: let the idol of confusion defend itself ","Jeruel: fear ","Jerusalem: vision of peace ","Jerusha: banished; possession; inheritance ","Jesaiah: health ","Jeshebeab: sitting ","Jesher: right; singing ","Jeshimon: solitude; desolation ","Jeshishai: ancient; rejoicing exceedingly ","Jeshohaia: the Lord pressing; the meditation of God ","Jeshua: same as Joshua ","Jesiah: sprinkling of the Lord ","Jesimiel: naming ","Jesse: gift; oblation; one who is ","Jesui: even-tempered; flat country ","Jesus: savior; deliverer ","Jether: he that excels ","Jetheth: giving ","Jethlah: hanging up; heaping up ","Jethro: his excellence; his posterity ","Jetur: order; succession; mountainous ","Jeuel God hath taken away; God heaping up ","Jeush Jeuz ","Jew same as Judah ","Jezaniah nourishment ","Jezebel chaste ","Jezer island of help ","Jeziah: Jeziel ","Jezoar: clear; white ","Jezrahiah: the Lord arises; brightness of the Lord ","Jezneel: seed of God ","Jibsam: their drought ","Jidlaph: he that distills water ","Jimnah: right hand; numbering; preparing ","Jiphtah: opening ","Jiphthael: God opening ","Joab: paternity; voluntary ","Joah: fraternity; brother of the Lord ","Joahaz: apprehending; possessing; seeing ","Joakim: rising or establishing of the Lord ","Joanna: grace or gift of the Lord ","Joash: who despairs or burns ","Joatham: same as Jotham; Jehovah is perfect ","Job: he that weeps or cries ","Jobab: sorrowful ","Jochebed: glorious; honorable ","Joed: witnessing; robbing; passing over ","Joel: he that wills or commands ","Joelah: lifting up; profiting; taking away slander ","Joezer: he that aids ","Jogbehah: an exalting; high ","Jogli: passing over; turning back; rejoicing ","Joha: who enlivens or gives life ","Johanan: who is liberal or merciful ","John: the grace or mercy of the Lord ","Joiarib: chiding ","Jokdeam: crookedness ","Jokim: that made the sun stand still ","Jokmeam: confirmation ","Jokneam: possessing ","Jokshan: an offense; hardness; a knocking ","Joktan: small dispute; contention; disgust ","Jonadab: who gives liberally ","Jonah or Jonas; dove ","Jonan: a dove; multiplying of the people ","Jonathan: given of God ","Joppa: beauty; comeliness ","Jorah: or Jorai; casting forth ","Joram: to cast; elevated ","Jordan: the river of judgment ","Jorim: he that exalts the Lord ","Josabad: having a dowry ","Josaphat: same as Jehoshaphat: ","Jose: raised; who pardons ","Joseph: increase; addition ","Joses: same as Jose ","Joshah: being; forgetting; owing ","Joshaviah: the seat ","Joshbekesha: it is requiring or beseeching ","Joshua: a savior; a deliverer ","Josiah: the Lord burns; the fire of the Lord ","Josibiah: the seat ","Josiphiah: increase of the Lord; the Lord's finishing ","Jotham: the perfection of the Lord ","Jothath: or Jothatha ","Jozabad: same as Josabad ","Jozachar: remembering; of the male sex ","Jubal: he that runs; a trumpet ","Jucal: mighty; perfect ","Judah: the praise of the Lord; confession ","Judas: or Jude, praised","Judaea: or Judea; praise ","Judith: same as Judah ","Julia: downy; soft and tender hair ","Julius: same as Julia ","Junia: youth ","Jupiter: the father that helpeth ","Jushabhesed: dwelling-place; change of mercy ","Justus: just or upright ","Juttah: turning away"

        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.jText);
        text.setText(randomName);

        jList = (ListView) findViewById(R.id.jList);
        jAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        jList.setAdapter(jAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        jAd =findViewById(R.id.jAd);
        AdRequest jReq = new AdRequest.Builder().build();
        jAd.loadAd(jReq);
    }
}
