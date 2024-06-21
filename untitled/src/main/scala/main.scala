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

  // trimEnd deprecated
  b2.trimEnd(5)
  b2.dropRight(5) // ArrayBuffer(1,1,2)
  println(b2)

  b2.insert(2,6) // insert 6 at index offset 2 in b2 array
  println(b2)

  b2.remove(2) // remove index 2
  println(b2)

  val c2 = b2.toArray
  println(("c2=" , c2))

  // multi dimensional arrays
  val matrix = Array.ofDim[Double](3,4)// 3 rows 4 columns
  println(matrix(2)(3))
  matrix(2)(3)= 42
  println(matrix)

  // Java to scala collection conversions
  //import scala.collection.JavaConversions
  //import scala.jdk.CollectionConverters.*

  // this below gives us List
  import scala.jdk.CollectionConverters._

  val list1 = new java.util.ArrayList[String]()
  list1.add("abc")
  list1.add("def")
  list1.add("ghi")
  println(list1)

  println(list1.toArray())
  println(list1.toArray().length)

  //list1.toBuffer .... did not work

  val map = new java.util.HashMap[ String, Int]
  map.put("a",10)
  println(map)
  // println(map.toMap) ..... fail


  // collections
  //import scala.collection.immutable.List
  val l1 = List(1,2,3)
  println(l1)
  val l2 = List()
  println(l2)
  println(l1  == Nil) // false
  println(l2 == Nil) // false

  val l3 = List(2,"a")
  println(l3)
  println(l3(1))
  val l4 = List(1,-2,3,2,-1,0,3)
  println(l4.sorted)
  println(l4.sorted.reverse)
  println(List("b","d").sorted)
  //println(List(1,"a").sorted)
  println(l4.sortWith((x,y) => x < y))
  println(l4.sortWith((x,y) => x > y))
  println(l4)

  // mutable list
  import scala.collection.mutable.ListBuffer
  val lb = ListBuffer.empty[String]
  lb += "b"
  println(lb)
  lb += ("c","d" , "e")
  println(lb)
  lb -= "d"
  println(lb)
  lb ++= List("f","g")
  println(lb)


  // do this last so we can see
  // we got here
  println("hello world!")
}