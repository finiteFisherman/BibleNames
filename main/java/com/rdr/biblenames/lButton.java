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

public class lButton extends AppCompatActivity {

    private AdView lAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_button);

        Random r = new Random();
        ListView lList;
        ArrayAdapter<String> lAdapter;

        final String[] nameArray = new String[]{
                "Laadah","Laadan","Laban","Labana","Lachish","Lael","Lahad","Lahairoi","Lahmam",
                "Lahmi","Laish","Lamech","Laodicea","Lapidoth","Lasea","Lashah","Lazarus","Leah",
                "Lebanon","Lebaoth","Lebbeus","Lebonah","Lehabim","Lehi","Lekah","Lemuel","Leshem",
                "Letushim","Leummim","Levi","Libnah","Libni","Libya","Linus","Lo-ammi","Lod","Lois",
                "Lo-ruhamah","Lot","Lubin","Lucas","Lucifer","Lud","Luhith","Luke","Luz","Lycaonia",
                "Lydda","Lysanias","Lysias","Lysimachus","Lystra"
        };

        final String[] wholeNameArray = new String[]{

                "Laadah: to assemble together; to testify; passing over","Laadan: for pleasure; devouring; judgment","Laban: white; shining; gentle; brittle","Labana: the moon; whiteness; frankincense","Lachish: who walks","Lael: to God; to the mighty","Lahad: praising; to confess","Lahairoi: who liveth and seeth me","Lahmam: their bread; their war","Lahmi: my bread; my war","Laish: a lion","Lamech: poor; made low","Laodicea: just people","Lapidoth: enlightened; lamps","Lasea: thick; wise","Lashah: to call; to anoint","Lazarus: assistance of God","Leah: weary; tired","Lebanon: white","Lebaoth: lividness","Lebbeus: a man of heart; praising; confessing","Lebonah: same as Labana","Lehabim: flames; inflamed; swords","Lehi: jawbone","Lekah: walking; going","Lemuel: God with them",
                "Leshem: a name; putting; a precious stone","Letushim: hammermen; filemen","Leummim countries; without water","Levi: associated with him","Libnah: white; whiteness","Libni: same as Libnah","Libya: the heart of the sea; fat","Linus: net","Lo-ammi: not my people","Lod: nativity; generation","Lois: better","Lo-ruhamah: not having obtained mercy; not pitied","Lot: covering, veil", "Lotan: a covering","Lubin: heart of a man; heart of the sea","Lucas: or Lucius; is bringer of light, morning","Lucifer: bringing light","Lud: or Ludim; nativity, generation","Luhith: made of boards","Luke: luminous; white","Luz: separation; departure; an almond","Lycaonia: she-wolf","Lydda: or Lydia; kind; kindred spirit","Lysanias: that drives away sorrow","Lysias: dissolving","Lysimachus: scattering the battle","Lystra: that dissolves or disperses"

        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.lText);
        text.setText(randomName);

        lList = (ListView) findViewById(R.id.lList);
        lAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray );
        lList.setAdapter(lAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        lAd =findViewById(R.id.lAd);
        AdRequest lReq = new AdRequest.Builder().build();
        lAd.loadAd(lReq);
    }
}
