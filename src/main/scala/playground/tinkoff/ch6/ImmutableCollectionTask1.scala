package playground.tinkoff.ch6

object ImmutableCollectionTask1 extends App {
  val list = List(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150)
  val sorted = list
    .filter((x) => x < 100)
    .filter(_ % 4 == 0)
    .map(_ / 4)
    .dropRight(1)
  
  /**
   * REQUIREMENT
   */
  for (i <- 0 to sorted.length - 1) {
    println(sorted(i))
  }
}
