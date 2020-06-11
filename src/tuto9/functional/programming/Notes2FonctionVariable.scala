package tuto9.functional.programming

object Notes2FonctionVariable extends  App {
  //on peut assigner une fonction à une variable
  val double = (i: Int) => { i * 2 }
  println(double(2))
  println(double(3))
  println("----------------------------------------------------------------------------------------------------")
  val list = List.range(1, 5)
  val doubleListe= list.map(double) //
  doubleListe.foreach(x => println(x))
  //scala peut savoir implicitement le type de retour d'une fonction grace au type inference
  //mais on peut quand meme préciser explicitement le type de retour
  val f: (Int) => Boolean  =  i => {i % 2 == 0 }
  val f1: Int => Boolean  =  i => {i % 2 == 0 }
  val f2: Int => Boolean  =  i => i % 2 == 0
  val f3: Int => Boolean  =  _ % 2 == 0
  //implicit approach:le type de retour n'est pas indiqué
  val add = (x: Int, y: Int) => { x + y }
  val add1 = (x: Int, y: Int) => x + y
  // explicit approach:le type de retour est indiqué
  val add2: (Int, Int) => Int = (x,y) => { x + y }
  val add3: (Int, Int) => Int = (x,y) => x + y
  println("---------------méthode en tant que fonction -------------------------")
  //on peut considérer les méthodes comme des fonctions càd on peut la passée à une fonction
  def modMethod(i:Int) = { i % 2 == 0 }
  def modMethod1(i:  Int) = i % 2 == 0
  def modMethod2(i:Int): Boolean = i % 2 == 0
  def modMethod3(i:  Int): Boolean = { i % 2 == 0 }
  val list1 = List.range(1, 10)
 val filtredList= list1.filter(modMethod)
  filtredList.foreach(println)
  // si on assigne une fonction à un variable le variable devient une fonction (ici cos est une méthode
  val c = scala.math.cos _
  println(c(0))
  //
  val fonction = (x: Int ) => x+1
  val ff = fonction
  println(ff(5))














}
