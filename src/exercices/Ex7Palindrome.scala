package exercices

object Ex7Palindrome extends App {
  def isPalindrome_func(s: String): Boolean = {
    //abccba ==> palindrome  // abcdjdcba ==> palindrome//  acdbg n'est pas symétrique donc n'est pas palindrome
    //how to get char by index in scala
    // La mariée ira mal
    var str1 = ""
    for (i <- 0 until s.length) {
      val a = s.charAt(s.length-1-i)
      str1 = str1 + a
   //  println(str1)
    }
    str1 == s
  }
  def isPalindrome2(s:String):Boolean = {
   var testpalindrom = true
    var i = 0
    while(i <= s.length/2 && testpalindrom){
      val a = s.charAt((i))
      testpalindrom = a==s.charAt(s.length-1-i)
      i=i+1
    }
    testpalindrom
  }
  def isPalindrome2Recurcive(s:String):Boolean = {
   // println(s)
    if(s.length==0||s.length==1) true
    else if(s.charAt(0) !=s.charAt(s.length-1)) false
    else
      isPalindrome2Recurcive(s.substring(1,s.length-1))

  }
/*
  println(isPalindrome_func("La mariée ira mal"))
  println(isPalindrome_func("abbvcvbba"))
  println(isPalindrome2("abcdjdcba"))
  println(isPalindrome2("aze"))*/
 println( isPalindrome2Recurcive("caaaa"))
  println( isPalindrome2Recurcive("abcdcba"))
}
