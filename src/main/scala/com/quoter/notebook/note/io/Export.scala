package com.quoter.notebook.note.io

import com.quoter.notebook.note.Note

/**
 * Created by sina on 12/26/14.
 */
trait Export extends Note {
  def txtFile
  def console
  
  tag = "#tag"
}
