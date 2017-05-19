package algorithmsforinterviews

/*
  Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
  http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
object MaxSum {
  def maxSumIterative(x: Array[Int]): Int = {
    var maxSum = x(0)
    for(i <- 0 until x.length) {
      var sum = 0
      for(j <- i until x.length) {
        sum += x(j)
        if (sum > maxSum) maxSum = sum
      }
    }
    maxSum
  }

  def maxSumSinglePass(x: Array[Int]): Int = {
    var maxSoFar = x(0)
    var maxEndingHere = 0

    for(i <- 0 until x.length) {
      maxEndingHere = maxEndingHere + x(i)
      if (maxSoFar < maxEndingHere) maxSoFar = maxEndingHere
      if (maxEndingHere < 0) maxEndingHere = 0
    }
    maxSoFar
  }

  // https://en.wikipedia.org/wiki/Maximum_subarray_problem#Kadane.27s_algorithm
  def maxSumSinglePassV2(x: Array[Int]): Int = {
    var maxSoFar, maxEndingHere = x(0)

    for(i <- 1 until x.length) {
      maxEndingHere = Math.max(x(i), maxEndingHere + x(i))
      maxSoFar = Math.max(maxSoFar, maxEndingHere)
    }
    maxSoFar
  }

  //Returns 0 for all negative values
  def maxSumScanLeft(x: Array[Int]): Int = {
    x.scanLeft(0)((maxSum, n) => math.max(0, maxSum + n)).max
  }

  def maxSumScanLeftV2(x: Array[Int]): Int = {
    x.tail.scanLeft(x.head)((maxSum, x) => math.max(x, maxSum+x)).max
  }
}
