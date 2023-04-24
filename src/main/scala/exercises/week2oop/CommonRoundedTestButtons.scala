package exercises.week2oop

object CommonRoundedTestButtons extends App {

  class Button(val label: String) {
    def this() = this("test") // FIXME test #3

    def click(): String = {
      s"button -${this.label}- has been clicked"
    }
  }

  class RoundedButton(override val label: String) extends Button {
    override def click() : String = {
      s"rounded ${super.click()}"
    }
  }

  class TestButton extends Button {
    override def click(): String = {
      s"test button -test- has been clicked"
    }
  }

  val button = new Button("save")
  val roundedButton = new RoundedButton("send")
  val defaultButton = Button()
  println(button.click())
  println(roundedButton.click())
  println(defaultButton.click())
}
