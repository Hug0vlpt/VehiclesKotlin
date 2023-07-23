package classesV.electricV

import enums.Noise

class ElectricCar: ElectricVehicle() {
    override val name = "electric car"
    override val nbWheels = 4
    override val noisePoll = Noise.QUIET
    fun turnOnRadio() {
        println("The radio is now turned on. Enjoy!")
    }
}
