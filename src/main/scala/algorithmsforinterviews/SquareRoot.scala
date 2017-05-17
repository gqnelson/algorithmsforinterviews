package algorithmsforinterviews

/**
  * 1.1 Implement a fast integer square root function that takes
  * in a 32-bit unsigned lteger and returns another 32-bit unsigned integer
  * that is the floor of the square root of the input.
  * Ex. sqrt(16) = 4
  *
  * Notes on how to compute recursively
  * http://www.cse.wustl.edu/~kjg/cse131/Notes/SquareRoot/sqrt.html
  */
object SquareRoot {

  def sqrt(x: Double): Double = {
    def closeEnough(g: Double) = {
      Math.abs(x/g - g) < .001
    }

    def betterGuess(g: Double) = {
      (g + x/g) / 2
    }

    def test(g: Double): Double = {
      if (closeEnough(g)) g else test(betterGuess(g))
    }

    test(1)
  }
}
