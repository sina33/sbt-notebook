package com.quoter.notebook

import com.quoter.notebook.nb.NotebookCore
import com.quoter.notebook.note.Note
import com.quoter.notebook.note.io.imports.Input
import com.quoter.notebook.note.io.{Imports, Exports}

/**
 * Created by sina on 12/26/14.
 */
object App {
  def main(args: Array[String]) {
    val nb: NotebookIFace = new NotebookCore
    args(0) match {
      case "-n" => {
        nb.newNote( new Note().in.console )
      }
      case "-s" => {
        val keys = readLine()
        val t : Array[Note] = nb.searchNote(keys)
        nb.viewNote( nb.searchNote(keys) )
      }
      case "-r" => {
        nb.deleteNote( readLine() )
      }
    }
  }
}
