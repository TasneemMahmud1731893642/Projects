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

public class burgerres extends AppCompatActivity {
    public int [] img = {R.drawable.tengri,R.drawable.sheekkabab,R.drawable.jalikabab,R.drawable.hariyali,R.drawable.chickenchaap,R.drawable.boti,R.drawable.beefchaap};
    public int [] img2 = {R.drawable.tengrisec,R.drawable.sheekkababsec,R.drawable.jalikababsec,R.drawable.hariyalisec,R.drawable.chickenchaapsec,R.drawable.botisec,R.drawable.beefchaapsec};
    public String [] data2 = {"Tengri", "Sheek Kabab","Jali Kabab", "Hariyali Kabab", "Chicken Chaap", "Boti Kabab", "Beef Chaap"};
    public String [] data3 = {"180", "190","50", "230", "190", "220", "210"};

    public  String j ="gg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burgerres);
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
            LayoutInflater li = LayoutInflater.from(burgerres.this);
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
            TextView toc;
            TextView toc1;

            public MyHolder(@NonNull View itemView) {
                super(itemView);





                toc = itemView.findViewById(R.id.textfoo);
                toc1 = itemView.findViewById(R.id.textfoo1);
                im = itemView.findViewById(R.id.iman);
                itemView.setOnClickListener(this);
                //b = findViewById(R.id.button1);

            }
            public void bindView(int pos){


                toc.setText(data2[pos]);
                toc1.setText(data3[pos]);
                im.setImageResource(img[pos]);










            }

            @Override
            public void onClick(View v) {
                if(getAdapterPosition()==0)
                {

                    Intent i = new Intent(burgerres.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);

                }
                if(getAdapterPosition()==1)
                {

                    Intent i = new Intent(burgerres.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]) );


                    startActivity(i);
                }
                if(getAdapterPosition()==2)
                {

                    Intent i = new Intent(burgerres.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]) );

                    startActivity(i);

                }
                if(getAdapterPosition()==3)
                {

                    Intent i = new Intent(burgerres.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]) );

                    startActivity(i);
                }
                if(getAdapterPosition()==4)
                {

                    Intent i = new Intent(burgerres.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]) );

                    startActivity(i);

                }
                if(getAdapterPosition()==5)
                {

                    Intent i = new Intent(burgerres.this,quantity2.class);

                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]) );
                    startActivity(i);
                }
                if(getAdapterPosition()==6)
                {

                    Intent i = new Intent(burgerres.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]) );
                    startActivity(i);
                }


            }
        }





    }
}
