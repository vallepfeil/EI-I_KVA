//0)
type Snake = List[Int]
val snake = List(3, 2, 2, 3, 2, 3, 2, 2, 3, 3, 2, 2, 2, 3, 3, 3, 3)
val s = List(3,3)
val s2 = List()

//1)
/**
 * foldRight mit neutralem Element nimmt benachbarte Elemente und summiert sie i. d. F. auf
 * reduce macht das Selbe ohne neutralem Element
 * Anders, z. B. mit s.reduce(_+_) - (s.length-1) == 27
 * @param s
 * @return
 */
def checkValidity(s: Snake): Boolean =
    s.foldRight(0)(_+_) - (s.length-1) == 27

//Tests
//
//checkValidity(snake)
//checkValidity(s)
//checkValidity(s2)
//

//2.a)

type Position = (Int, Int, Int)
type Direction = (Int, Int, Int)

//Tests
//
//val pos1 = (0,0,1)
//
//def test(p: Position): Boolean = true
//
//test(pos1)

//2.b)
// Currysierbar = Abwandlung, ganz schnell, z. B.
// um konkrete Fälle zu überprüfen
// Deshalb generische Funktion erforderlich
// Sinn: Unvollständige Parameterübergabe, 2 Parameter zu übergeben, Position i. d. F.
// ausgelassen

def inCube (dim: Int)(p: Position): Boolean =
    def inRange(n: Int) = 1 <= n && n <= dim
    val (x, y, z) = p
    inRange(x) && inRange(y) && inRange(z)

val inCube3 = inCube(3)_
val inCube4 = inCube(4)_


//inCube3/inCub4
//val pos = (1,2,1)
//inCube(pos)
