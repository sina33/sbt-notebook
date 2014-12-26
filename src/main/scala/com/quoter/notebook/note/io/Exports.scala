package com.quoter.notebook.note.io

import com.quoter.notebook.note.Note

/**
 * Created by sina on 12/26/14.
 */
trait Exports extends Note {
  def txtFile: String
  def console: String
  
  //tag = "#tag"
}
