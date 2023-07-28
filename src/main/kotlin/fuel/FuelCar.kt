package fuel

import Noise

class FuelCar: FuelVehicle() {
    override val name = "fuel car"
    override val nbWheels = 4
    override val noisePoll = Noise.MODERATE

    override fun start() {
        println("the $name starts. Engine is heating.")
    }
    fun turnOnRadio() {
        println("The radio is now turned on. Enjoy!")
    }
}
