class Instrument
trait Saxo(
    def play() =  println("i am here")
)

class Baryton extends Instrument {

  override def toString = "Baryton"
}


object Main {
  def main(args: Array[String]): Unit = {
        val baryton = new Baryton() with Saxo
        println(baryton)
  }
}