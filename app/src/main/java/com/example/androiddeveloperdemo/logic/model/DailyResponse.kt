package com.example.androiddeveloperdemo.logic.model

import com.google.gson.annotations.SerializedName
import java.util.*

class DailyResponse(val status: String, val result: Result) {

    class Result(val daily: Daily)

    class Daily(val temperature: List<Temperature>, val skycon: List<Skycon>, @SerializedName("life_index") val lifeIndex: LifeIndex)

    class Temperature(val max: Float, val min: Float)

    class Skycon(val value: String, val date: Date)

    class LifeIndex(val coldRisk: List<LifeDescription>, val carWashing: List<LifeDescription>, val ultraviolet: List<LifeDescription>, val dressing: List<LifeDescription>)

    class LifeDescription(val desc: String)

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
  "server_time": 1640748007,
  "location": [39.2072, 101.6656],
  "result": {
    "daily": {
      "status": "ok",
      "astro": [
        {
          "date": "2021-12-29T00:00+08:00",
          "sunrise": {
            "time": "08:32"
          },
          "sunset": {
            "time": "17:58"
          }
        }
      ],
      "precipitation": [
        {
          "date": "2021-12-29T00:00+08:00",
          "max": 0,
          "min": 0,
          "avg": 0
        }
      ],
      "temperature": [
        {
          "date": "2021-12-29T00:00+08:00",
          "max": -3,
          "min": -12.5,
          "avg": -4.99
        }
      ],
      "wind": [
        {
          "date": "2021-12-29T00:00+08:00",
          "max": {
            "speed": 7.28,
            "direction": 306.43
          },
          "min": {
            "speed": 1.8,
            "direction": 22
          },
          "avg": {
            "speed": 4.14,
            "direction": 283.01
          }
        }
      ],
      "humidity": [
        {
          "date": "2021-12-29T00:00+08:00",
          "max": 0.76,
          "min": 0.45,
          "avg": 0.61
        }
      ],
      "cloudrate": [
        {
          "date": "2021-12-29T00:00+08:00",
          "max": 0.52,
          "min": 0,
          "avg": 0.06
        }
      ],
      "pressure": [
        {
          "date": "2021-12-29T00:00+08:00",
          "max": 85640.37,
          "min": 85423.36,
          "avg": 85539.3
        }
      ],
      "visibility": [
        {
          "date": "2021-12-29T00:00+08:00",
          "max": 24.13,
          "min": 4.86,
          "avg": 7.18
        }
      ],
      "dswrf": [
        {
          "date": "2021-12-29T00:00+08:00",
          "max": 405.6,
          "min": 0,
          "avg": 183.2
        }
      ],
      "air_quality": {
        "aqi": [
          {
            "date": "2021-12-29T00:00+08:00",
            "max": {
              "chn": 65,
              "usa": 102
            },
            "avg": {
              "chn": 49,
              "usa": 95
            },
            "min": {
              "chn": 44,
              "usa": 63
            }
          }
        ],
        "pm25": [
          {
            "date": "2021-12-29T00:00+08:00",
            "max": 36,
            "avg": 33,
            "min": 18
          }
        ]
      },
      "skycon": [
        {
          "date": "2021-12-29T00:00+08:00",
          "value": "CLEAR_DAY"
        }
      ],
      "skycon_08h_20h": [
        {
          "date": "2021-12-29T00:00+08:00",
          "value": "CLEAR_DAY"
        }
      ],
      "skycon_20h_32h": [
        {
          "date": "2021-12-29T00:00+08:00",
          "value": "PARTLY_CLOUDY_NIGHT"
        }
      ],
      "life_index": {
        "ultraviolet": [
          {
            "date": "2021-12-29T00:00+08:00",
            "index": "4",
            "desc": "强"
          }
        ],
        "carWashing": [
          {
            "date": "2021-12-29T00:00+08:00",
            "index": "1",
            "desc": "适宜"
          }
        ],
        "dressing": [
          {
            "date": "2021-12-29T00:00+08:00",
            "index": "8",
            "desc": "极冷"
          }
        ],
        "comfort": [
          {
            "date": "2021-12-29T00:00+08:00",
            "index": "12",
            "desc": "湿冷"
          }
        ],
        "coldRisk": [
          {
            "date": "2021-12-29T00:00+08:00",
            "index": "4",
            "desc": "极易发"
          }
        ]
      }
    },
    "primary": 0
  }
}
* */