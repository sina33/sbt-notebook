package com.quoter.notebook.note

import scala.util.Random

/**
 * Created by sina on 12/26/14.
 */
//class Note(val uk: String, val time: Long) {
//  def this(uk: String) = this(uk, System.currentTimeMillis())
//  def this(time: Long) = this(System.currentTimeMillis().toString + "-" + Random.alphanumeric.take(8).mkString, time)
//  def this() = this(System.currentTimeMillis())
class Note(val uk: String) {
  def this() = this(System.currentTimeMillis().toString + "-" + Random.alphanumeric.take(8).mkString)
  
  var time: Long = System.currentTimeMillis()
  var context: String = ""
  var tag: String = ""
  var cat: String = ""

}
