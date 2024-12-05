package com.egci428.egci428_labquiz3_2024_25t1

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.egci428.egci428_labquiz3_2024_25t1.Models.MRoute
import com.egci428.egci428_labquiz3_2024_25t1.Models.RouteProvider


class MainActivity : AppCompatActivity() {

    private var routeList: ArrayList<MRoute>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val listView = findViewById<ListView>(R.id.listView)

        /* (1.1) load all routes names from RouteProvider.kt to variable "routeList" */
        routeList = /*...........(1.1)...............*/

        /* (1.2) Prepare adapter by using RouteAdapter class and set adapter to listView*/
        val adapter = /*...........(1.2)...............*/
        /*...........(1.2)...............*/

        listView.setOnItemClickListener { parent, view, position, id ->
            /* (1.3) Get the selected route name and transfer to RouteViewActivity by using displayMap function */
            var selectedRoute = /*...........(1.3)...............*/
            /*...........(1.3)...............*/

        }

    }
    private fun displayMap(aMRoute: MRoute) {
        val intent = Intent(this, RouteViewActivity::class.java)
        intent.putExtra("selRoute", /*...........(1.3)...............*/)
        intent.putExtra("countPoint", /*...........(1.3)...............*/)
        for (i in 1../*...........(1.3)...............*/){
            intent.putExtra("point"+i+"lat",/*...........(1.3)...............*/)
            intent.putExtra("point"+i+"lon", /*...........(1.3)...............*/)
        }
        startActivity(intent)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item!!.getItemId();
        if(id == R.id.menuAdd){
            actionAddClickHandler(item)
        }
        return super.onOptionsItemSelected(item)
    }

    private fun actionAddClickHandler(item: MenuItem) {

        /* (1.4) Go to RouteMapActivity Page by clicking at the + sign on the menu bar. */
        val intent = /*...........(1.4)...............*/
        /*...........(1.4)...............*/
    }


}