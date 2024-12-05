package com.egci428.egci428_labquiz3_2024_25t1.Models

/*
 * Created by Lalita N. on 5/12/24.
 */

class MRoute(val countPoint: Int, val mPoints: Array<MPoint>, val name: String){
 override fun toString(): String {
  return name
 }
}