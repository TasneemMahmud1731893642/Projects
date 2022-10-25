package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class checkout extends AppCompatActivity {
    RecyclerView rcv;
    static  ArrayList<String> data0 = new ArrayList<>(100);
    static ArrayList<String> data1 = new ArrayList<>(100);
    static ArrayList<String> data3 = new ArrayList<>(100);
    String[] datab = {"Chicken Burger", "Beef Burger"};
    public String ja;
    String sta = "Ended";
    int y;
    int h;
    int tah;
    String j;
    public String jb;
    TextView tx;
    TextView tx1;
    TextView tx2;

    Button bo;
    Button bo1;
    DatabaseReference rootref = FirebaseDatabase.getInstance().getReference();
    DatabaseReference rootref1 = rootref.child("Status");
    DatabaseReference conref1 = rootref1.child("stat");

    DatabaseReference rootref2 = rootref.child("Total");
    DatabaseReference conref2 = rootref2.child("tot");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.colorPrimary));
        rcv = findViewById(R.id.cartv2);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcv.setAdapter(new MyAdapter());
        tx = findViewById(R.id.tots);
        tx1 = findViewById(R.id.takis);
        tx2 = findViewById(R.id.delis);
        bo = findViewById(R.id.buttonq);


        Intent iin = getIntent();
        Bundle b = iin.getExtras();
        if (b != null) {



            h = (int) b.get("itotal");
            tah = (int) b.get("tax");
            j = (String) b.get("mat");
            data0 = (ArrayList<String>) b.get("data");
            data3 = (ArrayList<String>) b.get("data2");
            data1 = (ArrayList<String>) b.get("data5");

            //t.setText(j);
            //data = Arrays.copyOf(data, data.length+1);
            //data[data.length-1]=j;

            //data[n]=j;
            //data= addElement(data,j);

            //data.add(j);


        }
        jb = String.valueOf(h);
        SharedPreferences preference3 = getSharedPreferences("ides3", MODE_PRIVATE);
        SharedPreferences.Editor editor = preference3.edit();
        editor.putString("vall3", jb );
        editor.apply();
        tx.setText(String.valueOf(h));
        tx1.setText(String.valueOf(tah));
        tx2.setText("60");
        //Toast.makeText(checkout.this,"Welcome " + String.valueOf(tah) , Toast.LENGTH_LONG).show();
        bo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(checkout.this, deliveryinfo.class);
                startActivity(i);
            }
        });


    }
    public class MyAdapter extends RecyclerView.Adapter {

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
        {
            LayoutInflater li = LayoutInflater.from(checkout.this);
            View v = li.inflate(R.layout.listforcheck, viewGroup, false);
            MyHolder mh = new MyHolder(v);

            return mh;
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
            MyHolder myHolder = (MyHolder) viewHolder;
            myHolder.bindView(i);



        }

        @Override
        public int getItemCount() {
            return data0.size();
        }



        public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


            TextView tx1;
            TextView tx2;
            TextView tx3;

            public MyHolder(@NonNull View itemView) {
                super(itemView);

                tx1 = itemView.findViewById(R.id.foo);
                tx2 = itemView.findViewById(R.id.quan);

                tx3 = itemView.findViewById(R.id.pri);




            }
            public void bindView(int pos){
                tx1.setText(data0.get(pos));
                tx2.setText(data1.get(pos));


                tx3.setText(data3.get(pos));



            }

            @Override
            public void onClick(View v) {



            }
        }





    }
}