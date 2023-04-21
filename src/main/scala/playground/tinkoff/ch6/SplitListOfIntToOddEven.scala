package playground.tinkoff.ch6

object SplitListOfInt extends App {
  val list = List(0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1)
  val left = list.filter(_ == 0)
  val right = list.filter(_ != 0)
  printList(left)
  printList(right)

}
