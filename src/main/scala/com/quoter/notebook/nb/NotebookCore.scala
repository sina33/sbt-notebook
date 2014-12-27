package com.quoter.notebook.nb

import com.quoter.notebook.io.RW
import com.quoter.notebook.{IOiFace, NotebookIFace}
import com.quoter.notebook.note.Note

/**
 * Created by sina on 12/26/14.
 */
class NotebookCore extends NotebookIFace {

  val setting : Setting = new Setting()
  //setting.load()
  
  override val io: IOiFace = new RW

  override def newNote(note: Note): Boolean = {
    setting.add(note)
    io.save(note)
  }

  override def viewNote(notes: Array[Note]): Unit = {
    for(n <- notes) {
      io.toConsole(n)
      println("\t\t\t----------")
    }
  }

  override def searchNote(keys: String): Array[Note] = {
    if(keys == null) return setting.notes.toArray
    else return setting.notes.toArray
  }

  override def deleteNote(uk: String): Boolean = {
    setting.delete(uk)
    io.del(uk)
  }
}
