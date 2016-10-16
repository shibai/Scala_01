

def subtract(x: List[(Char, Int)], y: List[(Char, Int)]): List[(Char, Int)] = {
  val m = y.toMap
  x.map(p => m.get(p._1) match {
    case None => p
    case g => {
      (p._1, p._2 - g.get)
    }
  }).filter(p => p._2 > 0).sortBy(_._1)
}
val x = List(('a', 1), ('d', 1), ('l', 1), ('r', 1))
val m = List(('r', 1))
subtract(x, m)
