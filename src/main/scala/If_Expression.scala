object If_Expression {
  def main(args: Array[String]): Unit = {
    var a = 4
    var b = 5
    val minValue = if (a < b) a else b
    if (a < b) {
      println(s"$minValue is less than $b")
    } else {
      println(s"$minValue is greater than $b")
    }

  }
}
