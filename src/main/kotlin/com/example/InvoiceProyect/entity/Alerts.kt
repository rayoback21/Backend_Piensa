package com.example.InvoiceProyect.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "alerts")
class Alerts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null

    @ManyToOne
    @JoinColumn(name = "sensor_id", nullable = false)
    var sensors: Sensors? = null

    @Column(name = "alerts_type", length = 30, nullable = false)
    var alertsType: String? = null

    @Column(name = "message", columnDefinition = "TEXT", nullable = false)
    var message: String? = null

    @Column(name = "alerts_timestamp", nullable = false)
    var alertsTimestamp: LocalDateTime? = null

    @Column(name = "resolved", nullable = false)
    var resolved: Boolean = false
}
