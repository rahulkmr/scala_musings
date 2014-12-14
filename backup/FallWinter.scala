import Checksum.calculate

object FallWinter extends App {
  for (season <- List("fall", "winter", "spring"))
    println(season + ": " + calculate(season))
}
