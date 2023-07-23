package classesV.fuelV

import classesV.Vehicle
import interfacesV.IFuelVehicle

abstract class FuelVehicle: Vehicle(), IFuelVehicle {
    override fun refueling() {
        println("The $name is refueling.")
    }
}
