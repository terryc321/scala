

import scala.util.CommandLineParser as CLP

enum Color:
  case Red, Green, Blue


given CLP.FromString[Array[String]] with
  def fromString(value: Array[String]): String = "hello world!"

@main
def hello(args : Array[String]): Unit =
  /* * *
   *
  def msg = "I was compiled by Scala 3. :)"
  val example = new Example ()
  println()
  example.StringManipulations()
  println()
  example.listAndMap() 
  println()
  example.traverse()
  println()
  example.conandloop()

  // Expressions
  val myVariable = 10
  println("hello world")

  val lines = scala.io.Source.fromFile("file.txt").mkString
  println("--------")
  println(lines)
  println("--------")

  val myVar = 5
  println(myVar)
   
  val calculus = {val PI = 3.14; PI * myVar}
  println(calculus)

  val number = 2 
  val divideByTwo = if (number % 2 == 0 ) {println("Divisible by 2 ")} else { None}
  println(divideByTwo)
  val result = 3 * 2 * {if (number %2 == 0) {number * 2} else {0}}
  println("result = " + result)

  // match expressions 
  val laptop = "Mac"
  val laptopType = laptop match {
    case "Mac" => "hello apple!"
    case "PC" => "Hello PC!"
    case nothingMatches => "Are you sure yor a laptop :)"
  }
  println(laptopType)

  val productType = "PC"
  val productTypeMatch = productType match {
    case "Mac" | "iPod" | "iPad" => "hello apple!"
    case "PC" | "Surface" | "WindowsPhone" => "Hello microsoft"
    case nothingMatches => "sorry ..."
  }

  println("product type = " + productTypeMatch)

  // Pattern Guards
  val productType2 = "iPod"
  val productTypeMatch2 = productType2 match {
    case "Mac" | "iPod" | "iPad" => "hello apple!"
    case "PC" | "Surface" | "WindowsPhone" => "Hello microsoft"
    case nothingMatches if nothingMatches == "linux" => "Great choice!"
    case nothingMatches => "sorry ..."
  }
  println("product type = " + productTypeMatch2)

  // Match-All
  val matchAll = "Blaah"
  val matchEmAll = matchAll match {
    case "Mac" => "hello apple!"
    case "PC" => "Hello pc"
    case nothingMatches => s"what do you mean by blah .. $nothingMatches"
  }
  println("match all = " + matchEmAll)

  // wildcards
  val wildCard = "Blaah"
  val wildCardVal = wildCard match {
    case "Mac" => "hello apple!"
    case "PC" => "Hello pc"
    case _ => s"I dont think your product is a PC or APPle"
  }
  
  //Down casting - pattern variables
  // change 123 "hello" 3.2 List(1,2,3)
  val typedVariable:Any = List(1,2,3)
  val typeOfVariable = typedVariable match {
    case typedVariable:Int => "This is an integer, I can do my calcualtions"
    case typedVariable:String => "String"
    case typedVariable:Double => "Double"
    case _ => "Any"     
  }

  println("type of my variable is = " + typeOfVariable)

  // Closures
  val y  = 2
  val addYVariable = (x:Int) => x + y 
  println("adding an outside variable to function => " + addYVariable(3))
  
  var extras = 10
  val fullPrice = (price:Int) => price + extras 
  println("full price with extras = " + fullPrice(40))

  extras = 20
  println("full price with extras = " + fullPrice(40))
  println("ok..123...")





  
  

  // println("Hello world!")
  // println(msg)
  // val point1 = Point(2, 3)
  // println(point1.x)  // prints 2
  // println(point1)    // prints (2, 3)
  // println(example.push())
  //  *
  * * */ 
 
/* 
 *  challenge
 *  -help -h  
 *  -version -v 
 *
 *  print out loop from 1 to 10 
  printl out loop from 1 to 10 
 then ... from 1 to 10 , print out every i divisble by 2 
 *
 *
  

  println("hello world")
  for (x <- (1 to 10)) println("x = " + x)
  for (x <- (1 to 10) if x % 2 == 0 ) yield println("x = " + x)
 * */
  println("hello world")



