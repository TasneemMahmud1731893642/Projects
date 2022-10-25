package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class pizzares extends AppCompatActivity {
    int [] img = {R.drawable.chickenalujhol,R.drawable.chickenjhalfry,R.drawable.chingrimalaikari,R.drawable.chuijhal,R.drawable.khashirkoshamangsho,
            R.drawable.lauchingri,R.drawable.loittashutki,R.drawable.pabdajhol,R.drawable.ruimacherkaliya,R.drawable.sobjivaji,R.drawable.sorsheilish,R.drawable.vetkipaturi};
    int [] img2 = {R.drawable.chickenalujholsec,R.drawable.chickenjhalfrysec,R.drawable.chingrimalaikarisec,R.drawable.chuijhalsec,R.drawable.khashirkoshamangshosec,
            R.drawable.lauchingrisec,R.drawable.loittashutkisec,R.drawable.pabdajholsec,R.drawable.ruimacherkaliyasec,R.drawable.sobjivajisec,R.drawable.sorsheilishsec,R.drawable.vetkipaturisec};
    String [] data2 = {"Chicken Alu Jhol", "Chicken Jhal Fry","Chingri Malai Curry", "Chui Jhal", "Mutton Kosha Mangsho", "Lau Chingri", "Loitta Shutki"
    ,"Pabda Jhol", "Rui Macher Kaliya", "Deshi Mixed Vegetable", "Shorshe Elish", "Vetki Paturi"};
    String [] data3 = {"180", "190","320", "150", "280", "85", "150"
    ,"280", "190", "85", "320", "280"};
    DatabaseReference rootref = FirebaseDatabase.getInstance().getReference();
    DatabaseReference rootref1= rootref.child("Location2");
    DatabaseReference conref1 = rootref1.child("loc2");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizzares);
        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.colorPrimary));
        RecyclerView rcv = findViewById(R.id.Lister);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcv.setAdapter(new MyAdapter());






    }



    public class MyAdapter extends RecyclerView.Adapter {

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
        {
            LayoutInflater li = LayoutInflater.from(pizzares.this);
            View v = li.inflate(R.layout.listview, viewGroup, false);
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
            return img.length;
        }



        public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


            ImageView im;
            Button b;
            TextView toc2;
            TextView toc3;

            public MyHolder(@NonNull View itemView) {
                super(itemView);



                toc2 = itemView.findViewById(R.id.textfoo);
                toc3 = itemView.findViewById(R.id.textfoo1);
                im = itemView.findViewById(R.id.iman);
                itemView.setOnClickListener(this);

            }
            public void bindView(int pos){


                toc2.setText(data2[pos]);
                toc3.setText(data3[pos]);
                im.setImageResource(img[pos]);









            }

            @Override
            public void onClick(View v) {
                if(getAdapterPosition()==0)
                {
                    Intent i = new Intent(pizzares.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);

                }
                if(getAdapterPosition()==1)
                {

                    Intent i = new Intent(pizzares.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }
                if(getAdapterPosition()==2)
                {
                    Intent i = new Intent(pizzares.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);

                }
                if(getAdapterPosition()==3)
                {

                    Intent i = new Intent(pizzares.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }if(getAdapterPosition()==4)
                {
                    Intent i = new Intent(pizzares.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);

                }
                if(getAdapterPosition()==5)
                {

                    Intent i = new Intent(pizzares.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }if(getAdapterPosition()==6)
                {
                    Intent i = new Intent(pizzares.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);

                }
                if(getAdapterPosition()==7)
                {

                    Intent i = new Intent(pizzares.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }if(getAdapterPosition()==8)
                {
                    Intent i = new Intent(pizzares.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);

                }
                if(getAdapterPosition()==9)
                {

                    Intent i = new Intent(pizzares.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }if(getAdapterPosition()==10)
                {
                    Intent i = new Intent(pizzares.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);

                }
                if(getAdapterPosition()==11)
                {

                    Intent i = new Intent(pizzares.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }









            }
        }





    }
}

