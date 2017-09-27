package ScalaBasics

object VectorOperations{
  case class Vec2D(x: Int, y: Int) {
    //override toString
    override def toString: String = {
      s"($x, $y)"
    }

    def + (v2: Vec2D): Vec2D = {
      val addX = x + v2.x
      val addY = y + v2.y
      Vec2D(addX,addY)
    }

    def - (v2: Vec2D): Vec2D = {
      val subX = x - v2.x
      val subY = y - v2.y
      Vec2D(subX,subY)
    }

    def * (v2: Vec2D): Vec2D = {
      val multX = x * v2.x
      val multY = y * v2.y
      Vec2D(multX,multY)
    }
  }

    def main(args: Array[String]) = {
      //Test
      val v1 = Vec2D(2,3)
      val v2 = Vec2D(-1,0)
      println(s"v1 = $v1")
      println(s"v2 = $v2")

      //add
      val v3 = v1 + v2
      println(s"\nv1 + v2 = $v3")

      //subtract
      val v4 = v1 - v2
      println(s"\nv1 - v2 = $v4")

      //multiply
      val v5 = v1 * v2
      println(s"\nv1 * v2 = $v5")

    }
}
