package tuto12.collection

object test extends App{
  //todo tuple en scala
  //collection des données
  val t :Tuple2[String,Int]=("ismahan",28)
  println(t._1)
  println(t._2)
  val t1=(35,"haroun") //par type inférence t1 est un Tuple2[Int, String]
  println(t1._1)



}
