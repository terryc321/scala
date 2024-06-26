

import java.io._
import scala.io.Source._
import scala.io.Source


class FileIO {
  def fileWriter() = {
    val writer = new PrintWriter(new File("demo.txt"))
    writer.write("Hello scala 1\n")
    writer.write("Hello scala 2\n")
    writer.write("Hello scala 3\n")
    writer.write("Hello scala 4\n")
    writer.close()
  }
  def fileReader () = {
    val filename = "demo.txt"
    val len = Source.fromFile(filename).getLines().length
    println("len = " + len )
    for (line <- Source.fromFile(filename).getLines()) {
      println(line)
    }
  }
}





object FileIO :
  def main(args: Array[String]): Unit =
    for arg <- args do {
      //println("arg + : " + fact(BigInt(arg)))
      println("arg + : " + arg)
    }
    val foo = new FileIO
    foo.fileWriter()
    foo.fileReader()





    
  
  
  
  
  
  
  
  
  
