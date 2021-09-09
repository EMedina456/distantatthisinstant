package com.stfx.distantatthisinstant;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GTAMaps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    // Generate map
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_t_a_maps);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    // Get the city name to find its information
    private CityData getCityData(Intent intent) {
        String cityName = intent.getStringExtra("CityName");
        return CityData.findByName(cityName);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     */
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng location;
        // Add a marker in their location and move the camera
        CityData cityData = getCityData(getIntent());

        // Pin the location when program retrieves city data
        if (cityData != null) {
            location = new LatLng(cityData.getLat(), cityData.getLon());
        }

        else {
            location = new LatLng(43.5, -79.6);
        }

        // Show the marker and zoom into marker on map
        mMap.addMarker(new MarkerOptions().position(location).title("Marker at your location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 10.0f));
    }
}