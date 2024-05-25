def sum(a: Int, b: Int, c: Int) = a + b + c
def as() =  println("i am here")



object Main {
  def main(args: Array[String]): Unit = {
        val a = sum
        // a: (Int, Int, Int) => Int
        // val b = sum(1, _: Int, 3) 
        // b: (Int) => Int
        // b(2)
        println(a(1,2,3))
        as()
        // res10: Int = 6

  }
}