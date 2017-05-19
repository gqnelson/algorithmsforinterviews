package algorithmsforinterviews

import algorithmsforinterviews.SortedArraySearch.binarySearchDrop
import algorithmsforinterviews.SortedArraySearch.binarySearchRecursive
import algorithmsforinterviews.SortedArraySearch.binarySearchFunctional
import org.scalatest.FlatSpec

class SortedArraySearchSpec extends FlatSpec {
  "Binary Search" should "find" in {
    assert(binarySearchDrop(Array(1, 2, 3, 4), 3) == 2)
    assert(binarySearchDrop(Array(10, 20, 30, 40), 30) == 2)
  }

  "Binary Search" should "will not fin" in {
    assert(binarySearchDrop(Array(1, 2, 3, 4), 10) == -1)
    assert(binarySearchDrop(Array(10, 20, 30, 40), 1) == -1)
  }

  "Classic Binary Search" should "find" in {
    assert(binarySearchRecursive(Array(1, 2, 3, 4), 3) == 2)
    assert(binarySearchRecursive(Array(10, 20, 30, 40), 40) == 3)
  }

  "Classic Binary Search" should "will not find" in {
    assert(binarySearchRecursive(Array(1, 2, 3, 4), 10) == -1)
    assert(binarySearchRecursive(Array(10, 20, 30, 40), 1) == -1)
  }

  "Functional Binary Search" should "find" in {
    assert(binarySearchFunctional(Array(1, 2, 3, 4), 3) == 2)
    assert(binarySearchFunctional(Array(10, 20, 30, 40), 40) == 3)
  }

  "Functional Binary Search" should "will not find" in {
    assert(binarySearchFunctional(Array(1, 2, 3, 4), 10) == -1)
    assert(binarySearchFunctional(Array(10, 20, 30, 40), 1) == -1)
  }

}
