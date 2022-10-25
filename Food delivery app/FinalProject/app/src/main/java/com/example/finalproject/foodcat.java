package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import static com.example.finalproject.R.id.fab;

public class foodcat extends AppCompatActivity {

    String[] data2 = {"Kabab", "Rice", "Bangla Item", "Mezban","Naan/Parata", "Roll", "Mughlai", "Dessert"};
    int[] img = {R.drawable.kababcat, R.drawable.ricecat, R.drawable.banglait, R.drawable.mezban, R.drawable.parata, R.drawable.roll,R.drawable.nehari, R.drawable.dessert};
    private int[] hImages = new int[]{

            R.drawable.starcomsoon, R.drawable.domcomsoon
    };
    public int g;
    public  String lk;
    private  boolean clicked = false;
    FloatingActionButton b1;
    FloatingActionButton b2;
    FloatingActionButton b3;
    //private  val rotateOpen: Animation by lazy{ AnimationUtils.loadAnimation(this, R.anim.rotate_open_anim)};
    //private  val rotateOpen: Animation by lazy{ AnimationUtils.loadAnimation(this, R.anim.rotate_open_anim)};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodcat);
        b1 = findViewById(R.id.fab);
        b2 = findViewById(R.id.fab2);
        b3 = findViewById(R.id.fab3);

        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        if(b!=null)
        {

            int h;

            lk =(String) b.get("Mail");
            Toast.makeText(foodcat.this,"Welcome " + lk, Toast.LENGTH_LONG).show();



        }
        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.colorPrimary));
        CarouselView carouselView = findViewById(R.id.carousel);
        carouselView.setPageCount(hImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(hImages[position]);

            }
        });


        RecyclerView rcv = findViewById(R.id.myList);
        int numberOfColumns=2;
        rcv.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        int spanCount = 2; // 3 columns
        int spacing = 5; // 50px
        boolean includeEdge = false;
        rcv.addItemDecoration(new GridSpacingItemDecoration(spanCount, spacing, includeEdge));

        rcv.setAdapter(new MyAdapter());

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked== false)
                {
                    b2.setVisibility(v.VISIBLE);
                    b3.setVisibility(v.VISIBLE);
                    clicked= true;

                }
                else
                {
                    b2.setVisibility(v.INVISIBLE);
                    b3.setVisibility(v.INVISIBLE);
                    clicked = false;
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(foodcat.this,cart.class);
                startActivity(i);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(foodcat.this,profile.class);
                startActivity(i);

            }
        });

    }



    public class MyAdapter extends RecyclerView.Adapter {

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
        {
            LayoutInflater li = LayoutInflater.from(foodcat.this);
            View v = li.inflate(R.layout.listviewcat, viewGroup, false);
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
            return data2.length;
        }

        public class MyHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

            TextView tx2;
            ImageView im;

            public MyHolder(@NonNull View itemView) {
                super(itemView);

                tx2 = itemView.findViewById(R.id.text2);
                im = itemView.findViewById(R.id.img2);
                itemView.setOnClickListener(this);

            }
            public void bindView(int pos){

                tx2.setText(data2[pos]);
                im.setImageResource(img[pos]);
                g=pos;

            }

            @Override
            public void onClick(View v) {
                if(getAdapterPosition()==0)
                {
                    Intent i = new Intent(foodcat.this,burgerres.class);
                    startActivity(i);

                }
                if(getAdapterPosition()==1)
                {
                    Intent i = new Intent(foodcat.this,friedchic.class);
                    startActivity(i);
                }
                if(getAdapterPosition()==2)
                {
                    Intent i = new Intent(foodcat.this,pizzares.class);
                    startActivity(i);

                }
                if(getAdapterPosition()==3)
                {
                    Intent i = new Intent(foodcat.this,pasta.class);
                    startActivity(i);
                }
                if(getAdapterPosition()==4)
                {
                    Intent i = new Intent(foodcat.this,mexican.class);
                    startActivity(i);

                }
                if(getAdapterPosition()==5)
                {
                    Intent i = new Intent(foodcat.this,biriyani.class);
                    startActivity(i);
                }
                if(getAdapterPosition()==6)
                {
                    Intent i = new Intent(foodcat.this,mughres.class);
                    startActivity(i);
                }
                if(getAdapterPosition()==7)
                {
                    Intent i = new Intent(foodcat.this,desres.class);
                    startActivity(i);
                }

            }
        }





    }

}
