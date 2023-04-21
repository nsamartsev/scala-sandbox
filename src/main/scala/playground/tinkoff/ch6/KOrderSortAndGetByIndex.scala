package playground.tinkoff.ch6

object KOrderSortAndGetByIndex extends App {
  var list: List[Int] = List(3, 8, 1, 12, 23)
  println(list.sorted.apply(3))
  println(list.toString())
}
