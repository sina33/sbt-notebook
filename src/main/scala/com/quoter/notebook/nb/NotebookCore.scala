package com.quoter.notebook.nb

import com.quoter.notebook.NotebookIFace
import com.quoter.notebook.note.Note

/**
 * Created by sina on 12/26/14.
 */
class NotebookCore extends NotebookIFace {
  override def newNote(note: Note): Boolean = ???

  override def viewNote(notes: Array[Note]): Unit = ???

  override def searchNote(keys: String): Array[Note] = ???

  override def deleteNote(uk: String): Boolean = ???
}
