import scala.io.StdIn.readInt
object Q2 {5
  def main(args: Array[String]): Unit = {
    print("Enter the number:")
    var num = readInt()
    if(num<=0){
    println(negative(num))
    }
    if(num!= 0){
      println(odd_even(num))
    }

  }
  def negative(num:Int):String = num match{
    case x if x==0 => "Zero"
    case x if x<0 => "Negative"
  }
  def odd_even(num:Int): String= num%2 match{
    case 0 => "Even"
    case _ => "odd"
  }
5


}
