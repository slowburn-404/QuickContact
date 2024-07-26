package dev.borisochieng.tagtidy.nfc_writer



data class LaundryInfo(
    val clothType: String,
    val customerName: String,
    val washingInstructions: String,
    val customerAddress: String,
    val amountToBePaid: String,
    val deliveryDate: String,
    val status: String
)
