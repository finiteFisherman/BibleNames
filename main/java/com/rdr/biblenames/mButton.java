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

public class mButton extends AppCompatActivity {

    private AdView mAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_button);

        Random r = new Random();
        ListView mList;
        ArrayAdapter<String> mAdapter;

        final String[] nameArray = new String[]{
                "Maachah","Maachathi","Maadai","Maadiah","Maai","Maale-akrabbim","Maarath","Maaseiah",
                "Maasiai","Maath","Maaz","Macedonia","Machbenah","Machi","Machir","Machnadebai","Machpelah",
                "Madai","Madian","Madmannah","Madon","Magbish","Magdala","Magdalene","Magdiel","Magog",
                "Magor-missabib","Mahalah","Mahaleleel","Mahali","Mahanaim","Mahanehdan","Mahanem","Maharai",
                "Mahath","Mahavites","Mahaz","Mahazioth","Maher-shalal-hash-baz","Mahlah","Makas","Makheloth",
                "Makkedah","Malachi","Malcham","Malchiah","Malchiel","Malchus","Maleleel","Mallothi","Malluch",
                "Mammon","Mamre","Manaen","Manahethites","Manasseh","Manoah","Maon","Mara","Maralah","Maranatha",
                "Marcus","Mareshah","Mark","Maroth","Marsena","Martha","Mary","Mash","Mashal","Masrekah","Massa",
                "Massah","Matred","Matri","Mattan","Mattaniah","Mattatha","Mattathias","Matthal","Matthan",
                "Matthanias","Matthew","Mazzaroth","Meah","Mearah","Mebunnai","Mecherath","Medad","Medan","Medeba",
                "Media","Megiddo","Megiddon","Mehetabel","Mehida","Mehir","Mehujael","Mehuman","Mejarkon","Mekonah",
                "Melatiah","Melchi","Melchiah","Melchi-shua","Melchizedek","Melea","Melech","Melita","Mellicu",
                "Melzar","Memphis","Memucan","Menahem","Menan","Mene","Meonenim","Mephaath","Mephibosheth","Merab",
                "Meraioth","Merari","Mercurius","Mered","Meremoth","Meres","Meribah","Meribbaal","Merodach",
                "Merodach-baladan","Merom","Meronothite","Meroz","Mesha","Meshach","Meshech","Meshelemiah",
                "Meshezaheel","Meshillamith","Meshullam","Mesopotamia","Messiah","Metheg-ammah","Methusael",
                "Methusaleh","Meunim","Mezahab","Miamin","Mibhar","Mibsam","Mibzar","Micah","Micaiah","Micha",
                "Michaiah","Michal","Michmach","Michmethah","Michri","Michtam","Middin","Midian","Migdalel",
                "Migdalgad","Migdol","Migron","Mijamin","Mikloth","Milalai","Milcah","Milcom","Miletum","Millo",
                "Miniamin","Minneiah","Minni","Minnith","Miriam","Mishael","Mishal","Misham","Misheal","Mishma",
                "Mishmannah","Mishraites","Mispar","Misrephoth-maim","Mithcah","Mithnite","Mithredath","Mitylene",
                "Mizar","Mizpah","Mizraim","Mizzah","Mnason","Moab","Moladah","Molech","Molid","Mordecai","Moreh",
                "Moriah","Moserah","Moses","Mozah","Muppim","Mushi","Myra","Mysia"
        };

        final String[] wholeNameArray = new String[]{
                "Maachah: pressed down; worn; fastened","Maachathi: broken","Maadai: pleasant; testifying","Maadiah: pleasantness; the testimony of the Lord","Maai: belly; heaping up","Maale-akrabbim: ascent of scorpions","Maarath: den; making empty; watching","Maaseiah: the work of the Lord","Maasiai: the defense","Maath: wiping away; breaking; fearing; smiting","Maaz: wood; wooden","Macedonia: burning; adoration","Machi: poor; a smiter","Machir: selling; knowing","Machnadebai: smiter","Machpelah: double","Madai: a measure; judging; a garment","Madian: judgment; striving; covering; chiding","Madmannah: measure of a gift; preparation of a garment","Madon: a chiding; a garment; his measure","Magbish: excelling; height","Magdala: tower; greatness","Magdalene: a person from Magdala","Magdiel: declaring God; chosen fruit of God","Magog: covering; roof; dissolving","Magor-missabib: fear on every side","Magpiash: a body thrust hard together","Mahaleleel: praising God","Mahali: infirmity; a harp; pardon","Mahanaim: tents; two fields; two armies","Mahanehdan: tents of judgment","Mahanem: a comforter","Maharai: hasting; a hill; from a hill","Mahath: same as Maath","Mahavites: declaring a message; marrow","Mahaz: an end; ending; growing hope","Mahazioth: seeing a sign; seeing a letter","Maher-shalal-hash-baz: making speed to the spoil; he hastens to the prey","Makas: same as Mahaz","Makheloth: assemblies; congregations","Makkedah: worshiping; burning; raised; crookedness","Malachi: my messenger; my angel","Malchiel: God is my king","Malchus: my king","Maleleel: same as Mahaleleel","Mallothi: fullness; circumcision","Malluch: reigning; counseling","Mammon: riches","Mamre: rebellious; bitter; set with trees","Manaen: a comforter; a leader","Manahethites: my lady; my prince of rest","Manasseh: forgetfulness; he that is forgotten","Manoah: rest; a present","Maon: house; place of sin","Mara: or Marah; bitter","Maralah: sleep; a sacrifice of myrrh; ascension","Maranatha: the Lord is coming","Marcus: polite; shining","Mareshah: from the beginning; an inheritance","Mark: same as Marcus; hammer","Maroth: bitterness","Marsena: bitterness of a bramble","Martha: who becomes bitter; provoking","Mary: same as Miriam; beloved,","Mash: same as Meshech","Mashal: a parable; governing","Masrekah: whistling; hissing","Massa: a burden; prophecy","Massah: temptation","Matred: wand of government","Matri: rain; prison","Mattaniah: gift","Mattatha: his gift","Mattathias: the gift of the Lord","Matthan: same as Mattan","Matthal: gift; he that gives","Matthew: given; a reward","Matthias: same as Mattathias", "Mazzaroth: the twelve signs of the zodiac","Meah: a hundred cubits","Mearah: den; cave; making empty","Mebunnai: son; building; understanding","Mecherath: selling; knowledge","Medad: he that measures; water of love","Medan: judgment; process","Medeba: waters of grief; waters springing up","Media: measure; habit; covering",
                "Megiddo: his precious fruit; declaring a message","Megiddon: same as Megiddo","Mehetabel: how good is God","Mehida: a riddle; sharpness of wit","Mehir: a reward","Mehujael: who proclaims God","Mehuman: making an uproar; a multitude","Mejarkon: the waters of Jordan","Mekonah: a foot of a pillar; provision","Melatiah: deliverance of the Lord","Melchi: my king; my counsel","Melchiah: God is my king","Melchi-shua: king of health; magnificent king","Melchizedek: king of justice","Melea: supplying; supplied","Melech: king; counselor","Melita: affording honey","Mellicu: his kingdom; his counselor","Melzar: circumcision of a narrow place","Memphis: abode of the good","Memucan: impoverished; to prepare; certain; true","Menahem: comforter; who conducts them; preparation of heat","Menan: numbered; rewarded; prepared","Mene: who reckons or is counted","Meonenim: charmers","Mephaath: appearance","Mephibosheth: out of my mouth proceeds reproach","Merab: he that fights or disputes","Meraioth: bitterness; rebellious; changing","Merari: bitter; to provoke","Mercurius: an orator; an interpreter","Mered: rebellious","Meremoth: bitterness; myrrh of death","Meres: defluxion; imposthume","Meribah: dispute; quarrel","Meribbaal: he that resists Baal; rebellion","Merodach: bitter contrition","Merodach-baladan: bitter contrition","Merom: eminences; elevations","Meronothite: my singing; rejoicing; bearing rule","Meroz: secret","Mesha: burden; salvation","Meshach: that draws with force","Meshech: who is drawn by force","Meshelemiah: peace","Meshezaheel: God taking away; the salvation of God","Meshillamith: peaceable; perfect; giving again","Meshullam: peaceable; perfect; their parables","Mesobaite: the Lord's standing-place; a little doe","Mesopotamia: between two rivers","Messiah: anointed","Metheg-ammah: bridle of bondage","Methusael: who demands his death","Methusaleh: he has sent his death","Meunim: dwelling-places; afflicted","Mezahab: gilded","Miamin: the right hand","Mibhar: chosen; youth","Mibsam: smelling sweet","Mibzar: defending; forbidding; taking away","Micah: poor; humble","Micaiah: who is like to God?","Micha: same as Micaiah","Michaiah: or Michael or Michal; who is perfect?","Michmach: he that strikes","Michmethah: the gift or death of a striker","Michri: selling","Michtam: golden psalm","Middin: judgment; striving","Midian: judgment; covering; habit","Migdalel: tower of God","Migdalgad: tower compassed about","Migdol: a tower","Migron: fear; farm; throat","Mijamin: right hand","Mikloth: little wants; little voices; looking downward","Minneiah: possession of the Lord","Milalai: circumcision; my talk","Milcah: queen","Milcom: their king","Miletum: red; scarlet","Millo: fullness","Miniamin: right hand","Minni: reckoned; prepared","Minnith: same as Minni","Miriam: rebellion","Mishael: who is asked for or lent","Mishal: parables; governing","Misham: their savior; taking away","Misheal: requiring; lent; pit","Mishma: hearing; obeying","Mishmannah: fatness; taking away provision","Mishraites: spread abroad","Misrephoth-maim: hot waters","Mithcah: sweetness; pleasantness","Mithnite: loin; gift; hope","Mithredath: breaking the law","Mitylene: purity; cleansing; press","Mizar: little","Mizpah: or Mizpeh; watchtower","Mizraim:tribulations","Mizzah: defluxion from the head","Mnason: a diligent seeker; an exhorter","Moab: of his father","Moladah: birth; generation","Molech: or  Moloch; fire-god","Molid: nativity; generation","Mordecai: contrition; bitter; bruising","Moreh: stretching","Moriah: bitterness of the Lord","Moserah: or Moseroth; bond","Moses: taken out; drawn forth","Mozah: unleavened","Muppim: out of the mouth; covering","Mushi: he that touches","Myra: I flow; pour out; weep","Mysia: criminal; abominable"
        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.mText);
        text.setText(randomName);

        mList = (ListView) findViewById(R.id.mList);
        mAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        mList.setAdapter(mAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        mAd =findViewById(R.id.mAd);
        AdRequest mReq = new AdRequest.Builder().build();
        mAd.loadAd(mReq);
    }
}
