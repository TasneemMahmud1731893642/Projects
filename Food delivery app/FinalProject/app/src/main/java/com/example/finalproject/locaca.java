package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class locaca extends AppCompatActivity  {


    EditText et;
    TextView tx;
    Button bt;
    String j;
    String j1;
    String j2;
    double g;
    double k;
    double g1;
    double k1;
    double g2;
    double k2;
    DatabaseReference rootref = FirebaseDatabase.getInstance().getReference();
    DatabaseReference rootref1= rootref.child("Location");
    DatabaseReference rootref2= rootref.child("Location2");
    DatabaseReference rootref3= rootref.child("Location3");
    DatabaseReference conref1 = rootref1.child("loc");
    DatabaseReference conref2 = rootref2.child("loc2");
    DatabaseReference conref3 = rootref3.child("loc3");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locaca);
        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.colorPrimary));
        et=findViewById(R.id.namt);
        bt=findViewById(R.id.bun);
        bt=findViewById(R.id.bun);
        tx=findViewById(R.id.nitro);
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        if(b!=null)
        {

            int h;

            j =(String) b.get("check");

            //t.setText(j);
            //data = Arrays.copyOf(data, data.length+1);
            //data[data.length-1]=j;

            //data[n]=j;
            //data= addElement(data,j);

            //data.add(j);




        }
        conref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                j=text;
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        conref2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                j1=text;
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        conref3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                j2=text;
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if(j.equals("Takeout")){

                        g=23.794119;
                        k=90.405516;
                        if(j1.equals("pizza hut")){

                            g1=23.812185;
                            k1=90.424329;
                            if(j2.equals("kfc")){

                                g2=23.812175;
                                k2=90.424130;
                                Intent i = new Intent(locaca.this,map.class);
                                i.putExtra("lat",g);
                                i.putExtra("long",k);
                                i.putExtra("lat1",g1);
                                i.putExtra("long1",k1);
                                i.putExtra("lat2",g2);
                                i.putExtra("long2",k2);
                                startActivity(i);
                            }
                            if(j2.equals("bfc")){

                                g2=23.813430;
                                k2=90.425160;
                                Intent i = new Intent(locaca.this,map.class);
                                i.putExtra("lat",g);
                                i.putExtra("long",k);
                                i.putExtra("lat1",g1);
                                i.putExtra("long1",k1);
                                startActivity(i);
                            }
                            if(j2.equals("shawarma house")){

                                g2=23.812016;
                                k2=90.423100;
                                Intent i = new Intent(locaca.this,map.class);
                                i.putExtra("lat",g);
                                i.putExtra("long",k);
                                i.putExtra("lat1",g1);
                                i.putExtra("long1",k1);
                                i.putExtra("lat2",g2);
                                i.putExtra("long2",k2);
                                startActivity(i);
                            }
                            if(j2.equals("pastamania")){

                                g2=23.795608;
                                k2=90.414701;
                                Intent i = new Intent(locaca.this,map.class);
                                i.putExtra("lat",g);
                                i.putExtra("long",k);
                                i.putExtra("lat1",g1);
                                i.putExtra("long1",k1);
                                startActivity(i);
                            }
                            if(j2.equals("sultans dine")){

                                g2=23.811856;
                                k2=90.422641;
                                Intent i = new Intent(locaca.this,map.class);
                                i.putExtra("lat",g);
                                i.putExtra("long",k);
                                i.putExtra("lat1",g1);
                                i.putExtra("long1",k1);
                                i.putExtra("lat2",g2);
                                i.putExtra("long2",k2);
                                startActivity(i);
                            }
                            if(j2.equals("kacchi bhai")){

                                g2=23.811965;
                                k2=90.422923;
                                Intent i = new Intent(locaca.this,map.class);
                                i.putExtra("lat",g);
                                i.putExtra("long",k);
                                i.putExtra("lat1",g1);
                                i.putExtra("long1",k1);
                                startActivity(i);
                            }

                        }
                        if(j1.equals("pizzaroma")){

                            g1=23.785539;
                            k1=90.418646;
                            if(j2.equals("kfc")){

                                g2=23.812175;
                                k2=90.424130;
                                Intent i = new Intent(locaca.this,map.class);
                                i.putExtra("lat",g);
                                i.putExtra("long",k);
                                i.putExtra("lat1",g1);
                                i.putExtra("long1",k1);
                                i.putExtra("lat2",g2);
                                i.putExtra("long2",k2);
                                startActivity(i);
                            }
                            if(j2.equals("bfc")){

                                g2=23.813430;
                                k2=90.425160;
                                Intent i = new Intent(locaca.this,map.class);
                                i.putExtra("lat",g);
                                i.putExtra("long",k);
                                i.putExtra("lat1",g1);
                                i.putExtra("long1",k1);
                                startActivity(i);
                            }
                            if(j2.equals("shawarma house")){

                                g2=23.812016;
                                k2=90.423100;
                                Intent i = new Intent(locaca.this,map.class);
                                i.putExtra("lat",g);
                                i.putExtra("long",k);
                                i.putExtra("lat1",g1);
                                i.putExtra("long1",k1);
                                i.putExtra("lat2",g2);
                                i.putExtra("long2",k2);
                                startActivity(i);
                            }
                            if(j2.equals("pastamania")){

                                g2=23.795608;
                                k2=90.414701;
                                Intent i = new Intent(locaca.this,map.class);
                                i.putExtra("lat",g);
                                i.putExtra("long",k);
                                i.putExtra("lat1",g1);
                                i.putExtra("long1",k1);
                                startActivity(i);
                            }
                            if(j2.equals("sultans dine")){

                                g2=23.811856;
                                k2=90.422641;
                                Intent i = new Intent(locaca.this,map.class);
                                i.putExtra("lat",g);
                                i.putExtra("long",k);
                                i.putExtra("lat1",g1);
                                i.putExtra("long1",k1);
                                i.putExtra("lat2",g2);
                                i.putExtra("long2",k2);
                                startActivity(i);
                            }
                            if(j2.equals("kacchi bhai")){

                                g2=23.811965;
                                k2=90.422923;
                                Intent i = new Intent(locaca.this,map.class);
                                i.putExtra("lat",g);
                                i.putExtra("long",k);
                                i.putExtra("lat1",g1);
                                i.putExtra("long1",k1);
                                startActivity(i);
                            }
                        }
                    }
                if(j.equals("Chillox")){

                    g=23.793838;
                    k=90.404595;
                    if(j1.equals("daily treats")){

                        g1=23.793276;
                        k1=90.414669;
                        Intent i = new Intent(locaca.this,map.class);
                        i.putExtra("lat",g);
                        i.putExtra("long",k);
                        i.putExtra("lat1",g1);
                        i.putExtra("long1",k1);
                        startActivity(i);
                    }
                    if(j1.equals("des locos")){

                        g1=23.795917;
                        k1=90.414993;
                        Intent i = new Intent(locaca.this,map.class);
                        i.putExtra("lat",g);
                        i.putExtra("long",k);
                        i.putExtra("lat1",g1);
                        i.putExtra("long1",k1);
                        startActivity(i);
                    }
                }



            }
        });
    }


}
