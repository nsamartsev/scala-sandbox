package lectures.week3fp

import scala.annotation.tailrec

object FunctionsFP extends App {
  /**
   * H_O_F
   */

  @tailrec
  def nTimes(f: Int => Int, x: Int, n: Int): Int = {
    if (n <= 0) x
    else nTimes(f, f(x), n - 1)
  }

  val increment = (x: Int) => x + 1

  println(nTimes(increment, 0, 3)) // выведет 3

  def add(x: Int, y: Int) = x + y
  println(add(1, 2)) // 3

  def add(x: Int) = (y: Int) => x + y
  println(add(1)(2)) // 3

//  def add(x: Int)(y: Int) = x + y
//  println(add(1)(2))

  /**
   * H_O_F. Currying Functions
   */

  def curryingNTimes(f: Int => Int, n: Int): Int => Int = {
    if (n <= 0) (x: Int) => x // лямбда-функция, что просто берет и возвращает значение
    else (x: Int) => curryingNTimes(f, n - 1)(f(x))
  }

  println(curryingNTimes(increment, 3)(0))

  def someFunc: Int => Function1[Int, Int] = new Function1[Int, Function1[Int, Int]] {
    override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(y: Int): Int = x + y
    }
  }

  println(someFunc(5)(2))


}
