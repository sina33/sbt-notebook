package com.quoter.notebook.io

import com.quoter.notebook.note.Note

/**
 * Created by sina on 12/27/14.
 */
class Path(val n: Note, val root: String) {
  def this(n: Note) = this(n, ".")

  //val root = "."
  val sep = "/"
  val noteDir = root + sep + n.uk
  val txtFile = root + sep + noteDir + sep + "text"
  val tagFile = root + sep + noteDir + sep + "tag"
  val catFile = root + sep + noteDir + sep + "cat"

}
