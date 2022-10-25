package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class quantity extends AppCompatActivity {

    Button bx;
    int j = 1;
    int ji ;
    public int imge;
    public String naame;
    public String quantity;
    public String noted;
    public int price ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quantity);


        Intent iin = getIntent();
        Bundle b = iin.getExtras();
        if (b != null) {
            naame = (String) b.get("name");
            imge = (int) b.get("img");
            price = (int) b.get("pri");










        }




        //tox.setText(String.valueOf(price));





    }
}