# TaxiEventGenerator

## Intro
- Generate fake Taxi event as `stream` data source via scala
- Feel free to modify the [code](https://github.com/yennanliu/TaxiEventGenerator/blob/master/src/main/scala/EventGenerator/TaxiEventDataGenerator.scala)! 

## Quick Start
```bash
$ sbt run
$ curl localhost:44444

# { "id": 3546685,
#    "event_date": 1582713784790,
#    "tour_value": 76.8712661022363,
#    "id_driver": 3,
#    "id_passenger": 68
# }
                
# { "id": 2107006,
#    "event_date": 1582713784907,
#    "tour_value": 97.13985879731003,
#    "id_driver": 0,
#    "id_passenger": 41
# }
                
# { "id": 9773960,
#    "event_date": 1582713785010,
#    "tour_value": 36.661604401969306,
#    "id_driver": 5,
#    "id_passenger": 77
# }
# .
# .
# .

```