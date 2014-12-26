package com.quoter.notebook.note

import com.quoter.notebook.note.io.{Export, Import}

/**
 * Created by sina on 12/26/14.
 */
class Note(val uk: String) {
  def this() = this(System.currentTimeMillis())
  def this(i: Import, o: Export) = this("hi")

  val time = System.currentTimeMillis()
  var context: String = null
  var tag: String = null
  var cat: String = null
  
  val in: Import
  val out: Export
}
