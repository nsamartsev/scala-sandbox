package exercises.week3fp

object ProgrammingLanguageFilter extends App {
  val progLanguages = List("java", "scala", "python")
  val lngAbbrev = List("JA", "SCA", "PY")

  // 1 way
  // val result = for {
  //   abrv <- lngAbbrev
  //   lng <- progLanguages
  // } yield (abrv, lng)

  // 2 way
  val out = progLanguages
    .flatMap(lng => lngAbbrev.map(abrv => (abrv, lng)))
    .filter({
      case (a, l) => l.contains(a.toLowerCase())
    })

  val test = "abcderf"
  println(test.map(print))
  println(out)

  val out2 = progLanguages
    .flatMap(lng => lngAbbrev.map(abrv => (abrv, lng)))
    .filter((a, l) => l.contains(a.toLowerCase()))
  println(out2)

}
