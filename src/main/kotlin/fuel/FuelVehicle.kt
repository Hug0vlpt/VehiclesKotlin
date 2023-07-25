package fuel

import vehicle.Vehicle

abstract class FuelVehicle: Vehicle(), IFuelVehicle {
    override fun refueling() {
        println("The $name is refueling.")
    }
}
