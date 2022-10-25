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

public class friedchic extends AppCompatActivity {
    int [] img = {R.drawable.beefkhichuri,R.drawable.beefpakki,R.drawable.chickenkhichur,R.drawable.ilishpolau,R.drawable.jafranipolau,R.drawable.kachchi,R.drawable.morogpolau,R.drawable.tehari,R.drawable.tehari};
    int [] img2 = {R.drawable.beefkhichurisec,R.drawable.beefpakkisec,R.drawable.chickenkhichursec,R.drawable.ilishpolausec,R.drawable.jafranipolausec,R.drawable.kachchisec,R.drawable.morogpolausec,R.drawable.teharisec,R.drawable.teharisec};
    String [] data2 = {"Beef Khichuri", "Beef Pakki","Chicken Khichuri", "Ilish Polau", "Jafrani Polau", "Kachchi", "Morog Polau","Tehari(half)","Tehaari(Full)"};
    String [] data3 = {"180", "320","170", "320", "120", "380", "240","170","270"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friedchic);
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
            LayoutInflater li = LayoutInflater.from(friedchic.this);
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
            TextView toc1;
            TextView toc2;

            public MyHolder(@NonNull View itemView) {
                super(itemView);



                toc1 = itemView.findViewById(R.id.textfoo);
                toc2 = itemView.findViewById(R.id.textfoo1);
                im = itemView.findViewById(R.id.iman);
                itemView.setOnClickListener(this);

            }
            public void bindView(int pos){


                toc1.setText(data2[pos]);
                toc2.setText(data3[pos]);
                im.setImageResource(img[pos]);









            }

            @Override
            public void onClick(View v) {
                if(getAdapterPosition()==0)
                {

                    Intent i = new Intent(friedchic.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);

                }
                if(getAdapterPosition()==1)
                {

                    Intent i = new Intent(friedchic.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }
                if(getAdapterPosition()==2)
                {

                    Intent i = new Intent(friedchic.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);

                }
                if(getAdapterPosition()==3)
                {

                    Intent i = new Intent(friedchic.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }
                if(getAdapterPosition()==4)
                {

                    Intent i = new Intent(friedchic.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);

                }
                if(getAdapterPosition()==5)
                {

                    Intent i = new Intent(friedchic.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }
                if(getAdapterPosition()==6)
                {

                    Intent i = new Intent(friedchic.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);

                }
                if(getAdapterPosition()==7)
                {

                    Intent i = new Intent(friedchic.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }
                if(getAdapterPosition()==8)
                {

                    Intent i = new Intent(friedchic.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }



            }
        }





    }
}
