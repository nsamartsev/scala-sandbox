package playground.tinkoff.ch4

import scala.io.StdIn

object BankGift extends App {
  var accountAmounts = List(100, 200, 500, 300, 700)
  var newAmounts = accountAmounts.map(amount => sendGift(amount, getGift()))

  def sendGift(currentAmount: Int, gift: => Int) = {
    if (currentAmount >= 500)
      currentAmount + gift
    else
      currentAmount
  }

  val getGift = () => {
    println("The gift is received")
    StdIn.readLine.toInt
  }

}
