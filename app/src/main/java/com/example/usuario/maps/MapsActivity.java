package com.example.usuario.maps;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
        LatLng Autonoma = new LatLng(-12.195483, -76.9719602);
        LatLng Libreria = new LatLng(-12.1950265, -76.9716449);
        LatLng jugos = new LatLng(-12.1963635, -76.9721322);
        LatLng kenedy = new LatLng(-12.1963635, -77.0053457);
        LatLng upc = new LatLng(-12.1040615, -76.9629031);
        LatLng richi = new LatLng(-12.1318463, -76.9796455);
        LatLng icpna = new LatLng(-12.1134213, -77.0304143);

        mMap.addMarker(new MarkerOptions().position(Autonoma).title("Universidad Autonoma"));
        mMap.addMarker(new MarkerOptions().position(Libreria).title("Libreria"));
        mMap.addMarker(new MarkerOptions().position(jugos).title("Jugos"));
        mMap.addMarker(new MarkerOptions().position(kenedy).title("Parque kenedy"));
        mMap.addMarker(new MarkerOptions().position(upc).title("UPC-MONTERICO"));
        mMap.addMarker(new MarkerOptions().position(richi).title("UNIVERSIDAD RICARDO PALMA"));
        mMap.addMarker(new MarkerOptions().position(icpna).title("ICPNA ANGAMOS"));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Autonoma,18));
    }
}
