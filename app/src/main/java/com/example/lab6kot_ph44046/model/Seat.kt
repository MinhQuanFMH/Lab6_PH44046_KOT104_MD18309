package com.example.lab6kot_ph44046.model

// in /model/entieies/Seat.kt
data class Seat(var row: Char, val number: Int, var status:
SeatStatus)
// in /model/entieies/SeatStatus.kt
enum class SeatStatus { EMPTY, SELECTED, BOOKED, AISLE }