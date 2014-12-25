package com.quoter.notebook

import java.io._

import scala.io.Source

/**
 * Created by sina on 12/23/14.
 */
// todo: strip any space from beginning and end of tags
// todo: interface for notebook (trait)
// todo: add Date & Time to posts

object notebook {

  import java.io.File

  // todo: setting.nb create, update, load
  val settingFileName = ".setting.nb"
  var posts: Array[String] = if (settingExist) Source.fromFile(settingFileName).getLines().toArray[String] else null
  val table = new Array[Items](if(posts == null) 0 else posts.length)
  // todo: read a sorted table from file

  def newPost(uk: String): Boolean = {
//    if(!settingExist) createSetting
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

    val settingPW = new PrintWriter( getSetting )
    settingPW.write(uk + "\n")
    settingPW.close()
    true
  }

  def newPost(): Boolean = newPost(System.currentTimeMillis().toString)

  def searchTags(tag: Array[String]): Array[Items] = {
    val TagMatchPoint = 1
    println("searching on theses tags: " + tag.mkString(","))
    //printPostCollection(posts)
    for (i <- 0 until posts.length) {
      table.update(i, new Items(posts(i), Source.fromFile(posts(i) + "/tags.txt").getLines().mkString.split(",") , 0));
      for (t <- tag)
        if (table(i).tagList contains t)
          table(i).points = table(i).points + TagMatchPoint
    }
    table.sortBy(_.points)
  }

  def printPostCollection(items: Array[Items]): Unit = {
    for (i <- items) {
      println(i.toString)
      println(Source.fromFile(i.uk + "/content.txt").getLines().mkString )
      println("TAGS: " + Source.fromFile(i.uk + "/tags.txt").getLines().mkString + "\n")
    }
  }

  def printPostCollection(postColl: Array[String]): Unit = {
    println("---------- " + posts.length + " Posts ----------")
    for (p <- postColl) {
      println(p)
      println(Source.fromFile(p + "/content.txt").getLines().mkString)
      println("TAGS: " + Source.fromFile(p + "/tags.txt").getLines().mkString + "\n")
    }
  }

  def settingExist: Boolean = {
    if (new File(settingFileName).exists()) true
    else false
  }

  def getSetting: FileOutputStream = {
    //if (!settingExist)
    new FileOutputStream(settingFileName, true)
  }
}
