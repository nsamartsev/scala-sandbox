package playground.week1basics

import scala.annotation.tailrec

object PowerOfTwo extends App {
  private def powerOfTwo(n: Int): BigInt = {
    @tailrec
    def loop(result: BigInt, acc: BigInt): BigInt = {
      if (n == result) acc
      else loop(result + 1, 2 * acc)
    }
    loop(0, 1)
  }

  assert(powerOfTwo(2) == 4)
}
