package classesV.hybridV

import classesV.Vehicle
import interfacesV.IHybridVehicle

abstract class HybridVehicle: Vehicle(), IHybridVehicle {
    override fun recharging() {
        println("The $name is recharging.")
    }
    override fun refueling() {
        println("The $name is refueling.")
    }
}
