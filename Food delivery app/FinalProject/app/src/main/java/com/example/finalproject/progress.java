package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class progress extends AppCompatActivity {
    public String dk;
    public String dk1;
    TextView tyu;
    TextView tyu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        SharedPreferences preference4 = getSharedPreferences("ides3", MODE_PRIVATE);
        dk1 = preference4.getString("vall3"," ");
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        tyu = findViewById(R.id.adfie);
        tyu1 = findViewById(R.id.texttot);
        if(b!=null)
        {
            dk =(String) b.get("Addie");

        }
        tyu1.setText(dk1);
        tyu.setText(dk);
    }
}