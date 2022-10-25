package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class quantity2 extends AppCompatActivity {
    ImageView imh;
    ImageView imh1;
    ImageView imh2;
    TextView tox;
    TextView tox1;
    EditText et;
    EditText et1;
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
        setContentView(R.layout.activity_quantity2);


        Intent iin = getIntent();
        Bundle b = iin.getExtras();
        if (b != null) {
            naame = (String) b.get("name");
            imge = (int) b.get("img");
            price = (int) b.get("pri");










        }
        imh = findViewById(R.id.imageView2);
        imh.setImageResource(imge);
        et =findViewById(R.id.quanti);
        et1 =findViewById(R.id.noter);
        bx = findViewById(R.id.buttonq);
        //tox.setText(String.valueOf(price));




        bx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(quantity2.this,cart.class);
                i.putExtra("named", naame);
                i.putExtra("quant", et.getText().toString());
                i.putExtra("price",price);
                i.putExtra("note", et1.getText().toString());

                //ii.putExtra("price", databpi[getAdapterPosition()]);
                //ii.putExtra("prices", databp[getAdapterPosition()]);
                startActivity(i);
            }
        });

    }
}