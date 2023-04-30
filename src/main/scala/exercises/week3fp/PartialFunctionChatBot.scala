package exercises.week3fp

object PartialFunctionChatBot extends App {
  val aPartialFunction: PartialFunction[String, String] = {
    case "hello" => s"Hi, I'm Bot!"
    case "bye" => s"Bye-bye"
    case "what's up" => s"sup-sup"
  }

  val chatbot = aPartialFunction.lift

  scala.io.Source.stdin.getLines().map(chatbot).foreach(println)
}
