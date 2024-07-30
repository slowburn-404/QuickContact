package dev.borisochieng.autocaretag.nfc_writer.domain



data class LaundryInfo(
    val clothType: String,
    val customerName: String,
    val customerPhoneNo: String,
    val washingInstructions: String,
    val customerAddress: String,
    val amountToBePaid: String,
    val deliveryDate: String,
    val status: String
)
data class TagInfo(
    val customerName: String,
    val customerPhoneNo: String,
    val vehicleModel: String,
    val workDone: String,
    val appointmentDate: String,
    val nextAppointmentDate: String,
)
