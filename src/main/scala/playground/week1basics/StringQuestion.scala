package playground.week1basics

object StringQuestion extends App {
  val aString = "Scala course"

  println(aString.take(5).toUpperCase)
  println(aString.take(6).toUpperCase)
  println(aString.substring(1, 5).toUpperCase)
  println(aString.substring(0, 6).toUpperCase)
  println(aString.toUpperCase.substring(0, 5))
//  aString = aString.take(5); println(aString.toUpperCase)
  println(aString.substring(0, 5).toUpperCase)

}
