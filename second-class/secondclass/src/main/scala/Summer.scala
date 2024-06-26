
object Summer :

  def fact(n : BigInt):BigInt = 
    if n < 2 then 1 else fact2(n, BigInt(1))  
 
  def fact2(n : BigInt , r : BigInt):BigInt = 
    if n < 2 then r else fact2(n-1 , r * n) 

  def addInt(a:Int, b:Int): Int = {
    var sum: Int = 0
    println("entered into function addInt")
    sum = a + b
    return sum
  }

  def printInt(a: Int, b:Int) = {
    println("vlaue of a = " + a )
    println("value of b = "  + b)   
  }

  def pause() = {
    
  }


  def countDown() = {
    for(x <- (1 to 10) ; y = 11 - x ) { pause() ;  println(y)}
  }
 

  def main(args: Array[String]): Unit =
    for arg <- args do {
      println("arg + : " + fact(BigInt(arg)))
    }
    println("addInt 2 3 = " + addInt(2,3))
    printInt(b = 3 , a = 2 )
    
  
    
  
  
  
  
  
  
  
  
  
