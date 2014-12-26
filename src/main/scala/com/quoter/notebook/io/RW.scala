package com.quoter.notebook.io

import java.io.{PrintWriter, File}

import com.quoter.notebook.IOiFace
import com.quoter.notebook.note.Note

/**
 * Created by sina on 12/27/14.
 */
class RW extends IOiFace {
  override def save(n: Note): Boolean = {
    val p = new Path(n)
    if( new File(p.noteDir).exists() ) {
      println("mkdir error: a Note with this key (title) is already exists.")
      return false
    } else {
      new File(p.noteDir).mkdir()
      val pw1 = new PrintWriter(p.txtFile)
      pw1.println(n.context); pw1.close()
      val pw2 = new PrintWriter(p.catFile)
      pw2.println(n.cat); pw2.close()
      val pw3 = new PrintWriter(p.tagFile)
      pw3.println(n.tag); pw3.close()
      true
    }
  }

  override def fromConsole(): Note = {
    val n = new Note()
    println("Enter your text in one line:")
    n.context = readLine()
    println("Enter Category:")
    n.cat = readLine()
    println("Enter comma-separated tags:")
    n.tag = readLine()
    n
  }

  override def fromTxtFile(): Note = ???

  override def toConsole(n: Note): Unit = {
    val post = n.uk + "   @ " + n.time + "   in " + n.cat +
    "\n" + n.context + "\n" + "#" + n.tag + "\n"
    println(post)
  }

  override def toTxtFile(n: Note, f: String): Boolean = ???
}
