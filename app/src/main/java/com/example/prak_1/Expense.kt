package com.example.prak_1

import java.time.LocalDate

class Expense(val amount: Double, val category: String, val date: LocalDate) {
    override fun toString(): String {
        return "Amount: $amount, Category: $category, Date: $date"
    }
}