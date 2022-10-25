package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class mughres extends AppCompatActivity {
    int [] img = {R.drawable.chickenkorma,R.drawable.chickenroast,R.drawable.fullchickenroast,R.drawable.murgmusallam,R.drawable.muttonglassy,R.drawable.muttonmalairezala,R.drawable.nehari,R.drawable.nehari };
    int [] img2 = {R.drawable.chickenkormasec,R.drawable.chickenroastsec,R.drawable.fullchickenroastsec,R.drawable.murgmusallamsec,R.drawable.muttonglassysec,R.drawable.muttonmalairezalasec,R.drawable.neharisec,R.drawable.neharisec };
    String [] data2 = {"Chicken Korma", "Chicken Roast","Full Chicken Roast", "Murgmusallam", "Mutton Glassy", "Mutton Malai Rezala", "Nehari(Small)","Nehari(Large)"};
    String [] data3 = {"220", "150","580", "499", "190", "290", "200","390"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mughres);
        RecyclerView rcv = findViewById(R.id.Lister);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcv.setAdapter(new MyAdapter());
    }

    public class MyAdapter extends RecyclerView.Adapter {

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater li = LayoutInflater.from(mughres.this);
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
            TextView toc6;
            TextView toc7;

            public MyHolder(@NonNull View itemView) {
                super(itemView);


                toc6 = itemView.findViewById(R.id.textfoo);
                toc7 = itemView.findViewById(R.id.textfoo1);
                im = itemView.findViewById(R.id.iman);
                itemView.setOnClickListener(this);

            }

            public void bindView(int pos) {


                toc6.setText(data2[pos]);
                toc7.setText(data3[pos]);
                im.setImageResource(img[pos]);


            }

            @Override
            public void onClick(View v) {
                if (getAdapterPosition() == 0) {

                    Intent i = new Intent(mughres.this, quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));


                    startActivity(i);

                }
                if (getAdapterPosition() == 1) {

                    Intent i = new Intent(mughres.this, quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }
                if (getAdapterPosition() == 2) {

                    Intent i = new Intent(mughres.this, quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);

                }
                if (getAdapterPosition() == 3) {

                    Intent i = new Intent(mughres.this, quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }if (getAdapterPosition() == 4) {

                    Intent i = new Intent(mughres.this, quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);

                }
                if (getAdapterPosition() == 5) {

                    Intent i = new Intent(mughres.this, quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }
                if (getAdapterPosition() == 6) {

                    Intent i = new Intent(mughres.this, quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }
                if (getAdapterPosition() == 7) {

                    Intent i = new Intent(mughres.this, quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }



            }
        }


    }
}