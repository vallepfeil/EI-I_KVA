class main {
    /**
     * Snake i. d. F. Datenstruktur vom Typ List[Int]
     * snake i. d. F. Variable vom Typ List
     */
    type Snake = List[Int]
    val snake = List(3, 2, 2, 3, 2, 3, 2, 2, 3, 3, 2, 2, 2, 3, 3, 3, 3)

    def checkValidity(s: Snake): Boolean =
        val comparecubes = 27
        val sharedcubes = 16

        val actualcubes = s.reduce(_+_) - sharedcubes
        if comparecubes == actualcubes then return true else return false
}
