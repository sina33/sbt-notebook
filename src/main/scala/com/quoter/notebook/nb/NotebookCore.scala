package com.quoter.notebook.nb

import com.quoter.notebook.io.RW
import com.quoter.notebook.{IOiFace, NotebookIFace}
import com.quoter.notebook.note.Note

/**
 * Created by sina on 12/26/14.
 */
class NotebookCore extends NotebookIFace {

  override val io: IOiFace = new RW

  override def newNote(note: Note): Boolean = io.save(note)

  override def viewNote(notes: Array[Note]): Unit = {
    for(n <- notes) {
      io.toConsole(n)
      println("\t\t\t----------")
    }
  }

  override def searchNote(keys: String): Array[Note] = ???

  override def deleteNote(uk: String): Boolean = ???
}
