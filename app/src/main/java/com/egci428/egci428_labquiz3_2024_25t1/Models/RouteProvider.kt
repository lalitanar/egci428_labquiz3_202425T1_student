package com.egci428.egci428_labquiz3_2024_25t1.Models

/*
 * Created by Lalita N. on 5/12/24.
 */

object RouteProvider {

 private val data = ArrayList<MRoute>()
 fun getData(): ArrayList<MRoute> {
  return data
 }

 init {

  data.add(
   MRoute(
    4,
    arrayOf(MPoint(13.7946, 100.3234), MPoint(18.7061, 98.9817), MPoint(15.7061, 98.9817), MPoint(15.7061, 100.9817)),
    "route1"
   )
  )
  data.add(
   MRoute(
    3,
    arrayOf(MPoint(13.7946, 100.3234), MPoint(7.9519, 98.3381), MPoint(10.9519, 98.3381)),
    "route2"
   )
  )
 }
}