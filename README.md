# TaxiEventGenerator

## Intro
- Generate fake Taxi event as `stream` data source via scala
- Feel free to modify the [code](https://github.com/yennanliu/TaxiEventGenerator/blob/master/src/main/scala/EventGenerator/TaxiEventDataGenerator.scala)! 

## Quick Start
```bash
# run the TaxiEventDataGenerator.scala script 
$ sbt run
# open the other terminal
$ curl localhost:44444

# { "id": 3546685,
#    "event_date": 1582713784790,
#    "tour_value": 76.8712661022363,
#    "id_driver": 3,
#    "id_passenger": 68
# }...              
```