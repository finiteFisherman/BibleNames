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

public class rButton extends AppCompatActivity {

    private AdView rAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_button);

        Random r = new Random();
        ListView rList;
        ArrayAdapter<String> rAdapter;

        final String[] nameArray = new String[]{
                "Raamah","Raamiah","Rabbah","Rabbi","Rabmag","Rab-saris","Rab-shakeh","Raca","Rachab",
                "Rachal","Rachel","Raddai","Ragau","Raguel","Rahab","Rahab","Raham","Rakkath","Rakkon",
                "Ram","Ramah","Ramath","Ramathaim-zophim","Ramath-lehi","Ramath-mizpeh","Ramiah","Ramoth",
                "Raphah","Reaiah","Reba","Rebekah","Rechab","Reelaiah","Regem","Regemmelech","Rehabiah",
                "Rehob","Rehoboam","Rehoboth","Rehpaim","Rehum","Rei","Rekem","Remaliah","Remmon","Remphan",
                "Rephael","Rephaiah","Rephidim","Resen","Reu","Reuben","Reuel","Reumah","Rezeph","Rezin","Rezon",
                "Rhegium","Rhesa","Rhoda","Rhodes","Ribai","Riblah","Rimmon","Rinnah","Riphath","Rissah","Rithmah",
                "Rizpah","Rogelim","Rohgah","Romamti-ezer","Roman","Rome","Rosh","Rufus","Ruhamah","Rumah","Ruth"
        };

        final String[] wholeNameArray = new String[]{
                "Raamah: greatness; thunder; some sort of evil","Raamiah: thunder","Rabbah: great; powerful; contentious","Rabbi: or Rabboni; my teacher","Rabmag: who overthrows or destroys a multitude","Rab-saris: chief of the eunuchs","Rab-shakeh: cup-bearer of the prince","Raca: worthless; good-for-nothing","Rachab: large; extended","Rachal: to whisper; an embalmer","Rachel: sheep","Raddai: ruling; coming down","Ragau: friend; shepherd","Raguel: shepherd","Rahab: proud; quarrelsome (applied to Egypt)","Rahab: large; extended (name of a woman)","Raham: compassion; a friend","Rakkath: empty; temple of the head","Rakkon: vain; void; mountain of enjoyment","Ram: elevated; sublime","Ramah: same as Ram","Ramathaim-zophim: the two watch-towers","Ramath-lehi: elevation of the jaw-bone","Ramath-mizpeh: elevation of the watch-tower","Ramiah: exaltation of the Lord","Ramoth: eminences; high places","Reaiah: vision of the Lord","Reba: the fourth; a square; that lies or stoops down","Rebekah: fat; fattened; a quarrel appeased","Rechab: square; chariot with team of four horses","Reelaiah: shepherd or companion to the Lord","Regem: that stones or is stoned; purple","Regemmelech: he that stones the king; purple of the king","Rehabiah: breadth","Rehob: breadth; space; extent","Rehoboam: who sets the people at liberty",
                "Rehoboth: spaces; places","Rehum: merciful; compassionate","Rei: my shepherd; my companion; my friend","Rekem: vain pictures; divers picture","Remaliah: the exaltation of the Lord","Remmon: greatness; elevation; a pomegranate-tree","Remphan: prepared; arrayed","Rephael: the physic or medicine of God","Rephaiah: medicine or refreshment of the Lord","Rehpaim: giants; physicians; relaxed","Rephidim: beds; places of rest","Resen: a bridle or bit","Reu: his friend; his shepherd","Reuben: who sees the son; the vision of the son","Reuel: the shepherd or friend of God","Reumah: lofty; sublime","Rezeph: pavement; burning coal","Rezin: good-will; messenger","Rezon: lean; small; secret; prince","Rhegium: rupture; fracture","Rhesa: will; course","Rhoda: a rose","Rhodes: same as Rhoda","Ribai: strife","Riblah: quarrel; greatness to him","Rimmon: exalted; pomegranate","Rinnah: song; rejoicing","Riphath: remedy; medicine; release; pardon","Rissah: watering; distillation; dew","Rithmah: juniper; noise","Rizpah: bed; extension; a coal","Rogelim: a foot or footman","Rohgah: filled or drunk with talk","Romamti-ezer: exaltation of help","Roman: strong; powerful","Rome: strength; power","Rosh: the head; top","Rufus: red","Ruhamah: having obtained mercy","Rumah: exalted; sublime; rejected","Ruth: drunk; satisfied"

        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.rText);
        text.setText(randomName);

        rList = (ListView) findViewById(R.id.rList);
        rAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        rList.setAdapter(rAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        rAd =findViewById(R.id.rAd);
        AdRequest rReq = new AdRequest.Builder().build();
        rAd.loadAd(rReq);
    }
}
