package algorithmsforinterviews

/**
  * 1.2 SEARCH A SORTED ARRAY FOR k
  * Write a method that takes a sorted array A of integers and a key k
  * and returns the index of first occurrence of k in A.
  * Return -l if k does not appear in A.
  * Write tests to verify your code.
  *
  * Implement a binary search
  */
object SortedArraySearch {
  def binarySearchDrop(x: Array[Int], k: Int): Int = {
    if (x.length==0) return -1

    val mid = x.length/2
    if (x(mid) == k) mid
    else if (x(mid) < k) binarySearchDrop(x.drop(mid + 1), k)
    else binarySearchDrop(x.dropRight(mid + 1), k)
  }

  def binarySearchRecursive(x: Array[Int], k: Int): Int = {
    def searchR(start: Int, end: Int): Int = {
      if (start > end) return -1

      val mid = start + (end-start+1)/2
      if (x(mid) == k) mid
      else if (x(mid) < k) searchR(mid + 1, end)
      else searchR(start, mid - 1)
    }

    searchR(0, x.length-1)
  }

  def binarySearchFunctional(x: Array[Int], k: Int): Int = {
    def searchR(start: Int, end: Int): Int = {
      if (start > end) return -1

      val mid = start + (end-start+1)/2
      x match {
        case (arr:Array[Int]) if (x(mid)==k) => mid
        case (arr:Array[Int]) if (x(mid)>k) => searchR(mid + 1, end)
        case (arr:Array[Int]) if (x(mid)<k) => searchR(mid + 1, end)
      }
    }

    searchR(0, x.length-1)
  }
}
