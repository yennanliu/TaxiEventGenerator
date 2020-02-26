package EventGenerator

import java.io.PrintWriter
import java.net.ServerSocket
import java.util.Random

object TaxiEventDataGenerator {
  
  def main(args: Array[String]) {

    val port = 44444
    val viewsPerSecond = 10 
    val sleepDelayMs = (1000.0 / viewsPerSecond).toInt
    val listener = new ServerSocket(port)
    println(s"Listening on port: $port")

    while (true) {
      val socket = listener.accept()
      new Thread() {
        override def run(): Unit = {
          println(s"Got client connected from: ${socket.getInetAddress}")
          val out = new PrintWriter(socket.getOutputStream(), true)

          while (true) {

            val id=123
            val event_date=20200101
            val tour_value=100
            val id_driver="abc123"
            val id_passenger="c0001"

            val payload =
               s"""
                       |{ "id": $id,
                       |   "event_date": $event_date,
                       |   "tour_value": $tour_value,
                       |   "id_driver": $id_driver,
                       |   "id_passenger": $id_passenger
                       |}
                """.stripMargin

            Thread.sleep(sleepDelayMs)
            out.write(payload)
            out.flush()
          }
          socket.close()
        }
      }.start()
    }
  }
}