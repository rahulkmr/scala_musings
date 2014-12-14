import scala.io.Source

object ForTest extends Application {
  val filesHere = (new java.io.File("./src/main/scala")).listFiles

  def fileLines(file: java.io.File) =
    Source.fromFile(file).getLines.toList

  def grep(pattern: String) =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } println(file + ": " + line.trim)

  grep(".*object.*")
}
