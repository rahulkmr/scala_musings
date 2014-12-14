import java.io.File

val filesHere = (new File(".")).listFiles
filesHere.foreach(println)
//for (file <- filesHere)
  //println(file)
