type Snake = List[Int]
val snake = List(3, 2, 2, 3, 2, 3, 2, 2, 3, 3, 2, 2, 2, 3, 3, 3, 3)
val s = List(3,3)
val s2 = List()

/**
 * foldRight mit neutralem Element nimmt benachbarte Elemente und summiert sie i. d. F. auf
 * reduce macht das Selbe ohne neutralem Element
 * Anders, z. B. mit s.reduce(_+_) - (s.length-1) == 27
 * @param s
 * @return
 */

def checkValidity(s: Snake): Boolean =
    s.foldRight(0)(_+_) - (s.length-1) == 27



checkValidity(snake)
checkValidity(s)
checkValidity(s2)



