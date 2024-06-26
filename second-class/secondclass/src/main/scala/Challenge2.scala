
// input.txt contains a key map "NAME=bala AGE=23 COUNTRY=Singapore"

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

import java.io._
import scala.io.Source._
import scala.io.Source

class Challenge2 {
  def fileWriter() = {
    val writer = new PrintWriter(new File("input.txt"))
    writer.write("NAME=bala AGE=23 COUNTRY=Singapore")
    writer.close()
  }
  def fileReader () = {
    val filename = "input.txt"
    val len = Source.fromFile(filename).getLines().length
    println("len = " + len )
    for (line <- Source.fromFile(filename).getLines()) {
      println(line) ;
      split(line)
    }
  }
  
  def split(str : String) = {    
    val pairs = str.split("=| ").grouped(2)
    val map = pairs.map { case Array(k, v) => k -> v }.toMap
    // Map(NAME -> bala, AGE -> 23, COUNTRY -> Singapore)
    println("map = " + map)
  }

  def demo() = {
    try{
      fileWriter()
      fileReader()
    } catch  {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    }
  }
}



object Main :
  def main(args: Array[String]): Unit =
    for arg <- args do {
      println("arg + : " + arg)
    }
    val foo = new Challenge2
    foo.demo()
    






    
  
  
  
  
  
  
  
  
  
