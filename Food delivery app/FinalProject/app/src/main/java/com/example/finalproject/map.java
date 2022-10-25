package com.example.finalproject;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
     double lata;
    double longa;
    double lata1;
    double longa1;
    double lata2;
    double longa2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.colorPrimary));
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        if(b!=null)
        {

            int h;

            lata =(Double) b.get("lat");
            longa =(Double) b.get("long");
            lata1 =(Double) b.get("lat1");
            longa1 =(Double) b.get("long1");
            lata2 =(Double) b.get("lat2");
            longa2 =(Double) b.get("long2");





        }

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng res = new LatLng(lata, longa);
        LatLng res1 = new LatLng(lata1, longa1);
        LatLng res2 = new LatLng(lata2, longa2);

        LatLng nsu = new LatLng(23.815486, 90.425484);
        mMap.addMarker(new MarkerOptions().position(res));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(res));
        mMap.addMarker(new MarkerOptions().position(res1));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(res1));
       mMap.addMarker(new MarkerOptions().position(res2));
       mMap.moveCamera(CameraUpdateFactory.newLatLng(res2));
        mMap.addMarker(new MarkerOptions().position(nsu).title("Marker in nsu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nsu));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(new LatLng( 23.815486,
                        90.425484));


        CameraUpdate zoom=CameraUpdateFactory.zoomTo(15);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);
        mMap.addPolyline(
                new PolylineOptions()
                        .add(res)
                        .add(res1)
                        .add(res2)
                        .add(nsu)
                        .width(8f)
                        .color(Color.RED)

        );
    }
}
