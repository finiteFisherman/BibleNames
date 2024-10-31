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

public class tButton extends AppCompatActivity {

    private AdView tAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_button);

        Random r = new Random();
        ListView tList;
        ArrayAdapter<String> tAdapter;

        final String[] nameArray = new String[]{
                "Taanach","Taanach-shilo","Tabbath","Tabeal","Taberah","Tabitha","Tabor","Tabrimon",
                "Tadmor","Tahan","Tahapenes","Tahath","Tahpenes","Tahrea","Talitha-cumi","Talmai",
                "Tamah","Tamar","Tammuz","Tanach","Tanhumeth","Taphath","Tappuah","Tarah","Taralah",
                "Tarea","Tarpelites","Tarshish","Tarsus","Tartak","Tartan","Tatnai","Tebah","Tebaliah",
                "Tebeth","Tehinnah","Tekel","Tekoa","Telabib","Telah","Telassar","Telem","Telharsa","Tel-melah",
                "Tema","Teman","Terah","Teraphim","Tertius","Tertullus","Tetrarch","Thaddeus","Thahash","Thamah",
                "Tharah","Thebez","Thelasar","Theophilus","Thessalonica","Theudas","Thomas","Thummim","Thyatira",
                "Tibbath","Tiberias","Tiberius","Tibni","Tidal","Tiglath-pileser","Tikvah","Tilon","Timeus","Timnah",
                "Timnath","Timnath-heres","Timon","Timotheus","Tiphsah","Tirhakah","Tiria","Tirshatha","Tirzah","Tishbite",
                "Titus","Toah","Tob-adonijah","Tobiah","Tobit","Tochen","Togarmah","Tohu","Toi","Tola","Tolad","Trachonitis",
                "Troas","Trophimus","Tryphena","Tryphon","Tryphosa","Tubal","Tubal-cain","Tychicus","Tyrannus","Tyre"
        };

        final String[] wholeNameArray = new String[]{
                "Taanach: who humbles thee; who answers thee","Taanach-shilo: breaking down a fig-tree","Tabbath: good; goodness","Taberah: burning","Tabitha: clear-sighted; a roe-deer","Tabor: choice; purity; bruising","Tabrimon: good pomegranate; the navel; the middle","Tadmor: the palm-tree; bitterness","Tahan: beseeching; merciful","Tahapenes: secret temptation","Tahath: fear; going down","Tahpenes: standard; flight; temptation","Tahrea: anger; wicked contention","Talitha-cumi: young woman","Talmai: my furrow; that suspends the waters; heap of waters","Tamah: blotting or wiping out; smiting","Tamar: palm; palm-tree","Tammuz: abstruse; concealed; consumed","Tanach: same as Taanach","Tanhumeth: consolation; repentance","Taphath: distillation; drop","Tappuah: apple; swelling","Tarah: a hair; a wretch; one banished","Taralah: searching out slander","Tarea: howling; doing evil","Tarpelites: ravishers; succession of miracles","Tarshish: contemplation; examination","Tarsus: winged; feathered","Tartak: chained; bound; shut up","Tartan: a general (official title)","Tatnai: that gives; the overseer of the gifts and tributes","Tebah: murder; butchery; guarding of the body; a cook","Tebaliah: baptism","Tebeth: good","Tehinnah: entreaty; a favor","Tekel: weight","Tekoa: trumpet; that is confirmed","Telabib: a heap of new grain","Telah: moistening; greenness","Telassar: taking away; heaping up","Telem: their dew; their shadow","Telharsa: suspension of the plow","Tel-melah: heap of salt","Tema: admiration; perfection; consummation","Terah: to breathe; scent; blow","Teraphim: images; idols","Tertius: third","Tertullus: third","Tetrarch: governor of a fourth part","Thaddeus: that praises or confesses","Thahash: that makes haste; that keeps silence",
                "Thamah: that blots out; that suppresses","Tharah: same as Terah","Thebez: muddy; eggs; fine linen or silk","Thelasar: same as Telassar","Theophilus: friend of God","Thessalonica: victory against the Thessalians","Theudas: flowing with water","Thomas: a twin","Thummim: perfection; truth","Thyatira: a perfume; sacrifice of labor","Tibbath: killing; a cook","Tiberias: good vision; the navel","Tiberius: the son of Tiber","Tibni: straw; hay","Tidal: that breaks the yoke; knowledge of elevation","Tiglath-pileser: that binds or takes away captivity","Tikvah: hope; a little line; congregation","Tilon: murmuring","Timeus: perfect; admirable; honorable","Timnath: image; figure; enumeration","Timon: honorable; worthy","Timotheus: or Timothy  honor of God; valued of God","Tiphsah: passage; leap; step; the passover","Tirhakah: inquirer; examiner; dull observer","Tiria: searching out","Tirshatha: a governor","Tirzah: benevolent; complaisant; pleasing","Tishbite: that makes captive","Titus: pleasing","Toah: weapon; dart","Tob: good; goodness","Tob-adonijah: my good God; the goodness of the foundation of the Lord","Tochen: middle","Togarmah: which is all bone","Tohu: that lives; that declares","Toi: who wanders","Tola: worm; grub; scarlet","Tolad: a generation","Tophel: ruin; folly; without understanding","Tophet: a drum; betraying","Trachonitis: stony","Troas: penetrated","Trophimus: well educated; well brought up","Tryphena: delicious; delicate","Tryphon: masculine of Tryphena","Tryphosa: thrice shining","Tubal: the earth; the world; confusion","Tubal-cain: worldly possession; possessed of confusion","Tychicus: casual; by chance","Tyrannus: a prince; one that reigns","Tyre: or Tyrus; strength"
        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.tText);
        text.setText(randomName);

        tList = (ListView) findViewById(R.id.tList);
        tAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        tList.setAdapter(tAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        tAd =findViewById(R.id.tAd);
        AdRequest tReq = new AdRequest.Builder().build();
        tAd.loadAd(tReq);
    }
}
