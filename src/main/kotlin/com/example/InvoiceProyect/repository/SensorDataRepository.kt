package com.example.InvoiceProyect.repository

import com.example.InvoiceProyect.entity.SensorData
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SensorDataRepository : JpaRepository<SensorData, Long> {
    fun findById(id: Long?): SensorData?
}
