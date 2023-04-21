package playground.tinkoff.ch3

object Fibonacci extends App {
  private def fibs(num: Int): Int = {
    if (num == 1)
      1
    else if (num == 2)
      1
    else
      fibs(num - 1) + fibs(num - 2): Int
  }

  assert(fibs(1) == 1)
  assert(fibs(2) == 1)
  assert(fibs(3) == 2)
  assert(fibs(4) == 3)
  assert(fibs(5) == 5)
  assert(fibs(6) == 8)
  assert(fibs(7) == 13)
  assert(fibs(8) == 21)
  assert(fibs(9) == 34)
  assert(fibs(10) == 55)
}
