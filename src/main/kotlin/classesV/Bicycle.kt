package classesV

import enums.Noise

class Bicycle: Vehicle() {
    override val name = "bicycle"
    override val nbWheels = 2
    override val noisePoll = Noise.QUIET
    fun ringBell() {
        println("Ding Dong ♫⋆｡♪")
    }
    fun rearsUp() {
        println("The $name rears up!")
    }
}
