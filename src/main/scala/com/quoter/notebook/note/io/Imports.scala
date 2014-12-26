package com.quoter.notebook.note.io

import com.quoter.notebook.note.Note

/**
 * Created by sina on 12/26/14.
 */
trait Imports extends Note {
  def console: String
  def txtFile(file: String)
}
