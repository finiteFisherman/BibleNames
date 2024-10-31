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

public class nButton extends AppCompatActivity {

    private AdView nAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_button);

        Random r = new Random();
        ListView nList;
        ArrayAdapter<String> nAdapter;

        final String[] nameArray = new String[]{
                "Naam","Naamah","Naarah","Naashon","Nabal","Naboth","Nachon","Nachor","Nadab","Nagge",
                "Nahaliel","Nahallal","Naham","Naharai","Nahash","Nahath","Nahbi","Nahor","Nahshon",
                "Nahum","Nain","Naioth","Naomi","Naphish","Naphtali","Narcissus","Nason","Nathan",
                "Nathanael","Nathan-melech","Naum","Nazareth","Nazarite","Neah","Neapolis","Neariah",
                "Nebai","Nebaioth","Neballat","Nebat","Nebo","Nebuchadnezzar","Nebushasi_hahban",
                "Nebuzar-adan","Necho","Nedabiah","Neginoth","Nehelamite","Nehemiah","Nehum","Nehushta",
                "Nehushtan","Neiel","Nekoda","Nemuel","Nepheg","Nephish","Nephishesim","Nephthalim",
                "Nephthoah","Nephusim","Ner","Nereus","Nergal","Nergal-sharezer","Neri","Neriah","Nethaneel",
                "Nethaniah","Nethinims","Neziah","Nezib","Nibhaz","Nibshan","Nicanor","Nicodemus","Nicolaitanes",
                "Nicolas","Nicopolis","Niger","Nimrah","Nimrod","Nimshi","Nineveh","Nisan","Nisroch","No","Noadiah",
                "Noah","Noah","Nob","Nobah","Nod","Nodab","Noe","Nogah","Noha","Non","Noph","Nophah","Nun","Nymphas"
        };

        final String[] wholeNameArray = new String[]{
                "Naam: fair; pleasant","Naamah: or Naaman; pleasant; pleasantness","Naarah: or Naarai; girl, maiden","Naashon: that foretells; that conjectures","Nabal: fool; senseless","Naboth: words; prophecies","Nachon: ready; sure","Nachor: same as Nahor","Nadab: free and voluntary gift; prince","Nagge: clearness; brightness; light","Nahaliel: inheritance; valley of God","Nahallal: praised; bright","Naham: comforter; leader","Naharai: my nostrils; hot; anger","Nahash: snake; serpent","Nahath: rest; a leader","Nahbi: very secret","Nahor: hoarse; dry; hot","Nahshon: same as Naashon","Nahum: comforter; penitent","Nain: beauty; pleasantness","Naioth: beauties; habitations","Naomi: beautiful; agreeable","Naphish: the soul; he that rests","Naphtali: that struggles or fights","Narcissus: astonishment; stupidity","Nason: helper; entry-way","Nathan: given; giving; rewarded","Nathanael: the gift of God","Nathan-melech: the gift of the king","Naum: same as Nahum","Nazareth: separated; crowned; sanctified","Nazarite: one chosen or set apart","Neah: moved; moving","Neapolis: the new city","Neariah: child of the Lord","Nebai: budding; speaking; prophesying","Nebaioth: words; prophecies; buds","Neballat: prophecy; budding","Nebat: that beholds","Nebo: that speaks or prophesies","Nebuchadnezzar: or Nebuchadrezzar; nabu protect my eldest son ","Nebushasi-hahban speech: prophecy; springing; flowing","Nebuzar-adan: fruits or prophecies of judgment","Necho: lame; beaten","Nedabiah: prince or vow of the Lord","Neginoth: stringed instruments","Nehelamite: dreamer; vale; brook","Nehemiah: consolation; repentance of the Lord","Nehum: comforter; penitent","Nehushta: made of brass",
                "Nehushtan: a trifling thing of brass","Neiel: commotion","Nekoda: painted; inconstant","Nemuel: the sleeping of God","Nepheg: weak; slacked","Nephish: same as Naphish","Nephishesim: diminished; torn in pieces","Nephthalim: same as Naphtali","Nephthoah: opening; open","Nephusim: same as Nephishesim","Ner: a lamp; new-tilled land","Nereus: same as Ner","Nergal: the great man; the hero","Nergal-sharezer: treasurer of Nergal","Neri: my light","Neriah: light; lamp of the Lord","Nethaneel: same as Nathanael","Nethaniah: the gift of the Lord","Nethinims: given or offered","Neziah: conqueror; strong","Nezib: standing-place","Nibhaz budding; prophesying","Nibshan: prophecy; growing of a tooth","Nicanor: a conqueror; victorious","Nicodemus: victory of the people","Nicolas: same as Nicodemus","Nicolaitanes: followers of Nicolas","Nicopolis: the city of victory","Niger: black","Nimrah: or Nimrim; leopard; bitterness; rebellion","Nimrod: rebellion (but probably an unknown Assyrian word)","Nimshi: rescued from danger","Nineveh: handsome; agreeable","Nisan: standard; miracle","Nisroch: flight; proof; temptation; delicate","Noadiah: witness","Noah: repose; consolation","Noah: that quavers or totters (Zelophehad's daughter)","Nob: discourse; prophecy","Nobah: that barks or yelps","Nod: vagabond; fugitive","Nodab: vowing of his own accord","Noe: same as Noah","Nogah: brightness; clearness","Noha: rest; a guide","Non: posterity; a fish; eternal","Noph: honeycomb; anything that distills or drops","Nophah: fearful; binding","Nun: same as Non","Nymphas: spouse; bridegroom"

        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.nText);
        text.setText(randomName);

        nList = (ListView) findViewById(R.id.nList);
        nAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        nList.setAdapter(nAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        nAd =findViewById(R.id.nAd);
        AdRequest nReq = new AdRequest.Builder().build();
        nAd.loadAd(nReq);
    }
}
