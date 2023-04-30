package exercises.week2oop

import scala.annotation.tailrec

object LinkedList extends App {

  abstract class LogList {
    def last: String
    def previous: LogList
    def isEmpty: Boolean
    def all: String
    def add(msg: String): LogList
  }

  class Log(head: String, tail: LogList) extends LogList {
    override def add(msg: String): LogList = new Log(msg,this)
    override def previous: LogList = tail
    override def last: String = head
    override def isEmpty: Boolean = head.isEmpty

    override def all: String = {
      @tailrec
      def loop(list: LogList, acc: String): String = {
        if (!list.isEmpty)
          loop(list.previous, acc + list + " ")
        else
          acc.trim
      }
      loop(this, "")
    }

    def allSimplier: String = head + " " + tail.all

    // It's magic!
    override def toString: String = s"${this.head}"
  }

  object Empty extends LogList {
    override def add(msg: String): LogList = new Log(msg, Empty)
    override def previous: LogList = throw new NoSuchElementException
    override def last: String = throw new NoSuchElementException
    override def all: String = ""
    override def isEmpty: Boolean = true
  }

  val list = new Log("INFO_1", new Log("INFO_2", new Log("INFO_3", Empty)))
  println(list.all)

  val list2 = new Log("m1", new Log("m2", new Log("m3", Empty)));
  println(list2.all)
}
