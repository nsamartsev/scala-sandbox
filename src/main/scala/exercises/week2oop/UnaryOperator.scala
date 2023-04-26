package exercises.week2oop

object UnaryOperator extends App {

  class Person(val name: String) {
    def unary_+ : Person = {
      new Person(this.name + " NoSurname")
    }
  }

  val person = new Person("Bob")
  println((+person).name)

}
