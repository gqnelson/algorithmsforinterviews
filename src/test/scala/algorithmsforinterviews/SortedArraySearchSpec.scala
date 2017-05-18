package algorithmsforinterviews

import algorithmsforinterviews.SortedArraySearch.search
import algorithmsforinterviews.SortedArraySearch.searchClassic
import org.scalatest.FlatSpec

class SortedArraySearchSpec extends FlatSpec {
  "Binary Search" should "find" in {
    assert(search(Array(1, 2, 3, 4), 3) == 2)
    assert(search(Array(10, 20, 30, 40), 30) == 2)
  }

  "Binary Search" should "will not fin" in {
    assert(search(Array(1, 2, 3, 4), 10) == -1)
    assert(search(Array(10, 20, 30, 40), 1) == -1)
  }

  "Classic Binary Search" should "find" in {
    assert(searchClassic(Array(1, 2, 3, 4), 3) == 2)
    assert(searchClassic(Array(10, 20, 30, 40), 40) == 3)
  }

  "Classic Binary Search" should "will not find" in {
    assert(searchClassic(Array(1, 2, 3, 4), 10) == -1)
    assert(searchClassic(Array(10, 20, 30, 40), 1) == -1)
  }


}
