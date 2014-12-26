package com.quoter.notebook.note.io

import com.quoter.notebook.note.Note

/**
 * Created by sina on 12/26/14.
 */
trait Exports extends Filing {

  def toTextFile: Note
  def toConsole: String
  
  //tag = "#tag"
}
