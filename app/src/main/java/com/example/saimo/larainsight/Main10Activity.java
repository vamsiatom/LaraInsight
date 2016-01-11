package com.example.saimo.larainsight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main10Activity extends AppCompatActivity implements View.OnClickListener{


        public Button button;
        private EditText editText,editText2,editText3,editText4,editText5,editText6,editText7,editText8,editText9;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main10);
            init();
        }
    public void onBackPressed() {

        Intent intent = new Intent(this, Main2Activity.class);
        // intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

        private void init() {
            button = (Button)findViewById(R.id.button);
            editText =  (EditText) findViewById(R.id.editText);
            editText2 = (EditText) findViewById(R.id.editText2);
            editText3 = (EditText) findViewById(R.id.editText3);
            editText4 = (EditText) findViewById(R.id.editText4);
            editText5 = (EditText) findViewById(R.id.editText5);
            editText6 = (EditText) findViewById(R.id.editText6);
            editText7 = (EditText) findViewById(R.id.editText7);
            editText8 = (EditText) findViewById(R.id.editText8);
            editText9 = (EditText) findViewById(R.id.editText9);

            button.setOnClickListener(this);


        }

        public void onClick(View view){
            String num1 = editText.getText().toString();
            String num2 = editText2.getText().toString();
            String num3 = editText3.getText().toString();
            String num4 = editText4.getText().toString();
            String num5 = editText5.getText().toString();
            String num6 = editText6.getText().toString();
            String num7 = editText7.getText().toString();
            String num8 = editText8.getText().toString();

            int res = Integer.parseInt(num1) + Integer.parseInt(num2) + Integer.parseInt(num3) +Integer.parseInt(num4) + Integer.parseInt(num5) + Integer.parseInt(num6) + Integer.parseInt(num7) + Integer.parseInt(num8);
            float agg = res / 50;
            editText9.setText(String.valueOf(agg));

        }
    }
