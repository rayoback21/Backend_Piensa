package com.example.InvoiceProyect.controller

import com.example.InvoiceProyect.entity.SensorData
import com.example.InvoiceProyect.service.SensorDataService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/sensor-data")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class SensorDataController {
    @Autowired
    lateinit var sensorDataService: SensorDataService
    @GetMapping
    fun list(): List<SensorData> {
        return sensorDataService.list()
    }

    @PostMapping
    fun save (@RequestBody sensorData: SensorData): SensorData {
        return sensorDataService.save(sensorData)
    }
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        sensorDataService.delete(id)
    }
    @PutMapping
    fun update(@RequestBody sensorData: SensorData): ResponseEntity<SensorData> {
        return ResponseEntity(sensorDataService.update(sensorData), HttpStatus.OK)
    }
    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: Long): ResponseEntity<SensorData> {
        val sensorData = sensorDataService.findById(id)
        return if (sensorData != null) {
            ResponseEntity(sensorData, HttpStatus.OK)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)}}}

