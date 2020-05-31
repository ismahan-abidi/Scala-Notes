package tuto4.pattern.matching

object Notes1MultipleConditions {
  def main(args: Array[String]): Unit = {
   multiple_conditions(4)
    multiple_conditions(3)
    multiple_condition_string("hhhh")
    multiple_condition_string("start")

  }
  //s'il ya plusieur conditions qui fait le meme traitement on peut les rassemble dans le meme case statement et on les separant par un pipe |
  def multiple_conditions (x: Int) :Unit =  x match{
    case 1 | 3 | 5 | 7 | 9 => println("odd (impair)")
    case 2 | 4 | 6 | 8 | 10 => println("even (pair)")
  }
  //les conditions multiples sont appliquer sur tout les types
  def multiple_condition_string(x:String) = x match{
    case "start" | "go" => println("starting")
    case "stop" | "quit" | "exit" => println("stopping")
    case _ => println("doing nothing")
  }


}
