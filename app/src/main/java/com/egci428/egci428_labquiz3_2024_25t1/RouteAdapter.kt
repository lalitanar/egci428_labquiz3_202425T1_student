package com.egci428.egci428_labquiz3_2024_25t1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.egci428.egci428_labquiz3_2024_25t1.Models.MRoute

/*
 * Created by Lalita N. on 5/12/24.
 */

class RouteAdapter(val mContext: Context, val layoutResId: Int, val routeList: ArrayList<MRoute>):
 ArrayAdapter<MRoute>(mContext, layoutResId, routeList) {
 override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

  /* (4.1) Prepare the layout for each row in the list adapter*/
  val layoutInflator: LayoutInflater = LayoutInflater.from(/*......4.1.........*/)
  val view: View = layoutInflator.inflate(/*......4.1.........*/, null)
  val routeTextView = /*......4.1.........*/

  /* (4.2) Add value to each row in the list adapter */
  val rt = /*......4.1.........*/
   routeTextView.text = /*......4.1.........*/
    return view
 }
}