package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import android.util.Log;
import android.widget.Toast;

public class cart extends AppCompatActivity {
    int n;
    int nj;
    int njp;
    public  String num;
    public  String numor;
    public  String text;
    public  int j;
    public String g;
    public String g1;
    public String g2;
    public String g3;
    int p;
    String sta="notEnded";
    String [] datab = {"Chicken Burger", "Beef Burger"};
    static  ArrayList<String> data = new ArrayList<>(100);
    static ArrayList<String> data2 = new ArrayList<>(100);
    static ArrayList<String> data5 = new ArrayList<>(100);
    static ArrayList<String> data6 = new ArrayList<>(100);
    ArrayList<String> data4 = new ArrayList<>(100);
    ArrayList<Integer> data3 = new ArrayList<>(100);
    DatabaseReference rootref = FirebaseDatabase.getInstance().getReference();
    DatabaseReference rootref1= rootref.child("Status");
    DatabaseReference rootref2;
    DatabaseReference rootref3= rootref.child("Orders");
    DatabaseReference conref1 ;
    DatabaseReference conref2 ;
    DatabaseReference conref3 ;
    DatabaseReference conref4 ;
    DatabaseReference conref5 ;
    DatabaseReference conref6 ;
    DatabaseReference myref = FirebaseDatabase.getInstance().getReference();
    DatabaseReference rootref4= myref.child("CountOr");


