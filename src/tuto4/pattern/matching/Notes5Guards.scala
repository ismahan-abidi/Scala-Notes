package tuto4.pattern.matching

object Notes5Guards extends App {
  //guards permet d'ajouter des conditions apres le case statement
  f(3)
  f(19)
  f(25)
  f(50)
  println("*****************")
  g("abcd")
  g("ismahanbcdef")
  g("gggggggggggggg")
  println("*****************")
  valuesOfObject(1)
  valuesOfObject(3)
  valuesOfObject(8)
  println("*****************")
  var stock =  Stock("XYZ", 122)
  referenceClassGuards(stock)

  def f(i: Int): Unit = i match {
    case a if 0 to 9 contains a => println("0-9 range: " + a)
    case a if 10 to 19 contains a => println("10-19 range: " + a)
    case c if 20 to 29 contains c => println("20-29 range: " + c)
    case _ => println("Hmmm...")
  }

  def g(str: String): Unit = str match {
    case s1 if s1 contains "ab" => println(s"s1 est $s1 ")
    case s2 if s2 contains "bc" => println(s"s2 est $s2 ")
    case _ => println("okkkkkkkkkkk")
  }

  def valuesOfObject(num: Int): Unit = num match {
    case x if x == 1 => println("one, a lonely number")
    case x if (x == 2 || x == 3) => println(x)
    case _ => println("some other value")
  }

  def referenceClassGuards(stock: Stock) = stock match {
    case x if (x.symbol == "XYZ" && x.price < 20) => buy(x)
    case x if (x.symbol == "XYZ" && x.price > 50) => sell(x)
    case _ => // do nothing
  }
  def buy(stock: Notes5Guards.Stock)= println("bying...")

  def sell(stock: Notes5Guards.Stock)=println("selling...")

  case class Stock(symbol: String, price: Int)

}

