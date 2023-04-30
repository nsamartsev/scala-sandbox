package exercises.week3fp

import scala.util.Try


object ServerConnector extends App {
  val Host = "127.0.0.1"
  val Port = "8080"
  val ApiRoute = "/api/index.html"

  object HttpService {
    def apply(host: String, port: String): Connection = new Connection()
  }

  class Connection {
    def get(url: String) = "<h1>Welcome everyone.</h1>"
  }

  def render(s: String) = print(s)

  def safeConnection(host: String, port: String): Try[Connection] =
    Try(HttpService(host, port)).orElse(throw new RuntimeException("Someone else took the port"))

  def safeUrl(connect: Connection): Try[String] =
    Try(connect.get(ApiRoute)).orElse(throw new RuntimeException("Connection was Interrupted"))

  safeConnection(Host, Port)
    .foreach(connect => safeUrl(connect)
      .map(s => render(s))
    )
}
