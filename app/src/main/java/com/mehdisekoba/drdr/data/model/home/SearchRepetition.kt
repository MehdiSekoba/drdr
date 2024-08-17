package com.mehdisekoba.drdr.data.model.home

data class SearchRepetition(
    val id: Int,
    val title: String,
)

val dataSearchList = listOf(
    SearchRepetition(1, "زنان، زایمان و نازایی"),
    SearchRepetition(2, "کودکان"),
    SearchRepetition(3, "عمومی"),
    SearchRepetition(4, "داخلی"),
    SearchRepetition(5, "غدد و متابولیسم"),
    SearchRepetition(6, "پوست ، مو و زیبایی"),
    SearchRepetition(7, "مغز و اعصاب (نورولوژی)"),
    SearchRepetition(8, "ارتوپدی"),
    SearchRepetition(9, "گوش حلق و بینی"),
    SearchRepetition(10, "قلب و عروق")
)

