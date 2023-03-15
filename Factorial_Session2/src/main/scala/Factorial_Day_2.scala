class Factorial_Day_2 {
  def factorial_recursion(number: Int, accumulator: Int): Int = {
    if (number < 0)
      throw new IllegalArgumentException()
    try {
      if (number.isNaN) throw new IllegalArgumentException
    }
    catch {
      case a: IllegalArgumentException => {
        a.getMessage
      }
    }
    if (number <= 1) accumulator
    else factorial_recursion(number - 1, accumulator * number)
  }

}
