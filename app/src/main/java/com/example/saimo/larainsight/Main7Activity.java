package com.example.saimo.larainsight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main7Activity extends AppCompatActivity implements View.OnClickListener {

    private Button bthod,btvision,btmission,btback2,btchair,btnews,btfee,btplace,btprinci,btcourse,btevents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        init1();
    }
    public void onBackPressed() {

        Intent intent = new Intent(this, Main2Activity.class);
        // intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
    public void init1()
    {
        bthod = (Button) findViewById(R.id.bthod);
        btcourse = (Button) findViewById(R.id.btcourse);
        btplace = (Button) findViewById(R.id.btplace);
        btprinci = (Button) findViewById(R.id.btprinci);
        btchair = (Button) findViewById(R.id.btchair);
        btmission = (Button) findViewById(R.id.btmission);
        btvision = (Button) findViewById(R.id.btvision);
        btnews = (Button) findViewById(R.id.btnews);

        btcourse.setOnClickListener(this);
        btprinci.setOnClickListener(this);
        btchair.setOnClickListener(this);
        btmission.setOnClickListener(this);
        bthod.setOnClickListener(this);
        btplace.setOnClickListener(this);
        btvision.setOnClickListener(this);
        btnews.setOnClickListener(this);

    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btvision:
                Intent intent11=new Intent(this, Main12Activity.class);
                startActivity(intent11);
                finish();
                break;
            case R.id.btmission:
                Intent intent12= new Intent(this,Main13Activity.class);
                startActivity(intent12);
                finish();
                break;

            case R.id.btchair:
                Intent intent13= new Intent(this,Main14Activity.class);
                startActivity(intent13);
                finish();
                break;
            case R.id.btprinci:
                Intent intent14=new Intent(this,Main15Activity.class);
                startActivity(intent14);
                finish();
                break;
            case R.id.bthod:
                Intent intent15= new Intent(this,Main16Activity.class);
                startActivity(intent15);
                finish();
                break;
            case R.id.btcourse:
                Intent intent16= new Intent(this,Main17Activity.class);
                startActivity(intent16);
                finish();
                break;
            case R.id.btplace:
                Intent intent17= new Intent(this,Main18Activity.class);
                startActivity(intent17);
                finish();
                break;
            default:
                Intent intent18=new Intent(this,Main19Activity.class);
                startActivity(intent18);
                finish();
                break;
        }
    }
}