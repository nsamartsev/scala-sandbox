package exercises.week2oop

object AbstractAndAnonymEventAndListenerInheritance extends App {
  abstract class Event {
    def trigger(eventName: String): Unit
  }

  class Listener(val eventName: String, var event: Event) {
    def register(evt: Event): Unit = {
      event = evt
    }
    def sendNotification : Unit = {
      event.trigger(eventName)
    }
  }

  val notification: Listener = new Listener("mousedown", null)

  notification.register(new Event() {
    override def trigger(eventName: String): Unit = {
      println(s"trigger $eventName event")
    }
  })

  notification.sendNotification

}
