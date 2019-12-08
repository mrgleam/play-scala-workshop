import scala.io.Source
import scala.util.{Try,Success,Failure}

def readTextFile(filename: String): Try[List[String]] = {
  Try(Source.fromFile(filename).getLines.toList)
}

val filename = "no-such-file.txt"
readTextFile(filename) match {
  case Success(lines) => lines.foreach(println)
  case Failure(f) => println(s"Show error: $f")
}