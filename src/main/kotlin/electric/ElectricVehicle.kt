package electric

import vehicle.Vehicle

abstract class ElectricVehicle: Vehicle(), IElectricVehicle {
    override fun recharging() {
        println("The $name is recharging.")
    }
}
