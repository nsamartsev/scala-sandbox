package exercises.week2oop

import scala.annotation.tailrec

object LogSystem extends App {

  class Logger(val msgNum: Int = 0) {
    def info = {
      println("INFO New Message")
      new Logger(msgNum + 1)
    }

    @tailrec
    final def info(msgNum: Int): Logger = {
      if (msgNum <= 0)
        this
      else
        info.info(msgNum - 1)
    }

    def print = println(msgNum)
  }

  val logger: Logger = Logger(10)
  logger.info
  logger.info(5)
}
