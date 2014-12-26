package com.quoter.notebook

import com.quoter.notebook.note.Note
import com.quoter.notebook.note.io.{Imports, Exports}

/**
 * Created by sina on 12/26/14.
 */
trait NotebookIFace {

  def newNote(note: Note): Boolean
  def searchNote(keys: String): Array[Note]
  def viewNote(notes: Array[Note]): Unit
  def deleteNote(uk: String): Boolean
  
  //def scanFolder
}
