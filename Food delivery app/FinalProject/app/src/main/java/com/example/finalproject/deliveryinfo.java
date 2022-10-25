package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
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

public class deliveryinfo extends AppCompatActivity {
    TextView ty;
    Button bh;
    Button bh1;
    EditText er;
    EditText er1;
    EditText er2;

    public String giovani;
    public String giovani1;
    public String giovani2;
    public String giovani3;
    public String giovani4;
    DatabaseReference myref = FirebaseDatabase.getInstance().getReference();
    DatabaseReference rootref4= myref.child("Users");
    DatabaseReference rootref = FirebaseDatabase.getInstance().getReference();
    DatabaseReference rootref3= rootref.child("Orders");
    DatabaseReference rootref6;


    DatabaseReference rootref5;

    DatabaseReference conref1 ;
    DatabaseReference conref2 ;
    DatabaseReference conref3 ;
    DatabaseReference conref4 ;
    DatabaseReference conref5 ;
    DatabaseReference conref6 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deliveryinfo);
        bh = findViewById(R.id.bottol3);
        bh1 = findViewById(R.id.but2);
        er =findViewById(R.id.naming);
        er1 =findViewById(R.id.Phoning);
        er2 =findViewById(R.id.adie);
        SharedPreferences preference = getSharedPreferences("ides", MODE_PRIVATE);
        giovani = preference.getString("vall"," ");
        SharedPreferences preference2 = getSharedPreferences("ides2", MODE_PRIVATE);
        giovani4 = preference2.getString("vall2"," ");
        rootref5 = rootref4.child(giovani);
        conref1 = rootref5.child("Name");
        conref2 = rootref5.child("Phone");
        conref3 = rootref5.child("Address");


        //Toast.makeText(deliveryinfo.this,"Welcome " + giovani4 , Toast.LENGTH_LONG).show();



        bh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conref1.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        giovani1 = dataSnapshot.getValue(String.class);




                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                conref2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        giovani2 = dataSnapshot.getValue(String.class);




                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                conref3.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        giovani3 = dataSnapshot.getValue(String.class);




                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                er.setText(giovani1);
                er1.setText(giovani2);
                er2.setText(giovani3);

            }
        });
        bh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               rootref6 = rootref3.child(giovani4);
               conref4 = rootref6.child("Name");
               conref5 = rootref6.child("Phone");
               conref6 = rootref6.child("Address");

               conref4.setValue(er.getText().toString());
               conref5.setValue(er1.getText().toString());
               conref6.setValue(er2.getText().toString());

                if(TextUtils.isEmpty(er.getText().toString()) || TextUtils.isEmpty(er1.getText().toString()) || TextUtils.isEmpty(er2.getText().toString()))
                {
                    Toast.makeText(deliveryinfo.this,"Please enter all information",Toast.LENGTH_LONG).show();

                }
                else
                {
                    Intent i = new Intent(deliveryinfo.this,progress.class);
                    i.putExtra("Addie", er2.getText().toString());
                    startActivity(i);

                }


            }
        });




        //Toast.makeText(deliveryinfo.this,"Welcome " + giovani1 , Toast.LENGTH_LONG).show();
    }
}