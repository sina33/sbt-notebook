package com.quoter.notebook.nb


import java.io.{File, PrintWriter}

import com.quoter.notebook.IOiFace
import com.quoter.notebook.io.{RW}
import com.quoter.notebook.note.Note

import scala.collection.mutable.ListBuffer
import scala.io.Source


/**
 * Created by sina on 12/27/14.
 */
class Setting(val settingFile: String) {
  val io : IOiFace = new RW
  val notes: ListBuffer[Note] = ListBuffer.empty[Note]
  load()
  
  def this() = this(".setting.nb")
  
  def load() : Unit = {
    println("loading setting...")
    if(! new File(settingFile).exists)
      new File(settingFile).createNewFile()
    for(i <- Source.fromFile(settingFile).getLines() )
      if(i.length > 0) notes.append( io.load(i) )
//    notes.::(new Note("havij" + System.currentTimeMillis()))
    println("setting loaded : " + notes.toArray.length + " notes"  ) //+ notes.count(i => i.uk.length > 0))
    println("\t\t==========================\n")
  }

  def save() : Unit = {
    var pw = new PrintWriter(settingFile)
    for(i <- notes) {
      pw.println(i.uk)
    }
    pw.close()
//      new PrintWriter(settingFile).print( (notes.collect{case i => i.uk}).mkString("\n"))
  }
  
  def add(n: Note) = {
    notes.append(n)
    println( (notes.collect {case i:Note => i.uk} ).mkString("\n") )
    save()
  }
  
  def delete(uk: String) = {
    notes.dropWhile(_.uk.equals(uk))
    save()
  }
}
