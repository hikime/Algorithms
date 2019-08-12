import scala.collection.mutable.ArrayBuffer
import scala.util.Random

object SelectionSort {
  def main(args: Array[String]): Unit = {
    val arr = ArrayBuffer.fill(10)(Random.nextInt(100))
    print(selection(arr))
  }
  // Selection sort
  def selection(arr: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    for(i <- 0 until  arr.length) {
      var min = i
      for (j <- i until arr.length) {
        if (arr(j) < arr(min)) {
          min = j
        }
        swap(arr, i, min)
      }
    }
    arr
  }

  // Swap numbers
  def swap(arr: ArrayBuffer[Int], i: Int, j: Int): Unit = {
    val temp = arr(i)
    arr(i) = arr(j)
    arr(j) = temp
  }
}
