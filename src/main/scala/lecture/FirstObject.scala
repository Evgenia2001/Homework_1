package lecture

object FirstObject {
  def computeShippingCost (weight: Double): Double = {

    if (weight < 31.0){
      5.0
    } else {
      5.0 + (weight - 30.0) * 0.25
    }
  }

  def main (args: Array[String]): Unit = {
    println(computeShippingCost(40.0))
    println(computeShippingCost(31.0))
    println(computeShippingCost(30.0))
  }
}
