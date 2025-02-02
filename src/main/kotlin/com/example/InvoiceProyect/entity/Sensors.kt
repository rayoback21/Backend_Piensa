package com.example.InvoiceProyect.entity

import jakarta.persistence.*

@Entity
@Table(name = "sensors")
class Sensors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null

    @Column(name = "name", length = 50, nullable = false)
    var name: String? = null

    @Column(name = "type", length = 20, nullable = false)
    var type: String? = null

    @Column(name = "user_id", nullable = false)
    var userId: Int? = null

    @Column(name = "location", length = 100, nullable = false)
    var location: String? = null
}
