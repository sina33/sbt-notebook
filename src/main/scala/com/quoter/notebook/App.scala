package com.quoter.notebook

import com.quoter.notebook.nb.NotebookCore
import com.quoter.notebook.note.Note

/**
 * Created by sina on 12/26/14.
 */
object App {
  def main(args: Array[String]) {
    val nb: NotebookIFace = new NotebookCore
    if (args.size == 0) nb.viewNote(nb.searchNote(null))
    else
      args(0) match {
        case "-n" => {
          nb.newNote(nb.io.fromConsole())
        }
        case "-s" => {
          val keys = readLine()
          val t: Array[Note] = nb.searchNote(keys)
          nb.viewNote(nb.searchNote(keys))
        }
        case "-r" => {
          nb.deleteNote(readLine())
        }
        case "-v" => {
          if (args.size <= 1)
            nb.viewNote(nb.searchNote(null))
          else
            nb.viewNote(nb.searchNote(null))

        }
      }
  }
}
