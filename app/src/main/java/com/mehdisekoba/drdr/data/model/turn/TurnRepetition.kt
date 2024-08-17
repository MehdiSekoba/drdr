package com.mehdisekoba.drdr.data.model.turn

data class TurnRepetition(
    val id: Int,
    val firstname: String,
    val lastname: String,
    val code: String,
    val specialities: String,
    val created: String,
    val address: String,
    val phone: String,
    val avatar_path: String,
    val name_Patient: String,
    val appointment_Reservation: String,
    val payment: String
    )

val dataTurnList = listOf(
    TurnRepetition(1, firstname = "مهرناز ", lastname = "ایمانی", code = "49139571", specialities = "فوق تخصص بیماری های غدد درون ریز و متابولیسم (اندوکرینولوژی)", created = "2023-06-04 21:19:41", address = "تهران-تهران-بلوار آیت الله کاشانی به سمت صادقیه، بین اتوبان ستاری و خیابان حسن آباد، روبروی پارک گلپوش، ساختمان افرا، واحد 401", phone = "02186127454", avatar_path = "https://drdr.ir/_next/image/?url=https%3A%2F%2Fcdn.drdr.ir%2Fstorage%2Fmedia%2Fdoctors%2Favatars%2F81b93f39ed6cbd2b6bc7a8c4f24079f048b0e719.jpg&w=1920&q=75", name_Patient = "مهدی سِکوبا", appointment_Reservation = "250000", payment = "15000")
)

