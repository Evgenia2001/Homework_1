package lecture
import scala.io.Source
import scala.io.BufferedSource
object LectureQuestion {
  def fileSum (filename: String): Int = {
    var sum = 0
    val file: BufferedSource = Source.fromFile(filename)
    for (line <- file.getLines()){
      val splits: Array[String] = line.split("#")
      for (a <- splits) {
        sum = sum + a.toInt
      }
    }
    sum
  }
  def main (args: Array[String]): Unit = {
    val filename = "src/main/scala/lecture/text.txt"
     println(fileSum(filename))
  }
}
