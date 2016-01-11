package com.example.saimo.larainsight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

        private Button btsprofile, btsebook,btstudentinfo, btslogout;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main3);
            init();
        }
    public void onBackPressed() {

        Intent intent = new Intent(this, MainActivity.class);
       // intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }


    public void init() {
            btsprofile = (Button) findViewById(R.id.btsprofile);
            btsebook = (Button) findViewById(R.id.btsebook);
            btslogout = (Button) findViewById(R.id.btslogout);
            btstudentinfo = (Button)findViewById(R.id.btstudentinfo);

            btsprofile.setOnClickListener(this);
            btsebook.setOnClickListener(this);
            btstudentinfo.setOnClickListener(this);
            btslogout.setOnClickListener(this);
        }

        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btsprofile:
                    Intent intent28 = new Intent(this, Main28Activity.class);
                    startActivity(intent28);
                    finish();
                    break;
                case R.id.btsebook:
                    Intent intent08 = new Intent(this, Main8Activity.class);
                    startActivity(intent08);
                    finish();
                    break;

                case R.id.btstudentinfo:
                    Intent intent129 = new Intent(this, Main29Activity.class);
                    startActivity(intent129);
                    finish();
                    break;

                default:
                    Intent intent001 = new Intent(this, MainActivity.class);
                    startActivity(intent001);
                    finish();
                    break;
            }
        }
    }