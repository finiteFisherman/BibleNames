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

public class hButton extends AppCompatActivity {

    private AdView hAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_button);

        Random r = new Random();
        ListView hList;
        ArrayAdapter<String> hAdapter;

        final String[] nameArray = new String[]{
                "Haahashtari","Habaiah","Habakkuk","Habazinaiah","Habor","Hachaliah","Hachilah",
                "Hachmoni","Hadad","Hadadezer","Hadadrimmon","Hadar","Hadarezer","Hadashah","Hadassah",
                "Hadid;","Hadlai","Hadoram","Hadrach","Hagab","Hagar","Haggai","Haggeri","Haggiah",
                "Haggith","Hakkatan","Hakkoz","Hakupha","Halah","Halak","Halhul","Hali","Hallelujah",
                "Halloesh","Ham","Haman","Hamath","Hamath-zobah","Hammedatha","Hammelech","Hammon",
                "Hamonah","Hamon-gog","Hamor","Hamoth","Hamul","Hamutal","Hanameel","Hanan","Hananeel",
                "Hanani","Hananiah","Hanes","Haniel","Hannah","Hannathon","Hanniel","Hanoch","Hanun",
                "Hapharaim","Hara","Haradah","Haran","Harbonah","Hareph","Harhaiah","Harhas","Harhur",
                "Harim","Harnepher","Harod","Harosheth","Harran","Harsha","Harum","Harumaph","Haruphite",
                "Haruz","Hasadiah","Hashabiah","Hashabnah","Hashem","Hashub","Hashubah","Hashum","Hashupha",
                "Hasrah","Hatach","Hathath","Hatita","Hattil","Hattipha","Hattush","Hauran","Havilah",
                "Havoth-jair","Hazael","Hazaiah","Hazar-addar","Hazarenan","Hazargaddah","Hazar-hatticon",
                "Hazarmaveth","Hazar-shual","Hazar-susah","Hazelelponi","Hazeroth","Hazezon-tamar","Hazo",
                "Hazor","Heber","Hebrews","Hebron","Hegai","Helam","Helbah","Heldai","Helek","Helem","Heleph",
                "Helez","Heli","Helkai","Helkath-hazzurim","Helon","Heman","Hen","Hena","Henadad","Henoch","Hepher",
                "Hephzibah","Heres","Heresh","Hermas","Hermogenes","Hermon","Herod","Herodion","Heshbon","Heshmon",
                "Heth","Hethlon","Hezekiah","Hezer","Hezrai","Hezron","Hiddai","Hiddekel;","Hiel","Hierapolis","Higgaion",
                "Hilen","Hilkiah","Hillel","Hinnom","Hirah","Hiram","Hittite","Hivites","Hizkijah","Hobab","Hobah","Hod",
                "Hodaiah","Hodaviah","Hodesh","Hoglah","Hoham","Holon","Homam","Hophin","Hor","Horam","Horeb","Horem",
                "Hor-hagidgad","Hori","Horims","Hormah","Horonaim","Horonites","Hosah","Hosanna","Hosea","Hoshaiah",
                "Hoshama","Hotham","Hothir","Hukkok","Hul","Huldah","Hupham","Huppim","Hur","Huram","Huri","Hushah",
                "Hushai","Hushathite","Huz","Huzoth","Huzzab","Hymeneus"
        };

        final String[] wholeNameArray = new String[]{
                "Haahashtari: a runner ","Habaiah: the hiding of the Lord ","Habakkuk: he that embraces; a wrestler ","Habazinaiah: a hiding of the shield of the Lord ","Habor: a partaker; a companion ","Hachaliah: who waits for the Lord ","Hachilah: my hope is in her ","Hachmoni: a wise man ","Hadad: joy; noise; clamor ","Hadadezer: beauty of assistance ","Hadadrimmon: invocation to the god Rimmon ","Hadar: power; greatness ","Hadarezer: same as Hadadezer; Hadad helps","Hadashah: news; a month ","Hadassah: a myrtle; joy ","Hadid: rejoicing; sharp ","Hadlai: loitering; hindering ","Hadoram: their beauty; their power ","Hadrach: point; joy of tenderness ","Hagab: or Hagabah; locust ","Hagar: a stranger; one that fears ","Haggai: feast; solemnity ","Haggeri: or Haggi; a stranger","Haggiah: the Lord's feast ","Haggith: rejoicing ","Hakkatan: little ","Hakkoz: a thorn; summer; an end ","Hakupha: a commandment of the mouth ","Halah: a moist table ","Halak: part ","Halhul: grief; looking for grief ","Hali: sickness; a beginning; a precious stone ","Hallelujah: praise the Lord ","Halloesh: saying nothing; an enchanter ","Ham: hot; heat; brown ","Haman: noise; tumult ","Hamath: anger; heat; a wall ","Hamath-zobah: the heat ","Hammedatha: he that troubles the law ","Hammelech: a king; a counselor ","Hammon: heat; the sun ","Hamonah: his multitude; his uproar ","Hamon-gog: the multitude of Gog ","Hamor: an ass; clay; dirt ","Hamoth: indignation ","Hamul: godly; merciful ","Hamutal: the shadow of his heat ","Hanameel: the grace that comes from God; gift of God ","Hanan: full of grace ","Hananeel: grace ","Hanani: my grace; my mercy ","Hananiah: grace; mercy; gift of the Lord ","Hanes: banishment of grace ","Haniel: the gift of God ","Hannah: gracious; merciful; he that gives ","Hannathon: the gift of grace ","Hanniel: grace or mercy of God ","Hanoch: dedicated ","Hanun: gracious; merciful ","Hapharaim: searching; digging ","Hara: a hill; showing forth ","Haradah: well of great fear ","Haran: mountainous country ","Harran: see Charran ","Harbonah: his destruction; his sword ","Hareph: winter; reproach ","Harhas: anger; heat of confidence ","Harhaiah: heat ","Harhur: made warm ","Harim: destroyed; dedicated to God ","Harnepher: the anger of a bull; increasing heat ","Harod: astonishment; fear ","Harosheth: a forest; agriculture; workmanship; deafness; silence ","Harsha: workmanship; a wood ","Harum: high; throwing down ","Harumaph: destruction ","Haruphite: slender; sharp ","Haruz: careful ","Hasadiah: the mercy of the Lord ","Hashabiah: the estimation of the Lord ","Hashabnah: or Hashabniah; thought of God ","Hashem: named; a putting to ","Hashub: esteemed; numbered ","Hashubah: estimation; thought ","Hashum: silence; their hasting ","Hashupha: spent; made base ","Hasrah: wanting ","Hatach: he that strikes ","Hathath: fear ","Hatita: a bending of sin ","Hattil: howling for sin ","Hattipha: robbery ","Hattush: forsaking sin ","Hauran: a hole; liberty; whiteness ","Havilah: that suffers pain; that brings forth ","Havoth-jair: the villages that enlighten ","Hazael: that sees God ","Hazaiah: seeing the Lord ",
                "Hazar-addar: an imprisoned generation ","Hazarenan: imprisoned cloud ","Hazargaddah: imprisoned band ","Hazar-hatticon: middle village; preparation ","Hazarmaveth: dwelling of death ","Hazar-shual: a wolf's house ","Hazar-susah: or susim ","Hazelelponi: sorrow of countenance ","Hazeroth: villages; palaces ","Hazezon-tamar: drawing near to bitterness ","Hazo: seeing; prophesying ","Hazor: court; hay ","Heber: one that passes; anger ","Hebrews: descendants of Heber ","Hebron: society; friendship ","Hegai: or Hege; groaning, separation","Helam: their army; their trouble ","Helbah: or Helbon; fruitful or fertile ","Heldai or Heleb; the world; rustiness ","Helek: part; portion","Helem: dreaming; healing ","Heleph: changing; passing over ","Helez: armed; set free ","Heli: ascending; climbing up ","Helkai: same as Helek; part, portion","Helkath-hazzurim: the field of strong men ","Helon: window; grief ","Heman: their trouble; tumult; much; in great number ","Hen: grace; quiet; rest ","Hena: troubling ","Henadad: grace of the beloved ","Henoch: same as Enoch ","Hepher: a digger ","Hephzibah: my delight is in her ","Heres: the son; an earthen pot ","Heresh: a carpenter ","Hermas: or Hermes; cairn, pile of stones, boundary marker ","Hermogenes: begotten of Mercury ","Hermon: anathema; devoted to destruction ","Herod: son of a hero ","Herodion: the song of Juno ","Heshbon: invention; industry ","Heshmon: a hasty messenger ","Heth: trembling; fear ","Hethlon: a fearful dwelling ","Hezekiah: strength of the Lord ","Hezer: or Hezir; swine ","Hezrai: an entry or vestibule ","Hezron: the dart of joy; the division of the song ","Hiddai: a praise; a cry ","Hiddekel: sharp voice; sound ","Hiel: God lives; the life of God ","Hierapolis: holy city ","Higgaion: meditation; consideration ","Hilen: a window; grief ","Hilkiah: God is my portion ","Hillel: he that praises ","Hinnom: there they are; their riches ","Hirah: liberty; anger ","Hiram: exaltation of life; a destroyer ","Hittite: one who is broken; who fears ","Hivites: wicked; wickedness ","Hizkijah: the strength of the Lord ","Hobab: favored; beloved ","Hobah: love; friendship; secrecy ","Hod: praise; confession ","Hodaiah: the praise of the Lord ","Hodaviah: or Hodiah; majesty of Jehovah","Hodesh: a table; news ","Hoglah: his festival or dance ","Hoham: woe to them ","Holon: a window; grief ","Homam: making an uproar ","Hophin: he that covers; my fist ","Hor: who conceives ","Horam: their hill ","Horeb: desert; solitude; destruction ","Horem: an offering dedicated to God ","Hor-hagidgad: the hill of felicity ","Hori: a prince; freeborn ","Horims: princes; being angry ","Hormah: devoted or consecrated to God; utter destruction ","Horonaim: angers; ragings ","Horonites: men of anger ","Hosah: trusting ","Hosanna: save I pray thee; keep; preserve ","Hosea: or Hoshea; salvation ","Hoshaiah: the salvation of the Lord ","Hoshama: heard; he obeys ","Hotham: a seal ","Hothir: excelling; remaining ","Hukkok: engraver; scribe; lawyer ","Hul: pain; infirmity ","Huldah: the world ","Hupham: their chamber; their bank ","Huppim: a chamber covered; the sea-shore ","Hur: liberty; whiteness; hole ","Huram: their liberty; their whiteness; their hole ","Huri: being angry; or same as Huram ","Hushah: hasting; holding peace ","Hushai: their haste; their sensuality; their silence ","Hushathite: or Hushim ","Huz: counsel; woods; fastened ","Huzoth: streets; populous ","Huzzab: molten ","Hymeneus: nuptial; the god of marriage"

        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.hText);
        text.setText(randomName);

        hList = (ListView) findViewById(R.id.hList);
        hAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        hList.setAdapter(hAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        hAd =findViewById(R.id.hAd);
        AdRequest hReq = new AdRequest.Builder().build();
        hAd.loadAd(hReq);


    }
}
