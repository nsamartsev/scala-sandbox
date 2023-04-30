package exercises.week3fp

import scala.util.matching.Regex

object RegexPattern extends App {
  def saveContactInformation(contact: String): Unit = {
    val emailPattern: Regex = """^(\w+)@(\w+(.\w+)+)$""".r
    val phonePattern: Regex = """^(\d{3}-\d{3}-\d{4})$""".r

    contact match {
      case emailPattern(localPart, domainName, _) =>
        println(s"Hi $localPart, we have saved your email address.")
      case phonePattern(phoneNumber) =>
        println(s"Hi, we have saved your phone number $phoneNumber.")
      case _ =>
        println("Invalid contact information, neither an email address nor phone number.")
    }
  }

  saveContactInformation("123-456-7890")
  saveContactInformation("JohnSmith@sample.domain.com")
  saveContactInformation("2 Franklin St, Mars, Milky Way")
}
