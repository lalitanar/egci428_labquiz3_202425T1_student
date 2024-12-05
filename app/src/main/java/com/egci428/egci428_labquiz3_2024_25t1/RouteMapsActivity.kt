package com.egci428.egci428_labquiz3_2024_25t1

import android.content.Context
import android.graphics.Color
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.egci428.egci428_labquiz3_2024_25t1.databinding.ActivityRouteMapsBinding
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.PolylineOptions
import java.util.Random

class RouteMapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var binding: ActivityRouteMapsBinding
    private var mMap: GoogleMap? = null
    private var latLng: LatLng? = null

    private var view: View? = null
    private var color = false
    private var countMarker = 0
    private var previousLatLng = LatLng(50.0, 50.0)
    private var listPoints =  ArrayList<LatLng>()
    lateinit var colorBtn: Button
    lateinit var addBtn: Button
    lateinit var latTextView: TextView
    lateinit var lonTextView: TextView
    private val file = "routes.txt"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRouteMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)



        latTextView = findViewById<TextView>(R.id.latTextView)
        lonTextView = findViewById<TextView>(R.id.lonTextview)
        addBtn = findViewById<Button>(R.id.addBtn)
        colorBtn = findViewById(R.id.colorBtn)

        /* (3.1) Set Lat/Lon values receiving from textViews.*/
        latLng = /*...........(3.1)...............*/


        view = findViewById(R.id.colorBtn)
        view!!.setBackgroundColor(Color.RED)



        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)


        colorBtn.setOnClickListener {

            /* (3.2) Switch background color of colorBtn between red and green color */
            if (color == false) {
                /*............(3.2)...............*/
            } else {
                /*............(3.2)...............*/
            }
            color = !color

        }

        /* (3.3) Save all LatLng in listPoints to route.txt file (overwrite the previous one)*/
        addBtn.setOnClickListener {
            try {
                val fOut = openFileOutput(/*..........(3.3)..............*/)
                fOut.write(/*..........(3.3)..............*/)
                fOut.close()
                Toast.makeText(baseContext, "file saved", Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
                e.printStackTrace()
            }
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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        mMap!!.setOnMapClickListener {marker ->
            latLng = marker

            /* (3.4) If the colorBtn is red then add the red marker else add the green marker to the Lat/Lon location from textViews. */
            if (color == false) {

                mMap/*...........(3.4)...............*/

            } else if (color == true) {

                mMap/*...........(3.4)...............*/

            }

            /* (3.5) Move the map camera to the last Lat/Lon location and set the map's Zoom level = 5.*/
            mMap/*...........(3.5)...............*/

            /* (3.6) If there are more than one marker, draw the black line connecting between 2 markers*/
            if (countMarker > 0) {
                mMap/*...........(3.6)...............*/
            }
            countMarker = /*...........(3.6)...............*/
            previousLatLng = /*...........(3.6)...............*/

            /* (3.7)  Add marker’s location to the listPoints (arrayof(LatLng)) */
            listPoints/*..........(3.7)............. */
            updateMarker()
        }
    }

    private fun updateMarker(){

        /* (3.3)
           -  While checking the mobile device, the colorBtn background color will change to Green and Red alternatively
           - Random a new Lat/Lon location by calling randomLocation function and update this Lat/Lon location to TextViews
         */
        latTextView.setText(latLng!!.latitude.toString())
        lonTextView.setText(latLng!!.longitude.toString())

    }



}