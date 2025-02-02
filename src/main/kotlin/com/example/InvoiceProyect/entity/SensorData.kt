package com.example.InvoiceProyect.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "sensor_data")
class SensorData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null

    @Column(name = "temperature")
    var temperature: Double? = null

    @Column(name = "humidity")
    var humidity: Double? = null

    @Column(name = "soilmoisture")
    var soilMoisture: Double? = null

    @Column(name = "colorvalue")
    var colorValue: String? = null
}
