package playground.tinkoff.ch3

import scala.io.StdIn.readLine

object Main {
  def main(args: Array[String]): Unit = {
//    val line: String = StdIn.readLine()
//    val startIndex = Character.getNumericValue(line(0))
//    val endIndex = Character.getNumericValue(line(2))
//    val sentence: String = StdIn.readLine()

    val sentence: String = "foobarbaz"
    val startIndex: Int = 2
    val endIndex: Int = 6

    val sub = sentence.slice(startIndex, endIndex + 1)
    val mass = sentence.split(sub)

    val result = mass(0).concat(sub.reverse).concat(mass(1))
    println(result)

    test
  }

  def test: Unit = {
    val idx: Array[Int] = readLine().split(" ").map(_.toInt)
    val sentence: String = readLine()
    val sub = sentence.slice(idx(0), idx(1) + 1)
    val massString = sentence.split(sub)
    println(massString(0).concat(sub.reverse).concat(massString(1)))
  }

}
