package exercises.week3fp

object GuardPatternMatching extends App {

  def guard[A](data: A, maxLength: Int): String = {
    data match {
      case data: List[Any] if data.length <= maxLength => "Задан список List допустимой длины"
      case data: List[Any] if data.length >= maxLength => "Длина списка больше максимально допустимого значения"
      case data: String if data.length <= maxLength => "Длина строки не превышает максимально допустимого значения"
      case data: String if data.length >= maxLength => "Получена строка недопустимой длины"
      case _ => "Что это? Это не строка и не список"
    }
  }

  println(guard(List(1, 2, 3), 3))
  println(guard(List(1, 2, 3), 2))
  println(guard("Строка", 6))
  println(guard("Строка", 3))
  println(guard(42, 3))
}
