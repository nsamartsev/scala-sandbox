package playground.tinkoff.ch6

object SplitListOfIntToOddEven extends App {
  val list = List(0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1)
  private val left = list.filter(_ == 0)
  private val right = list.filter(_ != 0)
  printList(left)
  printList(right)

  private def printList(array: List[Int]): Unit = {
    for (i <- 0 to array.length - 1) {
      if (i == array.length - 1)
        print(s"${array(i)}\n")
      else
        print(s"${array(i)},")
    }
  }
}
