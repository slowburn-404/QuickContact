package dev.borisochieng.autocaretag.nfc_reader.ui

import dev.borisochieng.autocaretag.room_db.Client
import dev.borisochieng.autocaretag.room_db.Vehicle

data class ClientUiState(
	val client: Client = Client(name = "Jay Abbah", contactInfo = "+23472537353"),
	val clientVehicles: List<Vehicle> = emptyList()
)