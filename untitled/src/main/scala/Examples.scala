
class Examples :

  def StringManipulations () : Unit  =
    println("inside basic function StringManipulations")
    println(("Concatenated String is : hello. " + "how are u"))

  def listAndMap () : Unit  =
    println("inside listAndMap")
    val x = List(1,2,3)
    println("values in list x = " + x)
    println("values in list when prepend = " + ( 0 :: x))
    val xx = List(5,6,7,8)
    println("values in list xx = " + (xx))
    println("values in list c append values x and xx = " + (x ++ xx))
    println("start map")
    val colors = Map("red" -> "#FF0000" , "azure" -> "#F0FFFF")
    println("map colors = " + colors)
    for ((k,v) <- colors ) print("" + k + " -> " + v)
    println("check if colors is empty : " + colors.isEmpty)
    println("check if nums is empty : " + colors.isEmpty)
    // just create an empty map
    val nums = Map[Int,Int]()
    println("check if nums is empty : " + nums.isEmpty)
       

  def traverse () : Unit  =
    println("start traverse")
    val camelot = Map("Lady in the Water" -> 3.0 , "Snakes on a Plane" -> 4.0 , 
                      "You, Me and Dupree" -> 3.5)
    for ((k,v) <- camelot) println("key: " + k + ", value : " + v)
  
  def conandloop () : Unit  =
    println("start conditional loops")
    val list = List(1,2,3,4,5,6,7,8,9,10)
    println("list = " + list)
    for (a <- list) if (a < 8 && a != 3) println("Value of a: " + a ) 

end Examples






































    
