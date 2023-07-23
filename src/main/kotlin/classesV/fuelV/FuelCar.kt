package classesV.fuelV

import enums.Noise

class FuelCar: FuelVehicle() {
    override val name = "fuel car"
    override val nbWheels = 4
    override val noisePoll = Noise.MODERATE
    fun turnOnRadio() {
        println("The radio is now turned on. Enjoy!")
    }
}
