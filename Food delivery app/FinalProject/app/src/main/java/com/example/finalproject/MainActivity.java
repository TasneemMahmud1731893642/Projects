package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    public  String dk2;
    public  String dk3;

    DatabaseReference rootref = FirebaseDatabase.getInstance().getReference();
    DatabaseReference rootref3= rootref.child("Orders");
    DatabaseReference rootref6;
    DatabaseReference conref1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        SharedPreferences preference4 = getSharedPreferences("ides2", MODE_PRIVATE);
        dk2 = preference4.getString("vall2"," ");
        rootref6 = rootref3.child(dk2);
        conref1 = rootref6.child("Status");



        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {

                conref1.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        dk3 = dataSnapshot.getValue(String.class);
                        //Toast.makeText(MainActivity.this,"Welcome " + dk3 , Toast.LENGTH_LONG).show();

                        if(dk3.equals("running"))
                        {
                            Intent i = new Intent(MainActivity.this, progress.class);

                            startActivity(i);
                            finish();

                        }
                        else
                        {
                            Intent i = new Intent(MainActivity.this, logtype.class);

                            startActivity(i);
                            finish();

                        }




                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });







            }
        },5000);
    }
}
