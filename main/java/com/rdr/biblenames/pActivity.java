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

public class pActivity extends AppCompatActivity {

    private AdView pAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p);

        Random r = new Random();
        ListView pList;
        ArrayAdapter<String> pAdapter;

        final String[] nameArray = new String[]{
                "Paarai","Padan-aram","Padon","Pagiel","Pahath-Moab","Pai","Palal","Palestina","Pallu",
                "Palti","Paltiel","Pamphylia","Paphos","Parah","Paran","Parbar","Parmashta","Parmenas",
                "Parnach","Parosh","Parshandatha","Paruah","Pasach","Pasdammin","Paseah","Pashur","Patara",
                "Pathros","Patmos","Patrobas","Pau","Paul","Paulus","Pedahzur","Pedaiah","Pekah","Pekahiah",
                "Pekod","Pelaiah","Pelaliah","Pelatiah","Peleg","Pelethites","Pelonite","Peniel","Peninnah",
                "Pentapolis","Pentateuch","Pentecost","Penuel","Peor","Perazim","Peresh","Perez","Perez-Uzza",
                "Perga","Pergamos","Perida","Perizzites","Persia","Persis","Peruda","Peter","Pethahiah","Pethuel",
                "Peulthai","Phalec","Phallu","Phalti","Phanuel","Pharaoh","Pharez","Pharisees","Pharpar","Phebe",
                "Phenice","Phichol","Philadelphia","Philemon","Philetus","Philip","Philippi","Philistines","Philologus",
                "Phinehas","Phlegon","Phrygia","Phurah","Phygellus","Phylacteries","Pi-beseth","Pi-hahiroth","Pilate","Pinon",
                "Piram","Pirathon","Pisgah","Pisidia","Pison","Pithom","Pithon","Pochereth","Pontius","Pontus","Poratha","Potiphar",
                "Potipherah","Prisca","Priscilla","Prochorus","Puah","Publius","Pudens","Pul","Punites","Punon","Pur","Puteoli","Putiel"
        };

        final String[] wholeNameArray = new String[]{
                "Paarai: opening","Padan-aram: cultivated field or table-land","Padon: his redemption; ox-yoke","Pagiel: prevention","Pahath-Moab: ruler of Moab","Pai: or Pau; howling","Palal: thinking","Palestina: which is covered; watered; or brings and causes ruin","Pallu: marvelous; hidden","Palti: deliverance; flight","Paltiel: deliverance; or banishment","Pamphylia: a nation made up of every tribe","Paphos: which boils","Parah: a cow; increasing","Paran: beauty; glory; ornament","Parbar: a suburb","Parmashta: a yearling bull","Parmenas: that abides","Parnach: a bull striking","Parosh: a flea; the fruit of a moth","Parshandatha: given by prayer","Paruah: flourishing; that flies away","Pasach: thy broken piece","Pasdammin: portion or diminishing of blood","Paseah: passing over; halting","Pashur: that extends or multiplies the hole; whiteness","Patara: trodden under foot","Patmos: mortal","Patrobas: paternal; that pursues the steps of his father","Pau: same as Pai","Paul: small; little","Paulus: same as Paul","Pedahzur: strong or powerful savior; stone of redemption","Pedaiah: redemption of the Lord","Pekah: he that opens; that is at liberty","Pekahiah: it is the Lord that opens","Pekod: noble; rulers","Pelaiah: the Lord's secret or miracle","Pelaliah: entreating the Lord","Pelatiah: let the Lord deliver; deliverance of the Lord","Peleg: division","Pelethites: judges; destroyers","Pelonite: falling; secret","Peniel: face or vision of God; that sees God","Peninnah: pearl; precious stone; the face","Pentapolis: five cities","Pentecost: fiftieth","Penuel: same as Peniel","Peor: hole; opening","Perazim: divisions","Peresh: horseman","Perez: divided","Perez-Uzza: division of Uzza","Perga: very earthy","Pergamos: height; elevation","Perida: separation; division","Perizzites: dwelling in villages","Persia: that cuts or divides; a nail; a gryphon; a horseman","Persis: same as Persia","Peruda: same as Perida",
                "Peter: a rock or stone","Pethahiah: the Lord opening; gate of the Lord","Pethuel: mouth of God; persuasion of God","Peulthai: my works","Phalec: same as Peleg","Phalti: or Palti; deliverance","Phanuel: face or vision of God","Pharaoh: that disperses; that spoils","Pharez: division; rupture","Pharisees: set apart","Pharpar: that produces fruit","Phebe: shining; pure","Phenice: Phoenicia","Phichol: the mouth of all","Philadelphia: love of a brother","Philemon: who kisses","Philetus: amiable; beloved","Philip: warlike; a lover of horses","Philippi: same as Philip","Philistines: those who dwell in villages","Philologus: a lover of letters","Phinehas: bold aspect; face of trust or protection","Phlegon: zealous; burning","Phrygia: dry; barren","Phurah: that bears fruit","Phygellus: fugitive","Phylacteries: things to be especially observed","Pi-beseth: abode of the goddess Bahest or Bast","Pi-hahiroth: the mouth; the pass of Hiroth","Pilate: armed with a dart","Pinon: pearl; gem; that beholds","Piram: a wild ass of them","Pirathon: his dissipation or deprivation; his rupture","Pisgah: hill; eminence; fortress","Pisidia: pitch; pitchy","Pison: changing; extension of the mouth","Pithom: their mouthful; a dilatation of the mouth","Pithon: mouthful; persuasion","Pochereth: cutting of the mouth of warfare","Pontius: marine; belonging to the sea","Pontus: the sea","Poratha: fruitful","Potiphar: bull of Africa; a fat bull","Potipherah: that scatters abroad","Prisca: ancient","Priscilla: same as Prisca","Prochorus: he that presides over the choirs","Puah: mouth; corner; bush of hair","Publius: common","Pudens: shamefaced","Pul: bean; destruction","Punites: beholding; my face","Punon: precious stone; that beholds","Pur: Purim","Putiel: God is my fatness","Puteoli: sulphureous wells"

        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.pText);
        text.setText(randomName);

        pList = (ListView) findViewById(R.id.pList);
        pAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        pList.setAdapter(pAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        pAd =findViewById(R.id.pAd);
        AdRequest pReq = new AdRequest.Builder().build();
        pAd.loadAd(pReq);
    }
}
