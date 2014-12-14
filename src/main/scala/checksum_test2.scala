import Checksum.calculate

object ChecksumTest2 extends Application {
  for (season <- List("fall", "winter", "spring"))
    println(season + ":" + calculate(season))
}
