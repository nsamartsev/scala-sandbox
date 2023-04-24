package exercises.week1basics

object ReversePhrase extends App {

  def reversePhrase(in: String): String = {
    in
      .split("\\s+")
      .toList
      .reverse
      .mkString(" ")
  }

  val inputOne: String = "I like Scala"
  val inputTwo: String = "I like        Scala"

  assert(reversePhrase(inputOne).equals("Scala like I"))
  assert(reversePhrase(inputTwo) == "Scala like I")
}
