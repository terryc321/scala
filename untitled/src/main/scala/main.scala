

@main
def main() : Unit = {

  /*

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
   // cannot sort this list as
   // not enough information
   // do numbers come before letters ?
   //
   //println(List(1,"a").sorted)

   println(l4.sortWith((x,y) => x+"" < y + ""))
   println(l4.sortWith((x,y) => x < y))
   

  // mutable list
  import scala.collection.mutable.ListBuffer
  val lc = ListBuffer.empty[String]
  lc += "a"
  println(lc)
  lc += ("c","d","e")
  println(lc) // added c d e to a
  lc ++= List("f","g")
  println(lc)

  println(List(1,1,2,2))
  println(Set(1,1,2,2))
  println(List(1,2,3,4) ++ List(3,4,5,6))

  // sets
  println(Set(1,2,3,4)++Set(3,4,5,6))
  println(Set(1, 2, 3) == Set(3, 1,2))
  println(List(1,2,3) == List(3,1,2))
  println(Set(5,4,3,2,1).toList)

  println(Set(1, 2, 3, 4) + 2 )
  println(Set(1,2,3,4,5).toList)

  // immutable maps
  val scores0 = Map("John" -> 75, "Julia" -> 60 ,
    "Kevin" -> 26)
  println(scores0)
  val scores1 = Map( "John" -> 75, "Julia" -> 60 ,  "Kevin" -> 26)
  println(scores0("Julia"))
  //println(scores0("julia"))

  println(if (scores0.contains("Julia")) scores0("Julia") else 0)
  println(if (scores0.contains("julia")) scores0("julia") else 1)

  println(scores0.getOrElse("Julia",0))
  println(scores0.get("Julia"))
  println(scores0.get("Jacob"))
  println(scores0.get("Julia").getOrElse(0))
  println(scores0.get("Jacob").getOrElse(0))

  println(scores0.get("Jacob").getOrElse(0))
  println(scores0.get("Jacob").getOrElse(0))
  
  // mutable maps
  import scala.collection.mutable.{Map => Map}
  val scores = Map("John" -> 75, "Julia" -> 60 , "Kevin" -> 26)
  println(scores)
  //  println(scores("Jacob")) // no key error thrown
  scores += ("Jacob" -> 78 ,  "Julia" -> 65 )
  println(scores)
  scores -= "Jacob" // removed key and value 
  println(scores)

  val scores3 = scores + ("Julia" -> 55 , "Jacob" -> 77  )
  println(scores3)

  val scores4 = scores - "Jacob"
  println(scores4)

  // element traversing

  println(scores)
  for((k,v) <- scores) println((k,v))
  println(("scores :" , scores))
  for((k,v) <- scores) println(k+ " -> " + v)
   
  println(scores.keySet)
  for (v <- scores.values) println(v)
  // purpose of yield ?
  println("with yield .. gives")
  for ((k,v) <- scores) yield println((v,k))

  println("no yield .. gives")
  for ((k,v) <- scores) println((v,k))
  * 
  * 

  // streams are lists  with lazy access to elements
  val st = (1 to 100).toStream
  println(st)
  println(st.filter(_%10==0))
  println(st.filter(_%10==0).toList)

  // Tuples
  val t = (1,3.14,"John")
  println(t)
  println(t._1) // 1st element
  println(t._2) // 2nd element
  println(t._3) // 3rd element
  println(("t._3: ", t._3))
  val (first,second,third) = t
  println(first)
  println(second)
  println(third)

  val (first1,second1,_) = t
  println(first1)
  println(second1)

  // zipping
  val symbols = Array("<","-",">")
  val counts = Array(2,10,2)
  val pairs = symbols zip counts
  for ((s,n) <- pairs) print(s*n)

  println("")
  // two Lists to Map transformation
  val keys = List(1,2,3)
  val values = List("a","b", "c")
  println((keys zip values).toMap)

  val newMap = (keys zip values).toMap
  println(newMap)
  println(newMap(1))

  // Lists manipulations
  // from abstraction collections to lists
  val t2 = Traversable(1,2,3)
  println(t2)
  val i = Iterable(1,2,3)
  println(i)
  val sq = Seq(1,2,3)
  println(sq)

  //operations with Lists
  val odds = List(1,3,5,7,9)
  val evens = List(2,4,6,8)
  val nums = odds ++ evens
  println(nums)

  // cons 
  val digs = 0 :: nums
  println(digs)

  val lstr = "a" :: "b" :: "c" :: Nil
  println(lstr)

  // other useful examples
  val list = scala.collection.immutable.List(1,-2,3,2,-1,0,-3)
  println(list.head)
  println(list.tail)
  println(list.take(4))
  println(list.drop(4))
  println(list.takeRight(4))
  println(list.slice(3,6))
  println(list.min)
  println(list.sum)
  println(list.max)
  println(list.contains(3))
  println(list.contains(7))
  //

  println(("sanity list = " , list))
  println(list.indexOf(3))
  println(list.indexOf(0)) // gives 5
  println(list.indexOf(-1)) // gives 4 
  println(list.mkString)
  println(list.mkString(","))

  val list2 = scala.collection.immutable.List(1,-2,3,2,-1,0,-3)
  println(list2.indexOf(3))
  println(list2.indexOf(0)) // gives 5 .. 
  println(list2.indexOf(7)) // theres no 7 , -1 not found

  println(list.mkString)
  println(list.mkString("|"))
  println(list.count(x => x * x > 1  ))

  println(List(1,2,3) intersect List(2,3,4))
  println(List(1,2,3) diff List(2,3,4))
  println(List(1,2,3).permutations.toList)
  println(List(1,2,3).combinations(2).toList)
  println(List(List(1,2),List(3,4)).flatten)

  // Conditionals

  val x3 = 0
  val y2 = if (x3>0) 1 else -1
  println(y2)

  println(if (x3>0) "plus" else -1)
  println(if (x3 > 0) 1 else ())
  // unit () is anything
  println(if (x3 > 0) 1)

  // loops
  var sum = 0
  while (sum < 10) {sum += 1 ; println("sum = " + sum) }
  println(sum)

  sum = 0
  var k = 0
  while (k < 10){
    sum += k*k
    k += 1
  }

  println(("sum k " , sum,k))

  var sum1 = 0
  var l = List(1,2,3,4,5)
  for (e <- l) sum1 += e
  println(sum1)

  sum1 = 0
  for (i <- 1 to 10) sum1 += i
  println(sum1)

  sum1 = 0
  for (ch <- "Hello") sum1 += ch
  println(sum1)

  for (i <- 1 to 3; j <- 1 to 4) println("" + i + "," + j + " => " + (10 *i + j) + " ")
  println("")

  for (i <- 1 to 3; j <- 1 to 3 if (i != j)) println("" + i + "," + j + " => " + (10 *i + j) + " ")
  println("")

  
  for (i <- 1 to 3; from = 4 - i ; j <- from to 3 )  print((10 * i + j) + " ")
  println("")
  
   // i = 1  : from = 3 : j <- 3 to 3 ; 10 * i  + j  : i=1 j=3 13
   // i = 2  : from = 2 : j <- 2 to 3 ; 10 * i  + j  : i=2 j=2 22 , j=3 23
   // i = 3  : from = 1: j <- 1 to 3 ; 10 * i  + j   : i=3 j=1 31 , j=2 32 , j=3 33
   // 13 22 23 31 32 33   

  for (i <- 1 to 3; from = 4 - 1 ; j <- from to 3 )  print((10 * i + j) + " ")
  println("")

   *
   * * *  */

  val example = new Examples ()
  example.StringManipulations()
  println()
  example.listAndMap()
  println()
  example.traverse()
  println()
  example.conandloop()
  println()


  // do this last so we can see
  // we got here
  println()
  println()
  println(".......finished .......AAA")
}


