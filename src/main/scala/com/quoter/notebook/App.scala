package com.quoter.notebook

import com.quoter.notebook.nb.NotebookCore
import com.quoter.notebook.note.Note

/**
 * Created by sina on 12/26/14.
 */
object App {
  def main(args: Array[String]) {
    val nb: NotebookIFace = new NotebookCore
    args(0) match {
      case "-n" => {
        val note = new Note()
        note.context = readLine()
        note.tag = readLine()
        nb.newNote(note)
      }
      case "-s" => {
        val keys = readLine()
        nb.viewNote( nb.searchNote(keys) )
      }
      case "-r" => {
        nb.deleteNote( readLine() )
      }
    }
  }
}
