package com.quoter.notebook.io

import com.quoter.notebook.note.Note

/**
 * Created by sina on 12/27/14.
 */
class Path(val n: Note, val root: String) {
  def this(n: Note) = this(n, ".")

  //val root = "."
  val settingFile = ".setting.nb"
  val sep = "/"
  val noteDir = root + sep + n.uk
  
  val timFile = noteDir + sep + "time"
  val txtFile = noteDir + sep + "text"
  val tagFile = noteDir + sep + "tag"
  val catFile = noteDir + sep + "cat"

}
