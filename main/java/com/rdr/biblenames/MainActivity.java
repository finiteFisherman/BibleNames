package com.rdr.biblenames;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,random,info;
    private AdView homeAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (Button)findViewById(R.id.aButton);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,aButton.class);
                startActivity(i);
            }
        });
        b = (Button)findViewById(R.id.bButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,bButton.class);
                startActivity(i);
            }
        });
        c = (Button)findViewById(R.id.cButton);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,cButton.class);
                startActivity(i);
            }
        });
        d = (Button)findViewById(R.id.dButton);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,dButton.class);
                startActivity(i);
            }
        });
        e = (Button)findViewById(R.id.eButton);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,eButton.class);
                startActivity(i);
            }
        });
        f = (Button)findViewById(R.id.fButton);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,fButton.class);
                startActivity(i);
            }
        });
        g = (Button)findViewById(R.id.gButton);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,gButton.class);
                startActivity(i);
            }
        });
        h = (Button)findViewById(R.id.hButton);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,hButton.class);
                startActivity(i);
            }
        });
        i = (Button)findViewById(R.id.iButton);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,iButton.class);
                startActivity(i);
            }
        });
        j = (Button)findViewById(R.id.jButton);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,jButton.class);
                startActivity(i);
            }
        });
        k = (Button)findViewById(R.id.kButton);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,kButton.class);
                startActivity(i);
            }
        });
        l = (Button)findViewById(R.id.lButton);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,lButton.class);
                startActivity(i);
            }
        });
        m = (Button)findViewById(R.id.mButton);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,mButton.class);
                startActivity(i);
            }
        });
        n = (Button)findViewById(R.id.nButton);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,nButton.class);
                startActivity(i);
            }
        });
        o = (Button)findViewById(R.id.oButton);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,oButton.class);
                startActivity(i);
            }
        });
        p = (Button)findViewById(R.id.pButton);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,pActivity.class);
                startActivity(i);
            }
        });
        q = (Button)findViewById(R.id.qButton);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,qButton.class);
                startActivity(i);
            }
        });
        r = (Button)findViewById(R.id.rButton);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,rButton.class);
                startActivity(i);
            }
        });

        s = (Button)findViewById(R.id.sButton);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,sButton.class);
                startActivity(i);
            }
        });
        t = (Button)findViewById(R.id.tButton);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,tButton.class);
                startActivity(i);
            }
        });
        u = (Button)findViewById(R.id.uButton);
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,uButton.class);
                startActivity(i);
            }
        });
        v = (Button)findViewById(R.id.vButton);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,vButton.class);
                startActivity(i);
            }
        });
        w = (Button)findViewById(R.id.wButton);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,wButton.class);
                startActivity(i);
            }
        });
        x = (Button)findViewById(R.id.xButton);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,xButton.class);
                startActivity(i);
            }
        });
        y = (Button)findViewById(R.id.yButton);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,yButton.class);
                startActivity(i);
            }
        });
        z = (Button)findViewById(R.id.zButton);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,zButton.class);
                startActivity(i);
            }
        });
        random = (Button)findViewById(R.id.randButton);
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,randButton.class);
                startActivity(i);
            }
        });
        info = (Button)findViewById(R.id.infoButton);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,searchButton.class);
                startActivity(i);
            }
        });

        MobileAds.initialize(this,"ca-app-pub-1944052140945352~6835337056");
        homeAd =findViewById(R.id.homeAd);
        AdRequest homeReq = new AdRequest.Builder().build();
        homeAd.loadAd(homeReq);
    }
}
