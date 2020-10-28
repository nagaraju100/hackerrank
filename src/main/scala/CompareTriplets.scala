import java.io._

import scala.io._

object CompareTriplets  {

  // Complete the compareTriplets function below.
  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
      var result = Array[Int](2) // Companion Object, This is inserting value as result(0)=2
    var name = new Array[Int](2)
    var aliceCount = 0;
    var bobCount = 0;
      for (i <- 0 to a.length-1){
          if (a(i) > b(i)) aliceCount+=1
        if (a(i) < b(i)) bobCount+=1
      }
    name(0)=aliceCount
    name(1)=bobCount
    name
  }



  def main(args: Array[String]) {
    val printWriter = new PrintWriter("src/output/result.txt")
     // Replacing more spaces with replaceAll
    val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val b = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    val resu = compareTriplets(a, b)
    println(resu)
    printWriter.println(resu.mkString(" "))

    printWriter.close()
  }
}
