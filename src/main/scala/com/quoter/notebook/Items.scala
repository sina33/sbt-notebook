package com.quoter.notebook

/**
 * Created by sina on 12/23/14.
 */
//class Items {
//  var uk: String = null
//  var tagList: Array[String] = null
//  var cat: String = null
//  var points: Double = 0.0
//
//  override def toString = "@uk: " + uk + "\t\t" + "@pt: " + points
// }

class Items(var uk: String = null,
            var tagList: Array[String] = null,
            var points: Double = 0.0
             ) {

  override def toString = "@uk: " + uk + "\t\t" + "@pt: " + points
}
