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

public class mexican extends AppCompatActivity {
    int [] img = {R.drawable.naan,R.drawable.parata };
    int [] img2 = {R.drawable.naansec,R.drawable.paratasec };
    String [] data2 = {"Naan", "Parata"};
    String [] data3 = {"80", "80"};
    DatabaseReference rootref = FirebaseDatabase.getInstance().getReference();
    DatabaseReference rootref1= rootref.child("Location2");
    DatabaseReference conref1 = rootref1.child("loc2");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexican);
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
            LayoutInflater li = LayoutInflater.from(mexican.this);
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
            TextView toc4;
            TextView toc5;

            public MyHolder(@NonNull View itemView) {
                super(itemView);



                toc4 = itemView.findViewById(R.id.textfoo);
                toc5 = itemView.findViewById(R.id.textfoo1);
                im = itemView.findViewById(R.id.iman);
                itemView.setOnClickListener(this);
                //b = findViewById(R.id.button1);

            }
            public void bindView(int pos){


                toc4.setText(data2[pos]);
                toc5.setText(data3[pos]);
                im.setImageResource(img[pos]);









            }

            @Override
            public void onClick(View v) {
                if(getAdapterPosition()==0)
                {

                    Intent i = new Intent(mexican.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);

                }
                if(getAdapterPosition()==1)
                {

                    Intent i = new Intent(mexican.this,quantity2.class);
                    i.putExtra("name", data2[getAdapterPosition()] );
                    i.putExtra("img", img2[getAdapterPosition()] );
                    i.putExtra("pri", Integer.parseInt(data3[getAdapterPosition()]));

                    startActivity(i);
                }




            }
        }





    }
}
