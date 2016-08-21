package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0 || r == c) 1
      else pascal(c, r - 1) + pascal(c - 1, r - 1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {

      def helper(chars:List[Char], numOfOpen: Int): Boolean = {
        if (chars.isEmpty) {
          numOfOpen == 0
        }else {
          val head = chars.head
          val left =
            if (head == '(') {
              numOfOpen + 1
            }else if (head == ')') {
              numOfOpen - 1
            }else
              numOfOpen
          if (left >= 0) helper(chars.tail, left)
          else false
        }
      }

      helper(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (money == 0) 1
      else if (money < 0 || coins.isEmpty) 0
      else {
        val head = coins.head
        countChange(money, coins.tail) + countChange(money - head, coins)
      }
    }
  }
