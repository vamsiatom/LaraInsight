package com.example.saimo.larainsight;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main8Activity extends AppCompatActivity implements View.OnClickListener {

    private Button btgate, btgre, btcat, btprog, bteng, btquant, btsem, btcore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        initbb();
    }
    public void onBackPressed() {

        Intent intent = new Intent(this, Main2Activity.class);
        // intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void initbb() {
        btgate = (Button) findViewById(R.id.btgate);
        btgre = (Button) findViewById(R.id.btgre);
        btcat = (Button) findViewById(R.id.btcat);
        btprog = (Button) findViewById(R.id.btprog);
        bteng = (Button) findViewById(R.id.bteng);
        btquant = (Button) findViewById(R.id.btquant);
        btsem = (Button) findViewById(R.id.btsem);
        btcore = (Button) findViewById(R.id.btcore);

        btcat.setOnClickListener(this);
        btcore.setOnClickListener(this);
        bteng.setOnClickListener(this);
        btgate.setOnClickListener(this);
        btprog.setOnClickListener(this);
        btquant.setOnClickListener(this);
        btgre.setOnClickListener(this);
        btsem.setOnClickListener(this);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btgate:
                Intent intent20 = new Intent(this,Main20Activity.class);
                startActivity(intent20);
                finish();
                break;
            case R.id.btgre:
                Intent intent21 = new Intent(this, Main21Activity.class);
                startActivity(intent21);
                finish();
                break;
            case R.id.btcat:
                Intent intent22 = new Intent(this, Main22Activity.class);
                startActivity(intent22);
                finish();
                break;
            case R.id.btcore:
                Intent intent23 = new Intent(this, Main23Activity.class);
                startActivity(intent23);
                finish();
                break;
            case R.id.bteng:
                Intent intent24 = new Intent(this, Main24Activity.class);
                startActivity(intent24);
                finish();
                break;
            case R.id.btprog:
                Intent intent25 = new Intent(this, Main25Activity.class);
                startActivity(intent25);
                finish();
                break;
            case R.id.btsem:
                Intent intent26 = new Intent(this, Main26Activity.class);
                startActivity(intent26);
                finish();
                break;
            case R.id.btquant:
                Intent intent27 = new Intent(this, Main27Activity.class);
                startActivity(intent27);
                finish();
                break;
        }
    }
}
