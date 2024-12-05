package com.egci428.egci428_labquiz3_2024_25t1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.egci428.egci428_labquiz3_2024_25t1.Models.MPoint

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.egci428.egci428_labquiz3_2024_25t1.databinding.ActivityRouteViewBinding
import com.google.android.gms.maps.model.PolylineOptions

class RouteViewActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityRouteViewBinding

    private var latLng: LatLng? = null
    private var routeName: String? = null
    private var countPoint: Int? = null

    lateinit var pointList: MutableList<MPoint>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRouteViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        pointList = mutableListOf()

        //*(2.1) Set the value of routeName received from MainActivity*/
        val bundle = /*...........(2.1)...............*/
        if(bundle!=null){
            /*(2.2) Set the values of point1Lat, point1Lon, point2Lat, and point2Lon receiving from MainActivity*/
            routeName = /*...........(2.2)...............*/
            countPoint = /*...........(2.2)...............*/

            for (i in 1..countPoint!!){

                var pointLat = /*...........(2.2)...............*/
                var pointLon = /*...........(2.2)...............*/

                /*(2.3) Set and Add the values of these points in (2.2) to pointList.*/
                pointList./*...........(2.2)...............*/
            }
        }


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        /*(2.4) Set up the mapFragment.*/
        val mapFragment = /*...........(2.4)...............*/
        mapFragment.getMapAsync(this)

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


        if(pointList.isNotEmpty()) {
            var i = 0

            /*(2.5) Plot the markers on maps according to pointList.*/
            var point: LatLng? = null
            for(i in 0../*...........(2.5)...............*/) {
                point = /*...........(2.5)...............*/
                mMap./*...........(2.5)...............*/
                Log.d("Marker", point.toString())

                Log.d("Marker added: ", i.toString())
            }

            /*(2.6) Draw the line between markers according to the pointList.*/
            for(i in 1..pointList.size-1) {
                mMap.addPolyline(
                    /*...........(2.6)...............*/
                )

            }
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(point!!, 5f))
        } else{
            Log.d("Marker added: ", "Zero")
        }
    }
}