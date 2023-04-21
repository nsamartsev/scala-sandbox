package playground.week1basics

object LinkPrint extends App {
  val link = "https://stepik.org"
  println(s"The link is $link.toUpperCase")
//  println(link :+ 'catalog')
  println(raw"The link is \t $link")
  println(link :++ "/catalog")
//  println(s"The link is $linc")
  println(s"The link is link")
  println(s"The link is \t $link")
  println(s"The link is ${link.toUpperCase}")

}
