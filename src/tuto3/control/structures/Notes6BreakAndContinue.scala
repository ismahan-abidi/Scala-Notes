package tuto3.control.structures
import util.control.Breaks._
object Notes6BreakAndContinue {
  def main(args: Array[String]): Unit = {
    println("\n=== BREAK EXAMPLE ===")
    breakable {
      for (i <- 1 to 10) {
        println(i)
        if (i > 4) break // break out of the for loop
      }
    }
    println("\n=== CONTINUE EXAMPLE ===")
    val str = "peter piper picked a peck of pickled peppers"
    var numPs = 0
    for (i <- 0 until str.length) {
      breakable {
        if (str.charAt(i) != 'p') {
          println(str.charAt(i))
          break // break out of the 'breakable', continue the outside loop
        } else {
          numPs += 1
        }
      }
    }
    println("Found " + numPs + " p's in the string.")
  }

}
