package playground.tinkoff.ch3

import scala.io.StdIn.readLine

object ReverseStringFromIndex extends App {
    private val sentence: String = "foobarbaz"
    private val startIndex: Int = 2
    private val endIndex: Int = 6

    val substring = sentence.slice(startIndex, endIndex + 1)
    private val full = sentence.split(substring)

    val result = full(0).concat(substring.reverse).concat(full(1))

    assert (result == "fobraboaz")
}
