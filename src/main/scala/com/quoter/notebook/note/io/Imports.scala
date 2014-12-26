package com.quoter.notebook.note.io

import com.quoter.notebook.note.Note

/**
 * Created by sina on 12/26/14.
 */
trait Imports extends Filing {
  def fromConsole: Note
  def fromTextFile(file: String): Note
}
