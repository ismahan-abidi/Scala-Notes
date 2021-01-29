package exercices

object Ex8Tableau extends App {
  //si l'élément e existe dans le tableau array return true else return false
  def isElementExit[T](array: Array[T], e: T): Boolean = {
    var testExist = false
    var i = 0
    while (i < array.length && !testExist) {
      testExist = array(i) == e
      i = i + 1
    }
    testExist
  }

  println(isElementExit(Array('a', 'b', 'c', 'd'), 'e'))
  println(isElementExit(Array('a', 'b', 'e', 'c', 'd'), 'e'))
}
