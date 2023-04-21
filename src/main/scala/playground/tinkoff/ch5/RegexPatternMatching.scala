package playground.tinkoff.ch5

object RegexPatternMatching extends App {
  private val inputOne: List[String] = List(
    "oleg",
    "oleg@email.com",
    "7bdaf0a1be3",
    "a8af118b1a2",
    "28d74b7a3fe"
  )

  private val inputTwo: List[String] = List(
    "oleg oleg@email.com",
    "7bdaf0a1be3",
    "a8af118b1a2",
    "28d74b7a3fe"
  )

  private val loginRegex = "([a-zA-Z]+)".r
  private val emailRegex = "(\\w+@\\w+\\.\\w+)".r
  private val loginAndEmailRegex = "([a-zA-Z]+)\\s(\\w+@\\w+.\\w+)".r

  private def extractNameAndEmail(input: List[String]): String =
    input match {
      case loginRegex(l) :: emailRegex(e) :: rest => s"$l ${e.replaceAll("\\w+@", "")}"
      case loginAndEmailRegex(l, e) :: rest => s"$l ${e.replaceAll("\\w+@", "")}"
      case _ => s"invalid"
    }

  assert(extractNameAndEmail(inputOne) == "oleg email.com")
  assert(extractNameAndEmail(inputTwo) == "oleg email.com")
  println("Tests OK.")
}
