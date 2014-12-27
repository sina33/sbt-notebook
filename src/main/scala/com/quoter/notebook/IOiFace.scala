package com.quoter.notebook

import com.quoter.notebook.note.Note

/**
 * Created by sina on 12/27/14.
 */
trait IOiFace {

  def fromConsole(): Note

  def fromTxtFile(): Note
  
  def load(uk: String) : Note

  def toConsole(n: Note): Unit

  def toTxtFile(n: Note, f: String): Boolean
  
  def save(n: Note) : Boolean
  
  def del(uk: String) : Boolean
}
