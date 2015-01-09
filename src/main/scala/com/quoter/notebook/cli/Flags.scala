package com.quoter.notebook.cli

/**
 * Created by sina on 1/9/15.
 */
object WeekDay extends Enumeration {
  type WeekDay = Value
  val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
}

object ViewMode extends Enumeration {
  type ViewMode = Value
  val Paged, Single, Summary, SummaryPaged = Value
  val entryPerPage = 10
}

object InputMode extends Enumeration {
  type InputMode = Value
  val StdIn, NoteFile, TextFile = Value
}

class Flags {
  val viewAll = true
  

}
