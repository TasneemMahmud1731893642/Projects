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

public class desres extends AppCompatActivity {

    int[] img = {R.drawable.doibora, R.drawable.nolengurerfirni,R.drawable.nolengurerfirni,R.drawable.firni, R.drawable.firni, R.drawable.shahitukra};
    int[] img2 = {R.drawable.doiborasec, R.drawable.nolengurerfirnisec,R.drawable.nolengurerfirnisec,R.drawable.firnisec, R.drawable.firnisec, R.drawable.shahitukrasec};
    String[] data2 = {"Doibara","Nolen Gurer Firni(Small)","Nolen Gurer Firni(Large)", "Firni(Small)","Firni(Large)", "Shahitukra"};
    String[] data3 = {"100", "50","100", "50","100", "120"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desres);
        RecyclerView rcv = findViewById(R.id.Lister);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcv.setAdapter(new MyAdapter());
    }

    public class MyAdapter extends RecyclerView.Adapter {

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater li = LayoutInflater.from(desres.this);
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
            TextView toc7;
            TextView toc8;

            public MyHolder(@NonNull View itemView) {
                super(itemView);


                toc7 = itemView.findViewById(R.id.textfoo);
                toc8 = itemView.findViewById(R.id.textfoo1);
                im = itemView.findViewById(R.id.iman);
                itemView.setOnClickListener(this);
                //b = findViewById(R.id.button1);

            }

            public void bindView(int pos) {


                toc7.setText(data2[pos]);
                toc8.setText(data3[pos]);
                im.setImageResource(img[pos]);


            }

            @Override
            public void onClick(View v) {
                if (getAdapterPosition() == 0) {

                    Intent i = new Intent(desres.this, quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);

                }
                if (getAdapterPosition() == 1) {

                    Intent i = new Intent(desres.this, quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));


                    startActivity(i);
                }
                if (getAdapterPosition() == 2) {

                    Intent i = new Intent(desres.this, quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);

                }
                if (getAdapterPosition() == 3) {

                    Intent i = new Intent(desres.this, quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }
                if (getAdapterPosition() == 4) {

                    Intent i = new Intent(desres.this, quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);

                }
                if (getAdapterPosition() == 5) {

                    Intent i = new Intent(desres.this, quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }


            }
        }


    }
}