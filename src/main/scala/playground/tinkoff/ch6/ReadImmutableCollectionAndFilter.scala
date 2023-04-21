package playground.tinkoff.ch6

import scala.io.StdIn

object ReadImmutableCollectionAndFilter extends App {
  val test: List[Int] = Iterator
    .continually(StdIn.readLine())
    .takeWhile(_ != "END")
    .map(_.toInt)
    .toList

  val sum = test
    .zipWithIndex
    .filter(i => i._2 % 2 != 0)
    .map(_._1 * 2)
    .sum

  println(sum)

}