    RecyclerView rcv;
    String bi=null;
    String bip=null;
    String bipod=null;
    String bin= null ;
    int ian;
    int yo;
    int delfee = 60;
    int yo1;
    float tax;
    float per = 0.15f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.colorPrimary));

        rcv = findViewById(R.id.cartv);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcv.setAdapter(new MyAdapter());
        new ItemTouchHelper(itc).attachToRecyclerView(rcv);
        rootref4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                text = dataSnapshot.getValue(String.class);

                j=Integer.parseInt(text);
                j=j+1;
                text=Integer.toString(j);
                numor=text;



            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        if(b!=null)
        {

            int h;
            int ui;
            int ui2;


            g =(String) b.get("named");
            g1 =(String) b.get("quant");
            ui = Integer.parseInt(g1);
            int hi = (Integer) b.get("price");
          //  g2 =(String) b.get("price");
            g2 = (String) b.get("note");

            ui2 = ui *  hi;


            bi=g;
            bip = g1;
            bipod = String.valueOf(ui2);
            bin = g2;


            //t.setText(j);
            //data = Arrays.copyOf(data, data.length+1);
            //data[data.length-1]=j;

            //data[n]=j;
            //data= addElement(data,j);

            //data.add(j);




        }

       // Toast.makeText(cart.this,"Welcome " + g2 , Toast.LENGTH_LONG).show();

        data = Loaddata(data,"dat");
        data.add(bi);
         data2 = Loaddata(data2,"dat2");

        data2.add(bipod);
        data5 = Loaddata(data5,"dat5");
        data5.add(bip);
        data6 = Loaddata(data6 , "dat6");
        data6.add(bin);

        data3 =new ArrayList<>(100);
        data3=getIntegerArray(data2);
        yo= Sumat(data3);

        tax = (per *yo);
        yo1 = (int) tax;
        yo = yo + yo1 + delfee;





       // nj=data.size()-1;
       // num = Integer.toString(nj);
        Button button = findViewById(R.id.but);
        Button button1 = findViewById(R.id.but1);
        Button button2 = findViewById(R.id.but2);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          //++n;

                                          Savedata(data,"dat");
                                          Savedata(data2,"dat2");
                                          Savedata(data5,"dat5");
                                          Savedata(data6,"dat6");




                                          Intent i=new Intent(cart.this, foodcat.class);

                                          startActivity(i);


                                      }
                                  }
        );
        button1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           data =new ArrayList<>(100);
                                           Savedata(data,"dat");
                                           data2 =new ArrayList<>(100);

                                           Savedata(data2,"dat2");
                                           data5 =new ArrayList<>(100);

                                           Savedata(data5,"dat5");
                                           data6 =new ArrayList<>(100);

                                           Savedata(data6,"dat6");
                                           Intent i=new Intent(cart.this, foodcat.class);

                                           startActivity(i);


                                       }
                                   }
        );
        button2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {


                                           Intent i=new Intent(cart.this, checkout.class);
                                           i.putExtra("data",data);
                                           i.putExtra("data2",data2);
                                           i.putExtra("data5",data5);
                                           i.putExtra("total",Integer.toString(yo));
                                           i.putExtra("itotal",yo);
                                           i.putExtra("mat",g);
                                           i.putExtra("tax",yo1);


                                           Savedata(data,"dat");


                                           Savedata(data2,"dat2");
                                           Savedata(data5,"dat5");
                                           Savedata(data5,"dat6");
                                           data = duplicate(data);
                                           rootref2= rootref3.child(numor);
                                           conref1 = rootref2.child("order");
                                           conref2 = rootref2.child("quantity");
                                           conref3 = rootref2.child("price");
                                           conref4 = rootref2.child("note");
                                           conref5 = rootref2.child("Total");
                                           conref6 = rootref2.child("Status");

                                           Gson gson = new Gson();
                                           String json = gson.toJson(data);
                                           String json2 = gson.toJson(data2);
                                           String json3 = gson.toJson(data5);
                                           String json4 = gson.toJson(data6);
                                           conref1.setValue(json);
                                           conref2.setValue(json2);
                                           conref3.setValue(json3);
                                           conref4.setValue(json4);
                                           conref5.setValue(yo);
                                           conref6.setValue("running");
                                           rootref4.setValue(numor);
                                           //data3 =new ArrayList<>(100);
                                           SharedPreferences preference = getSharedPreferences("ides2", MODE_PRIVATE);
                                           SharedPreferences.Editor editor = preference.edit();
                                           editor.putString("vall2", numor);
                                           editor.apply();




                                           data =new ArrayList<>(100);
                                           Savedata(data,"dat");
                                           data2 =new ArrayList<>(100);

                                           Savedata(data2,"dat2");
                                           data5 =new ArrayList<>(100);
                                           Savedata(data5,"dat5");
                                           data6 =new ArrayList<>(100);
                                           Savedata(data6,"dat6");




                                           startActivity(i);


                                       }
                                   }
        );



    }
    public int Sumat(ArrayList<Integer> m)
    {
        int sum = 0;
        for(int i = 0; i < m.size(); i++)
        {
            sum += m.get(i);
        }
        return sum;
    }
    private ArrayList<Integer> getIntegerArray(ArrayList<String> stringArray) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(String stringValue : stringArray) {
            try {
                //Convert String to Integer, and store it into integer array list.
                result.add(Integer.parseInt(stringValue));
            } catch(NumberFormatException nfe) {
                //System.out.println("Could not parse " + nfe);
                Log.w("NumberFormat", "Parsing failed! " + stringValue + " can not be an integer");
            }
        }
        return result;
    }
    public ArrayList<String> duplicate( ArrayList<String> inputList) {

         ArrayList<String> temp = new ArrayList<>();
        for(int u=0;u<inputList.size();u++){
            if(!inputList.isEmpty()){
                temp.add(inputList.get(u));
            }

        }


        inputList.clear();
        inputList.addAll(temp);
        return inputList;

    }
    ItemTouchHelper.SimpleCallback itc = new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.RIGHT) {
        @Override
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder1) {
            return false;
        }

        @Override
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
            data.remove(viewHolder.getAdapterPosition());

            data2.remove(viewHolder.getAdapterPosition());
            data5.remove(viewHolder.getAdapterPosition());

            Savedata(data,"dat");
            Savedata(data2,"dat2");
            Savedata(data5,"dat5");
            Intent im = new Intent(cart.this,cart.class);
            startActivity(im);

            //MyAdapter.notifyItemremover(viewHolder.getAdapterPosition());

        }
    };


    public class MyAdapter extends RecyclerView.Adapter {

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
        {
            LayoutInflater li = LayoutInflater.from(cart.this);
            View v = li.inflate(R.layout.listforcart, viewGroup, false);
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
            return data.size();
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

                tx1.setText(data.get(pos));
                tx2.setText(data5.get(pos));



                tx3.setText(data2.get(pos));


            }

            @Override
            public void onClick(View v) {

            }
        }





    }
    public void Savedata(ArrayList<String> list, String key){
        SharedPreferences prefs = getSharedPreferences("shared",MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(key, json);
        editor.apply();     // This line is IMPORTANT !!!
    }
    public ArrayList<String> Loaddata(ArrayList<String> list,String key){
        SharedPreferences prefs = getSharedPreferences("shared",MODE_PRIVATE);
        Gson gson = new Gson();
        String json = prefs.getString(key, null);
        Type type = new TypeToken<ArrayList<String>>() {}.getType();
        list = gson.fromJson(json, type);
        return list;
    }




}
