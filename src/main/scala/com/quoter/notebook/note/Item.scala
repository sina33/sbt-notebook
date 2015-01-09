package com.quoter.notebook.note

/**
 * Created by sina on 12/31/14.
 */
trait Item {
  def isAvailable : Boolean
  def fileName : String
  val value: String

}

//todo: every item should extends Item trait