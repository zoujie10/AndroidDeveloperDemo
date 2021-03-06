package com.example.androiddeveloperdemo.logic.model

import com.google.gson.annotations.SerializedName

class RealtimeResponse(val status: String, val result: Result) {

    class Result(val realtime: Realtime)

    class Realtime(val skycon: String, val temperature: Float, @SerializedName("air_quality") val airQuality: AirQuality)

    class AirQuality(val aqi: AQI)

    class AQI(val chn: Float)

}
/*
{
  "status": "ok",
  "api_version": "v2.5",
  "api_status": "active",
  "lang": "zh_CN",
  "unit": "metric",
  "tzshift": 28800,
  "timezone": "Asia/Shanghai",
  "server_time": 1640745758,
  "location": [39.2072, 101.6656],
  "result": {
    "realtime": {
      "status": "ok",
      "temperature": -7,
      "humidity": 0.58,
      "cloudrate": 0,
      "skycon": "CLEAR_DAY",
      "visibility": 7.8,
      "dswrf": 47.7,
      "wind": {
        "speed": 1.8,
        "direction": 22
      },
      "pressure": 85583.47,
      "apparent_temperature": -9.9,
      "precipitation": {
        "local": {
          "status": "ok",
          "datasource": "radar",
          "intensity": 0
        },
        "nearest": {
          "status": "ok",
          "distance": 10000,
          "intensity": 0
        }
      },
      "air_quality": {
        "pm25": 45,
        "pm10": 49,
        "o3": 6,
        "so2": 8,
        "no2": 42,
        "co": 1.1,
        "aqi": {
          "chn": 63,
          "usa": 124
        },
        "description": {
          "chn": "良",
          "usa": "轻度污染"
        }
      },
      "life_index": {
        "ultraviolet": {
          "index": 3,
          "desc": "弱"
        },
        "comfort": {
          "index": 12,
          "desc": "湿冷"
        }
      }
    },
    "primary": 0
  }
}
 */