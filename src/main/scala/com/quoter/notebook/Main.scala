package com.quoter.notebook

/**
 * Created by sina on 12/23/14.
 */
object Main {
  def main(args: Array[String]) {
    if (args.length == 0) {
      print_usage()
      return
    }
    for(i <- 0 until args.length)
      println(i + "\t" + args(i))
    args(0).toLowerCase match {
      case "-n" => {
        args.length match {
          case 1 => {
            if ( notebook.newPost() ) println("# note successfully added.")
            else println("# can't create note.")
          }
          case _ => {
//            argIndex = argIndex + 1
            if ( notebook.newPost( args(1).toString ) ) println("# note successfully added.")
            else println("# can't create note.")
          }
        }
      }

      case "-s" => {
        args.length match {
          case 1 => {
            print_usage()
            return
          }
          case _ => {
            args(1).toLowerCase match {
              case "about" => {
                // comma separated parse
                if (notebook.posts != null)
                  notebook.printPostCollection( notebook.searchTags( args(2).split(",") ) )
                else
                  println("# notebook is empty.")
              }
              case _ => {
                print_usage()
                return
              }
            }
          }
        }
        
        
      }

      case "-v" => {
        notebook.printPostCollection( notebook.searchTags(Array(" ") ) )
        
      }  
        
      case _ => print_usage()
    }
    
  }

//  def quitParse(argLen: Int, idx: Int) : Boolean = {
//    if(idx < argLen) false
//    else true
//  }
  def print_usage() : Unit = {
  println("usage: ./nb -n [post title]  or  ./nb -s [search literal]")
  println("search literal patterns:")
  println("\tabout \"comma-separated tags\"")
  }
}
