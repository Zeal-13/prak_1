package com.example.prak_1


import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import java.time.LocalDate

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val expenseList = ExpenseList()

        expenseList.addExpense(Expense(10.0, "Food", LocalDate.now()))
        expenseList.addExpense(Expense(20.0, "Transport", LocalDate.now()))
        expenseList.addExpense(Expense(30.0, "Food", LocalDate.now()))

        expenseList.printAllExpenses()

        println(expenseList.calculateTotalExpensesByCategory())
    }
}

