import java.io.File
import scala.io.Source

def fileLines(file: File) =
  Source.fromFile(file).getLines.toList

val filesHere = (new File(".")).listFiles

//def grep(pattern: String) =
  //for (file <- filesHere
       //if file.getName.endsWith(".scala");
       //line <- fileLines(file);
       //trimmed = line.trim
       //if trimmed.matches(pattern)) yield file

def grep(pattern: String) =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala");
    line <- fileLines(file);
    trimmed = line.trim
    if trimmed.matches(pattern)
  } yield file

grep(".*gcd.*").foreach(println)
