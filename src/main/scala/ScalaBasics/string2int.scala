package ScalaBasics

object String2Int {
  def main(args: Array[String]) = {
    val str: List[String] = List("Simple", "list", "of", null, "strings", "")
    println(s"Strings: $str")

    //Convert to ints
    val int = for {
      s <- str
      val length = s match {//pattern matching
        case null => 0
        case "" => -1
        case _ => s.length
      }

    } yield  length //list
    println(s"Ints:\t $int")
  }
}
