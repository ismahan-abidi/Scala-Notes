package tuto1.string.notes

object Note2Splitting {
  def main(args: Array[String]): Unit = {
    val str = "haroun abidi"
    val array = str.split(" ")
   array.foreach(println)
    val s = "eggs, milk, butter, Coco Puffs"
    val array1=s.split(",")
    array1.map(x => x.trim).foreach(println)
    val string = " kouki abdelmonem"
    println(string)
    println(string.trim)
    //en scala la methode split est surcharge si elle prend en parametre un string alors on appele la methode de la classe string de java
    // et si elle prend un caractere on utulise la classa scala StringLike
    val ss ="hello world".split(' ')
    ss.foreach(println)
  }

}
