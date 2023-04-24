package exercises.week1basics

import scala.annotation.tailrec

object AddXRecursive extends App {

  val fArgs: Array[Int] = Array(10, 1, 5)
  def recCount(fArgs: Array[Int]): Int = {
    @tailrec
    def loop(x: Int, y: Int, n: Int): Int = {
      if (n > 0)
        loop(x + y, y, n - 1)
      else
        x
    }
    loop(fArgs(0),fArgs(1),fArgs(2))
  }

  val result: Int = recCount(fArgs)
  val len: Int = result.toString.length
  def printNumbers(len: Int) : Unit = {
    @tailrec
    def loop(len: Int): Unit = {
      if (len == 0) {
        print("is the result")
      } else {
        print(s"${result} ")
        loop(len - 1)
      }
    }
    loop(len)
  }

  printNumbers(len)
}
