package algorithmsforinterviews

import org.scalatest.FlatSpec

class MaxSumSpec extends FlatSpec {
  "Max sum iterative of" should "equal" in {
    assert(MaxSum.maxSumIterative(Array(1, 2, 3, 4)) == 10)
    assert(MaxSum.maxSumIterative(Array(1, 2, 3, -4)) == 6)
    assert(MaxSum.maxSumIterative(Array(-1, 2, 3, 4)) == 9)
    assert(MaxSum.maxSumIterative(Array(-2, -3, 4, -1, -2, 1, 5, -3)) == 7)
    assert(MaxSum.maxSumIterative(Array(-1, -2, -3, -4)) == -1)
    assert(MaxSum.maxSumIterative(Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)) == 6)
  }

  "Max sum single pass of" should "equal" in {
    assert(MaxSum.maxSumSinglePass(Array(1, 2, 3, 4)) == 10)
    assert(MaxSum.maxSumSinglePass(Array(1, 2, 3, -4)) == 6)
    assert(MaxSum.maxSumSinglePass(Array(-1, 2, 3, 4)) == 9)
    assert(MaxSum.maxSumSinglePass(Array(-2, -3, 4, -1, -2, 1, 5, -3)) == 7)
    assert(MaxSum.maxSumSinglePass(Array(-1, -2, -3, -4)) == -1)
    assert(MaxSum.maxSumSinglePass(Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)) == 6)
  }

  "Max sum single pass V2 of" should "equal" in {
    assert(MaxSum.maxSumSinglePassV2(Array(1, 2, 3, 4)) == 10)
    assert(MaxSum.maxSumSinglePassV2(Array(1, 2, 3, -4)) == 6)
    assert(MaxSum.maxSumSinglePassV2(Array(-1, 2, 3, 4)) == 9)
    assert(MaxSum.maxSumSinglePassV2(Array(-2, -3, 4, -1, -2, 1, 5, -3)) == 7)
    assert(MaxSum.maxSumSinglePassV2(Array(-1, -2, -3, -4)) == -1)
    assert(MaxSum.maxSumSinglePassV2(Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)) == 6)
  }

  "Max sum scanLeft of" should "equal" in {
    assert(MaxSum.maxSumScanLeft(Array(1, 2, 3, 4)) == 10)
    assert(MaxSum.maxSumScanLeft(Array(1, 2, 3, -4)) == 6)
    assert(MaxSum.maxSumScanLeft(Array(-1, 2, 3, 4)) == 9)
    assert(MaxSum.maxSumScanLeft(Array(-2, -3, 4, -1, -2, 1, 5, -3)) == 7)
    //    assert(MaxSum.maxSumScanLeft(Array(-1,-2,-3,-4)) == -1)
    assert(MaxSum.maxSumScanLeft(Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)) == 6)
  }

  "Max sum scanLeft V2 of" should "equal" in {
    assert(MaxSum.maxSumScanLeftV2(Array(1, 2, 3, 4)) == 10)
    assert(MaxSum.maxSumScanLeftV2(Array(1, 2, 3, -4)) == 6)
    assert(MaxSum.maxSumScanLeftV2(Array(-1, 2, 3, 4)) == 9)
    assert(MaxSum.maxSumScanLeftV2(Array(-2, -3, 4, -1, -2, 1, 5, -3)) == 7)
    assert(MaxSum.maxSumScanLeftV2(Array(-1, -2, -3, -4)) == -1)
    assert(MaxSum.maxSumScanLeftV2(Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)) == 6)
  }
}
