package com.quoter.notebook.note.io

import com.quoter.notebook.note.Note

/**
 * Created by sina on 12/26/14.
 */
class Filing extends Note {
  val root = "."
  val sep = "/"
  val noteDir = root + sep + uk
  val txtFile = root + sep + noteDir + sep + "text"
  val tagFile = root + sep + noteDir + sep + "tag"
  val catFile = root + sep + noteDir + sep + "cat"

}
