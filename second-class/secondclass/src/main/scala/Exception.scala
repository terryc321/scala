

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

class MyException {
  def demo() = {
    try{
      val f = new FileReader("input.txt")
    } catch  {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    }
  }
  
  def split(str) = {    
    val pairs = str.split("=| ").grouped(2)
    val map = pairs.map { case Array(k, v) => k -> v }.toMap
    // Map(NAME -> bala, AGE -> 23, COUNTRY -> Singapore)

  }

}


object Main :
  def main(args: Array[String]): Unit =
    for arg <- args do {
      //println("arg + : " + fact(BigInt(arg)))
      println("arg + : " + arg)
    }
    val foo = new MyException
    foo.demo()





    
  
  
  
  
  
  
  
  
  
