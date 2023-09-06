object Notes_About_Strings {
  def main(args: Array[String]): Unit = {
    val firstName = "John"
    val mi = 'C'
    val lastName = "Doe"
    val name = s"$firstName $mi $lastName"
    println(s"Name: $firstName $mi $lastName")
  }
}
