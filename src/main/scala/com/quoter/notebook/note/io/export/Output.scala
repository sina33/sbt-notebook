package com.quoter.notebook.note.io.export

import java.io.File

import com.quoter.notebook.note.io.{ Exports}

/**
 * Created by sina on 12/26/14.
 */
class Output extends Exports {


  override def toTextFile: String = ???

  override def toConsole: String = {
    ( uk + "   @ " + time + "   in " +
      "\n" + context + "\n#" + tag )
  }
  
  
}
