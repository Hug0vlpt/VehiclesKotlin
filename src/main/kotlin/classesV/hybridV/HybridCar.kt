package classesV.hybridV

import enums.Noise

class HybridCar: HybridVehicle() {
    override val name = "hybrid car"
    override val nbWheels = 4
    override val noisePoll = Noise.QUIET
    fun turnOnRadio() {
        println("The radio is now turned on. Enjoy!")
    }
}
