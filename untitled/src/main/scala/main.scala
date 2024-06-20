@main
//def main(args: Array[String] ): Unit = {
def main(): Unit = {
  println("Hello world!")
  println("here we go again !")

  // language fundamentals
  var x = 10
  println(x)
  x = 11
  println(x)
  x += 1
  println(x)
  x = x + 1
  println(x)
  x -= 1
  println(x)

  // val constant
  val y = 10
  // y = 11
 /*
 this is a longer comment
 y = 11
  */
  val z: Double = 10
  println(z)
  val greetings = ""
  val greeting1: Any = "hello"
  println(greetings)
  println(greeting1)

  val xmax, ymax = 100
  val a0 = 1
  var b0 = 3
  var c0 : Float = 2.4
  print(xmax,ymax)
  print(a0,b0,c0)
  //println(a0,b0,c0)

  // string routines
  val s1 = "string"
  println(s1)
  val s2 = "My" + s1
  println(s2)
  // overloaded +
  val s3 = s1 + 100
  println(s3)
  val s3b = s1 + " " + 100
  println(s3b)
  val s4 = 100.toString()
  println(s4)
  val s5 =
    """first line
      |second line""".stripMargin
  println(s5)

  // is the string empty?
  println("".isEmpty)
  println("".empty)

  println("abc".getBytes)
  println("abc".charAt(0))
  println("abc".charAt(1))

  println("abc".length)

  def fac(n:BigInt): BigInt = {
    if (n < 2){
      return n
    }
    else {
      return n * fac(n-1)
    }
  }

  // scala fails int test ?
  println(fac(5))
  println(fac(10))
  println(fac(20))

  println("aBcDe".filter(x => x.isUpper))
  println("aBcDe".filter(x => x.isLower))

  // variable length arrays
  import scala.collection.mutable.ArrayBuffer
  val b2 = ArrayBuffer[Int]()
  b2 += 1
  println(b2)
  b2 += (1,2,3,6)
  println(b2)
  b2 ++= Array(8,13,21)
  println(b2)
  


  // do this last so we can see
  // we got here
  println("hello world!")
}