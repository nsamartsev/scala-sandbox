package playground.tinkoff.ch6

object StringProcessing extends App {
  trait StringProcessor {
    def process(input: String): String
  }

  val tokenDeleter = new StringProcessor {
    override def process(input: String): String = {
      input.replaceAll("[,;:]", "")
    }
  }

  val shortener = new StringProcessor {
    override def process(input: String): String = {
      input.toLowerCase
    }
  }

  val toLowerConvertor = new StringProcessor {
    override def process(input: String): String = {
      var result: String = input
      if (input.length > 20) {
        result = input.substring(0, 19) + "..."
      }
      result
    }
  }
}
