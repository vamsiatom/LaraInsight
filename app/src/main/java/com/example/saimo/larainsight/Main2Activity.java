package com.example.saimo.larainsight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private Button btprofile, btatten, btfdback, btabtclg, btag, btlogout,btebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }
    @Override
    public void onBackPressed() {

        Intent intent = new Intent(this, MainActivity.class);
       // intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }


    public void init() {
        btprofile = (Button) findViewById(R.id.btprofile);
        btatten = (Button) findViewById(R.id.btatten);
        btfdback = (Button) findViewById(R.id.btfdback);
        btabtclg = (Button) findViewById(R.id.btabtclg);
        btag = (Button) findViewById(R.id.btag);
        btlogout = (Button) findViewById(R.id.btlogout);
        btebook = (Button)findViewById(R.id.btsebook);
        btprofile.setOnClickListener(this);
        btatten.setOnClickListener(this);
        btfdback.setOnClickListener(this);
        btabtclg.setOnClickListener(this);
        btag.setOnClickListener(this);
        btlogout.setOnClickListener(this);
        btebook.setOnClickListener(this);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btprofile:
                Intent intent4 = new Intent(Main2Activity.this, Main6Activity.class);
                startActivity(intent4);
                finish();
                break;
            case R.id.btatten:
                Intent intent5 = new Intent(Main2Activity.this, Main9Activity.class);
                startActivity(intent5);
                finish();
                break;
            case R.id.btfdback:
                Intent intent6 = new Intent(this, Main11Activity.class);
                startActivity(intent6);
                finish();
                break;
            case R.id.btabtclg:
                Intent intent7 = new Intent(this, Main7Activity.class);
                startActivity(intent7);
                finish();
                break;
            case R.id.btag:
                Intent intent8 = new Intent(this, Main10Activity.class);
                startActivity(intent8);
                finish();
                break;
            case R.id.btsebook:
                Intent intent9 = new Intent(this, Main8Activity.class);
                startActivity(intent9);
                finish();
                break;
            default:
                Intent intent10 = new Intent(this, MainActivity.class);
                startActivity(intent10);
                finish();
                break;
        }
    }
}