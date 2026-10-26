// COMP2850 Portfolio: Week 4
// Triangle class
//Ashkan Ramjerdi
import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    init {
        require(
            sideA > 0.0 && sideB > 0.0 && sideC > 0.0 &&
                sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA
        ) { "Triangle is invalid" }
    }

    val perimeter: Double
        get() = sideA + sideB + sideC

    val semiPerimeter: Double
        get() = perimeter / 2.0

    val area: Double
        get() = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))

    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}
