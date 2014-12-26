package com.quoter.notebook.note

/**
 * Created by sina on 12/26/14.
 */
class Note(val uk: String) {
  def this() = this(System.currentTimeMillis().toString)

  val time = System.currentTimeMillis()
  var context: String = null
  var tag: String = null
  var cat: String = null

}
