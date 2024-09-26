package com.example.prak_1

class ExpenseList {
    private val expenses = mutableListOf<Expense>()

    fun addExpense(expense: Expense) {
        expenses.add(expense)
    }

    fun printAllExpenses() {
        for (expense in expenses) {
            println(expense)
        }
    }

    fun calculateTotalExpensesByCategory(): Map<String, Double> {
        return expenses.groupBy { it.category }.mapValues { it.value.sumByDouble { it.amount } }
    }
}