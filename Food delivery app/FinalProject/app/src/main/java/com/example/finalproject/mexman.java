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
import android.widget.TextView;

public class mexman extends AppCompatActivity {
    String [] datab = {"Burrito", "Taco"};

    int [] databpi = {250, 350};
    String [] databp = {"250", "350"};
    String lk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexman);
        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.colorPrimary));
        RecyclerView rcv = findViewById(R.id.mexem);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcv.setAdapter(new MyAdapter());
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        if(b!=null)
        {

            int h;

            lk =(String) b.get("name");

            //t.setText(j);
            //data = Arrays.copyOf(data, data.length+1);
            //data[data.length-1]=j;

            //data[n]=j;
            //data= addElement(data,j);

            //data.add(j);




        }

    }
    public class MyAdapter extends RecyclerView.Adapter {

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
        {
            LayoutInflater li = LayoutInflater.from(mexman.this);
            View v = li.inflate(R.layout.listformen, viewGroup, false);
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
            return datab.length;
        }

        public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            TextView tx1;
            TextView tx2;

            public MyHolder(@NonNull View itemView) {
                super(itemView);

                tx1 = itemView.findViewById(R.id.it1);
                tx2 = itemView.findViewById(R.id.it2);
                itemView.setOnClickListener(this);


            }
            public void bindView(int pos){

                tx1.setText(datab[pos]);
                tx2.setText(databp[pos]);

            }

            @Override
            public void onClick(View v) {
                if(getAdapterPosition()==0)
                {
                    Intent ii=new Intent(mexman.this, cart.class);
                    ii.putExtra("name", datab[getAdapterPosition()]);

                    ii.putExtra("price", databpi[getAdapterPosition()]);
                    ii.putExtra("prices", databp[getAdapterPosition()]);

                    startActivity(ii);

                }
                if(getAdapterPosition()==1)
                {
                    Intent ii=new Intent(mexman.this, cart.class);
                    ii.putExtra("name", datab[getAdapterPosition()]);
                    ii.putExtra("mane2", lk);
                    ii.putExtra("price", databpi[getAdapterPosition()]);
                    ii.putExtra("prices", databp[getAdapterPosition()]);

                    startActivity(ii);
                }
            }
        }





    }
}
