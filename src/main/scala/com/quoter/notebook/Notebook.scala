package com.quoter.notebook

import java.io._

import scala.io.Source

/**
 * Created by sina on 12/23/14.
 */
// todo: interface for notebook (trait)
// todo: add Date & Time to posts

object notebook {

  import java.io.File

  // todo: setting.nb create, update, load
  val settingFileName = ".setting.nb"
  var posts: Array[String] = if (settingExist) Source.fromFile(settingFileName).getLines().toArray[String] else null
  var table = Array.apply(new Items)

  // todo: read a sorted table from file
  def load() = {


  }

  def newPost(uk: String): Boolean = {
    // todo: check if the key is unique
    if (!new File(uk).mkdir()) {
      println("# directory name exist. choose a unique title.")
      return false
    }
    println("Enter your text in -One- line: ")
    val pw1 = new PrintWriter(new File(uk + "/content.txt"))
    pw1.write(readLine())
    pw1.close
    println("Enter comma-separated tags: ")
    val pw2 = new PrintWriter(new File(uk + "/tags.txt"))
    pw2.write(readLine())
    pw2.close
    true
  }

  def newPost(): Boolean = newPost(System.currentTimeMillis().toString)

  def searchTags(tag: Array[String]): Array[Items] = {
    //val TagMatchPoint = 1
    println("THIS IS NOT A JOKE")
    for (i <- 0 until posts.length) {
      table(i).uk = posts(i)
      table(i).tagList = Source.fromFile(posts(i) + "/tags.txt").getLines().mkString.split(",")
      for (t <- tag)
        if (table(i).tagList contains t)
          table(i).points = table(i).points + 1 //TagMatchPoint
    }
    table.sortBy(_.points)
  }

  def printPostCollection(items: Array[Items]): Unit = {
    for (i <- items) {
      println(i.toString)
      println(Source.fromFile(i.uk + "/content.txt").getLines() + "\n")
    }
  }

  def settingExist: Boolean = {
    if (new File(settingFileName).exists()) true
    else false
  }

  def loadSetting: Unit = {

  }

  def createSetting: Unit = {
    val pw = new PrintWriter(new File(settingFileName))
    pw.write("")
    pw.close
  }
}
