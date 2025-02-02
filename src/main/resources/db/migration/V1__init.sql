CREATE TABLE IF NOT EXISTS sensor_data (
id SERIAL PRIMARY KEY,
temperature DECIMAL(5,2),
humidity DECIMAL(5,2),
soilMoisture DECIMAL(5,2),
colorValue VARCHAR(10)
    );
