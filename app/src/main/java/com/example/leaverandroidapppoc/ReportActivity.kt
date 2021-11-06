package com.example.leaverandroidapppoc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ReportActivity : AppCompatActivity() {
lateinit var recyclerView:RecyclerView
lateinit var editingAdapter:EditingAdapter
lateinit var listOfReports:ArrayList<Report>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)
        recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        listOfReports = ArrayList()
        var report = Report()
        report.reportIndentifier = "dummyId"
        listOfReports.add(report)
        var report2 = Report()
        report.reportIndentifier = "dummyId"
        listOfReports.add(report2)
        var report3 = Report()
        report.reportIndentifier = "dummyId"
        listOfReports.add(report3)
        var report4 = Report()
        report.reportIndentifier = "dummyId"
        listOfReports.add(report4)

        editingAdapter = EditingAdapter(this, listOfReports)
        val lv = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = lv
        recyclerView.adapter = editingAdapter
    }
}