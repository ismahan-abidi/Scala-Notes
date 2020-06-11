package tuto1.string.notes

object Note2Splitting {
  def main(args: Array[String]): Unit = {
    val str = "haroun abidi"
    val array = str.split(" ")
   array.foreach(x => println(x))
    val s = "eggs, milk, butter, Coco Puffs"
    val array1=s.split(",")
    array1.map(x => x.trim).foreach(println)
    val string1 = "     kouki abdelmonem     "
    println(string1)
    //la méthode trim est  utilisé pour omettre(supprimer) les espaces de début et de fin dans la chaîne indiquée.
    println(string1.trim)
    //en scala la methode split est surchargée si elle prend en parametre un string alors on appele la methode de la classe string de java
    // et si elle prend un caractere on utulise la classe scala StringLike
    val ss ="hello world".split(' ')
    ss.foreach(println)
  }

}
