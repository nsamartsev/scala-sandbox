package playground.tinkoff.ch6

object ForComptehentionPlayground extends App {
  val nums = List(2, 5, 1, 7, 4)

  val nums2 = nums.map(x => x * 2)

  val nums3 =
    for (x <- nums)
      yield x * 2

  val nums4 = for {
    x <- nums
    y <- 1 to x if y > 3
    y2 = y * 2
    z <- nums if z < y2
  } yield z + y2 - y

  for { x <- List(1,2,3,4) } x

  for { (k,v) <- Map("a" -> 1, "b" -> 2) }
    yield print(k)
  for { x <- Some(1) ; y <- None }
    yield print((x, y))
}
