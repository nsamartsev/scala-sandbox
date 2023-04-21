package playground.tinkoff.ch5

object PatternMatching extends App {
  val input1: List[String] = List(
    "oleg",
    "oleg@email.com",
    "7bdaf0a1be3",
    "a8af118b1a2",
    "28d74b7a3fe"
  )

  val input2: List[String] = List(
    "oleg oleg@email.com",
    "7bdaf0a1be3",
    "a8af118b1a2",
    "28d74b7a3fe"
  )

  val login = "([a-zA-Z]+)".r
  val email = "(\\w+@\\w+\\.\\w+)".r
  val login_with_email = "([a-zA-Z]+)\\s(\\w+@\\w+.\\w+)".r

  def extractNameAndEmail(input: List[String]): String =
    input match {
      case login(first) :: email(second) :: rest => s"$first ${second.replaceAll("\\w+@", "")}"
      case login_with_email(l, e) :: rest => s"$l ${e.replaceAll("\\w+@", "")}"
      case _ => s"invalid"
    }

  assert(extractNameAndEmail(input1) == "oleg email.com")
  assert(extractNameAndEmail(input2) == "oleg email.com")
}
