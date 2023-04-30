package exercises.week3fp

import org.graalvm.collections.Pair

import scala.io.StdIn
import scala.util.matching.Regex

object UserDataPattern extends App {

  case class FullName(name: String, surname: String)

  object FullName {
    def apply(name: String, surname: String): FullName =
      new FullName(name, surname)

    def unapply(full: FullName): Some[(String, String)] =
      Some((full.name, full.surname))
  }

  val input = Option(StdIn.readLine().split(" ")).orElse(null)
  val inArr: Array[String] = input.get
  val fullName = FullName(inArr(0), inArr(1))

  val userDataPattern: Regex = "^([a-zA-Z]+)\\s([a-zA-Z]+)$".r

  def initial(nameSurname: String): String =
    nameSurname match {
      case userDataPattern(n, s) => s"${n.take(1).toUpperCase}. ${s.take(1).toUpperCase}."
      case _ => "Oops, something is wrong"
    }
  println(initial(fullName.name + " " + fullName.surname))
  
}


