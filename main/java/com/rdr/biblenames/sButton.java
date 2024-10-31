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

public class sButton extends AppCompatActivity {

    private AdView sAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_button);

        Random r = new Random();
        ListView sList;
        ArrayAdapter<String> sAdapter;

        final String[] nameArray = new String[]{
                "Sabaoth","Sabeans","Sabtah","Sabtechah","Sacar","Sadducees","Sadoc","Salah","Salamis",
                "Salathiel","Salcah","Salem","Salim","Sallai","Salma","Salmon","Salome","Samaria","Samlah",
                "Samos","Samothracia","Samson","Samuel","Sanballat","Sanhedrin","Sansannah","Saph","Saphir",
                "Sapphira","Sarah","Sarai","Sardis","Sardites","Sarepta","Sargon","Sarid","Saron","Sarsechim",
                "Saruch","Satan","Saul","Sceva","Schaaph","Seba","Sebat","Secacah","Sechu","Secundus","Segub",
                "Seir","Sela","Selah","Sela-hammah-lekoth","Seled","Seleucia","Sem","Semachiah","Semaiah","Semei",
                "Senaah","Seneh","Senir","Sennacherib","Seorim","Sephar","Sepharad","Sepharvaim","Serah","Seraiah",
                "Seraphim","Sered","Sergius","Serug","Seth","Sethur","Shaalabbim","Shaalbim","Shaalbonite","Shaaraim",
                "Shaashgaz","Shabbethai","Shachia","Shadrach","Shage","Shalem","Shalim","Shalisha","Shallum","Shalmai",
                "Shalman","Shalmaneser","Shamariah","Shamed","Shamer","Shamgar","Shamhuth","Shamir","Shammah","Shammai",
                "Shammoth","Shammuah","Shamsherai","Shapham","Shaphat","Sharai","Sharar","Sharezer","Sharon","Shashai",
                "Shashak","Shaul","Shaveh","Shealtiel","Sheariah","Shear-jashub","Sheba","Shebam","Shebaniah","Shebarim",
                "Sheber","Shebna","Shebuel","Shecaniah","Shechem","Shedeur","Shehariah","Shelah","Shelemiah","Sheleph","Shelesh",
                "Shelomi","Shelumiel","Shem","Shema","Shemaiah","Shemariah","Shemeber","Shemer","Shemida","Sheminith","Shemiramoth",
                "Shemuel","Shen","Shenazar","Shenir","Shephatiah","Shephi","Shepho","Shephuphan","Sherah","Sherebiah","Sheshach",
                "Sheshai","Sheshan","Sheshbazzar","Shethar","Shethar-boznai","Sheva","Shibboleth","Shibmah","Shicron","Shiggaion",
                "Shihon","Shihor-libnah","Shilhi","Shillem","Shiloah","Shiloh","Shiloh","Shilom","Shilshah","Shimeah","Shimei","Shimeon",
                "Shimma","Shimon","Shimrath","Shimri","Shimrith","Shimshai","Shinab","Shinar","Shiphi","Shiphrah","Shisha","Shishak",
                "Shitrai","Shittim","Shiza","Shoa","Shobab","Shobach","Shobai","Shobal","Shobek","Shochoh","Shoham","Shomer","Shophach",
                "Shophan","Shoshannim","Shua","Shuah","Shual","Shubael","Shuham","Shulamite","Shunem","Shuni","Shuphim","Shur","Shushan",
                "Shuthelah","Sia","Sibbechai","Sibmah","Sichem","Siddim","Sidon","Sigionoth","Sihon","Sihor","Silas","Silla","Siloa","Silvanus",
                "Simeon","Simon","Sin","Sinai","Sinim","Sinon","Sion","Sippai","Sisamai","Sisera","Sitnah","Sivan","Smyrna","Socoh","Sodi",
                "Sodom","Solomon","Song","Sopater","Sophereth","Sorek","Sosthenes","Sotai","Spain","Stachys","Stephanas","Stephen","Suah",
                "Succoth","Succoth-benoth","Sud","Sur","Susanna","Susi","Sychar","Syene","Syntyche","Syracuse"
        };

        final String[] wholeNameArray = new String[]{
                "Sabaoth: Lord of hosts","Sabeans: captivity; conversion; old age","Sabtah: a going about or circuiting; old age","Sabtechah: that surrounds; that causes wounding","Sacar: wares; a price","Sadducees: followers of Sadoc","Sadoc: or Zadok","Salah: mission; sending","Salamis: shaken; test; beaten","Salathiel: asked or lent of God","Salcah: thy basket; thy lifting up","Salem: complete or perfect peace","Salim: foxes; fists; path","Sallai: or Sallu","Salma: peace; perfection","Salmon: peaceable; perfect; he that rewards","Salome: same as Salmon","Samaria: watch-mountain","Samlah: his raiment; his left hand; his astonishment","Samos: full of gravel","Samothracia: an island possessed by the Samians and Thracians","Samson: his sun; his service; there the second time","Samuel: heard of God; asked of God","Sanballat: bramble-bush; enemy in secret","Sanhedrin: sitting together","Sansannah: bough or bramble of the enemy","Saph: rushes; sea-moss","Saphir: delightful","Sapphira: that relates or tells","Sarah: lady; princess; princess of the multitude","Sarai: my lady; my princess","Sardis: prince of joy","Sardites: removing a dissension","Sarepta: a goldsmith's shop","Sargon: who takes away protection","Sarid: remaining; hand of a prince","Saron: same as Sharon","Sarsechim: master of the wardrobe","Saruch: branch; layer; lining","Satan: contrary; adversary; enemy; accuser","Saul: demanded; lent; ditch; death","Sceva: disposed; prepared","Seba: a drunkard; that turns","Sebat: twig; scepter; tribe","Secacah: shadow; covering; defense","Sechu: defense; bough","Secundus: second","Segub: fortified; raised","Seir: or Seirath","Sela: a rock","Sela-hammah-lekoth: rock of divisions","Selah: the end; a pause","Seled: affliction; warning","Seleucia: shaken or beaten by the waves","Sem: same as Shem; name","Semachiah: joined to the Lord","Semaiah: obeying the Lord","Semei: hearing; obeying","Senaah: bramble; enemy","Seneh: same as Senaah","Senir: bed-candle; changing","Sennacherib: bramble of destruction","Seorim: gates; hairs; tempests","Sephar: book; scribe; number","Sepharad: a book descending","Sepharvaim: the two books; the two scribes","Serah: lady of scent; song; the morning star","Seraiah: prince of the Lord","Seraphim: burning; fiery","Sered: dyer's vat","Sergius: net","Serug: branch; layer; twining","Seth: put; who puts; fixed","Sethur: hid; destroying","Shaalabbim: understanding","Shaalbim: that beholds the heart","Shaalbonite: a fox's building","Schaaph: fleeing; thinking","Shaaraim: gates; valuation; hairs","Shaashgaz: he that presses the fleece; that shears the sheep","Shabbethai: my rest","Shachia: protection of the Lord","Shadrach: tender","Shage: touching softly; multiplying much","Shalem: same as Salem","Shalim: same as Salim","Shalisha: three; the third; prince; captain","Shallum: perfect; agreeable","Shalmai: my garment","Shalman: peaceable; perfect; that rewards","Shalmaneser: peace; tied; chained; perfection; retribution","Shamariah: throne or keeping of the Lord","Shamed: destroying; wearing out","Shamer: keeper; thorn; dregs","Shamgar: named a stranger; he is here a stranger","Shamhuth: desolation; destruction","Shamir: or Shamer","Shammah: loss; desolation; astonishment","Shammai: my name; my desolations","Shammoth: names; desolations","Shammuah: he that is heard; he that is obeyed","Shamsherai: there a singer or conqueror","Shapham: or Shaphan","Sharai: my lord; my prince; my song","Sharar: navel; thought; singing","Sharezer: overseer of the treasury","Sharon: his plain; his song","Shashai: rejoicing; mercy; linen","Shashak: a bag of linen; the sixth bag","Shaul: or Saul","Shaveh: the plain; that makes equality","Shealtiel: same as Salathiel","Sheariah: gate of the Lord; tempest of the Lord","Shear-jashub: the remnant shall return","Sheba: captivity; old man; repose; oath","Shebam: compassing about; old men","Shebaniah: the Lord that converts","Shebarim: breakings; hopes","Sheber: breaking; hope","Shebna: who rests himself; who is now captive","Shebuel: turning","Shecaniah: habitation of the Lord","Shechem: part; portion; back early in the morning","Shedeur: field of light; light of the Almighty","Shehariah: mourning or blackness of the Lord",
                "Shelah: that breaks; that unties; that undresses","Shelemiah: God is my perfection; my happiness; my peace","Sheleph: who draws out","Shelesh: captain; prince","Shelumiel: same as Shelemiah","Shem: name; renown","Shema: hearing; obeying","Shemaiah: that hears or obeys the Lord","Shemariah: God is my guard","Shemeber: name of force; name of the strong","Shemer: guardian; thorn","Shemida: name of knowledge; that puts knowledge","Sheminith: eighth (an eight-stringed instrument)","Shemiramoth: the height of the heavens","Shemuel: appointed by God","Shen: tooth; ivory; change","Shenazar: treasurer of a tooth","Shenir: lantern; light that sleeps","Shephatiah: the Lord that judges","Shephi: beholder; honeycomb; garment","Shepho: desert","Shephuphan: serpent","Sherah: flesh; relationship","Sherebiah: singing with the Lord","Sheshach: bag of flax or linen","Sheshai: six; mercy; flax","Sheshan: lily; rose; joy; flax","Sheshbazzar: joy in tribulation; joy of the vintage","Shethar: putrefied; searching","Shethar:-boznai that makes to rot; that seeks those who despise me","Sheva: vanity; elevation; fame; tumult","Shibmah: overmuch captivity","Shicron: drunkenness; his gift; his wages","Shiggaion: a song of trouble or comfort","Shihon: sound; wall of strength","Shihor-libnah: blackness of Libnah","Shilhi: or Shilhim","Shillem: peace; perfection; retribution","Shiloah: same as Siloah","Shiloh: sent","Shiloh (name of a city) peace; abundance","Shilom: tarrying; peace-maker","Shilshah: three; chief; captain","Shimeah: or Shimeath","Shimei: or Shimi; that hears or obeys; my reputation; my fame","Shimeon: or Simeon; obedient; listening; little hyena","Shimma: same as Shimeah","Shimon: providing well; fatness; oil","Shimrath: hearing; obedient","Shimshai: my son","Shimri: thorn; dregs","Shinab: father of changing","Shinar: watch of him that sleeps","Shiphi: multitude","Shiphrah: handsome; trumpet; that does good","Shisha: of marble; pleasant","Shishak: present of the bag; of the pot; of the thigh","Shitrai: gatherer of money","Shittim: thorns","Shiza: this gift","Shoa: kings; tyrants","Shobab: returned; turned back; a spark","Shobach: your bonds; your chains","Shobai: turning captivity","Shobal: path; ear of corn","Shobek: made void; forsaken","Shochoh: defense; a bough","Shoham: keeping back","Shomer: keeper; dregs","Shophach: pouring out","Shophan: rabbit; hid","Shoshannim: those that shall be changed","Shua: crying; saving","Shuah: ditch; swimming; humiliation","Shual: fox; path; first","Shubael: returning captivity; seat of God","Shuham: talking; thinking; humiliation; budding","Shulamite: peaceable; perfect; that recompenses","Shunem: their change; their sleep","Shuni: changed; sleeping","Shur: wall; ox; that beholds","Shushan: lily; rose; joy","Shuthelah: plant; verdure; moist; pot","Sia: moving; help","Sibbechai: bough; cottage; of springs","Sibmah: conversion; captivity","Sichem: portion; shoulder","Siddim: the tilled field","Sidon: hunting; fishing; venison","Sigionoth: according to variable songs or tunes","Sihon: rooting out; conclusion","Sihor: black; trouble (the river Nile)","Silas three","Silla exalting","Siloa Siloam","Silvanus who loves the forest","Simeon that hears or obeys; that is heard","Simon that hears; that obeys","Sin bush","Sinai: a bush; enmity","Sinim: south country","Sion: noise; tumult","Sippai: threshold; silver cup","Sinon: a breast-plate; deliverance","Sisamai: house; blindness","Sisera: that sees a horse or a swallow","Sitnah: hatred","Sivan: a bush or thorn","Smyrna: myrrh","So a measure for grain; vail","Socoh: tents; tabernacles","Sodi: my secret","Sodom: their secret; their cement","Solomon: peaceable; perfect; one who recompenses","Sopater: or Sosipater","Sophereth: scribe","Sorek: vine; hissing; a color inclining to yellow","Sosthenes: savior; strong; powerful","Sotai: conclusion in pleading; binding","Spain: rare; precious","Stachys: spike or ear of corn","Stephanas: crown; crowned","Stephen: same as Stephanas","Suah: speaking; entreating; ditch","Succoth: tents; tabernacles","Succoth-benoth: the tents of daughters","Sud: my secret","Sur: that withdraws or departs; rebellion","Susanna: lily; rose; joy","Susi: horse; swallow; moth","Sychar: end","Syene: a bush; enmity","Syntyche: that speaks or discourses","Syracuse: that draws violently"

        };

        int randInt = r.nextInt(nameArray.length);
        String randomName = nameArray[randInt];

        TextView text = (TextView) findViewById(R.id.sText);
        text.setText(randomName);

        sList = (ListView) findViewById(R.id.sList);
        sAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,wholeNameArray);
        sList.setAdapter(sAdapter);

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        sAd =findViewById(R.id.sAd);
        AdRequest sReq = new AdRequest.Builder().build();
        sAd.loadAd(sReq);
    }
}
