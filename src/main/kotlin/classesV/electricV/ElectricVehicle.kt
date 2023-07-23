package classesV.electricV

import classesV.Vehicle
import interfacesV.IElectricVehicle

abstract class ElectricVehicle: Vehicle(), IElectricVehicle {
    override fun recharging() {
        println("The $name is recharging.")
    }
}
