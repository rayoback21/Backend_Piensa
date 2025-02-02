package com.example.InvoiceProyect.service

import com.example.InvoiceProyect.entity.SensorData
import com.example.InvoiceProyect.repository.SensorDataRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class SensorDataService {

    @Autowired
    lateinit var sensorDataRepository: SensorDataRepository

    fun list(): List<SensorData> {
        return sensorDataRepository.findAll()
    }

    fun save(sensorData: SensorData): SensorData {
        return sensorDataRepository.save(sensorData)
    }

    fun update(sensorData: SensorData): SensorData {
        try {
            sensorDataRepository.findById(sensorData.id)
                ?: throw Exception("ID no encontrado")
            return sensorDataRepository.save(sensorData)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun findById(id: Long?): SensorData? {
        return sensorDataRepository.findById(id)
    }
    fun updateName(sensorData: SensorData): SensorData? {
        try {
            var response = sensorDataRepository.findById(sensorData.id)
                ?: throw Exception("Ya existe el id")
            response.apply {
                id= sensorData.id
            }
            return sensorDataRepository.save (response)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun delete(id: Long) {
        if (!sensorDataRepository.existsById(id)) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "Film with id $id not found")
        }
        sensorDataRepository.deleteById(id)
    }
}
