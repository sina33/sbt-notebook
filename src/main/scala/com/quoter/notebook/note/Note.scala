package com.quoter.notebook.note

import com.quoter.notebook.note.io.export.Output
import com.quoter.notebook.note.io.imports.Input
import com.quoter.notebook.note.io.{Exports, Imports}

/**
 * Created by sina on 12/26/14.
 */
class Note(val uk: String) {
  def this() = this(System.currentTimeMillis().toString)

  val time = System.currentTimeMillis()
  var context: String = null
  var tag: String = null
  var cat: String = null

  val in: Imports = new Input
  val out: Exports = new Output
}
