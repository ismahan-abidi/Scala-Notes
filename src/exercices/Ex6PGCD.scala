package exercices

object Ex6PGCD extends App {
  def pgcd_iteratif(x: Int, y: Int): Int = {
    if (x == 0) return y
    else if (y == 0) return x
    else {
      var pgcd = 0
      var r = 0
      var b = 0
      if (x > y) {
        pgcd = y
        r = x % y
        b = y
      } else {
        pgcd = x
        r = y % x
        b = x
      }
      while (r != 0) {
        println("r = " + r + " , b = " + b)
        pgcd = r
        val b1 = r
        r = b % r
        b = b1
      }
      pgcd
    }


  }

  def pgcd_recur(x: Int, y: Int): Int = {
    if (x == 0) return y
    else if (y == 0) return x
    else {
      var r = 0
      var pgcd = 0
      if (x > y) {
        r = x % y
        pgcd = y
      } else {
        r = y % x
        pgcd = x
      }
      println("r = " + r + " , pgcd = " + pgcd)
      if (r == 0)
        pgcd
      else pgcd_recur(pgcd, r)
    }
  }

  println(pgcd_iteratif(782, 221))
  println(pgcd_recur(782, 221))

}
