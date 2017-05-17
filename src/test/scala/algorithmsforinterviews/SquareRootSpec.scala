package algorithmsforinterviews

import org.scalatest.FlatSpec

class SquareRootSpec extends FlatSpec {

  "SquareRoot of " should " should be " in {
    assert(Math.abs(SquareRoot.sqrt(16) - 4) < .001)
    assert(Math.abs(SquareRoot.sqrt(4) - 2) < .001)
  }

}
